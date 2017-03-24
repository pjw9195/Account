import java.util.Scanner;

public class Accounttest {

public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		CheckingAccount account1 = new CheckingAccount(100);
		CheckingAccount account2 = new CheckingAccount(100);
		
		System.out.printf("account1 balance: %f\n" , account1.getbalance());
		System.out.printf("account2 balance: %f\n" , account2.getbalance());
		
		System.out.printf("Enter deposit amount for Account1 :");
		
		double num;
		
		num = input.nextDouble();
		account1.credit(num);

		System.out.printf("account1 balance: %f\n" , account1.getbalance());
		System.out.printf("account2 balance: %f\n" , account2.getbalance());
		
		System.out.printf("Enter withdraw amount for Account2 :");
		num = input.nextDouble();
		account2.debit(num);
		
		if(account2.getbalance() < 0){

			System.out.printf("account1 balance: %f\n" , account1.getbalance());
			System.out.printf("account2 balance: %f\n\n" , account2.getbalance());
			
			
			
		}
		account1.nextmonth();
		account2.nextmonth();
		System.out.printf("next month!\n");
		System.out.printf("account1 balance: %f\n" , account1.getbalance());
		System.out.printf("account2 balance: %f\n" , account2.getbalance());
}
}

