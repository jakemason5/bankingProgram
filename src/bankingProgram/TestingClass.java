package bankingProgram;

import java.util.Random;
import java.util.Scanner;

public class TestingClass {
	
	public static void main(String agrs[])
	{
		CheckingAccount CA = new CheckingAccount();

		
		//Program updated by allowing for user input to create accounts
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your First Name: ");
		String firstName = sc.next();
		System.out.print("What is your Last Name: ");
		String lastName = sc.next();
		CA.setName(firstName, lastName);
		Random r = new Random( System.currentTimeMillis());
		int accountID = 10000 + r.nextInt(80000);
		System.out.println("Your account ID is " + accountID);
		CA.setAccountID(accountID);
		double interestRate = (r.nextInt(21)) / 10.0;
		System.out.println("Your interest rate is " + interestRate);
		CA.setInterestRate(interestRate);
		
		
		while(true)
		{
			System.out.println("Enter what you would like to do");
			System.out.println("D for Deposit");
			System.out.println("W for Withdrawal");
			System.out.println("I for Account Information");
			System.out.println("E for Exit");
			
			String input = sc.next();
			
			if(input.equalsIgnoreCase("D"))
			{
				System.out.print("What is your deposit amount: ");
				double deposit = sc.nextDouble();
				CA.deposit(deposit);
			}
			else if(input.equalsIgnoreCase("W"))
			{
				System.out.print("What is your withdrawal amount: ");
				double withdraw = sc.nextDouble();
				CA.processWithdrawal(withdraw);
			}
			else if(input.equalsIgnoreCase("I"))
			{
				CA.displayAccount();
			}
			else if(input.equalsIgnoreCase("E"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Sorry that is not a proper input, please try again.");
			}
		}
	}

}
