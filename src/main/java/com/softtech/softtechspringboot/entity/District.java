package com.softtech.softtechspringboot.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRY")
@Getter
@Setter
public class District {
    @Id
    @SequenceGenerator(name = "District", sequenceName = "DISTRICT_ID_SEQ")
    @GeneratedValue(generator = "District")
    private int id;

    @Column(name = "ID_CITY")
    private int cityId;

    @Column(name = "NAME")
    private String name;
}
