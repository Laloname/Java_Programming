package Dollars;
import java.util.*;
/**
 * Project:  Java Programming
 * Package:  Dollars
 * File:  Dollars
 * Created by:  Kimberly Henry
 * On 4/15/2014 at 5:19 AM.
 * <p/>
 * <p/>
 * Write a class that calculates and displays the conversion of an entered number of dollars
 * into currency denominations—20s, 10s, 5s, and 1s. Save the class as Dollars.java.
 */
public class Dollars
	{
		public static void main(String[] args)
			{
				Scanner enter = new Scanner(System.in);
				System.out.println("Please enter the total amount of money >> ");
				double money = enter.nextDouble();
				int noTwenty = (int) money / 20;
				System.out.println("You have " + noTwenty + " twenty dollar bills.");
				double balanceAfterTwenty = money - (noTwenty * 20);
				int noTen = (int) balanceAfterTwenty / 10;
				System.out.println("You have " + noTen + " ten dollar bills.");
				double balanceAfterTen = money - ((noTwenty * 20) + (noTen * 10));
				int noFive = (int) balanceAfterTen / 5;
				System.out.println("You have " + noFive + " five dollar bills.");
				double balanceAfterFive = money - ((noTwenty * 20) + (noTen * 10) + (noFive * 5));
				int noOne = (int) (balanceAfterFive / 1);
				System.out.println("You have " + noOne + " one dollar bills.");
			}
	}
