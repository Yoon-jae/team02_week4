package com.bill.team02.week4;

import java.io.IOException;

public class AppController {

    private AppView appView;
    private FormController formController;

    public AppController() {
        this.appView = new AppView();
    }

    public void run() throws IORuntimeException {
        String[] accountData = null;
        try  {
            accountData = this.appView.scanFile();
        } catch (Exception e) {
            throw new IORuntimeException("Scan failed");
        }
        formController = new FormController(accountData);
        formController.printClientBill();
    }
}
