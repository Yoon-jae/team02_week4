package com.bill.team02.week4;

public class RateCalculation {

	public static double getBasicMonthlyRate(Plan aPlan) {
		return aPlan.getBasicRate();
	}

	public static double getAdditionaLineRate(Plan aPlan, int aNumberOfLine) {
		if (aNumberOfLine < 3) {
			return aPlan.getAdditionalLineRate() * (aNumberOfLine - 1);
		} else {
			return (aPlan.getAdditionalLineRate() * 2) + ((aNumberOfLine - 2) * 5);
		}
	}

	public static double getAdditionalMinuteRate(Plan aPlan, Line aLine) {
		if (aLine.getUsedMinutes() > aPlan.getBasicMinute()) {
			return 0;
		} else {
			return aPlan.getRatePerExcessMinute() * (aLine.getUsedMinutes() - aPlan.getBasicMinute());
		}
	}

	public static double getTotalRate(double basicMonthlyRate, double additionalLineRate,
			double additionalMinuterRate) {
		return basicMonthlyRate + additionalLineRate + additionalMinuterRate;
	}

}
