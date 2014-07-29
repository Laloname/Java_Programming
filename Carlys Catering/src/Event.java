import java.util.Scanner;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 6:34 PM.
 * Project: Carlys Catering
 * Package: PACKAGE_NAME
 * File:  Event
 * Create a class to hold Event data for Carly’s Catering. The class contains:
 * 1. Two public final static fields that hold the price per guest ($35) and the
 * cutoff value for a large event (50 guests)
 * 2. Three private fields that hold an event number, number of guests for the
 * event, and the price. The event number is stored as a String because Carly
 * plans to assign event numbers such as M312.
 * 3. Two public set methods that set the event number (setEventNumber()) and
 * the number of guests (setGuests()). The price does not have a set method
 * because the setGuests() method will calculate the price as the number of
 * guests multiplied by the price per guest every time the number of guests is set.
 * 4. Three public get methods that return the values in the three non-static fields
 * Save the file as Event.java.
 */
public class Event
	{
		public static double pricePerGuestHigh = 35.00;
		public static double pricePerGuestLow = 32.00;
		public static final int LARGE_EVENT_MAX = 50;
		private String eventNumber;
		private int guests;
		private double pricePerEvent;



		public void setEventNumber()
			{
				Scanner enter = new Scanner(System.in);
				System.out.println("Enter the event number: ");
				eventNumber = enter.nextLine();
			}
		public void setGuests()
			{
				Scanner enter = new Scanner(System.in);
				System.out.println("Enter the number of guest attending ");
				guests = enter.nextInt();
			}
		public boolean isLargeEvent()
			{
				if (guests >= LARGE_EVENT_MAX)
					{
						return true;
					}
				else if (guests < LARGE_EVENT_MAX)
					{
						return false;
					}
				return isLargeEvent();
			}

		public String getEventNumber(int guests)
			{
				return eventNumber;
			}
		public int getGuests(boolean largeEvent)
			{
				return guests;
			}
	}
