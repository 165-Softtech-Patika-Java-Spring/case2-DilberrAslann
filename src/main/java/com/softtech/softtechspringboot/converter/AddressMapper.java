package com.softtech.softtechspringboot.converter;

import com.softtech.softtechspringboot.dto.AddressResponseDto;
import com.softtech.softtechspringboot.dto.AddressSaveRequestDto;
import com.softtech.softtechspringboot.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address convertToAddress(AddressSaveRequestDto addressSaveRequestDto);

    AddressResponseDto convertToAddressResponseDto(Address address);

}
