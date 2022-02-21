package com.softtech.softtechspringboot.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "STREET")
@Getter
@Setter
public class Street {
    @Id
    @SequenceGenerator(name = "Street", sequenceName = "STREET_ID_SEQ")
    @GeneratedValue(generator = "Street")
    private int id;

    @Column(name = "ID_NEIGHBORHOOD")
    private int neighborhoodId;

    @Column(name = "NAME")
    private String name;
}
