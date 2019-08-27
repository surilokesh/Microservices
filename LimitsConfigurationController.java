package com.practice.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public LimitsConfiguartion getLimits() {
		
		return (new LimitsConfiguartion(configuration.getMinimum(), configuration.getMaxmimum()));
		
	}
	
}
