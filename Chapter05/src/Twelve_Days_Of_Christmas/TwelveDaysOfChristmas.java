package Twelve_Days_Of_Christmas;
import java.util.Scanner;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 7:43 AM.
 * Project: Java Programming
 * Package: Twelve_Days_Of_Christmas
 * File:  TwelveDaysOfChristmas
 * Use the Web to locate the lyrics to the traditional song “The Twelve Days of
 * Christmas.” The song contains a list of gifts received for the holiday. The list is
 * cumulative so that as each “day” passes, a new verse contains all the words of the
 * previous verse, plus a new item. Write an application that displays the words to
 * the song starting with any day the user enters. (Hint: Use a switch statement
 * with cases in descending day order and without any break statements so that
 * the lyrics for any day repeat all the lyrics for previous days.) Save the file as
 * TwelveDays.java.
 */
public class TwelveDaysOfChristmas
	{
		public static int day;
		public static final String ONE = "A Partridge in a Pear Tree ";
		public static final String TWO = "Two Turtle Doves, ";
		public static final String THREE = "Three French Hens, ";
		public static final String FOUR = "Four Calling Birds, ";
		public static final String FIVE = "Five Golden Rings, ";
		public static final String SIX = "Six Geese a Laying, ";
		public static final String SEVEN = "Seven Swans a Swimming, ";
		public static final String EIGHT = "Eight Maids a Milking, ";
		public static final String NINE = "Nine Ladies Dancing, ";
		public static final String TEN = "Ten Lords a Leaping, ";
		public static final String ELEVEN = "Eleven Pipers Piping,";
		public static final String TWELVE = "12 Drummers Drumming, ";
		public static final String LYRICS1 = "On the first day of Christmas my true love sent to me:";
		public static final String LYRICS2 = " and ";
		public static Scanner enter = new Scanner(System.in);
		public static void main(String[] args)
			{
				System.out.println("Enter Starting Day: ");
				day = enter.nextInt();
				System.out.println(LYRICS1);
				switch (day)
					{
						case 1:
							System.out.println(TWELVE);
						case 2:
							System.out.println(ELEVEN);
						case 3:
							System.out.println(TEN);
						case 4:
							System.out.println(NINE);
						case 5:
							System.out.println(EIGHT);
						case 6:
							System.out.println(SEVEN);
						case 7:
							System.out.println(SIX);
						case 8:
							System.out.println(FIVE);
						case 9:
							System.out.println(FOUR);
						case 10:
							System.out.println(THREE);
						case 11:
							System.out.println(TWO);
						case 12:
							System.out.println(ONE);
							break;
					}
			}
	}
