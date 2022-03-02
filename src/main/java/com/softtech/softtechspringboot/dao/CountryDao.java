package com.softtech.softtechspringboot.dao;

import com.softtech.softtechspringboot.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryDao extends JpaRepository<Country, Long> {

    Country findByCode(String code);

}
