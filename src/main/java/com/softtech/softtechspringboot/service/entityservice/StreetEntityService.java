package com.softtech.softtechspringboot.service.entityservice;

import com.softtech.softtechspringboot.dao.StreetDao;
import com.softtech.softtechspringboot.entity.Street;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StreetEntityService {
    private final StreetDao streetDao;

    public Street save(Street street){

        return streetDao.save(street);
    }

    public Optional<Street> findById(Integer id){

        return streetDao.findById(id);
    }
}
