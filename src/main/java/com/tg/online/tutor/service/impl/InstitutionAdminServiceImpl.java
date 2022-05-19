package com.tg.online.tutor.service.impl;

import com.tg.common.service.tgenums.ErrorMessageEnum;
import com.tg.common.service.tgenums.SuccessMessageEnum;
import com.tg.online.tutor.binder.AddressBinder;
import com.tg.online.tutor.binder.InstitutionAdminBinder;
import com.tg.online.tutor.dto.request.InstitutionAdminRequest;
import com.tg.online.tutor.entity.Address;
import com.tg.online.tutor.entity.EntityType;
import com.tg.online.tutor.entity.Institution;
import com.tg.online.tutor.entity.InstitutionAdmin;
import com.tg.online.tutor.repository.InstitutionAdminRepository;
import com.tg.online.tutor.repository.InstitutionRepository;
import com.tg.online.tutor.service.InstitutionAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class InstitutionAdminServiceImpl implements InstitutionAdminService {

    @Autowired
    EntityTypeService entityTypeService;

    @Autowired
    AddressBinder addressBinder;

    @Autowired
    InstitutionAdminBinder institutionAdminBinder;

    @Autowired
    InstitutionRepository institutionRepository;

    @Autowired
    InstitutionAdminRepository institutionAdminRepository;

    @Override
    public ResponseEntity<?> saveInstitutionAdmin(InstitutionAdminRequest request) {

        //get Entity type
        Optional<EntityType> entityType =entityTypeService.findEntityTypeByName("INSTITUTION_ADMIN");

        if(entityType.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(ErrorMessageEnum.INVALID_EMAIL);
        }

        Optional<Institution> instituion = institutionRepository.findById(request.getInstitutionId());

        if(instituion.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body(ErrorMessageEnum.INVALID_EMAIL);
        }

        Address address=addressBinder.convertAddresRequestDtoToAddressEntity(request);

        address.setEntityType(entityType.get());

        InstitutionAdmin institutionAdmin = institutionAdminBinder.convertAddRequestToEntity(request);

        institutionAdmin.setAddress(address);

        institutionAdmin.setTgInstitutionId(instituion.get());

        institutionAdminRepository.save(institutionAdmin);

        return ResponseEntity.status(HttpStatus.OK).body(SuccessMessageEnum.DETAILS_SAVE_SUCCESS);
    }
}
