package com.bill.team02.week4;

public class Plan {
	
	private double basicRate;
	private int basicMinute;
	private double additionalLineRate;
	private double ratePerExcessMinute;
	private String planName;
	
	public double getBasicRate() {
		return basicRate;
	}
	
	public int getBasicMinute() {
		return basicMinute;
	}
	
	public double getAdditionalLineRate() {
		return additionalLineRate;
	}

	public double getRatePerExcessMinute() {
		return ratePerExcessMinute;
	}
	
	public String getPlanName(){
		return planName;
	}
}
