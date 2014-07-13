package Even_Odd;
import java.util.Scanner;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 7:42 AM.
 * Project: Java Programming
 * Package: Even_Odd
 * File: EvenOdd
 * Write an application that asks a user to enter an integer. Display a
 * statement that indicates whether the integer is even or odd. Save the
 * file as EvenOdd.java.
 */
public class EvenOdd
	{
		public static void main(String[] args)
			{
				int selection;
				Scanner enter = new Scanner(System.in);
				System.out.println("Please enter any number: ");
				selection = enter.nextInt();
				if (selection % 2 == 0)
					{
						System.out.println("Your have selected an even number");
					}
				else
					{
						System.out.println("Your have selected an odd number");
					}
			}
	}
