package com.tg.online.tutor.controller;

import com.tg.online.tutor.dto.request.InstitutionAdminRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/institution/admin")
public class InstitutionAdminController {

    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> addInstitutionAdmin(InstitutionAdminRequest request) {

        return  ResponseEntity.status(HttpStatus.OK).body("Received");
    }
}
