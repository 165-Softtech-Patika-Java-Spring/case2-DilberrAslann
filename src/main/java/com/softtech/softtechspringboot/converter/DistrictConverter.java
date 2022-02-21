package com.softtech.softtechspringboot.converter;


import com.softtech.softtechspringboot.dto.DistrictDto;
import com.softtech.softtechspringboot.entity.District;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DistrictConverter {
    public List<DistrictDto> convertToDistrictDtoList(List<District> districtList) {

        List<DistrictDto> districtDtoList = new ArrayList<>();

        for (District district : districtList) {

            DistrictDto districtDto = convertToDistrictDto(district);

            districtDtoList.add(districtDto);
        }

        return districtDtoList;
    }
//Bu kısım District i DistrictDto olarak dönüştürür.

    public DistrictDto convertToDistrictDto(District district) {
        DistrictDto districtDto=new DistrictDto();
        districtDto.setId((district.getId()));
        districtDto.setName((district.getName()));
        districtDto.setCityId(district.getCityId());
        return  districtDto;
    }

}
