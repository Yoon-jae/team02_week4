package com.bill.team02.week4;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author 8
 *
 */
public class PlanTest {

    Plan plan = new Plan(10.0, 10, 10.0, 10.0, "PlanName");
    
    @Test
    public void testGetBasicRate() {
        assertEquals(10.0, plan.getBasicRate(),0.5); 
    }

    @Test
    public void testGetBasicMinute() {
        assertEquals(10, plan.getBasicRate(),0.5); 
    }

    @Test
    public void testGetAdditionLineRate() {
        assertEquals(10.0, plan.getBasicRate(),0.5); 
    }

    @Test
    public void testGetRatePerExcessMinute() {
        assertEquals(10.0, plan.getBasicRate(),0.5); 
    }

    @Test
    public void testGetPlanName() {
        assertEquals(12.0, plan.getBasicRate(),0.5); 
    }
 
}
