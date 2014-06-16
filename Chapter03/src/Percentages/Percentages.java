package Percentages;
/**
 * Project:     Java Programming
 * Package:     Percentages
 * Filename:    Percentages
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 1:45 AM
 *
 *
 * Create an application named Percentages whose main() method holds two double
 * variables. Assign values to the variables. Pass both variables to a method named
 * computePercent() that displays the two values and the value of the first number as a
 * percentage of the second one. For example, if the numbers are 2.0 and 5.0, the method
 * should display a statement similar to 2.0 is 40% of 5.0.  Then call the method a second
 * time, passing the values in reverse order. Save the application as Percentages.java.
 */
public class Percentages
	{
		public static void main(String[] args)
			{
				double a = 6;
				double b = 9;
				computePercent(a, b);
				computePercent(b, a);
			}
		public static void computePercent(double a, double b)
			{
				System.out.println("Integer a is " + a + " and integer b is " + b);
				System.out.println(a + " is " + (a/b) + " % of " + b);
			}
	}
