package com.bill.team02.week4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SilverTest {
    
    Plan silver = new Silver();
    
    @Test
    public void testBasicRate() {
        assertEquals(29.95, silver.getBasicRate(),0.05); 
    }
    
    @Test
    public void testBasicMinute() {
        assertEquals(500, silver.getBasicMinute(),0.05); 
    }
    
    @Test
    public void testAdditionLineRate() {
        assertEquals(21.50, silver.getAdditionLineRate(),0.05); 
    }
    
    @Test
    public void testRatePerExcessMinute() {
        assertEquals(0.54, silver.getRatePerExcessMinute(),0.05); 
    }
    
    @Test
    public void testPlanName() {
        assertEquals("Silver", silver.getPlanName(),0.05); 
    }

}