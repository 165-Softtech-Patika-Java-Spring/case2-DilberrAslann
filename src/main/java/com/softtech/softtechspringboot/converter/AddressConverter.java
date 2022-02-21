package com.softtech.softtechspringboot.converter;

import com.softtech.softtechspringboot.dto.AddressDto;
import com.softtech.softtechspringboot.entity.Address;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AddressConverter {
    public List<AddressDto> convertToAddressDtoList(List<Address> addressList) {

        List<AddressDto> addressDtoList = new ArrayList<>();

        for (Address address : addressList) {

            AddressDto addressDto = convertToAddressDto(address);

            addressDtoList.add(addressDto);
        }

        return addressDtoList;
    }
//Bu kısım Address i AddressDto olarak dönüştürür.

    public AddressDto convertToAddressDto(Address address) {
        AddressDto addressDto = new AddressDto();
      //  addressDto.setId(Address.getId());
        addressDto.setCountry(address.getCountry());
        addressDto.setCity(address.getCity());
        addressDto.setDistrict(address.getDistrict());
        addressDto.setNeighborhood(address.getNeighborhood());
        addressDto.setApartmentNumber(address.getApartmentNumber());
        addressDto.setDoorNumber(address.getDoorNumber());
        return addressDto;
    }
}
