package com.bill.team02.week4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SilverTest {
    
    @Test
    public void testSilverBasicRate() {
        Plan silver = new Silver();
        assertEquals(29.95, silver.getBasicRate(),30); 
    }
    
    @Test
    public void testSilverBasicMinute() {
        Plan silver = new Silver();
        assertEquals(500, silver.getBasicMinute(),30); 
    }
    
    @Test
    public void testSilverAdditionLineRate() {
        Plan silver = new Silver();
        assertEquals(21.50, silver.getAdditionLineRate(),30); 
    }
    
    @Test
    public void testSilverRatePerExcessMinute() {
        Plan silver = new Silver();
        assertEquals(0.54, silver.getRatePerExcessMinute(),30); 
    }
    
    @Test
    public void testSilverPlanName() {
        Plan silver = new Silver();
        assertEquals("Silver", silver.getPlanName()); 
    }

}