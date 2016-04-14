package com.bill.team02.week4;

import java.io.IOException;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class AppViewTest {
    private AppView appView;
    private String[] ad;
    
    @Before
    public void setUp(){
        appView = new AppView();
        //expected accountData here
    }
    
    @Test
    public void scanFileTest() throws IOException{
        assertSame(ad,appView.scanFile(""));
    }

}
