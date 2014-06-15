package Inches_To_Feet_Interactive;
import javax.swing.*;
/**
 * Project:  Java Programming
 * Package:  Inches_To_Feet_Interactive
 * File:  InchesToFeetInteractive
 * Created by:  Kimberly
 * On 4/15/2014 at 1:01 AM.
 *
 * Write an interactive version of the InchesToFeet class that accepts the inches
 * value from a user. Save the class as InchesToFeetInteractive.java.
 */
public class InchesToFeetInteractive
	{
		public static void main(String[] args)
			{
				int lengthInches;
				int feet = 12;
				String length;
				length = JOptionPane.showInputDialog(null, "Please enter the total length in inches",
				                                     "TOTAL INCHES", JOptionPane.QUESTION_MESSAGE);
				lengthInches = Integer.parseInt(length);
				int totalFeet = lengthInches / feet;
				int totalInches = lengthInches % feet;
				JOptionPane.showMessageDialog(null, lengthInches + " inches converts to " + totalFeet + " feet, " +
				                                    "and " + totalInches + " inches.",
				                              "TOTAL FEET AND INCHES", JOptionPane.PLAIN_MESSAGE);
			}
	}
