package com.bill.team02.week4;

public class FormController {

	ClientAccountData clientAccountData;
	
	public FormController(String[] accountData) {
		clientAccountData = new ClientAccountData(accountData);
	}
	
	public void printClientBill(){
		System.out.println("=================================================");
		System.out.println("		Here is your Bill");
		System.out.println("-------------------------------------------------");
		System.out.println("Your Plan 			: " + clientAccountData.getPlan().getPlanName());
		
//		System.out.println("Your basic monthly rate		: $" + basicMonthlyRate);
//		System.out.println("Your additional line rate 	: $" + additionalLineRate);
//		System.out.println("Your additional minuter rate	: $" + additionalMinuterRate);
		System.out.println("-------------------------------------------------");
		System.out.println("Your total account rate		: $" + clientAccountData.calculateRate());
		System.out.println("=================================================");
	}
}
