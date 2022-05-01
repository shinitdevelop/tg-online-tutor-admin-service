package com.tg.online.tutor.service;

import com.tg.online.tutor.binder.AddressBinder;
import com.tg.online.tutor.binder.InstitutionBinder;
import com.tg.online.tutor.entity.Address;
import com.tg.online.tutor.entity.EntityType;
import com.tg.online.tutor.entity.Institution;
import com.tg.online.tutor.repository.InstitutionRepository;
import com.tg.online.tutor.request.InstitutionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InstitutionService {

    @Autowired
    InstitutionBinder institutionBinder;
    @Autowired
    InstitutionRepository institutionRepository;

    @Autowired
    EntityTypeService entityTypeService;

    @Autowired
    AddressBinder addressBinder;
    public ResponseEntity<?> saveInstitution(InstitutionRequest request){

        //get Entity type
        Optional<EntityType> entityType =entityTypeService.findEntityTypeByName("INSTITUTION");

        if(entityType.isEmpty()){
            //throw exception
        }

        Address address=addressBinder.convertInstitutionModelToAddressEntity(request);

        address.setEntityType(entityType.get());

        Institution ins= institutionBinder.convertRequestToEntity(request);

        ins.setAddress(address);

        ins = institutionRepository.save(ins);

        return new ResponseEntity<>(ins, HttpStatus.OK);

    }
}
