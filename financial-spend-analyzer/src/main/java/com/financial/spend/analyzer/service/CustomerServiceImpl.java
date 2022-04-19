package com.financial.spend.analyzer.service;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.financial.spend.analyzer.dao.CustomerRepository;
import com.financial.spend.analyzer.model.CustomerInformation;

@Service
public class CustomerServiceImpl implements CustomerService {

	private Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public ResponseEntity<?> createCustomer(@Valid CustomerInformation customer) {
		customerRepository.save(customer);
		logger.debug(" create customer  response ::" + customer.toString());
		return ResponseEntity.ok().body(customer);

	}

}
