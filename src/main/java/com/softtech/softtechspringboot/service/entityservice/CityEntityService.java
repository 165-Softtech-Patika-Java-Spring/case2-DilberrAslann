package com.softtech.softtechspringboot.service.entityservice;

import com.softtech.softtechspringboot.dao.CityDao;
import com.softtech.softtechspringboot.entity.City;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityEntityService {
    private final CityDao cityDao;


    public City save(City city){

        return cityDao.save(city);
    }

    public Optional<City> findById(String id){

        return cityDao.findById(id);
    }
}
