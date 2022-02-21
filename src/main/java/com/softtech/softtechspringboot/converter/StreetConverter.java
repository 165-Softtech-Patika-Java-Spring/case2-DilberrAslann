package com.softtech.softtechspringboot.converter;


import com.softtech.softtechspringboot.dto.StreetDto;
import com.softtech.softtechspringboot.entity.Street;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StreetConverter {
    public List<StreetDto> convertToStreetDtoList(List<Street> streetList) {

        List<StreetDto> streetDtoList = new ArrayList<>();

        for (Street street : streetList) {

            StreetDto streetDto = convertToStreetDto(street);

            streetDtoList.add(streetDto);
        }

        return streetDtoList;
    }
//Bu kısım Street i StreetDto olarak dönüştürür.

    public StreetDto convertToStreetDto(Street street) {
        StreetDto streetDto=new StreetDto();

        streetDto.setId((street.getId()));
        streetDto.setName((street.getName()));
        streetDto.setNeighborhoodId((street.getNeighborhoodId()));
        return  streetDto;
    }
}
