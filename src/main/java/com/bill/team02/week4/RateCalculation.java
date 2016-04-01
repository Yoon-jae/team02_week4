package com.bill.team02.week4;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

public class RateCalculation {
	
	private static Logger logger = Logger.getLogger("My Logger");

	private static final int RATE_OF_FAMILIY_DISCOUNT = 5;
	private static final int NUMBER_OF_APPLIED_DISCOUNT_USER = 3;
	private static final int NUMBER_OF_NOT_APPLIED_DISCOUNT_USER = 2;
	private static final int THE_MAIN_USER = 1;
	private static final int BORDER_OF_FAMILIY_DISCOUNT = 3;

	private RateCalculation() {

	}

	public static double getBasicMonthlyRate(Plan plan) {
		return plan.getBasicRate();
	}

	public static double getAdditionalLineRate(Plan plan, int aNumberOfLine) {
		if (aNumberOfLine < BORDER_OF_FAMILIY_DISCOUNT) {
			return plan.getAdditionalLineRate() * (aNumberOfLine - THE_MAIN_USER);
		} else {
			return (plan.getAdditionalLineRate() * NUMBER_OF_NOT_APPLIED_DISCOUNT_USER)
					+ ((aNumberOfLine - NUMBER_OF_APPLIED_DISCOUNT_USER) * RATE_OF_FAMILIY_DISCOUNT);
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
		logger.setUseParentHandlers(false);
		logger.addHandler(new StreamHandler(System.err, new SimpleFormatter()));
		logger.log(Level.INFO, "basicMonthlyRate : " + basicMonthlyRate + "\nadditionalLineRate : " + additionalLineRate
				+ "\nadditionalMinuterRate : " + additionalMinuterRate + "\n");
		
		return basicMonthlyRate + additionalLineRate + additionalMinuterRate;
	}

}
