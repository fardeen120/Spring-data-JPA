package com.springbootorm.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {
	
	@Id
	private int laptopid;
	private String modelNumber;
	private String brand;
	
	@OneToOne()
	@JoinColumn(name = "employee id")
	@JsonBackReference
	private Employee employee;

	public Laptop(int laptopid, String modelNumber, String brand, Employee employee) {
		super();
		this.laptopid = laptopid;
		this.modelNumber = modelNumber;
		this.brand = brand;
		this.employee = employee;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getLaptopid() {
		return laptopid;
	}

	public void setLaptopid(int laptopid) {
		this.laptopid = laptopid;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
}
