package bankingProgram;

public class CheckingAccount extends BankAccount {
	double interestRate;
	
	public CheckingAccount()
	{
		super();
	}
	
	public void setInterestRate(double rate)
	{
		interestRate = rate;
	}
	
	
		
	public void processWithdrawal(double amount)
	{
		super.withdrawal(amount);
		if(super.getBalance() < 0)
		{
			super.withdrawal(30);
			System.out.println("A fee of $30 has been applied for this transaction");
		}
	}
	
	public void displayAccount()
	{
		super.accountSummary();
		System.out.println("Iterest Rate: " + interestRate);
	}
	
	

}
