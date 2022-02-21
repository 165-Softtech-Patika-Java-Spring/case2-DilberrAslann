package com.softtech.softtechspringboot.dto;

import lombok.Data;


@Data
public class AddressDto {

    private int id;
    private String country;
    private String city;
    private String district;
    private String neighborhood;
    private String street;
    private int doorNumber;
    private String apartmentNumber;

}
