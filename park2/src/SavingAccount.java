
public class SavingAccount extends Account {
	
	private int time;
	private double interest;
	private int num = 0;

	
	
	public SavingAccount(double balance, double interest ){
		
		super(balance);
		this.interest = interest;
	}
	@Override
	public double getWithdrawableAccount(){
		return getbalance();
	}
	@Override
	public void passTime(int a){
		time = a + time;
		
		if(time > 11 && num ==0 ){
			setbalance(getbalance()*Math.pow((1+interest), time));
			num=1;
		}
		
		
		
			
		
	}
	@Override
	public void debit(double a) {
		
			if(time > 11){
			setbalance(getbalance() - a);
		} else { System.out.println("아직 출금할 수 없습니다.");
			
		}
			
		
	}

}
