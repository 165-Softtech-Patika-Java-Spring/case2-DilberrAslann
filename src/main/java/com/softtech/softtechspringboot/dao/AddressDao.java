package com.softtech.softtechspringboot.dao;

import com.softtech.softtechspringboot.dto.AddressDetailDto;
import com.softtech.softtechspringboot.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao extends JpaRepository<Address, Long> {

    @Query(" select new com.softtech.softtechspringboot.dto.AddressDetailDto( " +
            " country.name, city.name " +
            " ) " +
            " from Address adr left join Country country on adr.countryId = country.id " +
            " left join City city on adr.cityId = city.id " +
            "where adr.id = :id "
    )
    AddressDetailDto findAddressDetails(@Param("id") Long id);
}
