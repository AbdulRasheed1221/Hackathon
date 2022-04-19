package com.financial.spend.analyzer.service;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.financial.spend.analyzer.model.CustomerInformation;

public interface CustomerService {

	ResponseEntity<?> createCustomer(@Valid CustomerInformation customer);

}
