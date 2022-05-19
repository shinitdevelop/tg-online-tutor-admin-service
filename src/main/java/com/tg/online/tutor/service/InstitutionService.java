package com.tg.online.tutor.service;

import com.tg.online.tutor.dto.request.InstitutionRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface InstitutionService {

    public ResponseEntity<?> saveInstitution(InstitutionRequest request);

    public ResponseEntity<?> getInstitution();

    public ResponseEntity<?> deactivateInstitution(Long id);


}
