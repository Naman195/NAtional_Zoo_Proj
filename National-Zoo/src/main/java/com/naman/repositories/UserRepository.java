package com.naman.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naman.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
