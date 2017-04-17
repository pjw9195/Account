
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
		
	public void passTime(){
			time = 1 + time;
			
			if(time > 11 && num ==0 ){
				setbalance(getbalance()*Math.pow((1+interest), time));
				num=1;
			}	
		
	}
	@Override
	public void debit(double a) throws Exception {

		if(time > 11){
			setbalance(getbalance() - a);
		} else if(a <0 ){
			throw new Exception("음수입력!");
		} else {throw new Exception("아직 출금할 수 없습니다.");
		}
			
		
	}
	public double EstimateValue(int month){
		
		return getbalance()*Math.pow((1+interest), month); 
	}
	public double EstimateValue(){
		
		return getbalance()*Math.pow((1+interest), 1); 
	}
	
	public String toString(){
		
		return String.format("SavingAccount_Balance : %.2f", getbalance());
	}

}
