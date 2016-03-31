package com.bill.team02_week4;

public class AppController {

	private AppView appView;
	private FormController formController;
	
	public AppController() throws Exception {
		this.appView = new AppView();
		this.formController = new FormController();
	}
	
	public void run() {
		
	}
}
