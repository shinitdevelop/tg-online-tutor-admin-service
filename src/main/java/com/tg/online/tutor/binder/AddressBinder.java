package com.tg.online.tutor.binder;

import com.tg.online.tutor.dto.AddressRequest;
import com.tg.online.tutor.entity.Address;
import com.tg.online.tutor.dto.request.InstitutionRequest;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AddressBinder {

    public Address convertAddresRequestDtoToAddressEntity(AddressRequest request){
    	
    	 return Address.builder().state(request.getState()).city(request.getCity())
                .address(request.getAddress()).pinCode(request.getPinCode()).lastUpdate(LocalDateTime.now()).build();

    }

    public Address convertRequestToAddress(String state, String city,String address,Long pinCode){
        return Address.builder().state(state).city(city)
                .address(address).pinCode(pinCode).lastUpdate(LocalDateTime.now()).build();

    }
}
