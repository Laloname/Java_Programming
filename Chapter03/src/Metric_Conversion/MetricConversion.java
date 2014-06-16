package Metric_Conversion;
import java.util.*;
/**
 * Project:     Java Programming
 * Package:     Metric_Conversion
 * Filename:    MetricConversion
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 1:49 AM
 *
 * There are 2.54 centimeters in an inch, and there are 3.7854 liters in a U.S. gallon.
 * Create a class named MetricConversion. Its main() method accepts an integer value
 * from a user at the keyboard, and in turn passes the entered value to two methods.
 * One converts the value from inches to centimeters and the other converts the same
 * value from gallons to liters. Each method displays the results with appropriate
 * explanation. Save the application as MetricConversion.java.
 */
public class MetricConversion
	{
		public static void main(String[] args)
			{
				Scanner enter = new Scanner(System.in);
				System.out.println("Please enter any whole number --> ");
				int anyValue = enter.nextInt();
				convertAnyValueToInches(anyValue);
				convertAnyValueToGallons(anyValue);
			}
		public static void convertAnyValueToInches(int anyValue)
			{
				double centimeters = anyValue * 2.54;
				System.out.println("The whole number you entered is " + anyValue + "." +
				                   "  This value converted to centimeters is " + centimeters);
			}
		public static void convertAnyValueToGallons(int anyValue)
			{
				double liters = anyValue / 0.26417;
				System.out.println("The whole number you entered is " + anyValue + "." +
				                   "  This value converted to liters is " + liters);
			}
	}
