package com.bill.team02.week4;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GoldTest {
    private Gold gold;
    
    @Before
    public void setUp(){
        gold = new Gold();   
    }
    @Test
    public void testGoldBasicRate() {
        assertEquals(49.95, gold.getBasicRate(),30); 
    }
    
    @Test
    public void testGoldBasicMinute() {
        assertEquals(1000, gold.getBasicMinute(),30); 
    }
    
    @Test
    public void testGoldAdditionLineRate() {
        assertEquals(14.50, gold.getAdditionLineRate(),30); 
    }
    
    @Test
    public void testGoldRatePerExcessMinute() {
        assertEquals(0.45, gold.getRatePerExcessMinute(),30); 
    }
    
    @Test
    public void testGoldPlanName() {
        assertEquals("Gold", gold.getPlanName()); 
    }

}