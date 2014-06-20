package Bird_Sighting;
/**
 * Project:  Java Programming
 * Package:  Bird_Sighting
 * File:  TestBirdSighting
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 18-Jun-2014
 * At: 12:15 PM
 *
 * Create an application named TestBirdSighting that demonstrates
 * that each method works correctly. Save the file as TestBirdSighting.java.
 */
class TestBirdSighting
	{
		public static void main(String[] args)
			{
				BirdSighting test001 = new BirdSighting();
				System.out.println("Bird Species:  " + test001.getBirdSeen());
				System.out.println("Number Seen:  " + test001.getNumberSeen());
				test001.getDateSeen();
				System.out.println("Day Of Year Seen:  " + test001.getDateSeen());
				BirdSighting test002 = new BirdSighting("Blue Jay", 6, 2014, 6, 20);
				System.out.println("Bird Species:  " + test002.getBirdSeen());
				System.out.println("Number Seen:  " + test002.getNumberSeen());
				test001.getDateSeen();
				System.out.println("Day Of Year Seen:  " + test002.getDateSeen());
			}
	}
