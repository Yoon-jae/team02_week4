package com.bill.team02.week4;

import java.util.logging.Logger;

public class FormController {

    private ClientAccountData clientAccountData;
    private StringBuilder builder;
    private static final Logger LOGGER = Logger.getLogger("PrintFormat");

    public FormController(String[] accountData) {
        clientAccountData = new ClientAccountData(accountData);
        builder = new StringBuilder();
    }

    public void printClientBill() {
        makeOutline();
        builder.append("               Here is your Bill\n");
        makeBorderLine();
        builder.append("              < Your Information >\n");
        builder.append("Your Plan                       : " + clientAccountData.getPlan().getPlanName() + "\n");
        builder.append("Number of your member           : " + clientAccountData.getArrayLine().length + "\n");
        builder.append("\nEach line information\n");
        Line[] clientLineInfo = clientAccountData.getArrayLine();
        for(int i=0; i<clientLineInfo.length; i++){
            builder.append("        "+(i+1) + ". " + clientLineInfo[i].getLineUserName() + " (" + clientLineInfo[i].getUsedMinutes() + " min)\n");
        }
        builder.append("\nYour total used minutes         : " + clientAccountData.getTotalMinutes() + " min\n");
        makeBorderLine();
        builder.append("           < Rate for used minutes >\n");
        builder.append("Your basic monthly rate         : $" + clientAccountData.getBasicMonthlyRate() + "\n");
        builder.append("Your additional line rate       : $" + clientAccountData.getAdditionalLineRate() + "\n");
        builder.append("Your additional minute rate     : $" + clientAccountData.getAdditionalMinuteRate() + "\n");
        builder.append(clientAccountData.checkFamilyDiscountAndPrint() + "\n");
        makeBorderLine();
        builder.append("Your total account rate         : $" + clientAccountData.calculateRate() + "\n");
        makeOutline();

        LOGGER.info(builder+"");
    }

    private void makeOutline() {
        builder.append("\n===============================================\n");
    }

    private void makeBorderLine() {
        builder.append("-----------------------------------------------\n");
    }
}
