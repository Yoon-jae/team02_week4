package com.bill.team02.week4;

import java.io.IOException;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class ClientAccountDataTest {
    private ClientAccountData cd;
    private RateCalculation rc;
    private Line[] arrayLine;
    private Gold g;
    private static final int NUMBER_OF_LINE_INDEX_ZERO = 0;
    private static final int NUMBER_OF_LINE_INDEX_TWO = 2;

    @Before
    public void setUp() throws IOException {

        String[] ad = new AppView().scanFile("input_PersonalInfo.txt");
        cd = new ClientAccountData(ad);
        rc = new RateCalculation();
        g = new Gold();

        arrayLine = new Line[Integer.parseInt(ad[ad.length - NUMBER_OF_LINE_INDEX_TWO])];
        for (int i = 0; i < ad.length - NUMBER_OF_LINE_INDEX_TWO; i++) {
            int newIndex = i / NUMBER_OF_LINE_INDEX_TWO;
            if (i % NUMBER_OF_LINE_INDEX_TWO == NUMBER_OF_LINE_INDEX_ZERO) {
                arrayLine[newIndex] = new Line(ad[i]);
            } else {
                arrayLine[newIndex].setUsedMinutes(Double.parseDouble(ad[i]));
            }
        }

    }

    @Test
    public void calculateRateTest() {
        assertSame(cd.calculateRate(), rc.getTotalRate(rc.getBasicMonthlyRate(g), rc.getAdditionalLineRate(g, 4),
                rc.getAdditionalMinuteRate(g, arrayLine)));
    }
    
    @Test
    public void getBasicMonthlyRateTest(){
        
    }
    
    @Test
    public void getAdditionalLineRateTest(){
        
    }
    
    @Test
    public void getAdditionalMinuteRateTest(){
        
    }
    
    @Test
    public void getArrayLineTest(){
        
    }
    
    @Test
    public void checkFamillyDiscountAndPrintTest(){
        
    }
    
    @Test
    public void checkAndsetPlanTest(){
        
    }
}
