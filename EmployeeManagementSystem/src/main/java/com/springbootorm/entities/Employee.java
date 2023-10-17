package com.springbootorm.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee  {
	
	

	@Id
	private long employeeid;
	
	private String empname;
	private String about;
	
	
	@OneToOne(cascade = CascadeType.ALL , mappedBy = "employee")
	@JsonManagedReference
	private Laptop laptop;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "employee",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("employee")
	@JsonManagedReference
	private List<Address>addlist = new ArrayList<>();
	
	

	public Employee(long employeeid, String empname, String about, Laptop laptop, List<Address> addlist) {
		super();
		this.employeeid = employeeid;
		this.empname = empname;
		this.about = about;
		this.laptop = laptop;
		this.addlist = addlist;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	
	
	public List<Address> getAddlist() {
		return addlist;
	}

	public void setAddlist(List<Address> addlist) {
		this.addlist = addlist;
	}

	
	
	
	
	
	
	
	}
