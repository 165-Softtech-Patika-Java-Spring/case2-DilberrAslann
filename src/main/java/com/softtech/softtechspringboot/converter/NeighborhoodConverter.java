package com.softtech.softtechspringboot.converter;

import com.softtech.softtechspringboot.dto.NeighborhoodDto;
import com.softtech.softtechspringboot.entity.Neighborhood;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class NeighborhoodConverter {
    public List<NeighborhoodDto> convertToNeighborhoodDtoList(List<Neighborhood> neighborhoodList) {

        List<NeighborhoodDto> neighborhoodDtoList = new ArrayList<>();

        for (Neighborhood neighborhood : neighborhoodList) {

            NeighborhoodDto neighborhoodDto = convertToNeighborhoodDto(neighborhood);

            neighborhoodDtoList.add(neighborhoodDto);
        }

        return neighborhoodDtoList;
    }

    public NeighborhoodDto convertToNeighborhoodDto(Neighborhood neighborhood) {
        NeighborhoodDto neighborhoodDto=new NeighborhoodDto();

        neighborhoodDto.setId((neighborhood.getId()));
        neighborhoodDto.setName((neighborhood.getName()));
        neighborhoodDto.setDistrictId((neighborhood.getDistrictId()));
        return  neighborhoodDto;
    }
}
