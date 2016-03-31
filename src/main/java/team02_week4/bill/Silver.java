package team02_week4.bill;

public class Silver extends Plan {
	
	private double basicRate = 29.95;
	private int basicMinute = 500;
	private double additionalLineRate = 21.50;
	private double ratePerExcessMinute = 0.54;

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
