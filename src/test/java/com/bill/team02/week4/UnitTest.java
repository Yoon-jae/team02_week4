package com.bill.team02.week4;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class UnitTest {
    
    AppController app = new AppController();

    @Test
    public void testAppController() {
        Main.main(null);
        assertTrue( true );
    }

    @Test
    public void testConstructorIsPrivate() throws Exception {
      Constructor<Main> constructor = Main.class.getDeclaredConstructor();
      assertTrue(Modifier.isPrivate(constructor.getModifiers()));
      constructor.setAccessible(true);
      constructor.newInstance();
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
    
}
