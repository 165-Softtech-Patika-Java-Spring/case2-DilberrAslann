package com.softtech.softtechspringboot.dao;

import com.softtech.softtechspringboot.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictDao extends JpaRepository<District, Integer> {
}
