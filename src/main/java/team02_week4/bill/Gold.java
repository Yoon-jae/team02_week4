package team02_week4.bill;

public class Gold extends Plan {
	
	private double basicRate = 49.95;
	private int basicMinute = 1000;
	private double additionalLineRate = 0.45;
	private double ratePerExcessMinute = 14.50;

	public void setBasicRate(double basicRate){
		this.basicRate = basicRate;
	}
	
	public void setBasicMinute(int basicMinute){
		this.basicMinute = basicMinute;
	}
	
	public void setAdditionalLineRate(double additionalLineRate){
		this.additionalLineRate = additionalLineRate;
	}

	public void setRatePerExcessMinute(double ratePerExcessMinute){
		this.ratePerExcessMinute = ratePerExcessMinute;
	}

}
