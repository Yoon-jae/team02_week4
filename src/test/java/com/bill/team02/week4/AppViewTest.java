package com.bill.team02.week4;

import java.io.IOException;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class AppViewTest {
    private AppView appView;
    private String[] ad;
    private String[] adt;

    private static final int NUMBER_OF_LINE_ZERO = 0;
    private static final int NUMBER_OF_LINE_TEN = 10;

    @Before
    public void setUp() throws IOException {
        appView = new AppView();
        ad = new String[NUMBER_OF_LINE_TEN];
        ad[0] = "Cho-yoon-jae";
        ad[1] = "500.0";
        ad[2] = "Jegal-su-min";
        ad[3] = "300.0";
        ad[4] = "Jo-sang-kyung";
        ad[5] = "70.0";
        ad[6] = "Kim-geun-young";
        ad[7] = "8.0";
        ad[8] = "4";
        ad[9] = "gold";
        adt = appView.scanFile("input_PersonalInfo.txt");
        // expected accountData here
    }

    @Test
    public void scanFileTest() {
        for (int i = NUMBER_OF_LINE_ZERO; i < NUMBER_OF_LINE_TEN; i++) {
            assertEquals(ad[i], adt[i]);
        }
    }

}
