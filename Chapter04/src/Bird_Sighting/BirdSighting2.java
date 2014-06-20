package Bird_Sighting;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Project:  Java Programming
 * Package:  Bird_Sighting
 * File:  BirdSighting
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 18-Jun-2014
 * At: 12:13 PM
 *
 * Create a class with the same functionality as the BirdSighting class, but create
 * the default constructor to call the three-parameter constructor. Save the class as
 * BirdSighting2.java.
 */
public class BirdSighting2
	{
		private String birdSeen;
		private int numberSeen;
		private GregorianCalendar dateSeen;
		public BirdSighting2(int year, int month, int dayOfMonth)
			{
				birdSeen = "Robin";
				numberSeen = 1;
				this.dateSeen = new GregorianCalendar(year, month, dayOfMonth);
			}
		public int getDateSeen()
			{
				return dateSeen.get(Calendar.DAY_OF_YEAR);
			}
		public String getBirdSeen()
			{
				return birdSeen;
			}
		public int getNumberSeen()
			{
				return numberSeen;
			}
	}
