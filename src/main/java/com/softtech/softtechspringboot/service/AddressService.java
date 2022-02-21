package com.softtech.softtechspringboot.service;

import com.softtech.softtechspringboot.converter.AddressConverter;
import com.softtech.softtechspringboot.dto.AddressDto;
import com.softtech.softtechspringboot.entity.Address;
import com.softtech.softtechspringboot.service.entityservice.AddressEntityService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressEntityService addressEntityService;
    private final AddressConverter addressConverter;

    public AddressDto findById(int id) {

        Optional<Address> address = addressEntityService.findById(id);

        AddressDto addressDto = addressConverter.convertToAddressDto(address.orElse(null));

        return addressDto;
    }

    public Address save(Address address) {

        return addressEntityService.save(address);
    }

    public void delete(int id) {

        Address address = addressEntityService.getByIdWithControl(id);

        addressEntityService.delete(address);
    }
}
