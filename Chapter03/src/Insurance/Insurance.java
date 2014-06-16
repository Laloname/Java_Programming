package Insurance;
import javax.swing.*;
/**
 * Project:     Java Programming
 * Package:     Insurance
 * Filename:    Insurance
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 2:05 AM
 *
 * The Harrison Group Life Insurance company computes annual policy premiums based on the age the customer turns in the
 * current calendar year. The premium is computed by taking the decade of the customer’s age, adding 15 to it, and
 * multiplying by 20. For example, a 34-year-old would pay $360, which is calculated by adding the decades (3) to 15,
 * and then multiplying by 20. Write an application that prompts a user for the current year and a birth year. Pass
 * both to a method that calculates and returns the premium amount, and then display the returned amount. Save the
 * application as Insurance.java.
 */
public class Insurance
	{
		public static void main(String[] args)
			{
				String year1 = JOptionPane.showInputDialog(null, "Please enter the current year: ",
				                                           "CURRENT YEAR", JOptionPane.QUESTION_MESSAGE);
				int year = Integer.parseInt(year1);
				String born1 = JOptionPane.showInputDialog(null, "Please enter the current year: ",
				                                           "BIRTH YEAR", JOptionPane.QUESTION_MESSAGE);
				int born = Integer.parseInt(born1);
				JOptionPane.showMessageDialog(null, "The premium is " + calculatePremium(year, born) + ".00 dollars",
				                              "INSURANCE PREMIUM", JOptionPane.INFORMATION_MESSAGE);
				System.out.println("The premium is " + calculatePremium(year, born) + " dollars.");
			}
		public static int calculatePremium(int year, int born)
			{
				int age = year - born;
				final int ADD = 15;
				final int MULTIPLY = 20;
				final int DECADE = 10;
				int decade = age / DECADE;
				System.out.println("Age: " + age);
				return ((decade + ADD) * MULTIPLY);
			}
	}
