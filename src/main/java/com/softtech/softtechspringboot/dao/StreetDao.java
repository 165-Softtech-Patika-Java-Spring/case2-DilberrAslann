package com.softtech.softtechspringboot.dao;


import com.softtech.softtechspringboot.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetDao extends JpaRepository<Street, Integer> {
}
