package com.bill.team02.week4;

public class ClientAccountData {

    private Plan plan;
    private Line[] arrayLine;
    private String hostName;
    private String emailAddress;
    private double basicMonthlyRate;
    private double additionalLineRate;
    private double additionalMinuteRate;

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
        return RateCalculation.getTotalRate(basicMonthlyRate, additionalLineRate, additionalMinuteRate);
    }

    public double getBasicMonthlyRate() {
        basicMonthlyRate = RateCalculation.getBasicMonthlyRate(plan);
        return basicMonthlyRate;
    }

    public double getAdditionalLineRate() {
        additionalLineRate = RateCalculation.getAdditionalLineRate(plan, arrayLine.length);
        return additionalLineRate;
    }

    public double getAdditionalMinuteRate() {
        additionalMinuteRate = RateCalculation.getAdditionalMinuteRate(plan, arrayLine);
        return additionalMinuteRate;
    }

    public static int getNumberOfLineIndexZero() {
        return NUMBER_OF_LINE_INDEX_ZERO;
    }

    public static int getNumberOfLineIndexOne() {
        return NUMBER_OF_LINE_INDEX_ONE;
    }

    public static int getNumberOfLineIndexTwo() {
        return NUMBER_OF_LINE_INDEX_TWO;
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
        if(arrayLine.length<4){
            return "* You cannot get family discount. *";
        }
        else{
            return "* You got family discount. *";
        }
    }

    private void checkAndSetPlan(String plan) {
        if ("Gold".equals(plan)) {
            this.plan = new Gold();
        } else if ("Silver".equals(plan)) {
            this.plan = new Silver();
        } else {
            throw new IllegalArgumentException("There isn't such plan");
        }
    }

}
