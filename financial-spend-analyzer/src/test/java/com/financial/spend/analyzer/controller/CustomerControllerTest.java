package com.financial.spend.analyzer.controller;


import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import com.financial.spend.analyzer.model.CustomerInformation;

public class CustomerControllerTest {

	 @InjectMocks
	 CustomerController controller;
	
	@Test
	public void createCustomerTest() {
		CustomerInformation customerInformation = new CustomerInformation(1, "Abdul", "Shaik", "9666994958", "abc@gmail.com",6706);
		 Mockito.when(controller.createCustomer(customerInformation));
	}
}
