package Percentages;
import java.util.*;
/**
 * Project:     Java Programming
 * Package:     Percentages
 * Filename:    Percentages2
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 1:46 AM
 *
 *
 * Modify the Percentages class to accept the values of the two doubles from a user
 * at the keyboard. Save the file as Percentages2.java.
 */

public class Percentages2
	{
		public static void main(String[] args)
			{
				Scanner enter = new Scanner(System.in);
				System.out.println("Enter a double:  ");
				double a = enter.nextDouble();
				System.out.println("Enter another double:  ");
				double b = enter.nextDouble();
				computePercent(a, b);
				computePercent(b, a);
			}
		public static void computePercent(double a, double b)
			{
				System.out.println("Integer a is " + a + " and integer b is " + b);
				System.out.println(a + " is " + (a/b) + " % of " + b);
			}
	}
