package com.softtech.softtechspringboot.service.entityservice;

import com.softtech.softtechspringboot.converter.AddressMapper;
import com.softtech.softtechspringboot.dao.AddressDao;
import com.softtech.softtechspringboot.dto.AddressDetailDto;
import com.softtech.softtechspringboot.dto.AddressResponseDto;
import com.softtech.softtechspringboot.dto.AddressSaveRequestDto;
import com.softtech.softtechspringboot.entity.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressEntityService {

    private final AddressDao addressDao;

    public AddressResponseDto save(AddressSaveRequestDto addressSaveRequestDto){

        Address address = AddressMapper.INSTANCE.convertToAddress(addressSaveRequestDto);

        address = addressDao.save(address);

        AddressResponseDto addressResponseDto = AddressMapper.INSTANCE.convertToAddressResponseDto(address);

        return addressResponseDto;
    }

    public void delete(Long id){

        Address address = getById(id);

        addressDao.delete(address);
    }

    public AddressResponseDto findById(Long id){

        Address address = getById(id);

        AddressResponseDto addressResponseDto = AddressMapper.INSTANCE.convertToAddressResponseDto(address);

        return addressResponseDto;
    }

    public AddressDetailDto findAddressDetails(Long id){
        return addressDao.findAddressDetails(id);
    }

    private Address getById(Long id) {

        Optional<Address> addressOptional = addressDao.findById(id);

        Address address;
        if (addressOptional.isPresent()) {
            address = addressOptional.get();
        } else {
            throw new RuntimeException("Item not found!");
        }
        return address;
    }
}
