package com.bill.team02.week4;

public class FormController {
    private ClientAccountData clientAccountData;
    private StringBuffer buf;
    public FormController(String[] accountData) {
        clientAccountData = new ClientAccountData(accountData);
        buf = new StringBuffer();
    }

    public void printClientBill() {
        buf.append("=================================================\n");
        buf.append("               Here is your Bill\n");
        buf.append("-------------------------------------------------\n");
        buf.append("              < Your Information >\n");
        buf.append("Your Plan           : " + clientAccountData.getPlan().getPlanName() + "\n");
        buf.append("Number of your member           : " + clientAccountData.getArrayLine().length + "\n");
        buf.append("Your total used minutes         : " + clientAccountData.getTotalMinutes() + "\n");
        buf.append("-------------------------------------------------\n");
        buf.append("           < Rate for used minutes >\n");
        buf.append("Your basic monthly rate         : $" + clientAccountData.getBasicMonthlyRate() + "\n");
        buf.append("Your additional line rate       : $" + clientAccountData.getAdditionalLineRate() + "\n");
        buf.append("Your additional minute rate     : $" + clientAccountData.getAdditionalMinuteRate() + "\n");
        buf.append("          "+clientAccountData.checkFamilyDiscountAndPrint() + "\n");
        buf.append("-------------------------------------------------\n");
        buf.append("Your total account rate         : $" + clientAccountData.calculateRate() + "\n");
        buf.append("=================================================\n");
        
        System.out.println(buf);
    }
}
