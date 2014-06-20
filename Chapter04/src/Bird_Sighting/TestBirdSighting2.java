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
class TestBirdSighting2
	{
		public static void main(String[] args)
			{
				BirdSighting2 test003 = new BirdSighting2(2015, 6, 1);
				System.out.println("Bird Species:  " + test003.getBirdSeen());
				System.out.println("Number Seen:  " + test003.getNumberSeen());
				test003.getDateSeen();
				System.out.println("Day Of Year Seen:  " + test003.getDateSeen());
			}
	}
