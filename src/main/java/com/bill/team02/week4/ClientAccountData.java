package com.bill.team02.week4;

public class ClientAccountData {

    private Plan plan;
    private Line[] arrayLine;
    private String hostName;
    private String emailAddress;

    private static final int NUMBEROFLINEINDEXZERO = 0;
    private static final int NUMBEROFLINEINDEXONE = 1;
    private static final int NUMBEROFLINEINDEXTWO = 2;

    public ClientAccountData(String[] accountData) {
        this.checkAndSetPlan(accountData[accountData.length - NUMBEROFLINEINDEXONE]);
        arrayLine = new Line[Integer.parseInt(accountData[accountData.length - NUMBEROFLINEINDEXTWO])];
        for (int i = 0; i < accountData.length - NUMBEROFLINEINDEXTWO; i++) {
            int newIndex = i / NUMBEROFLINEINDEXTWO;
            if (i % NUMBEROFLINEINDEXTWO == NUMBEROFLINEINDEXZERO) {
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
        } else {
            this.plan = new Silver();
            throw new IllegalArgumentException("No such plan");

        }
    }

}
