package com.bill.team02.week4;

import java.util.logging.Level;
import java.util.logging.Logger;
public class AppController {

    private AppView appView;
    private FormController formController;
    private static final Logger LOGGER = Logger.getLogger("Err logger");

    public AppController() {
        this.appView = new AppView();
    }

    public void run(String fileName) {
        
        String[] accountData = null;
        try {
            accountData = this.appView.scanFile(fileName);
        } catch (Exception e) {
              LOGGER.log(Level.INFO, "Scan failed", e);
        }
        formController = new FormController(accountData);
        formController.printClientBill();
    }
}
