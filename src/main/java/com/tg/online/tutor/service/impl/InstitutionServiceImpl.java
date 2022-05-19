package com.tg.online.tutor.service.impl;

import com.tg.common.service.tgenums.ErrorMessageEnum;
import com.tg.common.service.tgenums.SuccessMessageEnum;
import com.tg.online.tutor.binder.AddressBinder;
import com.tg.online.tutor.binder.InstitutionBinder;
import com.tg.online.tutor.entity.Address;
import com.tg.online.tutor.entity.EntityType;
import com.tg.online.tutor.entity.Institution;
import com.tg.online.tutor.repository.InstitutionRepository;
import com.tg.online.tutor.dto.request.InstitutionRequest;
import com.tg.online.tutor.service.InstitutionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.Optional;

@Service
public class InstitutionServiceImpl implements InstitutionService {

    @Autowired
    InstitutionBinder institutionBinder;
    @Autowired
    EntityTypeService entityTypeService;

    @Autowired
    AddressBinder addressBinder;

    @Autowired
    InstitutionRepository institutionRepository;
    public ResponseEntity<?> saveInstitution(InstitutionRequest request){

        //get Entity type
        Optional<EntityType> entityType =entityTypeService.findEntityTypeByName("INSTITUTION");

        if(entityType.isEmpty()){
          return ResponseEntity.status(HttpStatus.OK).body(ErrorMessageEnum.INVALID_EMAIL);
        }

        if(StringUtils.isAllBlank(request.getEmail())){
            return ResponseEntity.status(HttpStatus.OK).body(ErrorMessageEnum.INVALID_EMAIL);
        }

        Address address=addressBinder.convertAddresRequestDtoToAddressEntity(request);

        address.setEntityType(entityType.get());

        Institution ins= institutionBinder.convertRequestToEntity(request);

        ins.setAddress(address);

        ins = institutionRepository.save(ins);

        return  ResponseEntity.status(HttpStatus.OK).body(SuccessMessageEnum.DETAILS_SAVE_SUCCESS);

    }

    @Override
    public ResponseEntity<?> getInstitution() {
        Optional<Institution> institutionDetails = institutionRepository.findInstitutionsByIsActive(Boolean.TRUE);

        if(institutionDetails.isPresent()) {
            //binder

            return ResponseEntity.status(HttpStatus.OK).body(institutionBinder.converToInstitutionDto(institutionDetails.get()));

        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorMessageEnum.INVALID_ID);
        }
    }

    @Override
    public ResponseEntity<?> deactivateInstitution(Long id) {

       Optional<Institution> institution= institutionRepository.findById(id);
       if(institution.isPresent()) {
           institution.get().setIsActive(Boolean.FALSE);
           institutionRepository.save(institution.get());
           return ResponseEntity.status(HttpStatus.OK).body(SuccessMessageEnum.DETAILS_SAVE_SUCCESS);
       } else {
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
       }
    }
}
