package com.softtech.softtechspringboot.dao;

import com.softtech.softtechspringboot.entity.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NeighborhoodDao extends JpaRepository<Neighborhood, Long> {

    List<Neighborhood> findAllByDistrictId(Long districtId);
}