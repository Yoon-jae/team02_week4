package com.bill.team02.week4;

import java.io.IOException;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class AppControllerTest {
    private AppController A;

    @Before
    public void setUp() {
        A = new AppController();
    }

    @Test
    public void runTest() throws IOException {
        String[] str = { "input_PersonalInfo.txt", "input_PersonalInfo2.txt", "input_PersonalInfo3.txt" };
        AppView av = new AppView();
        for (int i = 0; i < 3; i++) {
            String[] ac = av.scanFile(str[i]);
            assertEquals(true, A.run(ac[i]));
        }
        assertEquals(false, A.run(null));
        assertEquals(false, A.run("asdf"));
    }
}