package com.tg.online.tutor.binder;

import com.tg.online.tutor.entity.Address;
import com.tg.online.tutor.request.InstitutionRequest;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AddressBinder {

    public Address convertInstitutionModelToAddressEntity(InstitutionRequest request){

       return Address.builder().state(request.getState()).city(request.getCity())
                .address(request.getAddress()).pinCode(request.getPinCode()).lastUpdate(LocalDateTime.now()).build();
    }
}
