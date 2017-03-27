
abstract public class Account {
	
	private double balance;
	
	public double getbalance(){
		return balance;
	}
	protected void setbalance(double a){
	balance = a;
	}
	
	public void credit(double a){
	balance = balance + a;
	}
	
	public void debit(double a){
		
	balance = balance - a;

	}
	public Account(double a){
		balance = a;
	}
	
	public abstract double getWithdrawableAccount();

	public abstract void passTime(int a);
	
}
	
	

	
	


