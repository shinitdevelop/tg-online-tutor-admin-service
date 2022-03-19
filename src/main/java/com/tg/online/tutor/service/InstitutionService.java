package com.tg.online.tutor.service;

import com.tg.online.tutor.binder.InstitutionBinder;
import com.tg.online.tutor.entity.Institution;
import com.tg.online.tutor.repository.InstitutionRepository;
import com.tg.online.tutor.request.InstitutionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InstitutionService {

    @Autowired
    InstitutionBinder institutionBinder;
    @Autowired
    InstitutionRepository institutionRepository;

    public ResponseEntity<?> saveInstitution(InstitutionRequest request){

        Institution ins= institutionBinder.convertRequestToEntity(request);

        ins = institutionRepository.save(ins);

        return new ResponseEntity<>(ins, HttpStatus.OK);

    }
}
