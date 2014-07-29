import java.util.Scanner;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 5:52 PM.
 * Project: Carlys Catering
 * Package:
 * File:  CarlysEventPrice
 * Carly’s Catering provides meals for parties and special events. In Chapter 2,
 * you wrote an application that prompts the user for the number of guests
 * attending an event, displays the company motto with a border, and then
 * displays the price of the event and whether the event is a large one. Now
 * modify the program so that the main() method contains only three executable
 * statements that each call a method as follows:
 * 1. The first executable statement calls a public static int method that
 * prompts the user for the number of guests and returns the value to the
 * main() method.
 * 2. The second executable statement calls a public static void method that
 * displays the company motto with the border.
 * 3. The last executable statement passes the number of guests to a public
 * static void method that computes the price of the event, displays the
 * price, and displays whether the event is a large event.
 */
public class CarlysEventPriceWithMethods
	{
		public static int guests;
		public static final double PRICE_PER_GUEST = 35.00;
		public static double totalBill;
		public static Scanner enter = new Scanner(System.in);

		public static void main(String[] args)
			{
				getGuests();
				displayMotto();
				displayEvent(guests);
			}
		public static int getGuests()
			{
				System.out.println("How many quest will be attending? ");
				guests = enter.nextInt();
				return guests;
			}
		public static String getEventNumber()
			{
				getEventNumber();
				return getEventNumber();
			}
		public static void displayEvent(int guests)
			{
				boolean isLargeEvent = (guests > 49);
				System.out.println("Number of guests attending: " + getGuests());
				System.out.println("Price Per Guest: " + PRICE_PER_GUEST);
				System.out.println("Total Bill: " + totalBill);
				System.out.println("Is this a large event: " + isLargeEvent);
			}
		public static void displayMotto()
			{
				System.out.println("*********************************************");
				System.out.println( "Carly's makes the food that makes it a party!");
				System.out.println("*********************************************");
			}
	}
