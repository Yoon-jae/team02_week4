package com.bill.team02.week4;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

public class AppController {

    private AppView appView;
    private FormController formController;
    private static final Logger LOGGER = Logger.getLogger("Err logger");

    public AppController() {
        this.appView = new AppView();
    }

    public void run() {
        
        LOGGER.setUseParentHandlers(false);
        LOGGER.addHandler(new StreamHandler(System.err, new SimpleFormatter()));
        String[] accountData = null;
        try {
            accountData = this.appView.scanFile();
        } catch (Exception e) {
              LOGGER.log(Level.INFO, "Scan failed", e);
        }
        formController = new FormController(accountData);
        formController.printClientBill();
    }
}
