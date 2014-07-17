import java.util.Scanner;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 5:52 PM.
 * Project: Carlys Catering
 * Package:
 * File:  CarlysEventPrice
 * Carly’s Catering provides meals for parties and special events. Write a program that
 * prompts the user for the number of guests attending an event and then computes the
 * total price, which is $35 per person. Display the company motto with the border that
 * you created in the CarlysMotto2 class in Chapter 1, and then display the number of
 * guests, price per guest, and total price. Also display a message that indicates true
 * or false depending on whether the job is classified as a large event—an event with
 * 50 or more guests. Save the file as CarlysEventPrice.java.
 */
public class CarlysEventPrice
	{
		public static int guests;
		public static final double PRICE_PER_GUEST = 35.00;
		public static double totalBill;
		public static Scanner enter = new Scanner(System.in);

		public static void main(String[] args)
			{
				System.out.println("How many quest will be attending? ");
				guests = enter.nextInt();
				CarlysMotto2.displayMotto();
				calculateBill();
				displayEvent();
			}
		public static double calculateBill()
			{
				totalBill = guests * PRICE_PER_GUEST;
				return totalBill;
			}
		public static void displayEvent()
			{
				boolean isLargeEvent = (guests > 49);
				System.out.println("Number of guests attending: " + guests);
				System.out.println("Price Per Guest: " + PRICE_PER_GUEST);
				System.out.println("Total Bill: " + totalBill);
				System.out.println("Is this a large event: " + isLargeEvent);
			}
	}
