package com.bill.team02.week4;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {

    @Test
    public void testAppController() {
        assertTrue(true);
    }

    @Test
    public void testRun() {
        new Main();
        Main.main(null);
    }

    @Test
    public void runFirstFile() {
        AppController app = new AppController();
        app.run("input_PersonalInfo.txt");
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
