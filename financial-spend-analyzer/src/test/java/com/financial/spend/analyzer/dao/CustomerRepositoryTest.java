package com.financial.spend.analyzer.dao;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.financial.spend.analyzer.model.CustomerInformation;

@SpringBootTest
public class CustomerRepositoryTest {
	
	 @Autowired
	    private CustomerRepository customerRepository;
	 
	 @Test
	    public void testCreateCustomer() throws Exception {
		 
		 CustomerInformation customerInformation = new CustomerInformation(1, "Abdul", "Shaik", "9666994958", "abc@gmail.com",6706);
		 customerRepository.save(customerInformation);
	 }

}
