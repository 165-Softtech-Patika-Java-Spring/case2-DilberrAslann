package com.softtech.softtechspringboot.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
@Getter
@Setter
public class Address {
    @Id
    @SequenceGenerator(name = "Country", sequenceName = "COUNTRY_ID_SEQ")
    @GeneratedValue(generator = "Country")
    private Integer id;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "CITY")
    private String city;

    @Column(name = "DISTRICT")
    private String district;

    @Column(name = "NEIGHBORHOOD")
    private String neighborhood;

    @Column(name = "STREET")
    private String street;

    @Column(name = "DOOR_NUMBER")
    private Integer doorNumber;

    @Column(name = "APARTMENT_NUMBER")
    private String apartmentNumber;

}
