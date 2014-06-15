package Inches_To_Feet;
/**
 * Project:  Java Programming
 * Package:  Inches_To_Feet
 * File:  InchesToFeet
 * Created by:  Kimberly
 * On 4/15/2014 at 12:45 AM.
 * <p/>
 * Write a class that declares a variable named inches that holds a length in inches,
 * and assign a value. Display the value in feet and inches; for example, 86 inches
 * becomes 7 feet and 2 inches. Be sure to use a named constant where appropriate.
 * Save the class as InchesToFeet.java.
 */
public class InchesToFeet
	{
		public static void main(String[] args)
			{
				int lengthInches = 123;
				int feet = 12;
				int totalFeet = lengthInches / feet;
				int totalInches = lengthInches % feet;
				System.out.println(lengthInches + " inches converts to " + totalFeet + " feet, " +
				                   "and " + totalInches + " inches.");
			}
	}
