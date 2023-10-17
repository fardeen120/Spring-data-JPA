package com.springbootorm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootorm.entities.Address;

public interface AddressDao extends JpaRepository<Address, Long> {

}
