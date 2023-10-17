package com.springbootorm.service;

import java.util.List;
import java.util.Optional;

import com.springbootorm.entities.Employee;

public interface EmployeeService {

	public List<Employee> getEmployee();

	public Optional<Employee> getEmployeebyId(long empid);

	public Employee addemployee(Employee employee);

	public Employee updateemployee(Employee employee);

	public void deleteemployee(long parseLong);

	public Employee saveemployeeaddress(Employee employee);

	public Optional<Employee> getEmployeeAddressbyId(long empid);

	
	

}
