package Invoices;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 10:06 PM.
 * Project: Java Programming
 * Package: Invoices
 * File:  Invoice
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
				balanceDue = balance;
				if (invoice < 1000)
					{
						invoice = 0;
					}
				else
					{
						invoiceNumber = invoice;
					}
				if (mth < 1 || mth > 12)
					{
						mth = 0;
					}
				else
					{
						month = mth;
					}
				if (d < 1 || d > 31)
					{
						d = 0;
					}
				else
					{
						day = d;
					}
				if (yr < 2011 || yr > 2017)
					{
						yr = 0;
					}
				else
					{
						year = yr;
					}
			}
		public void displayInvoice()
			{
				System.out.println("Invoice Number: " + invoiceNumber);
				System.out.println("Due Date: " + month + "-" + day + "-" + year);
				System.out.println("Balance Due: " + balanceDue);
			}
	}

