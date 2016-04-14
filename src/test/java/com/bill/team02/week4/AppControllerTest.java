package com.bill.team02.week4;

import java.io.IOException;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class AppControllerTest {
    private AppController app;

    @Before
    public void setUp() {
        app = new AppController();
    }

    @Test
    public void runTest() throws IOException {
        String[] str = { "input_PersonalInfo.txt", "input_PersonalInfo2.txt", "input_PersonalInfo3.txt" };
        for (int i = 0; i < 3; i++) {
            assertEquals(true, app.run(str[i]));
        }
        assertEquals(false, app.run(null));
        assertEquals(false, app.run("asdf"));
    }
}