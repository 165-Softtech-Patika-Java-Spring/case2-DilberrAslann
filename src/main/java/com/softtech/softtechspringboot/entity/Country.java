package com.softtech.softtechspringboot.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


@Entity
@Table(name = "COUNTRY")
@Getter
@Setter
public class Country {
    @Id
    @SequenceGenerator(name = "Country", sequenceName = "COUNTRY_ID_SEQ")
    @GeneratedValue(generator = "Country")
    private Integer id;

    @Column(name = "NAME")
    private String name;

}


