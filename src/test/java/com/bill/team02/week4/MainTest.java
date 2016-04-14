package com.bill.team02.week4;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class MainTest {
    
    @Test
    public void testConstructorIsPrivate() throws Exception {
      Constructor<Main> constructor = Main.class.getDeclaredConstructor();
      assertTrue(Modifier.isPrivate(constructor.getModifiers()));
      constructor.setAccessible(true);
      constructor.newInstance();
    }

    @Test
    public void testAppController() {
        Main.main(null);
        assertTrue( true );
    }
    
    
}
