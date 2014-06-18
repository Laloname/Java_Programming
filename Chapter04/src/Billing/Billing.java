package Billing;
/**
 * Project:  Java Programming
 * Package:  Billing
 * File:  Billing
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 18-Jun-2014
 * At: 4:04 AM
 * <p/>
 * Create a class named Billing that includes three overloaded computeBill()
 * methods for a photo book store.  When computeBill() receives a single
 * parameter, it represents the price of one photo book ordered. Add 8%
 * tax, and return the total due.  When computeBill() receives two parameters,
 * they represent the price of a photo book and the quantity ordered. Multiply
 * the two values, add 8% tax, and return the total due.  When computeBill()
 * receives three parameters, they represent the price of a photo book, the
 * quantity ordered, and a coupon value. Multiply the quantity and price,
 * reduce the result by the coupon value, and then add 8% tax and return the
 * total due.  Write a main() method that tests all three overloaded methods.
 * Save the application as Billing.java.
 */
public class Billing
	{
		private static final double TAX = 0.08;
		private static double photoBookPrice;
		private static int booksOrdered;
		public static void main(String[] args)
			{
				computeBill(15.99);
				computeBill(15.99, 15);
				computeBill(15.99, 15, 10.00);
			}
		public static void computeBill(double price)
			{
				photoBookPrice = price;
				double booksBill = (photoBookPrice * TAX) + photoBookPrice;
				System.out.println("Total cost for your order is " + booksBill);
			}
		public static void computeBill(double price, int ordered)
			{
				photoBookPrice = price;
				booksOrdered = ordered;
				double booksBill = (photoBookPrice * booksOrdered * TAX) + (photoBookPrice * booksOrdered);
				System.out.println("Total cost for your order is " + booksBill);
			}
		public static void computeBill(double price, int ordered, double discount)
			{
				photoBookPrice = price;
				booksOrdered = ordered;
				double booksBill = (photoBookPrice * booksOrdered * TAX - discount) + (photoBookPrice * booksOrdered);
				System.out.println("Total cost for your order is " + booksBill);
			}
	}
