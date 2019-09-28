package b6070236_b6070212_b6074425;

public class claculate3{
	public static double finance;
	public double month,pay,price,interest,totale;
	
	public void mommom(double month ,double pay,double price,double interest){
		this.month = month;
		this.pay = pay;
		this.price = price;
		this.interest = interest;
		}
	
	public void calStar(double pay,double price){
		finance = price - pay ;
		System.out.println(finance + "     finance ");
		System.out.println(pay+"     pay ");
		System.out.println(price+"     price ");
	}
	
	public double getFinance(){
		return finance;
	}
}
