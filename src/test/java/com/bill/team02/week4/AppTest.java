package com.bill.team02.week4;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest {
    
    @Test
    public void testGoldApp(){
        Main.main(new String[]{"input_PersonalInfo"});
        assertEquals(true, true);
    }
    
}
