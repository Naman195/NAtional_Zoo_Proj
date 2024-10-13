package com.naman.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class Zoo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name  = "zoo_id")
	private Long zooId;
	
	@Column(name = "zoo_name", nullable = false)
	private String zooName;
	
	@ManyToOne
	@JoinColumn(name = "address_id", nullable = true)
	private Address address;

	public Long getZooId() {
		return zooId;
	}

	public void setZooId(Long zooId) {
		this.zooId = zooId;
	}

	public String getZooName() {
		return zooName;
	}

	public void setZooName(String zooName) {
		this.zooName = zooName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
