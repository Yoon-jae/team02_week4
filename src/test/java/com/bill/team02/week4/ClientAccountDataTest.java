package com.bill.team02.week4;

import java.io.IOException;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class ClientAccountDataTest {
    private ClientAccountData cd;
    private ClientAccountData cd2;
    private ClientAccountData cd3;

    private RateCalculation rc;
    private Line[] arrayLine;
    private Line[] arrayLine2;
    private Line[] arrayLine3;

    private Gold g;
    private Silver s;
    private static final int NUMBER_OF_LINE_INDEX_ZERO = 0;
    private static final int NUMBER_OF_LINE_INDEX_TWO = 2;
    private static final int NUMBER_OF_LINE_ZERO = 0;
    private static final int NUMBER_OF_LINE_FOUR = 4;
    private static final int NUMBER_OF_LINE_TWO = 2;
    private static final double TEST_LIMIT = 0.04;

    private static final int TOTAL_MIN_ONE = 878;
    private static final int TOTAL_MIN_TWO = 878;
    private static final int TOTAL_MIN_THREE = 800;

    private String[] ad;
    private String[] ad2;
    private String[] ad3;
    private String[] ad4;

    @Before
    public void setUp() throws IOException {

        ad = new AppView().scanFile("input_PersonalInfo.txt");
        ad2 = new AppView().scanFile("input_PersonalInfo2.txt");
        ad3 = new AppView().scanFile("input_PersonalInfo3.txt");
        ad4 = null;

        cd = new ClientAccountData(ad);
        cd2 = new ClientAccountData(ad2);
        cd3 = new ClientAccountData(ad3);

        rc = new RateCalculation();
        g = new Gold();
        s = new Silver();

        arrayLine = new Line[Integer.parseInt(ad[ad.length - NUMBER_OF_LINE_INDEX_TWO])];
        for (int i = 0; i < ad.length - NUMBER_OF_LINE_INDEX_TWO; i++) {
            int newIndex = i / NUMBER_OF_LINE_INDEX_TWO;
            if (i % NUMBER_OF_LINE_INDEX_TWO == NUMBER_OF_LINE_INDEX_ZERO) {
                arrayLine[newIndex] = new Line(ad[i]);
            } else {
                arrayLine[newIndex].setUsedMinutes(Double.parseDouble(ad[i]));
            }
        }
        arrayLine2 = new Line[Integer.parseInt(ad2[ad2.length - NUMBER_OF_LINE_INDEX_TWO])];
        for (int i = 0; i < ad2.length - NUMBER_OF_LINE_INDEX_TWO; i++) {
            int newIndex = i / NUMBER_OF_LINE_INDEX_TWO;
            if (i % NUMBER_OF_LINE_INDEX_TWO == NUMBER_OF_LINE_INDEX_ZERO) {
                arrayLine2[newIndex] = new Line(ad2[i]);
            } else {
                arrayLine2[newIndex].setUsedMinutes(Double.parseDouble(ad2[i]));
            }
        }
        arrayLine3 = new Line[Integer.parseInt(ad3[ad3.length - NUMBER_OF_LINE_INDEX_TWO])];
        for (int i = 0; i < ad3.length - NUMBER_OF_LINE_INDEX_TWO; i++) {
            int newIndex = i / NUMBER_OF_LINE_INDEX_TWO;
            if (i % NUMBER_OF_LINE_INDEX_TWO == NUMBER_OF_LINE_INDEX_ZERO) {
                arrayLine3[newIndex] = new Line(ad3[i]);
            } else {
                arrayLine3[newIndex].setUsedMinutes(Double.parseDouble(ad3[i]));
            }
        }

        cd.getAdditionalLineRate();
        cd.getAdditionalMinuteRate();
        cd.getBasicMonthlyRate();

        cd2.getAdditionalLineRate();
        cd2.getAdditionalMinuteRate();
        cd2.getBasicMonthlyRate();

        cd3.getAdditionalLineRate();
        cd3.getAdditionalMinuteRate();
        cd3.getBasicMonthlyRate();

    }

    @Test
    public void calculateRateTest() {
        assertEquals(rc.getTotalRate(rc.getBasicMonthlyRate(g), rc.getAdditionalLineRate(g, arrayLine.length),
                rc.getAdditionalMinuteRate(g, arrayLine)), cd.calculateRate(), TEST_LIMIT);

        assertEquals(rc.getTotalRate(rc.getBasicMonthlyRate(s), rc.getAdditionalLineRate(s, arrayLine2.length),
                rc.getAdditionalMinuteRate(s, arrayLine2)), cd2.calculateRate(), TEST_LIMIT);

        assertEquals(rc.getTotalRate(rc.getBasicMonthlyRate(s), rc.getAdditionalLineRate(s, arrayLine3.length),
                rc.getAdditionalMinuteRate(s, arrayLine3)), cd3.calculateRate(), TEST_LIMIT);

    }

    @Test
    public void getBasicMonthlyRateTest() {
        assertEquals(rc.getBasicMonthlyRate(g), cd.getBasicMonthlyRate(), TEST_LIMIT);
        assertEquals(rc.getBasicMonthlyRate(s), cd2.getBasicMonthlyRate(), TEST_LIMIT);
        assertEquals(rc.getBasicMonthlyRate(s), cd3.getBasicMonthlyRate(), TEST_LIMIT);
    }

    @Test
    public void getAdditionalLineRateTest() {
        assertEquals(rc.getAdditionalLineRate(g, arrayLine.length), cd.getAdditionalLineRate(), TEST_LIMIT);
        assertEquals(rc.getAdditionalLineRate(s, arrayLine2.length), cd2.getAdditionalLineRate(), TEST_LIMIT);
        assertEquals(rc.getAdditionalLineRate(s, arrayLine3.length), cd3.getAdditionalLineRate(), TEST_LIMIT);
    }

    @Test
    public void getAdditionalMinuteRateTest() {
        assertEquals(rc.getAdditionalMinuteRate(g, arrayLine), cd.getAdditionalMinuteRate(), TEST_LIMIT);
        assertEquals(rc.getAdditionalMinuteRate(s, arrayLine2), cd2.getAdditionalMinuteRate(), TEST_LIMIT);
        assertEquals(rc.getAdditionalMinuteRate(s, arrayLine3), cd3.getAdditionalMinuteRate(), TEST_LIMIT);

    }

    @Test
    public void getArrayLineTest() {
        for (int i = NUMBER_OF_LINE_ZERO; i < NUMBER_OF_LINE_FOUR; i++) {
            assertEquals(arrayLine[i].getLineUserName(), cd.getArrayLine()[i].getLineUserName());
            assertEquals(arrayLine[i].getUsedMinutes(), cd.getArrayLine()[i].getUsedMinutes(), TEST_LIMIT);
        }
        for (int i = NUMBER_OF_LINE_ZERO; i < NUMBER_OF_LINE_FOUR; i++) {
            assertEquals(arrayLine2[i].getLineUserName(), cd2.getArrayLine()[i].getLineUserName());
            assertEquals(arrayLine2[i].getUsedMinutes(), cd2.getArrayLine()[i].getUsedMinutes(), TEST_LIMIT);
        }
        for (int i = NUMBER_OF_LINE_ZERO; i < NUMBER_OF_LINE_TWO; i++) {
            assertEquals(arrayLine3[i].getLineUserName(), cd3.getArrayLine()[i].getLineUserName());
            assertEquals(arrayLine3[i].getUsedMinutes(), cd3.getArrayLine()[i].getUsedMinutes(), TEST_LIMIT);
        }
    }

    @Test
    public void getTotalMinutesTest() {
        assertEquals(TOTAL_MIN_ONE, cd.getTotalMinutes(), TEST_LIMIT);
        assertEquals(TOTAL_MIN_TWO, cd2.getTotalMinutes(), TEST_LIMIT);
        assertEquals(TOTAL_MIN_THREE, cd3.getTotalMinutes(), TEST_LIMIT);

    }

    @Test
    public void checkFamillyDiscountAndPrintTest() {
        assertEquals("\n*         You cannot get family discount.         *", cd3.checkFamilyDiscountAndPrint());
        assertEquals("\n*         You've got family discount.         *", cd.checkFamilyDiscountAndPrint());
        assertEquals("\n*         You've got family discount.         *", cd2.checkFamilyDiscountAndPrint());

    }

    @Test
    public void getPlanTest() {
        assertEquals(g.getBasicRate(), cd.getPlan().getBasicRate(), TEST_LIMIT);
        assertEquals(g.getBasicMinute(), cd.getPlan().getBasicMinute(), TEST_LIMIT);
        assertEquals(g.getAdditionLineRate(), cd.getPlan().getAdditionLineRate(), TEST_LIMIT);
        assertEquals(g.getRatePerExcessMinute(), cd.getPlan().getRatePerExcessMinute(), TEST_LIMIT);
        assertEquals(g.getPlanName(), cd.getPlan().getPlanName());
    }

    @Test
    public void getPlanTest2() {
        assertEquals(s.getBasicRate(), cd2.getPlan().getBasicRate(), TEST_LIMIT);
        assertEquals(s.getBasicMinute(), cd2.getPlan().getBasicMinute(), TEST_LIMIT);
        assertEquals(s.getAdditionLineRate(), cd2.getPlan().getAdditionLineRate(), TEST_LIMIT);
        assertEquals(s.getRatePerExcessMinute(), cd2.getPlan().getRatePerExcessMinute(), TEST_LIMIT);
        assertEquals(s.getPlanName(), cd2.getPlan().getPlanName());
    }

    @Test
    public void checkAndSetPlanTest() throws IOException {
        ad4 = new AppView().scanFile("input_PersonalInfo4.txt");
        ClientAccountData t = new ClientAccountData(ad4);
        assertEquals(null, t.getPlan());
    }
}
