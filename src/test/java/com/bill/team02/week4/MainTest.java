package com.bill.team02.week4;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
    
    @Test(expected=IllegalAccessException.class)
    public void testConstructorIsPrivate() throws Exception{
        Main.class.newInstance();
        fail("This calss constructor should be private");
    }

    @Test
    public void testAppController() {
        Main.main(null);
        assertTrue( true );
    }
    
    
}
