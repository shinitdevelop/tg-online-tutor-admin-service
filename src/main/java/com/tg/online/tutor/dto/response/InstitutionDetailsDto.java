package com.tg.online.tutor.dto.response;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class InstitutionDetailsDto {

    private Long id;

    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private Long contact;

    private String logo;


}
