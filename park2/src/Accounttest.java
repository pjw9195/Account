import java.util.Scanner;

public class Accounttest {

public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Account account1 = new Account();
		Account account2 = new Account();
		
		account1.setbalance(100);
		account2.setbalance(100);
		System.out.printf("account1 balance: %f\n" , account1.getbalance());
		System.out.printf("account2 balance: %f\n" , account2.getbalance());
		
		/*
		
		double num;
		int count= 1;
		
		while(count==1){
		
		
		System.out.printf("Enter withdrawal amount for account1 : ");
		num=input.nextDouble();
		
		
		
			if(account1.getbalance() < num){
				System.out.printf("Substacting %f from account1 balance\n" , num);
				System.out.printf("Debit amount exeeded account balance\n." , num);

				System.out.printf("account1 balance: %f\n" , account1.getbalance());
				System.out.printf("account2 balance: %f\n" , account2.getbalance());
				
			}
			else{
				account1.debit(num);

				System.out.printf("account1 balance: %f\n" , account1.getbalance());
				System.out.printf("account2 balance: %f\n" , account2.getbalance());
				
			
			}
			
			System.out.printf("Enter withdrawal amount for account2 : ");
			num=input.nextDouble();
			
			
			
				if(account2.getbalance() < num){
					System.out.printf("Substacting %f from account2 balance\n" , num);
					System.out.printf("Debit amount exeeded account balance\n." , num);

					System.out.printf("account1 balance: %f\n" , account1.getbalance());
					System.out.printf("account2 balance: %f\n" , account2.getbalance());
					
				}
				else{
					account2.debit(num);

					System.out.printf("account1 balance: %f\n" , account1.getbalance());
					System.out.printf("account2 balance: %f\n" , account2.getbalance());
					
				
				}
		
		
		}
		*/
}		
}
