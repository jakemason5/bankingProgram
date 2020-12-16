package bankingProgram;

import java.text.DecimalFormat;

public class BankAccount {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	int accountID;
	double balance;
	String firstName;
	String lastName;

	
	public BankAccount()
	{
		this.balance = 0;
	}
	
	
	public void deposit(double A)
	{
		this.balance = this.balance + A;
	}
	
	public void withdrawal(double A) 
	{
		this.balance = this.balance - A;
	}	
	
	
	public void setName(String A, String B)
	{
		firstName = A;
		lastName = B;
	}
	
	public void setAccountID(int A)
	{
		accountID = A;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getAccount()
	{
		return accountID;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void accountSummary()
	{
		System.out.print("First Name: " + firstName);
		System.out.print(" Last Name: " + lastName);
		System.out.println(" Account ID: " + accountID);
		System.out.println(" Balance: " + df2.format(balance));
	}
	
}
