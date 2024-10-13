package com.naman.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name  = "state_id")
	private Long stateId;
	
	@Column(name = "state_name", nullable = false)
	private String stateName;
	
	
	@ManyToOne
	@JoinColumn(name = "country_id", nullable = false)
	private Country country;


	public Long getStateId() {
		return stateId;
	}


	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public Country getCountry() {
		return country;
	}


	public void setCountry(Country country) {
		this.country = country;
	}
	
}
