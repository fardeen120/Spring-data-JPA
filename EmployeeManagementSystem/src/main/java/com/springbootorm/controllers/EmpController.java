package com.springbootorm.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootorm.entities.Address;
import com.springbootorm.entities.Employee;
import com.springbootorm.service.EmployeeService;

@RestController
public class EmpController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping("/employee")
	public List<Employee>getemployee(){
		
		return this.employeeservice.getEmployee();
		}
	
	@GetMapping("/employee/{empid}")
	public Optional<Employee> getempbyid(@PathVariable String empid) {
		return this.employeeservice.getEmployeebyId(Long.parseLong(empid));
	}
	
	@PostMapping("/employee")
	public Employee addemployee(@RequestBody Employee employee) {
		return this.employeeservice.addemployee(employee);
	}
	
	@PutMapping("/employee")
	public Employee updateemployee(@RequestBody Employee employee) {
		return this.employeeservice.updateemployee(employee);
	}
	
	@DeleteMapping("/employee/{empid}")
	public ResponseEntity<HttpStatus> deleteemployee(@PathVariable String empid) {
		try {
			
			this.employeeservice.deleteemployee(Long.parseLong(empid));
			return new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PostMapping("/address/employee")
	public Employee saveempaddress(@RequestBody Employee employee) {
		return this.employeeservice.saveemployeeaddress(employee);
		
	}
	
	@GetMapping("/address/employee/{empid}")
	public Optional<Employee> getempaddressbyid(@PathVariable String empid) {
		return this.employeeservice.getEmployeeAddressbyId(Long.parseLong(empid));
	}
	
	
	

}
