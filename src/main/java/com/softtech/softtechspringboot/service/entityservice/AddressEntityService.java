package com.softtech.softtechspringboot.service.entityservice;

import com.softtech.softtechspringboot.dao.AddressDao;
import com.softtech.softtechspringboot.entity.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressEntityService {

    private final AddressDao addressDao;
    public final AddressEntityService addressEntityService;

    public Address save(Address address){

        return addressDao.save(address);
    }

    public Optional<Address> findById(Integer id){

        return addressDao.findById(id);
    }

    public void delete(Address address){

        addressDao.delete(address);
    }

    public Address getByIdWithControl(Integer id) {

        Optional<Address> addressOptional = findById(id);

        Address address;
        if (addressOptional.isPresent()){
            address = addressOptional.get();
        }else{
          address=null;
        }
        return address;

    }
}
