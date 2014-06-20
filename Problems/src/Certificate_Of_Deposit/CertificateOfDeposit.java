package Certificate_Of_Deposit;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static com.sun.javafx.fxml.expression.Expression.add;
/**
 * Project:  Java Programming
 * Package:  Certificate_Of_Deposit
 * File:  CertificateOfDeposit
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 20-Jun-2014
 * At: 4:43 PM
 *
 * Create a CertificateOfDeposit class. The class contains data fields that hold a
 * certificate number, account holder’s last name, balance, issue date, and maturity
 * date, using GregorianCalendar objects for each date. Provide get and set
 * methods for each field. Also provide a constructor that requires parameters
 * used to set the first four fields, and sets the maturity date to exactly one year
 * after the issue date. Save the class as CertificateOfDeposit.java.
 */
public class CertificateOfDeposit
	{
		private int certificateNumber;
		private String accountOwnerLastName;
		private double accountBalance;
		private GregorianCalendar issueDate;
		private GregorianCalendar maturityDate;
		public CertificateOfDeposit(int certificate, String lastName, double balance, GregorianCalendar issueDate)
			{
				certificateNumber = certificate;
				accountOwnerLastName = lastName;
				accountBalance = balance;
				issueDate = new GregorianCalendar();
				maturityDate = calculateMaturityDate();
			}
		public void setCertificateNumber(int certificate)
			{
				certificateNumber = certificate;
			}
		public int getCertificateNumber()
			{
				return certificateNumber;
			}
		public void setAccountOwnerLastName(String lastName)
			{
				accountOwnerLastName = lastName;
			}
		public String getAccountOwnerLastName()
			{
				return accountOwnerLastName;
			}
		public void setAccountBalance(double balance)
			{
				accountBalance = balance;
			}
		public double getAccountBalance()
			{
				return accountBalance;
			}
		public GregorianCalendar getIssueDate()
			{
				return issueDate;
			}
		public GregorianCalendar calculateMaturityDate()
			{
				issueDate.add(Calendar.YEAR, 1);
				return maturityDate;
			}
	}
