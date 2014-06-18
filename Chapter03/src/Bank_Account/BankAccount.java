package Bank_Account;
import java.util.Scanner;
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
		public void setAccountNumber()
			{
				accountNumber = accountNumber;
			}
		public int getAccountNumber()
			{
				return accountNumber;
			}
		public void setAccountOwner()
			{
				accountOwner = accountOwner;
			}

		public String getAccountOwner()
			{
				return accountOwner;
			}
		public void setAccountBalance()
			{
				accountBalance = accountBalance;
			}
		public double getAccountBalance()
			{
				return accountBalance;
			}
		public double deductMonthlyFee()
			{
				double monthlyFee = 4.00;
				return accountBalance - monthlyFee;
			}
		public void explainAccountPolicy()
			{
				System.out.println("The $4 service fee will be deducted on a monthly basis.");
				System.out.println("Your new account balance is " + deductMonthlyFee());
			}
		public void getData()
			{
				Scanner enter = new Scanner(System.in);
				System.out.print("Enter account number: ");
				accountNumber = enter.nextInt();
				System.out.print("Enter account balance: ");
				accountBalance = enter.nextDouble();
				enter.nextLine();
				System.out.print("Enter account owner: ");
				accountOwner = enter.nextLine();
			}
		public void showData()
			{
				System.out.println("Bank Account Number:  " + getAccountNumber());
				System.out.println("Account Owner:  " + getAccountOwner());
				System.out.println("Account Balance:  " + getAccountBalance());
				explainAccountPolicy();
			}

	}
