package Certificate_Of_Deposit;
import javax.swing.*;
import java.util.*;
public class TestCertificateOfDeposit2
	{
		public static void main(String[] args)
			{
				String certNum;
				String name;
				double balance;
				String entryString;
				int mo, da, yr;
				// Default Gregorian Calendar object with statement
				GregorianCalendar issueDate = new GregorianCalendar();
				//JOptionPane or Interactive input dialog prompting user for input
				certNum = JOptionPane.showInputDialog(null,
					                                     "Enter certificate number");
				name = JOptionPane.showInputDialog(null,
					                                  "Enter last name of owner");
				entryString = JOptionPane.showInputDialog(null,
					                                         "Enter balance");
				balance = Double.parseDouble(entryString);
				entryString = JOptionPane.showInputDialog(null,
					                                         "Enter month  of issue");
				mo = Integer.parseInt(entryString);
				entryString = JOptionPane.showInputDialog(null,
					                                         "Enter day of issue");
				da = Integer.parseInt(entryString);
				entryString = JOptionPane.showInputDialog(null,
					                                         "Enter year of issue");
				//
				yr = Integer.parseInt(entryString);
				issueDate = new
					            GregorianCalendar(yr, (mo - 1), da);
				CertificateOfDeposit cert1 = new CertificateOfDeposit(certNum, name, balance, issueDate);
				certNum = JOptionPane.showInputDialog(null,
					                                     "Enter certificate number");
				name = JOptionPane.showInputDialog(null,
					                                  "Enter last name of owner");
				entryString = JOptionPane.showInputDialog(null,
					                                         "Enter balance");
				balance = Double.parseDouble(entryString);
				entryString = JOptionPane.showInputDialog(null,
					                                         "Enter month  of issue");
				mo = Integer.parseInt(entryString);
				entryString = JOptionPane.showInputDialog(null,
					                                         "Enter day of issue");
				da = Integer.parseInt(entryString);
				entryString = JOptionPane.showInputDialog(null,
					                                         "Enter year of issue");
				yr = Integer.parseInt(entryString);
				issueDate = new
					            GregorianCalendar(yr, (mo - 1), da);
				CertificateOfDeposit cert2 = new CertificateOfDeposit(certNum, name, balance, issueDate);
				display1(cert1, 1);
				display2(cert2, 2);
			}
		public static void display1(TestCertificateOfDeposit2 cert1, int num)
			{
				GregorianCalendar iDate = new GregorianCalendar();
				iDate = cert1.getIssueDate();
				GregorianCalendar matDate = new GregorianCalendar();
				matDate = cert1.getMaturityDate();
				JOptionPane.showMessageDialog(null, "Certificate " + num +
				                                    "\nName: " + cert1.getCertNum() + " " +
				                                    cert1.getName() + "  Balance: $" + cert1.getBalance() +
				                                    "  Issued: " +
				                                    (iDate.get(Calendar.MONTH) + 1) +
				                                    "/" + iDate.get(Calendar.DAY_OF_MONTH) +
				                                    "/" + iDate.get(Calendar.YEAR) +
				                                    "\nMaturity date is " +
				                                    (matDate.get(Calendar.MONTH) + 1) +
				                                    "/" + matDate.get(Calendar.DAY_OF_MONTH) +
				                                    "/" + matDate.get(Calendar.YEAR));
			}
		public static void display2(TestCertificateOfDeposit2 cert2, int num)
			{
				GregorianCalendar iDate = new GregorianCalendar();
				iDate = cert2.getIssueDate();
				GregorianCalendar matDate = new GregorianCalendar();
				matDate = cert2.getMaturityDate();
				JOptionPane.showMessageDialog(null, "Certificate " + num +
				                                    "\nName: " + cert2.getCertNum() + " " +
				                                    cert2.getName() + "  Balance: $" + cert2.getBalance() +
				                                    "  Issued: " +
				                                    (iDate.get(Calendar.MONTH) + 1) +
				                                    "/" + iDate.get(Calendar.DAY_OF_MONTH) +
				                                    "/" + iDate.get(Calendar.YEAR) +
				                                    "\nMaturity date is " +
				                                    (matDate.get(Calendar.MONTH) + 1) +
				                                    "/" + matDate.get(Calendar.DAY_OF_MONTH) +
				                                    "/" + matDate.get(Calendar.YEAR));
			}
	}
