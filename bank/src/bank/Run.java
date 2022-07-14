package bank;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		System.out.println("Please select the bank account type:");
		System.out.println("1 - Checking account");
		System.out.println("2 - Saving account");
		
		int accountOption = sc.nextInt();
		
		switch(accountOption) {
			case 1:
			Account ca = new CheckingAccount();
			ca.printStatement();
			break;
			
			case 2:
			Account sa = new SavingAccount();
			sa.printStatement();
			break;
		}
		
		sc.close();
	
	}

}
