package com.bill.team02.week4;

public class FormController {
    private ClientAccountData clientAccountData;
    private StringBuilder builder;

    public FormController(String[] accountData) {
        clientAccountData = new ClientAccountData(accountData);
        builder = new StringBuilder();
    }

    public void printClientBill() {
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

        System.out.println(builder);
    }

    private void makeOutline() {
        builder.append("=================================================\n");
    }

    private void makeBorderLine() {
        builder.append("-------------------------------------------------\n");
    }
}
