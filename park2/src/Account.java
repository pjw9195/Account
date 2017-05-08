import java.util.List;
import java.util.ArrayList;
abstract public class Account implements Valuable {
	
	private double balance;
	
	public static double sumForAccount(ArrayList<? extends Account> list){
		double sum = 0;
		for(Account account : list){
			sum+=account.getbalance();
		}
		return sum;
	}
	public static void passTimeForList(ArrayList<? extends Account> list,int month){
		for(Account account : list){
			account.passTime(month);
		}
	}
	public double getbalance(){
		return balance;
	}
	protected void setbalance(double a){
	balance = a;
	}
	
	public void credit(double a){
	balance = balance + a;
	}
	
	public void debit(double a) throws Exception{
		
	balance = balance - a;

	}
	public Account(double a){
		balance = a;
	}
	
	public abstract double getWithdrawableAccount();

	public abstract void passTime(int a);
	public abstract void passTime();
}
	
	

	
	


