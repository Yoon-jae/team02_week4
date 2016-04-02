package com.bill.team02.week4;

public class Plan {
    private double basicRate;
    private int basicMinute;
    private double additionLineRate;
    private double ratePerExcessMinute;
    private String planName;

    public Plan(double basicRate, int basicMinute, double additionalLineRate, double ratePerExcessMinute,
            String planName) {
        this.basicRate = basicRate;
        this.basicMinute = basicMinute;
        this.additionLineRate = additionalLineRate;
        this.ratePerExcessMinute = ratePerExcessMinute;
        this.planName = planName;
    }

    public double getBasicRate() {
        return basicRate;
    }

    public int getBasicMinute() {
        return basicMinute;
    }

    public double getAdditionLineRate() {
        return additionLineRate;
    }

    public double getRatePerExcessMinute() {
        return ratePerExcessMinute;
    }

    public String getPlanName() {
        return planName;
    }
}
