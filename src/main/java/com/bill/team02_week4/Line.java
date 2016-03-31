package com.bill.team02_week4;

public class Line {
	
	private int usedMinutes;
	private String phoneNumber;
	private String lineUserName;
	
	public Line(int usedMinutes, String phoneNumber, String lineUserName){
		this.usedMinutes = usedMinutes;
		this.phoneNumber = phoneNumber;
		this.lineUserName = lineUserName;
	}
	
	public int getUsedMinutes(){	
		return usedMinutes; 
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String getLineUserName(){
		return lineUserName;
	}
	
	public void setLineUserName(String lineUserName){
		this.lineUserName = lineUserName;
	}
	
	
	

}
