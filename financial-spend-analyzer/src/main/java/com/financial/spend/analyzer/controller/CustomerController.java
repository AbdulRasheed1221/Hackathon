package com.financial.spend.analyzer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.financial.spend.analyzer.model.*;
import com.financial.spend.analyzer.service.CustomerService;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

	private Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer/register")
	public ResponseEntity<?> createCustomer(@Valid @RequestBody CustomerInformation customer) {
		ResponseEntity<?> customerResponseDto = null;
		
		logger.debug("Invoke create customer service");
		customerResponseDto = customerService.createCustomer(customer);
		logger.debug("customerResponse ::" + customerResponseDto.toString());

		return customerResponseDto;
	}
}