package Invoices;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 10:06 PM.
 * Project: Java Programming
 * Package: Invoices
 * File:  Invoice2
 * Modify the constructor in the Invoice class so that the day is not greater
 * than 31, 30, or 28, depending on the month. For example, if a user tries
 * to create an invoice for April 31, force it to April 30. Also, if the month
 * is invalid, and thus forced to 0, also force the day to 0. Save the modified
 * Invoice class as Invoice2.java.
 */
public class Invoice2
	{
		private int invoiceNumber;
		private double balanceDue;
		private int month;
		private int day;
		private int year;
		public Invoice2(int invoice, double balance, int mth, int d, int yr)
			{
				invoiceNumber = invoice;
				balanceDue = balance;
				month = mth;
				day = d;
				year = yr;
				if (invoice < 1000)
					{
						invoice = 0;
						if (invoice == 0)
							{
								System.out.println("Invoice INVALID: ");
							}
					}
				if ((month == 2 && day > 28) || (month == 1 && day > 31) || (month == 3 && day > 31)
				    || (month == 5 && day > 31) || (month == 7 && day > 31) || (month == 8 && day > 31)
				    || (month == 10 && day > 31) || (month == 12 && day > 31) || (month == 4 && day > 30)
				    || (month == 6 && day > 30) || (month == 9 && day > 30) || (month == 11 && day > 30))
					{
						switch (month)
							{
								case 1:
								case 3:
								case 5:
								case 7:
								case 8:
								case 10:
								case 12:
									day = 31;
									break;
								case 2:
									day = 28;
									break;
								case 4:
								case 6:
								case 9:
								case 11:
									day = 30;
									break;
								default:
									System.out.println("Month INVALID or Day, Day set to last of the month");
							}
					}
			}
		public void displayInvoice()
			{
				System.out.println("Invoice Number: " + invoiceNumber);
				System.out.println("Due Date: " + month + "-" + day + "-" + year);
				System.out.println("Balance Due: " + balanceDue);
			}
	}
