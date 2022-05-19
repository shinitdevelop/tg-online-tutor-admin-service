package com.tg.online.tutor.dto.request;

import com.tg.online.tutor.dto.AddressRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class InstitutionAdminRequest implements AddressRequest {

    private Long id;

    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private Long contact;
    @NotNull
    private String state;
    @NotNull
    private String city;
    @NotNull
    private String address;
    @NotNull
    private Long pinCode;

    @NotNull
    private Long institutionId;

}
