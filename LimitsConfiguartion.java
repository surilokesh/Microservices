package com.practice.microservices.limitsservice;

public class LimitsConfiguartion {
	
	private int minLimit;
	
	private int maxLimit;

	public LimitsConfiguartion(int minLimit, int maxLimit) {
		
		this.minLimit = minLimit;
		this.maxLimit = maxLimit;
	}

	public int getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(int minLimit) {
		this.minLimit = minLimit;
	}

	public int getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}
	
	

}
