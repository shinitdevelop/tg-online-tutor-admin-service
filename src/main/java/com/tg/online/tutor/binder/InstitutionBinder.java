package com.tg.online.tutor.binder;

import com.tg.online.tutor.entity.Institution;
import com.tg.online.tutor.request.InstitutionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class InstitutionBinder {

    @Autowired
    AddressBinder addressBinder;

    public Institution convertRequestToEntity(InstitutionRequest request){

     return    Institution.builder().id(request.getId()).name(request.getName()).contact(request.getContact())
                .address(addressBinder.convertInstitutionModelToAddressEntity(request)).email(request.getEmail())
                .logo(request.getLogo()).latitude(request.getLatitude()).longitude(request.getLongitude())
                .lastUpdate(LocalDateTime.now()).isActive(Boolean.TRUE).build();

    }


}
