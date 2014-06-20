package Next_Year;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Project:  Java Programming
 * Package:  Next_Year
 * File:  NextYear
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 20-Jun-2014
 * At: 4:07 PM
 *
 * Write an application that uses methods in the GregorianCalendar class to calculate
 * the number of days from today until the end of the current year. Save the file as
 * YearEnd.java.
 */
public class NextYear
	{
		public static void main(String[] args)
			{
				GregorianCalendar today = new GregorianCalendar();
				int currentDay = (today.get(Calendar.DAY_OF_YEAR) + 1);
				System.out.println("Today is the " + currentDay + "th day of the year.");
				int daysInYear = today.getMaximum(Calendar.DAY_OF_YEAR);
				System.out.println("There is " + daysInYear + " days in the year.");
				System.out.println("There is " + (daysInYear - currentDay) + " days left in the year.");
			}
	}
