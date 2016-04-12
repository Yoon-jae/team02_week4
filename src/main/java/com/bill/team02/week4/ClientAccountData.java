package com.bill.team02.week4;

public class ClientAccountData {

    private static final int BOUND_OF_FAMILY_DISCOUNT = 4;
    private Plan plan;
    private Line[] arrayLine;
    private RateCalculation rCalculation;
    private double basicMonthlyRate;
    private double additionalLineRate;
    private double additionalMinuteRate;

    private static final int NUMBER_OF_LINE_INDEX_ZERO = 0;
    private static final int NUMBER_OF_LINE_INDEX_ONE = 1;
    private static final int NUMBER_OF_LINE_INDEX_TWO = 2;

    public ClientAccountData(String[] accountData) {
        rCalculation = new RateCalculation();
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

    public double calculateRate() {
        return rCalculation.getTotalRate(basicMonthlyRate, additionalLineRate, additionalMinuteRate);
    }

    public double getBasicMonthlyRate() {
        basicMonthlyRate = rCalculation.getBasicMonthlyRate(plan);
        return basicMonthlyRate;
    }

    public double getAdditionalLineRate() {
        additionalLineRate = rCalculation.getAdditionalLineRate(plan, arrayLine.length);
        return additionalLineRate;
    }

    public double getAdditionalMinuteRate() {
        additionalMinuteRate = rCalculation.getAdditionalMinuteRate(plan, arrayLine);
        return additionalMinuteRate;
    }

    public Plan getPlan() {
        return plan;
    }

    public Line[] getArrayLine() {
        return arrayLine;
    }

    public double getTotalMinutes() {
        double totalMinutes = 0;
        for (int i = 0; i < arrayLine.length; i++) {
            totalMinutes += arrayLine[i].getUsedMinutes();
        }
        return totalMinutes;
    }

    public String checkFamilyDiscountAndPrint() {
        int numOfLines = arrayLine.length; 
        if (numOfLines < BOUND_OF_FAMILY_DISCOUNT) {
            return "\n*         You cannot get family discount.         *";
        } else {
            return "\n*         You've got family discount.         *";
        }
    }

    private void checkAndSetPlan(String plan) {
        if ("gold".equals(plan)) {
            this.plan = new Gold();
        } else if ("silver".equals(plan)) {
            this.plan = new Silver();
        } else {
            throw new IllegalArgumentException("There isn't such plan");
        }
    }

}
