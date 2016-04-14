package com.bill.team02.week4;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class MainTest {
    
    @Test
    public void testConstructorIsPrivate(){
        final Constructor<?>[] constructors = Main.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
    }
    }

    @Test
    public void testAppController() {
        Main.main(null);
        assertTrue( true );
    }
    
    
}
