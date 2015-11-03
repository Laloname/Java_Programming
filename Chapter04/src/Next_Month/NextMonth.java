package Next_Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Project:  Java Programming
 * Package:  Next_Month
 * File:  NextMonth
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 20-Jun-2014
 * At: 1:24 PM
 *
 * Write an application that uses methods in the GregorianCalendar class to
 * calculate how many days are left until the first day of next month. Save the file as
 * NextMonth.java.
 */
public class NextMonth
	{
		public static void main(String[] args)
			{
				GregorianCalendar today = new GregorianCalendar();
				int currentDay = today.get(Calendar.DAY_OF_MONTH);
				System.out.println("Today is the " + currentDay + "th day of the month.");
				System.out.println("There is " + ((today.get(Calendar.DAY_OF_MONTH)) -
				                                  (today.getActualMaximum(Calendar.DAY_OF_MONTH))) + " days left in the month.");
			}
	}
