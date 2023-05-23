package com.OneToMany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import antlr.collections.List;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int AdressId;
	private String city,State;
	
	@OneToMany(cascade = CascadeType.ALL)
	private java.util.List<Employee> Emp;

	public int getAdressId() {
		return AdressId;
	}

	public void setAdressId(int adressId) {
		AdressId = adressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public java.util.List<Employee> getEmp() {
		return Emp;
	}

	public void setEmp(java.util.List<Employee> emp) {
		Emp = emp;
	}

	
	
	
	

}
