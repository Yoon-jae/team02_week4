package com.bill.team02.week4;

import java.util.logging.Logger;

public class ClientAccountData {

	private Plan plan;
	private Line[] arrayLine;
	private String hostName;
	private String emailAddress;
	
	private static final int NUMBER_OF_LINE_INDEX_ZERO = 0;
	private static final int NUMBER_OF_LINE_INDEX_ONE = 1;
	private static final int NUMBER_OF_LINE_INDEX_TWO = 2;

	public ClientAccountData(String[] accountData) {
		this.checkAndSetPlan(accountData[accountData.length - NUMBER_OF_LINE_INDEX_ONE]);
		arrayLine = new Line[Integer.parseInt(accountData[accountData.length - NUMBER_OF_LINE_INDEX_TWO])];
		for (int i = 0; i < accountData.length - NUMBER_OF_LINE_INDEX_TWO; i++) {
			int newIndex = i / NUMBER_OF_LINE_INDEX_TWO;
			if (i % NUMBER_OF_LINE_INDEX_TWO == NUMBER_OF_LINE_INDEX_ZERO) {
				arrayLine[newIndex] = new Line(accountData[i]);
			} else {
				arrayLine[newIndex].setUsedMinutes(Double.parseDouble(accountData[i]));
			}
		}
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public double calculateRate() {
		double basicMonthlyRate = RateCalculation.getBasicMonthlyRate(plan);
		double additionalLineRate = RateCalculation.getAdditionalLineRate(plan, arrayLine.length);
		double additionalMinuteRate = RateCalculation.getAdditionalMinuteRate(plan, arrayLine);
		return RateCalculation.getTotalRate(basicMonthlyRate, additionalLineRate, additionalMinuteRate);
	}

	private void checkAndSetPlan(String plan) {
		if ("Gold".equals(plan)) {
			this.plan = new Gold();
		} else if ("Silver".equals(plan)) {
			this.plan = new Silver();
		} else {
			throw new IllegalArgumentException("No such plan");
		}
	}
}
