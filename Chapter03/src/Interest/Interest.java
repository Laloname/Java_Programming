package Interest;
import java.util.*;
/**
 * Project:     Java Programming
 * Package:     Interest
 * Filename:    Interest
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 7:49 AM
 *
 * Write an application that calculates and displays the amount of money a user would
 * have if his or her money could be invested at 5 percent interest for one year. Create a
 * method that prompts the user for the starting value of the investment and returns it
 * to the calling program. Call a separate method to do the calculation, and return the
 * result to be displayed. Save the program as Interest.java.
 */
public class Interest
	{
		private static double initialCash;
		public static void main(String[] args)
			{
				setInitialCash();
				getInitialCash();
				calculateInterest(initialCash);
				System.out.println("Initial Investment of " + initialCash + " dollars.");
				System.out.println("Interest earned on initial investment will" +
				                   " yield " + calculateInterest(initialCash) + " dollars interest.");
			}
		public static void setInitialCash()
			{
				System.out.println("What is your initial investment?");
				Scanner enter = new Scanner(System.in);
				initialCash = enter.nextDouble();
			}
		public static double getInitialCash()
			{
				return initialCash;
			}
		public static double calculateInterest(double initialCash)
			{
				final double RATE = 0.05;
				final int TERM = 1;
				return ((initialCash * RATE) * TERM);
			}
	}
