package com.bill.team02.week4;

import java.io.IOException;

public class AppController {

	private AppView appView;
	private FormController formController;
	
	public AppController() {
		this.appView = new AppView();
		this.formController = new FormController();
	}
	
	public void run() {
        try {
			this.appView.scanFile("input.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
