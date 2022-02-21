package com.softtech.softtechspringboot.service;

import com.softtech.softtechspringboot.converter.CountryConverter;
import com.softtech.softtechspringboot.converter.DistrictConverter;
import com.softtech.softtechspringboot.dto.CountryDto;
import com.softtech.softtechspringboot.dto.DistrictDto;
import com.softtech.softtechspringboot.entity.Country;
import com.softtech.softtechspringboot.entity.District;
import com.softtech.softtechspringboot.service.entityservice.CountryEntityService;
import com.softtech.softtechspringboot.service.entityservice.DistrictEntityService;
import lombok.RequiredArgsConstructor;
import org.hibernate.criterion.Distinct;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DistrictService {
    private final DistrictEntityService districtEntityService;
    private final DistrictConverter districtConverter;

    public DistrictDto findById(int id) {

        Optional<District> district =districtEntityService.findById(id);

        DistrictDto districtDto = districtConverter.convertToDistrictDto(district.orElse(null));

        return districtDto;
    }

    public District save(District district) {

        return districtEntityService.save(district);
    }
}
