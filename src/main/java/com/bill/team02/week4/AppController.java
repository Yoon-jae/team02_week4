package com.bill.team02.week4;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;
//import java.util.logging.Handler;

public class AppController {

    private AppView appView;
    private FormController formController;

    public AppController() {
        this.appView = new AppView();
    }

    public void run() {
        Logger logger = Logger.getLogger("My Logger");
        logger.setUseParentHandlers(false);
        logger.addHandler(new StreamHandler(System.err, new SimpleFormatter()));
        String[] accountData = null;
        try {
            accountData = this.appView.scanFile();
        } catch (Exception e) {
              logger.log(Level.INFO, "Scan failed", e);
            //throw new IORuntimeException("Scan failed");
        }
        formController = new FormController(accountData);
        formController.printClientBill();
    }
}
