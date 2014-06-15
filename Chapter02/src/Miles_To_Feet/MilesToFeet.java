package Miles_To_Feet;
/**
 * Project:  Java Programming
 * Package:   Miles_To_Feet
 * File:  MilesToFeet
 * Created by:  Kimberly
 * On 4/14/2014 at 9:45 PM.
 *
 * Write a Java class that declares a named constant that holds the number of feet in
 * a mile: 5,280. Also declare a variable to represent the distance in miles between
 * your house and your uncle’s house. Assign an appropriate value to the variable—
 * for example, 8.5. Compute and display the distance to your uncle’s house in both
 * miles and feet. Display explanatory text with the values—for example, The
 * distance to my uncle's house is 8.5 miles or 44880.0 feet. Save the class as
 * MilesToFeet.java.
 */
public class MilesToFeet
	{
		public static void main(String[] args)
			{
				int mile = 5280;
				int distance = 202;
				int feet = mile * distance;
				System.out.println("It is " + distance + " miles to my uncles house. \nThis is exactly " + feet + " feet.");
			}
	}
