package com.bill.team02.week4;

public class Silver extends Plan {

    private static final double BASIC_RATE = 29.95;
    private static final int BASIC_MINUTE = 500;
    private static final double ADDITIONAL_LINE_RATE = 21.50;
    private static final double RATE_PER_EXCESS_MINUTES = 0.54;
    private static final String PLAN_NAME = "Silver";

    public Silver() {
        super(BASIC_RATE, BASIC_MINUTE, ADDITIONAL_LINE_RATE, RATE_PER_EXCESS_MINUTES, PLAN_NAME);
    }

}
