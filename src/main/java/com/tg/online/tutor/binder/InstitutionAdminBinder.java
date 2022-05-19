package com.tg.online.tutor.binder;

import com.tg.online.tutor.dto.request.InstitutionAdminRequest;
import com.tg.online.tutor.entity.InstitutionAdmin;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class InstitutionAdminBinder {

    public InstitutionAdmin convertAddRequestToEntity(InstitutionAdminRequest request){

       return InstitutionAdmin.builder().name(request.getName()).contact(request.getContact())
                .email(request.getEmail()).isActive(Boolean.TRUE).lastUpdate(LocalDateTime.now()).build();
    }
}
