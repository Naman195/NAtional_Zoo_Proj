package com.naman.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naman.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {
	

}
