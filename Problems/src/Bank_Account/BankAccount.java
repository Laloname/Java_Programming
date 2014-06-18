package Bank_Account;
/**
 * Project:     Java Programming
 * Package:     Bank_Account
 * Filename:    BankAccount
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 11:03 PM
 *
 * Create a class named BankAccount with fields that hold an account number, the owner’s name, and the account
 * balance. Include a constructor that initializes each field to appropriate default values. Also include methods to
 * get and set each of the fields.
 * Include a method named deductMonthlyFee() that reduces the balance by $4.00.
 * Include a static method named explainAccountPolicy() that explains that the $4 service fee will be deducted
 * each month. Save the class as BankAccount.java.
 */
public class BankAccount
	{
		private int accountNumber;
		private String accountOwner;
		private double accountBalance;
		public BankAccount()
			{
				accountNumber = 0;
				accountOwner = " ";
				accountBalance = 0;
			}
		public void setAccountNumber(int acct)
			{
				accountNumber = acct;
			}
		public int getAccountNumber()
			{
				return accountNumber;
			}
		public void setAccountOwner(String owner)
			{
				accountOwner = owner;
			}
		public String getAccountOwner()
			{
				return accountOwner;
			}
		public void setAccountBalance(double balance)
			{
				accountBalance = balance;
			}
		public double getAccountBalance()
			{
				return accountBalance;
			}
		public double deductMonthlyFee()
			{
				double monthlyFee = 4.00;
				double newAccountBalance = accountBalance - monthlyFee;
				return newAccountBalance;
			}
		public void explainAccountPolicy()
			{
				System.out.println("The $4 service fee will be deducted on a monthly basis.");
				System.out.println("Your new account balance is " + deductMonthlyFee());
			}
	}
