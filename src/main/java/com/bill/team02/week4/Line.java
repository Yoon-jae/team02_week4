package com.bill.team02.week4;

public class Line {
	
	private int usedMinutes;
	private String lineUserName;
	
	public Line(String lineUserName){
		this.lineUserName = lineUserName;
	}
	
	public void setUsedMinutes(int usedMinutes){
		this.usedMinutes = usedMinutes;
	}
	
	public int getUsedMinutes(){	
		return usedMinutes; 
	}
	
	public String getLineUserName(){
		return lineUserName;
	}
	
	public void setLineUserName(String lineUserName){
		this.lineUserName = lineUserName;
	}
	
	
	

}
