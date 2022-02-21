package com.softtech.softtechspringboot.service;

import com.softtech.softtechspringboot.converter.CountryConverter;
import com.softtech.softtechspringboot.dto.CountryDto;
import com.softtech.softtechspringboot.entity.Country;
import com.softtech.softtechspringboot.service.entityservice.CountryEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryEntityService countryEntityService;
    private final CountryConverter countryConverter;

    public CountryDto findById(int id) {

        Optional<Country> country = countryEntityService.findById(id);

        CountryDto countryDto = countryConverter.convertToCountryDto(country.orElse(null));

        return countryDto;
    }

    public Country save(Country country) {

        return countryEntityService.save(country);
    }




}
