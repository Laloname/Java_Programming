package Invoices;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 9:02 PM.
 * Project: Java Programming
 * Package: Invoices
 * File:  TestInvoice2
 * Then modify the TestInvoice class to create Invoice2 objects.
 * Create enough objects to test every decision in the constructor.
 * Save this file as TestInvoice2.java.
 */
public class TestInvoice2
	{
		public static void main(String[] args)
			{
				Invoice2 test001 = new Invoice2(999, 56.00, 1, 32, 2014);
				Invoice2 test002 = new Invoice2(5423, 56.00, 2, 31, 2014);
				Invoice2 test003 = new Invoice2(1235, 56.00, 3, 32, 2014);
				Invoice2 test004 = new Invoice2(8563, 56.00, 4, 31, 2014);
				Invoice2 test005 = new Invoice2(9999, 56.00, 5, 32, 2014);
				Invoice2 test006 = new Invoice2(2222, 56.00, 6, 31, 2014);
				Invoice2 test007 = new Invoice2(1111, 56.00, 7, 32, 2014);
				Invoice2 test008 = new Invoice2(4444, 56.00, 8, 32, 2014);
				Invoice2 test009 = new Invoice2(5555, 56.00, 9, 31, 2014);
				Invoice2 test010 = new Invoice2(6666, 56.00, 10, 32, 2014);
				Invoice2 test011 = new Invoice2(7777, 56.00, 11, 31, 2014);
				Invoice2 test012 = new Invoice2(8888, 56.00, 12, 32, 2014);
				test001.displayInvoice();
				test002.displayInvoice();
				test003.displayInvoice();
				test004.displayInvoice();
				test005.displayInvoice();
				test006.displayInvoice();
				test007.displayInvoice();
				test008.displayInvoice();
				test009.displayInvoice();
				test010.displayInvoice();
				test011.displayInvoice();
				test012.displayInvoice();
			}
	}
