
public class Account {
	
	private double balance;
	
	public double getbalance(){
		return balance;
	}
	public void setbalance(double a){
	balance = a;
	}
	
	public void credit(double a){
	balance = balance + a;
	}
	
	public void debit(double a){
		
	balance = balance - a;

	}
}
	
	


