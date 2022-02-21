package com.softtech.softtechspringboot.service.entityservice;

import com.softtech.softtechspringboot.dao.NeighborhoodDao;
import com.softtech.softtechspringboot.entity.Neighborhood;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NeighborhoodEntityService {

    private final NeighborhoodDao neighborhoodDao;

    public Neighborhood save(Neighborhood neighborhood){

        return neighborhoodDao.save(neighborhood);
    }

    public Optional<Neighborhood> findById(Integer id){

        return neighborhoodDao.findById(id);
    }

   /* public Neighborhood update(Neighborhood neighborhood) {

        return  neighborhoodDao.update(neighborhood);
    }*/
}
