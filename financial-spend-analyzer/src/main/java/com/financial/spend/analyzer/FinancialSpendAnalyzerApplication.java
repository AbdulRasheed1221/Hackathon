package com.financial.spend.analyzer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class FinancialSpendAnalyzerApplication {

	private static Logger logger = LoggerFactory.getLogger(FinancialSpendAnalyzerApplication.class);

	public static void main(String[] args) {
		logger.debug("FinancialSpendAnalyzerApplication starts....");
		SpringApplication.run(FinancialSpendAnalyzerApplication.class, args);
		logger.debug("FinancialSpendAnalyzerApplication started successfully");
	}

}
