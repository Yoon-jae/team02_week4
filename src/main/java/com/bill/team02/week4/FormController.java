package com.bill.team02.week4;

public class FormController {

	ClientAccountData clientAccountData;
	
	public FormController(String[] accountData) {
		clientAccountData = new ClientAccountData(accountData);
	}
}
