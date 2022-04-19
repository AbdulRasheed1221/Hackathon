package com.financial.spend.analyzer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financial.spend.analyzer.exception.ErrorDetails;
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

	@SuppressWarnings("unused")
	@PostMapping("/customer/register")
	public ResponseEntity<?> createCustomer(@Valid @RequestBody CustomerInformation customer) {
		ResponseEntity<?> customerResponse = null;
		ProviderInfo providerInfo = new ProviderInfo();
		ErrorDetails error = new ErrorDetails();

		try {
			logger.debug("Invoke create customer service");
			customerResponse = customerService.createCustomer(customer);
			logger.debug("customerResponse ::" + customerResponse.toString());
			if (customerResponse != null) {
				providerInfo.setStatusCode("200");
				providerInfo.setMessage("Successfully Created Customer");
				return new ResponseEntity<ProviderInfo>(providerInfo, HttpStatus.OK);
			} else {
				error.setStatusCode("500");
				error.setMessage("The request is failed due to an Internal Server");

				return new ResponseEntity<ErrorDetails>(error, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		} catch (Exception e) {
			logger.debug("The request is failed due to  wrong input" + e.getMessage());
			error.setStatusCode("400");
			error.setMessage("bad request");
			return new ResponseEntity<ErrorDetails>(error, HttpStatus.BAD_REQUEST);

		}
	}
}