package Temperature;
import java.util.Scanner;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 9:00 AM.
 * Project: Java Programming
 * Package: PACKAGE_NAME
 * File: Temperature.Temperature
 * Write an application that prompts the user for the day’s high and low
 * temperatures. If the high is greater than or equal to 90 degrees,
 * display the message, “Heat warning.” If the low is less than 32 degrees,
 * display the message “Freeze warning.” If the difference between the high
 * and low temperatures is more than 40 degrees, display the message, “Large
 * temperature swing.” Save the file as Temperatures.java.
 */
public class Temperature
	{
		public static int highTemp;
		public static int lowTemp;
		public static void main(String[] args)
			{
				Scanner enter = new Scanner(System.in);
				System.out.println("Please enter high temp of the day");
				highTemp = enter.nextInt();
				System.out.println("Please enter low temp of the day");
				lowTemp = enter.nextInt();
				int tempDiff = (highTemp - lowTemp);
				if (highTemp >= 90)
					{
						System.out.println("Heat Warning");
					}
				else if (lowTemp < 32)
					{
						System.out.println("Freeze Warning");
					}
				else if (tempDiff > 40)
					{
						System.out.println("Temperature.Temperature Swing");
					}
				else
					{
						System.out.println("No significant temperature changes.");
					}
			}
	}
