package com.bill.team02.week4;

public class ClientAccountData {
	
	Plan plan;
	Line[] line;
	String hostName;
	String emailAddress;
	
	public ClientAccountData(String[] accountData){
		
	}
	
	public double calculateRate(){
		double basicMonthlyRate = RateCalculation.getBasicMonthlyRate(plan);
		double additionalLineRate = RateCalculation.getAdditionaLineRate(plan, line.length);
		double additionalMinuteRate = RateCalculation.getAdditionalMinuteRate(plan, line);
		return RateCalculation.getTotalRate(basicMonthlyRate, additionalLineRate, additionalMinuteRate);
	}
	

}
