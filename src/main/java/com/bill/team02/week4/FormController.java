package com.bill.team02.week4;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

public class FormController {
    private ClientAccountData clientAccountData;
    private StringBuilder builder;
    private static final Logger logger = Logger.getLogger("PrintFormat");

    public FormController(String[] accountData) {
        clientAccountData = new ClientAccountData(accountData);
        builder = new StringBuilder();
    }

    public void printClientBill() {
        logger.setUseParentHandlers(false);
        logger.addHandler(new StreamHandler(System.out, new SimpleFormatter()));
        
        makeOutline();
        builder.append("               Here is your Bill\n");
        makeBorderLine();
        builder.append("              < Your Information >\n");
        builder.append("Your Plan           : " + clientAccountData.getPlan().getPlanName() + "\n");
        builder.append("Number of your member           : " + clientAccountData.getArrayLine().length + "\n");
        builder.append("Your total used minutes         : " + clientAccountData.getTotalMinutes() + "\n");
        makeBorderLine();
        builder.append("           < Rate for used minutes >\n");
        builder.append("Your basic monthly rate         : $" + clientAccountData.getBasicMonthlyRate() + "\n");
        builder.append("Your additional line rate       : $" + clientAccountData.getAdditionalLineRate() + "\n");
        builder.append("Your additional minute rate     : $" + clientAccountData.getAdditionalMinuteRate() + "\n");
        builder.append("          " + clientAccountData.checkFamilyDiscountAndPrint() + "\n");
        makeBorderLine();
        builder.append("Your total account rate         : $" + clientAccountData.calculateRate() + "\n");
        makeOutline();

        logger.log(Level.INFO, builder+"");
    }

    private void makeOutline() {
        builder.append("=================================================\n");
    }

    private void makeBorderLine() {
        builder.append("-------------------------------------------------\n");
    }
}
