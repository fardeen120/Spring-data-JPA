package com.springbootorm.controllers;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootorm.dao.AddressDao;
import com.springbootorm.entities.Address;


@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private AddressDao addressdao;
	
	@GetMapping("/addresses")
	public List<Address>getaddressdetails(){
		List<Address> addressdetails =(List<Address>)addressdao.findAll();
		return addressdetails;
		
		
		
	}
	
	
	}


