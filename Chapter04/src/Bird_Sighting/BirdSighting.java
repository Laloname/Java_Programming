package Bird_Sighting;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * Project:  Java Programming
 * Package:  Bird_Sighting
 * File:  BirdSighting
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 18-Jun-2014
 * At: 12:13 PM
 *
 * Create a BirdSighting class for the Birmingham Birdwatcher’s Club that includes
 * data fields for a bird species sighted, the number seen, and the day of the year. For
 * example, April 1 is the 91st day of the year, assuming it is not a leap year. The class
 * also includes methods to get each field. In addition, create a default constructor that
 * automatically sets the species to “robin” and the number and day to 1. Save the file as
 * BirdSighting.java.
 */
public class BirdSighting
	{
		private String birdSeen;
		private int numberSeen;
		private int dateseen;
		private GregorianCalendar dateSeen;
		public BirdSighting(String birdSeen, int numberSeen, int dateseen)
			{
				this.birdSeen = "Robin";
				this.numberSeen = 1;
				this.dateseen = 1;
			}
		public GregorianCalendar getDateSeen(int month, int date)
			{
				dateSeen.set(month, date);
				dateSeen.get(GregorianCalendar.DAY_OF_YEAR);
				return dateSeen;
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
