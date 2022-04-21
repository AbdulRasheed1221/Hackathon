package com.financial.spend.analyzer.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.financial.spend.analyzer.dao.CustomerRepository;
import com.financial.spend.analyzer.model.CustomerInformation;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SpringExtension.class)
public class CustomerServiceImplTest {

	@InjectMocks
	CustomerServiceImpl service;

	@Mock
	private CustomerRepository repo;

	@Test
	public void createCustomerTest() {
		CustomerInformation customer = new CustomerInformation();
		customer.setFirst_name("Shaik");
		customer.setAdhar_number(123456789);
		service.createCustomer(customer);

	}

}
