package com.softtech.softtechspringboot.service;

import com.softtech.softtechspringboot.converter.CityConverter;
import com.softtech.softtechspringboot.dto.CityDto;
import com.softtech.softtechspringboot.entity.City;
import com.softtech.softtechspringboot.service.entityservice.CityEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityService {
    private final CityEntityService cityEntityService;
    private final CityConverter cityConverter;

    public CityDto findById(String id) {

        Optional<City> city = cityEntityService.findById(id);

        CityDto cityDto = cityConverter.convertToCityDto(city.orElse(null));

        return cityDto;
    }

    public City save(City city) {

        return cityEntityService.save(city);
    }

}
