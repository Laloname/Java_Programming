package Sandwich;
import java.util.Scanner;
/**
 * Project:     Java Programming
 * Package:     Sandwich
 * Filename:    Sandwich
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 7:54 AM
 *
 * Create a class named Sandwich. Data fields include a String for the main ingredient (such as "tuna"), a String for
 * bread type (such as "wheat"), and a double for price (such as 4.99). Include methods to get and set values for each
 * of these fields. Save the class as Sandwich.java.
 */
public class Sandwich
	{
		//todo  This class should be done over; does not function as intended.
		private String sandwichFilling;
		private String typeBread;
		private double sandwichPrice;
		public static void main(String[] args)
			{
			}
		public Sandwich() //Default Constructor
		{
			sandwichFilling = "Tuna";
			typeBread = "White";
			sandwichPrice = 5.99;
		}
		public Sandwich(String filling, String bread, double price) //Direct constructor and setters
		{
			sandwichFilling = filling;
			typeBread = bread;
			sandwichPrice = price;
		}
		public static Sandwich getSandwichData()//Constructor to enter data from keyboard
		{
			Scanner enter = new Scanner(System.in);
			System.out.println("What type of filling would you like:  ");
			String sandwichFilling = enter.nextLine();
			System.out.println("What type of bread:  ");
			String typeBread = enter.nextLine();
			double sandwichPrice = enter.nextDouble();
			return new Sandwich(sandwichFilling, typeBread, sandwichPrice);
		}
		public String getSandwichFilling()
			{
				return sandwichFilling;
			}
		public String getTypeBread()
			{
				return typeBread;
			}
		public double getSandwichPrice()
			{
				return sandwichPrice;
			}
	}
