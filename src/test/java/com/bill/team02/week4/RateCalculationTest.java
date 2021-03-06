package com.bill.team02.week4;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class RateCalculationTest {
    
    @Test
    public void getBasicMonthlyRateTest1() {
        Gold g = new Gold();

        RateCalculation c = new RateCalculation();

        assertEquals(c.getBasicMonthlyRate(g),g.getBasicRate() ,0.05);

    }

    @Test
    public void getBasicMonthlyRateTest2() {
        Silver s = new Silver();

        RateCalculation c = new RateCalculation();

        assertEquals(s.getBasicRate(), c.getBasicMonthlyRate(s),0.05);

    }

    @Test
    public void getBasicMonthlyRateTest3() {
        Silver s = new Silver();

        RateCalculation c = new RateCalculation();

        assertEquals(s.getBasicRate(), c.getBasicMonthlyRate(s),0.05);

    }

    @Test
    public void getBasicMonthlyRateTest4() {
        Silver s = new Silver();

        RateCalculation c = new RateCalculation();

        assertEquals(s.getBasicRate(), c.getBasicMonthlyRate(s),0.05);

    }



    @Test
    public void getAdditionalLineRateTest() {
        Gold g = new Gold();
        Silver s = new Silver();

        RateCalculation r = new RateCalculation();

        for (int aNumberOfLine = 0; aNumberOfLine < 15; aNumberOfLine++) {
            r.getAdditionalLineRate(g, aNumberOfLine);
            r.getAdditionalLineRate(s, aNumberOfLine);
        }
    }
    
    @Test
    public void getAdditionalMinuteRateTest() throws IOException{
        Gold g = new Gold();
        Silver s = new Silver();

       
        Line[] l = new ClientAccountData(new AppView().scanFile("input_PersonalInfo.txt")).getArrayLine();

        RateCalculation r = new RateCalculation();
        
        r.getAdditionalMinuteRate(g,l);
        r.getAdditionalMinuteRate(s,l);

    }

    @Test
    public void getTotalRateTest() throws IOException {

        Gold g = new Gold();
        Silver s = new Silver();

        RateCalculation c = new RateCalculation();
        Line[] l = new ClientAccountData(new AppView().scanFile("input_PersonalInfo.txt")).getArrayLine();

        for (int aNumberOfLine = 0; aNumberOfLine < 15; aNumberOfLine++) {
        c.getTotalRate(c.getBasicMonthlyRate(g), c.getAdditionalLineRate(g, aNumberOfLine), c.getAdditionalMinuteRate(g,l));
        c.getTotalRate(c.getBasicMonthlyRate(s), c.getAdditionalLineRate(s, aNumberOfLine), c.getAdditionalMinuteRate(s,l));
        }
    }
}
