package com.springbootorm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootorm.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
