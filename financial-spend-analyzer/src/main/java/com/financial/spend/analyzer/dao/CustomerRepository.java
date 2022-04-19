package com.financial.spend.analyzer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financial.spend.analyzer.model.CustomerInformation;

public interface CustomerRepository extends JpaRepository<CustomerInformation, Long> {

}
