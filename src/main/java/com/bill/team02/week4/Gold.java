package com.bill.team02.week4;

public class Gold extends Plan {

    private static final double BASIC_RATE = 49.95;
    private static final int BASIC_MINUTE = 1000;
    private static final double ADDITIONAL_LINE_RATE = 14.50;
    private static final double RATE_PER_EXCESS_MINUTES = 0.45;
    private static final String PLAN_NAME = "Gold";

    public Gold() {
        super(BASIC_RATE, BASIC_MINUTE, ADDITIONAL_LINE_RATE, RATE_PER_EXCESS_MINUTES, PLAN_NAME);
    }
}
