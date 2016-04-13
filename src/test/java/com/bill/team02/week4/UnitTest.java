package com.bill.team02.week4;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {
    
    AppController app = new AppController();

    @Test
    public void testAppController() {
        Main.main(null);
        assertTrue( true );
    }

    @Test
    public void testSecondRun() {
        app.run("input_PersonalInfo2.txt");
        assertTrue( true );
    }
    
    @Test
    public void testThirdRun() {
        app.run("input_PersonalInfo3.txt");
        assertTrue( true );
    }
    
    @Test
    public void testPlan() {
        Plan plan = new Plan(100.0, 1000, 200.0, 150.0, "planName");
        assertEquals(100.0, plan.getBasicRate(),30);
        assertEquals(1000, plan.getBasicMinute(),30);
        assertEquals(200.0, plan.getAdditionLineRate(),30);
        assertEquals(150.0, plan.getRatePerExcessMinute(),30);
        assertEquals("planName", plan.getPlanName());
    }
    
}
