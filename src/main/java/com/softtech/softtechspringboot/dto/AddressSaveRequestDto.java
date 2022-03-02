package com.softtech.softtechspringboot.dto;

import lombok.Data;

@Data
public class AddressSaveRequestDto {

    private Long countryId;
    private Long cityId;
    private Long districtId;
    private Long neighborhoodId;
    private Long streetId;
    private String doorNumber;
    private String apartmentNumber;
}

