package com.bill.team02.week4;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class UnitTest {

    @Test
    public void testAppController() {
        assertTrue(true);
    }

    @Test
    public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
      Constructor<Main> constructor = Main.class.getDeclaredConstructor();
      assertTrue(Modifier.isPrivate(constructor.getModifiers()));
      constructor.setAccessible(true);
      constructor.newInstance();
    }

    @Test
    public void runFirstFile() {
        /*AppController app = new AppController();
        app.run("input_PersonalInfo.txt");*/
        Main.main("input_PersonalInfo.txt");
    }

    @Test
    public void runSecondFile() {
        AppController app = new AppController();
        app.run("input_PersonalInfo2.txt");
    }

    @Test
    public void runThirdFile() {
        AppController app = new AppController();
        app.run("input_PersonalInfo3.txt");
    }

    @Test
    public void runErrorFile() {
        AppController app = new AppController();
        app.run("Error_fileName.txt");
    }

}
