package Certificate_Of_Deposit;
import java.util.Scanner;
/**
 * Project:  Java Programming
 * Package:  Certificate_Of_Deposit
 * File:  TestCertificateOfDeposit
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 20-Jun-2014
 * At: 4:45 PM
 *
 * Create an interactive application that prompts the user for data for two
 * CertificateOfDeposit objects. Prompt the user for certificate number, name,
 * balance, and issue date for each CertificateOfDeposit, and then instantiate
 * the objects. Display all the values, including the maturity dates. Save the
 * application as TestCertificateOfDeposit.java.
 */
public class TestCertificateOfDeposit
	{
		public static void main(String[] args)
			{
				CertificateOfDeposit test001 = new CertificateOfDeposit();
				Scanner enter = new Scanner(System.in);
				System.out.print("Enter Certificate Number: ");
				test001.setCertificateNumber(enter.nextInt());
				System.out.print("Enter Account Owners Last Name: ");
				test001.setAccountOwnerLastName(enter.nextLine());
				System.out.print("Enter Account Balance: ");
				enter.nextLine();
				test001.setAccountBalance(enter.nextDouble());
				System.out.print("Enter Issue Year");
				test001.setIssueDate();
			}
	}
