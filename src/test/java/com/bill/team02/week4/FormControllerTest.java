package com.bill.team02.week4;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormControllerTest {
    
    @Test
    public void testPrintClientBill() {
        FormController formController = new FormController(new String[]{"Kim","500","1","gold"});
        formController.printClientBill();
        assertTrue(true);
    }
}
