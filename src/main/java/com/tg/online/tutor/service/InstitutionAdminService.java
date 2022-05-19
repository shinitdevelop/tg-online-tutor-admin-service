package com.tg.online.tutor.service;

import com.tg.online.tutor.dto.request.InstitutionAdminRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface InstitutionAdminService {

    ResponseEntity<?> saveInstitutionAdmin(InstitutionAdminRequest request);
}
