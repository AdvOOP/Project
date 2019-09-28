package b6070236_b6070212_b6074425;

public class calculate extends Mom{
	
	private double inter , interyear ;
	public void setInteryear(double interyear){
		this.interyear = interyear;
	}
	
	public void calInteryear(double finance,double month){
		inter = (finance * interyear) * (month / 12) ;
		System.out.println(month + "      MMM");
	}
	
	public double getInterest(){
		return inter;
	}

}
