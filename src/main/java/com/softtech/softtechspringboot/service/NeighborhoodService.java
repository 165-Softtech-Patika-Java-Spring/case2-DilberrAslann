package com.softtech.softtechspringboot.service;

import com.softtech.softtechspringboot.converter.NeighborhoodConverter;
import com.softtech.softtechspringboot.dto.NeighborhoodDto;
import com.softtech.softtechspringboot.entity.Neighborhood;
import com.softtech.softtechspringboot.service.entityservice.NeighborhoodEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NeighborhoodService {
    private final NeighborhoodEntityService neighborhoodEntityService;
    private final NeighborhoodConverter neighborhoodConverter;


    public NeighborhoodDto findById(int id) {

        Optional<Neighborhood> neighborhood =neighborhoodEntityService.findById(id);

        NeighborhoodDto neighborhoodDto = neighborhoodConverter.convertToNeighborhoodDto(neighborhood.orElse(null));

        return neighborhoodDto;
    }

    public Neighborhood save(Neighborhood neighborhood) {

        return neighborhoodEntityService.save(neighborhood);
    }


   /* public Neighborhood update(int neighborhoodid, String name) {

        Neighborhood neighborhood= neighborhoodDao.getById(neighborhoodid);

        neighborhood.setName(name);

        return neighborhoodDao.save(neighborhood);
    }*/



}
