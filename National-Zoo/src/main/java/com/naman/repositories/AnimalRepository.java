package com.naman.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naman.entities.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
	

}
