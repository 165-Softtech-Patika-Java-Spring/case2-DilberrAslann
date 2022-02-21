package com.softtech.softtechspringboot.converter;

import com.softtech.softtechspringboot.dto.CountryDto;
import com.softtech.softtechspringboot.entity.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryConverter {
    public List<CountryDto> convertToCountryDtoList(List<Country> countryList) {

        List<CountryDto> countryDtoList = new ArrayList<>();

        for (Country country : countryList) {

            CountryDto countryDto = convertToCountryDto(country);

            countryDtoList.add(countryDto);
        }

        return countryDtoList;
    }
//Bu kısım Country i CountryDto olarak dönüştürür.

    public CountryDto convertToCountryDto(Country country) {
        CountryDto countryDto = new CountryDto();
        countryDto.setId(country.getId());
        countryDto.setName(country.getName());
        return countryDto;
    }

}
