package com.bill.team02.week4;

public class RateCalculation {

    private static final int RATE_OF_FAMILIY_DISCOUNT = 5;
    private static final int NUMBER_OF_APPLIED_DISCOUNT_USER = 3;
    private static final int NUMBER_OF_NOT_APPLIED_DISCOUNT_USER = 2;
    private static final int THE_MAIN_USER = 1;
    private static final int BORDER_OF_FAMILIY_DISCOUNT = 3;

    public RateCalculation() {
    }

    public double getBasicMonthlyRate(Plan plan) {
        return plan.getBasicRate();
    }

    public double getAdditionalLineRate(Plan plan, int aNumberOfLine) {
        if (aNumberOfLine < BORDER_OF_FAMILIY_DISCOUNT) {
            return plan.getAdditionLineRate() * (aNumberOfLine - THE_MAIN_USER);
        } else {
            return (plan.getAdditionLineRate() * NUMBER_OF_NOT_APPLIED_DISCOUNT_USER)
                    + ((aNumberOfLine - NUMBER_OF_APPLIED_DISCOUNT_USER) * RATE_OF_FAMILIY_DISCOUNT);
        }
    }

    public double getAdditionalMinuteRate(Plan plan, Line[] arrayLine) {
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

    public double getTotalRate(double basicMonthlyRate, double additionalLineRate,
            double additionalMinuterRate) {
        return basicMonthlyRate + additionalLineRate + additionalMinuterRate;
    }
}
