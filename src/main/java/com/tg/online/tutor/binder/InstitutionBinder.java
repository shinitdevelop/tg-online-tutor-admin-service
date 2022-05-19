package com.tg.online.tutor.binder;

import com.tg.online.tutor.dto.response.InstitutionDetailsDto;
import com.tg.online.tutor.entity.Institution;
import com.tg.online.tutor.dto.request.InstitutionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class InstitutionBinder {

    @Autowired
    AddressBinder addressBinder;

    public Institution convertRequestToEntity(InstitutionRequest request){

     return    Institution.builder().name(request.getName()).contact(request.getContact())
                .email(request.getEmail())
                .logo(request.getLogo()).latitude(request.getLatitude()).longitude(request.getLongitude())
                .lastUpdate(LocalDateTime.now()).isActive(Boolean.TRUE).build();

    }

    public InstitutionDetailsDto converToInstitutionDto(Institution institution) {
        return InstitutionDetailsDto.builder().name(institution.getName())
                .id(institution.getId())
                .contact(institution.getContact())
                .email(institution.getEmail())
                .logo(institution.getLogo())
                .build();
    }


}
