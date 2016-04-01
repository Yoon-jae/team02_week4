package com.bill.team02.week4;

public class ClientAccountData{

	private Plan plan;
	private Line[] arrayLine;
	private String hostName;
	private String emailAddress;

	private final static int zero = 0;
	private final static int one = 1;
	private final static int two = 2;

	public ClientAccountData(String[] accountData){
		this.checkAndSetPlan(accountData[accountData.length-one]);
		arrayLine = new Line[Integer.parseInt(accountData[accountData.length-two])];
		for(int i=0; i<accountData.length-two; i++){
			int newIndex = i/two;
			if(i%two == zero) {
				arrayLine[newIndex] = new Line(accountData[i]);
			} else {
				arrayLine[newIndex].setUsedMinutes(Double.parseDouble(accountData[i]));
			}
		}
	}
	
	public String getHostName(){
		return hostName;
	}

	public void setHostName(String hostName){
		this.hostName = hostName;
	}

	public String getEmailAddress(){
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress){
		this.emailAddress = emailAddress;
	}

	public double calculateRate(){
		double basicMonthlyRate = RateCalculation.getBasicMonthlyRate(plan);
		double additionalLineRate = RateCalculation.getAdditionalLineRate(plan, arrayLine.length);
		double additionalMinuteRate = RateCalculation.getAdditionalMinuteRate(plan, arrayLine);
		return RateCalculation.getTotalRate(basicMonthlyRate, additionalLineRate, additionalMinuteRate);
	}

	private void checkAndSetPlan(String plan){
		if("Gold".equals(plan)){
			this.plan = new Gold();
		} else if("Silver".equals(plan)){
			this.plan = new Silver();
		} else{
			System.err.println("There isn't such plan");
		}
	}

}
