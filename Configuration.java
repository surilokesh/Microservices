package com.practice.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;



@ConfigurationProperties("limits-service")
public class Configuration {

	private int minimum;
	private int maxmimum;
	
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaxmimum() {
		return maxmimum;
	}
	public void setMaxmimum(int maxmimum) {
		this.maxmimum = maxmimum;
	}
	
}
