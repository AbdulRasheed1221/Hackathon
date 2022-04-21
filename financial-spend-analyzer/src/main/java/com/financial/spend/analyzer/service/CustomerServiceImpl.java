package com.financial.spend.analyzer.service;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.financial.spend.analyzer.dao.CustomerRepository;
import com.financial.spend.analyzer.exception.ErrorDetails;
import com.financial.spend.analyzer.exception.ProviderInfo;
import com.financial.spend.analyzer.model.CustomerInformation;

@Service
public class CustomerServiceImpl implements CustomerService {

	private Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	private CustomerRepository customerRepository;

	@SuppressWarnings("unused")
	@Override
	public ResponseEntity<?> createCustomer(@Valid CustomerInformation customer) {
		ProviderInfo providerInfo = new ProviderInfo();
		ErrorDetails error = new ErrorDetails();
		try {
			customerRepository.save(customer);
			logger.debug(" create customer  response ::" + customer.toString());
			if (customer != null) {
				providerInfo.setStatusCode("201");
				providerInfo.setMessage("Successfully Created The Customer");
				return new ResponseEntity<ProviderInfo>(providerInfo, HttpStatus.CREATED);
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
