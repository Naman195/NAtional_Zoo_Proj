package com.naman.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naman.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
