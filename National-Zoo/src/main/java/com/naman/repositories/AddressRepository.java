package com.naman.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naman.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	

}
