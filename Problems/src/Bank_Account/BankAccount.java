package Bank_Account;
/**
 * Project:     Java Programming
 * Package:     Bank_Account
 * Filename:    BankAccount
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 11:03 PM
 * <p/>
 * Create a class named BankAccount with fields that hold an account number, the owner’s name, and the account
 * balance. Include a constructor that initializes each field to appropriate default values. Also include methods to
 * get and set each of the fields. Include a method named deductMonthlyFee() that reduces the balance by $4.00.
 * Include a static method named explainAccountPolicy() that explains that the $4 service fee will be deducted
 * each month. Save the class as BankAccount.java.
 */
public class BankAccount
	{
		private final int accountNumber;
		private final String fullName;
		private final double accountBalance;
		public BankAccount()
			{
				accountNumber = 999999999;
				fullName = " ";
				accountBalance = 0;
			}
		public void setAccountNumber(int accountNumber)
			{
				accountNumber = accountNumber;
			}
		public void setFullName(String fullName)
			{
				fullName = fullName;
			}
		public void setAccountBalance(double accountBalance)
			{
				accountBalance = accountBalance;
			}
		public int getAccountNumber()
			{
				return accountNumber;
			}
		double getAccountBalance()
			{
				return accountBalance;
			}
		public String getFullName()
			{
				return fullName;
			}
		public void deductMonthlyFee()
			{
				double monthlyFee = 4.00;
				double newBalance = getAccountBalance() - monthlyFee;
				System.out.println("Your balance after the monthly fees are " + newBalance);
			}
		public void explainAccountPolicy()
			{
				System.out.println("The $4 service fee will be deducted each month.");
			}
	}
