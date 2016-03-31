package com.bill.team02.week4;

public class ClientAccountData {
	
	Plan plan;
	Line[] arrayLine;
	String hostName;
	String emailAddress;
	
	public ClientAccountData(String[] accountData){
		this.checkAndSetPlan(accountData[accountData.length-1]);
		arrayLine = new Line[Integer.parseInt(accountData[accountData.length-2])];
		for(int i=0; i<accountData.length-2; i++){
			int newIndex = i/2;
			if(i%2 == 0) {
				arrayLine[newIndex] = new Line(accountData[i]);
			}
			else {
				arrayLine[newIndex].setUsedMinutes(Double.parseDouble(accountData[i]));
			}
		}
	}
	
	public double calculateRate(){
		double basicMonthlyRate = RateCalculation.getBasicMonthlyRate(plan);
		double additionalLineRate = RateCalculation.getAdditionalLineRate(plan, arrayLine.length);
		double additionalMinuteRate = RateCalculation.getAdditionalMinuteRate(plan, arrayLine);
		return RateCalculation.getTotalRate(basicMonthlyRate, additionalLineRate, additionalMinuteRate);
	}
	
	private void checkAndSetPlan(String plan){
		if(plan.equals("Gold")){
			this.plan = new Gold();
		}
		else if(plan.equals("Silver")){
			this.plan = new Silver();
		}
		else{
			System.out.println("There isn't such plan");
		}
	}

}
