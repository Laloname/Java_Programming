package Certificate_Of_Deposit;
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
				CertificateOfDeposit test001 = new CertificateOfDeposit(23, "Henry", 2500.00, 2013, 7, 20);
				System.out.println("Certificate Number: " + test001.getCertificateNumber());
				System.out.println("Owner Last Name: " + test001.getAccountOwnerLastName());
				System.out.println("Account Balance: " + test001.getAccountBalance());
				System.out.println("Issue Date: " + test001.getIssueDate());
				System.out.println("Maturity Date: " + test001.calculateMaturityDate());
			}
	}
