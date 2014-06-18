package Bank_Account;
/**
 * Project:     Java Programming
 * Package:     Bank_Account
 * Filename:    TestBankAccount
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 11:04 PM
 *
 * Create a class named TestBankAccount whose main() method declares four BankAccount objects. Call a getData()
 * method three times.
 * Within the method, prompt a user for values for each field for a BankAccount,
 * and return a
 * BankAccount object to the main() method where it is assigned to one of main()’s BankAccount  objects. Do not
 * prompt the user for values for the fourth BankAccount object, but let it continue to hold the default values.
 * Then, in main(), pass each BankAccount object in turn to a showValues() method that displays the data, calls
 * the method that deducts the monthly fee, and displays the balance again. The showValues() method also calls
 * the method that explains the deduction policy. Save the  application as TestBankAccount.java.
 */
public class TestBankAccount
	{
		public static void main(String[] args)
			{
				BankAccount test001 = new BankAccount();
				BankAccount test002 = new BankAccount();
				BankAccount test003 = new BankAccount();
				BankAccount test004 = new BankAccount();
				test001.getData();
				test001.showData();
				test002.getData();
				test002.showData();
				test003.getData();
				test003.showData();
				test004.showData();
			}

	}
