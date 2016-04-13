package com.bill.team02.week4;

import static org.junit.Assert.*;

import org.junit.Test;

public class LineTest {

    Plan plan = new Plan(100.0, 1000, 200.0, 150.0, "planName");

    @Test
    public void testGetPlanName() {
        assertEquals("planName", plan.getPlanName());
    }

    @Test
    public void testGetRatePerExcessMinute() {
        assertEquals(150.0, plan.getRatePerExcessMinute(), 0.05);
    }

    @Test
    public void testGetAdditionalLineRate() {
        assertEquals(200.0, plan.getAdditionLineRate(), 0.05);
    }

    @Test
    public void testGetBasicMinute() {
        assertEquals(1000, plan.getBasicMinute(), 0.05);
    }
    
    @Test
    public void testGetBasicRate() {
        assertEquals(100.0, plan.getBasicRate(), 0.05);
    }

}
