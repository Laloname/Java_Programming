package Eggs;
import java.util.*;
/**
 * Project:  Java Programming
 * Package:     Eggs
 * Filename:    Eggs
 * Created By:  Kimberly Henry
 * On: 13-Jun-2014 At: 10:21 PM
 *
 * Meadowdale Dairy Farm sells organic brown eggs to local customers. They charge
 * $3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen.
 * Write a class that prompts a user for the number of eggs in the order and then
 * display the amount owed with a full explanation. For example, typical output might
 * be, “You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45.0
 * cents each for a total of $7.85.” Save the class as Eggs.java.
 */
public class Eggs
	{
		static final double DOZEN_EGGS = 3.25;
		static final double SINGLE_EGG = .45;
		static final int NO_IN_DOZEN = 12;
		public static void main(String[] args)
			{
				System.out.println("How many eggs do you have: ");
				Scanner enter = new Scanner(System.in);
				int eggs = enter.nextInt();
				System.out.println("You have " + eggs + " eggs.");
				System.out.println("This is a total of " + (eggs / NO_IN_DOZEN) + " dozen eggs and " + (eggs % NO_IN_DOZEN) + " single eggs.");
				System.out.println("This will cost you " + ((eggs / NO_IN_DOZEN) * DOZEN_EGGS) + ".");
				System.out.println("The single eggs will cost you " + ((eggs % NO_IN_DOZEN) * SINGLE_EGG) + ".");
				System.out.println("The total cost for all eggs is " + (((eggs % NO_IN_DOZEN) * SINGLE_EGG) + ((eggs / NO_IN_DOZEN) * DOZEN_EGGS)));
			}
	}
