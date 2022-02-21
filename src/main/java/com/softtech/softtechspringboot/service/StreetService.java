package com.softtech.softtechspringboot.service;

import com.softtech.softtechspringboot.converter.StreetConverter;
import com.softtech.softtechspringboot.dao.StreetDao;
import com.softtech.softtechspringboot.dto.StreetDto;
import com.softtech.softtechspringboot.entity.Street;
import com.softtech.softtechspringboot.service.entityservice.StreetEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StreetService {
    private final StreetEntityService streetEntityService;
    private final StreetConverter streetConverter;
   // private final StreetDao streetDao;

    public StreetDto findById(int id) {

        Optional<Street> street =streetEntityService.findById(id);

        StreetDto streetDto = streetConverter.convertToStreetDto(street.orElse(null));

        return streetDto;
    }

    public Street save(Street street) {

        return streetEntityService.save(street);
    }
}
