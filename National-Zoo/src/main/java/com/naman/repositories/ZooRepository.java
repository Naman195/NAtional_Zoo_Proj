package com.naman.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naman.entities.Zoo;

public interface ZooRepository extends JpaRepository<Zoo, Long> {

	
}
