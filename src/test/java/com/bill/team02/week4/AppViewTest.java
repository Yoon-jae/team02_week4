package com.bill.team02.week4;

import java.io.IOException;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class AppViewTest {
    private AppView av;
    private String[] ad;
    
    @Before
    public void setUp(){
        av = new AppView();
        //expected accountData here
    }
    
    @Test
    public void scanFileTest() throws IOException{
        assertSame(ad,av.scanFile(""));
    }

}
