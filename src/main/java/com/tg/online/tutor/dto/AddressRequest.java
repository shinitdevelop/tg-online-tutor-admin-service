package com.tg.online.tutor.dto;

import javax.validation.constraints.NotNull;

public interface AddressRequest {


     String getState();

    String getCity();

    String getAddress();

    Long getPinCode();


}
