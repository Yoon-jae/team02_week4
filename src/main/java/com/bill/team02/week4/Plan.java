package com.bill.team02.week4;

public class Plan {
    private final double BASIC_RATE;
    private final int BASIC_MINUTE;
    private final double ADDITIONAL_LINE_RATE;
    private final double RATE_PER_EXCESS_MINUTES;
    private final String PLAN_NAME;

    public Plan(double basic_rate, int basic_minute, double additional_line_rate, double rate_per_excess_minute,
            String plan_name) {
        this.BASIC_RATE = basic_rate;
        this.BASIC_MINUTE = basic_minute;
        this.ADDITIONAL_LINE_RATE = additional_line_rate;
        this.RATE_PER_EXCESS_MINUTES = rate_per_excess_minute;
        this.PLAN_NAME = plan_name;
    }

    public double getBasicRate() {
        return BASIC_RATE;
    }

    public int getBasicMinute() {
        return BASIC_MINUTE;
    }

    public double getAdditionalLineRate() {
        return ADDITIONAL_LINE_RATE;
    }

    public double getRatePerExcessMinute() {
        return RATE_PER_EXCESS_MINUTES;
    }

    public String getPlanName() {
        return PLAN_NAME;
    }

}
