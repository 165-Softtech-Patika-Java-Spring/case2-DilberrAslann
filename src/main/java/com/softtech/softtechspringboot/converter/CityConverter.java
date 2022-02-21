package com.softtech.softtechspringboot.converter;

import com.softtech.softtechspringboot.dto.CityDto;
import com.softtech.softtechspringboot.entity.City;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityConverter {
    public List<CityDto> convertToCityDtoList(List<City> cityList) {

        List<CityDto> cityDtoList = new ArrayList<>();

        for (City city : cityList) {

            CityDto cityDto = convertToCityDto(city);

            cityDtoList.add(cityDto);
        }

        return cityDtoList;
    }

    public CityDto convertToCityDto(City city) {
        CityDto cityDto = new CityDto();
        cityDto.setPlate(city.getPlate());
        cityDto.setCountryId(city.getCountryId());
        cityDto.setName(city.getName());
        return cityDto;
    }
}
