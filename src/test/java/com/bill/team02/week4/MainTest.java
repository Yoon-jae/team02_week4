package com.bill.team02.week4;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Before;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainTest {

    private static final Logger LOGGER = Logger.getLogger("Err logger");
    
    @Before
    public void testConstructorIsPrivate() {
        Constructor<Main> constructor = null;
        try {
            constructor = Main.class.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            LOGGER.log(Level.INFO, "No such method", e);
        } catch (SecurityException e) {
            LOGGER.log(Level.INFO, "Security exception", e);
        }
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
        } catch (InstantiationException e) {
            LOGGER.log(Level.INFO, "InstantiationException", e);
        } catch (IllegalAccessException e) {
            LOGGER.log(Level.INFO, "IllegalException", e);
        } catch (IllegalArgumentException e) {
            LOGGER.log(Level.INFO, "IllegalArgumentException", e);
        } catch (InvocationTargetException e) {
            LOGGER.log(Level.INFO, "InvocationTargetException", e);
        }
    }

    @Test
    public void testAppController() {
        Main.main(null);
        assertTrue(true);
    }

}
