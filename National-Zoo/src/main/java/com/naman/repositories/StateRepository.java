package com.naman.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naman.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
