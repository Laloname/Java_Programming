/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 4:24 AM.
 * Project: Carlys Catering
 * Package: PACKAGE_NAME
 * File:  EventDemo
 * Use the CarlysEventPriceWithMethods class you created in Step 1a as a starting
 * point for a program that demonstrates the Event class you created in Step 1b, but
 * make the following changes:
 * 1. You already have a method that gets a number of guests from a user; now add
 * a method that gets an event number. The main() method should declare an
 * Event object, call the two data entry methods, and use their returned values to
 * set the fields in the Event object.
 * 2. Call the method from the CarlysEventPriceWithMethods class that displays
 * the company motto with the border. The method is accessible because it is
 * public, but you must fully qualify the name because it is in another class.
 * 3. Revise the method that displays the event details so that it accepts the newly
 * created Event object. The method should display the event number, and it
 * should still display the number of guests, the price per guest, the total price,
 * and whether the event is a large event.
 * Save the program as EventDemo.java.
 */
public class EventDemo
	{

		public static void main(String[] args)
			{
				Event test001 = new Event();
				test001.setEventNumber();
				test001.setGuests();
				test001.getPrice();
				CarlysEventPriceWithMethods.displayMotto();
				CarlysEventPriceWithMethods.displayEvent(test001);

			}
	}
