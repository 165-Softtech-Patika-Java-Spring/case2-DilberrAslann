package com.softtech.softtechspringboot.service.entityservice;

import com.softtech.softtechspringboot.dao.CountryDao;
import com.softtech.softtechspringboot.entity.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryEntityService {

    private final CountryDao countryDao;

    public Country save(Country country){

        return countryDao.save(country);
    }

    public Optional<Country> findById(Integer id){

        return countryDao.findById(id);
    }
}
