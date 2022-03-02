package com.softtech.softtechspringboot.service.entityservice;

import com.softtech.softtechspringboot.dao.DistrictDao;
import com.softtech.softtechspringboot.entity.District;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DistrictEntityService {

    private final DistrictDao districtDao;

    public District save(District district){
        return districtDao.save(district);
    }

    public List<District> findAllByCityId(Long cityId){
        return districtDao.findAllByCityId(cityId);
    }
}