
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
        assertTrue( true );
        com.bill.team02.week4.Main.main(null);
    }

}

