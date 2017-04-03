
public class CheckingAccount extends Account {
	
	private double credit_limit;
	private double interest;
	private double loan_interest;

	
	
	public CheckingAccount(double balance, double credit_limit, double interest, double loan_interest ){
		
		super(balance);
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
	}
	
	@Override
	public void debit(double a) {
		if(getbalance()-a < -(credit_limit)){
			System.out.printf("error!\n %f");	
		}	else{
			setbalance(getbalance() - a);
		}
			
		
	}
	public void nextmonth(){
		if(getbalance() > 0){
			setbalance(getbalance()*interest);
		} else {
			setbalance(getbalance()*loan_interest);
		}	
	}
	@Override
	public double getWithdrawableAccount(){
		if(getbalance() + credit_limit >0){
		return (getbalance() + credit_limit);
		}
		else{
			
			return 0;
		}
	}
	@Override
	public void passTime(int a){
		 if(getbalance()>0){
		setbalance(getbalance()*Math.pow((1+interest), a));
		 } else{
			 
			setbalance(getbalance()*Math.pow((1+loan_interest), a));
		 }
		 
	}
	public boolean isBankrupted(){
		if(getbalance() < -(credit_limit)){
		//ÆÄ»ê
		
			return false;
		}
		else{
			return true;
		}
		
		
	}
	public double EstimateValue(int month){
		
		return getbalance()*Math.pow((1+interest), month); 
	}
	
	public String toString(){
		
		return String.format("CheckingAccount_Balance : %.2f", getbalance());
	}


}
