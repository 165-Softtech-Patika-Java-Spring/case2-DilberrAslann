package com.softtech.softtechspringboot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "NEIGHBORHOOD")
@Getter
@Setter
public class Neighborhood {
    @Id
    @SequenceGenerator(name = "Neighborhood", sequenceName = "NEIGHBORHOOD_ID_SEQ")
    @GeneratedValue(generator = "Neighborhood")
    private int id;

    @Column(name = "ID_DISTRICT")
    private int districtId;

    @Column(name = "NAME")
    private String name;


}
