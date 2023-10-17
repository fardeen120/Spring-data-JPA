package com.springbootorm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootorm.dao.EmployeeDao;
import com.springbootorm.entities.Address;
import com.springbootorm.entities.Employee;

@Service
public class EmployeeServiceimpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeedao;

	@Override
	public List<Employee> getEmployee() {
		
		return employeedao.findAll();
	}

	@Override
	public Optional<Employee> getEmployeebyId(long empid) {
		
		return employeedao.findById(empid);
	}

	@Override
	public Employee addemployee(Employee employee) {
		
		return employeedao.save(employee);
	}

	@Override
	public Employee updateemployee(Employee employee) {
		
		return employeedao.save(employee);
	}

	@Override
	public void deleteemployee(long parseLong) {
		Employee entity=employeedao.getOne(parseLong);
		employeedao.delete(entity);
		
	}
	
	public Employee saveemployeeaddress(Employee employee) {
		List<Address>addlist = new ArrayList<>();
		
		Address a1 = new Address();
		a1.setAddressid(1212);
		a1.setStreet("beconganj");
		a1.setCity("kanpur");
		a1.setCountry("India");
		
		Address a2 = new Address();
		a2.setAddressid(1217);
		a2.setStreet("kondhwa");
		a2.setCity("pune");
		a2.setCountry("India");
		
		Address a3 = new Address();
		a3.setAddressid(1219);
		a3.setStreet("kudasan");
		a3.setCity("gujrat");
		a3.setCountry("India");
//		one to many
		addlist.add(a1);
		addlist.add(a2);
		addlist.add(a3);
		
//		many to one
		a1.setEmployee(employee);
		a2.setEmployee(employee);
		a3.setEmployee(employee);
		
		employee.setAddlist(addlist);
		employee=employeedao.save(employee);
		return employee;
		
	}

	@Override
	public Optional<Employee> getEmployeeAddressbyId(long empid) {
		
		return this.employeedao.findById(empid);
	}

}
