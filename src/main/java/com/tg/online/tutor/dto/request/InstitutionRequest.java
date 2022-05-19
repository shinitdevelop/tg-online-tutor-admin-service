package com.tg.online.tutor.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tg.online.tutor.dto.AddressRequest;
import lombok.*;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class InstitutionRequest implements AddressRequest {

    private Long id;

    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private Long contact;

    private String logo;

    private BigDecimal latitude;

    private BigDecimal longitude;
    @NotNull
    private String state;
    @NotNull
    private String city;
    @NotNull
    private String address;
    @NotNull
    private Long pinCode;


}
