package com.softtech.softtechspringboot.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "CITY")
@Getter
@Setter
public class City {
    @Id
    @Column(name="PLATE")
    private String plate;

    @Column(name = "ID_COUNTRY")
    private int countryId;

    @Column(name = "NAME")
    private String name;


}
