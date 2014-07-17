package Invoices;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 10:36 PM.
 * Project: Java Programming
 * Package: Invoices
 * File:  TestInvoice
 * Write an application containing a main() method that declares several
 * Invoice objects, proving that all the statements in the constructor
 * operate as specified.  Save the file as TestInvoice.java.
 */
public class TestInvoice
	{
		public static void main(String[] args)
			{
				Invoice lessThan = new Invoice(999, 0, 0, 0, 2010);
				Invoice moreThan = new Invoice(1001, 56.00, 13, 32, 2018);
				Invoice correct = new Invoice(1234, 185.00, 3, 12, 2014);
				lessThan.displayInvoice();
				System.out.println();
				moreThan.displayInvoice();
				System.out.println();
				correct.displayInvoice();
			}
	}
