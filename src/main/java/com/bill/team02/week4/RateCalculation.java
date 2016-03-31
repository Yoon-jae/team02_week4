package com.bill.team02.week4;

public class RateCalculation {

	public static double getBasicMonthlyRate(Plan plan) {
		return plan.getBasicRate();
	}

	public static double getAdditionalLineRate(Plan plan, int aNumberOfLine) {
		if (aNumberOfLine < 3) {
			return plan.getAdditionalLineRate() * (aNumberOfLine - 1);
		} else {
			return (plan.getAdditionalLineRate() * 2) + ((aNumberOfLine - 2) * 5);
		}
	}

	public static double getAdditionalMinuteRate(Plan plan, Line[] arrayLine) {
		int sumOfMinutes = 0;

		for (int i = 0; i < arrayLine.length; i++) {
			sumOfMinutes += arrayLine[i].getUsedMinutes();
		}
		if (sumOfMinutes < plan.getBasicMinute()) {
			return 0;
		} else {
			return plan.getRatePerExcessMinute() * (sumOfMinutes - plan.getBasicMinute());
		}
	}

	public static double getTotalRate(double basicMonthlyRate, double additionalLineRate,
			double additionalMinuterRate) {
		return basicMonthlyRate + additionalLineRate + additionalMinuterRate;
	}

}
