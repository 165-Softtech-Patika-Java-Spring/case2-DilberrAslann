package com.softtech.softtechspringboot.service.entityservice;

import com.softtech.softtechspringboot.dao.CountryDao;
import com.softtech.softtechspringboot.entity.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryEntityService {

    private final CountryDao countryDao;

    public List<Country> findAll(){
        return countryDao.findAll();
    }

    public Country save(Country country){
        return countryDao.save(country);
    }

    public Country findByCountryCode(String countryCode){
        return countryDao.findByCode(countryCode);
    }
}