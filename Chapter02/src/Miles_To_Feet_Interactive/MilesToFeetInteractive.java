package Miles_To_Feet_Interactive;
import java.util.*;
/**
 * Project:  Java Programming
 * Package:  Miles_To_Feet_Interactive
 * File:  MilesToFeetInteractive
 * Created by:  Kimberly
 * On 4/14/2014 at 10:02 PM.
 * <p/>
 * Convert the MilesToFeet class to an interactive application. Instead of assigning
 * a value to the distance, accept the value from the user as input. Save the revised
 * class as MilesToFeetInteractive.java
 */
public class MilesToFeetInteractive
	{
		public static void main(String[] args)
			{
				int mile = 5280;
				int distance;
				Scanner enter = new Scanner(System.in);
				System.out.println("Please enter the number of miles to your uncles house >> ");
				distance = enter.nextInt();
				int feet = mile * distance;
				System.out.println("It is " + distance + " miles to my uncles house." +
				                   " \nThis is exactly " + feet + " feet.");
			}
	}
