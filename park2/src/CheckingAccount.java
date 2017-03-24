
public class CheckingAccount extends Account {
	
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	
	public CheckingAccount(double a){
		
		super(a);
		credit_limit = -1000;
		interest = 1.01;
		loan_interest = 1.07;
		
	}
	
	@Override
	public void debit(double a) {
		if(getbalance()-a < credit_limit){
			System.out.printf("error!\n");
			
		}
		else{
			setbalance(getbalance() - a);
		}
			
		
	}
	public void nextmonth(){
		if(getbalance() > 0){
			setbalance(getbalance()*interest);
		}
		else{
			setbalance(getbalance()*loan_interest);
		}

		
	}	

}
