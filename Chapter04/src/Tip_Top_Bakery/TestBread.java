package Tip_Top_Bakery;
/**
 * Project:  Java Programming
 * Package:  Tip_Top_Bakery
 * File:  TestBread
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 18-Jun-2014
 * At: 7:05 PM
 */
public class TestBread
	{
		public static void main(String[] args)
			{
				Bread test001 = new Bread("Wheat", 69);
				Bread test002 = new Bread("White", 494);
				Bread test003 = new Bread("Sourdough", 96);
				System.out.println(Bread.MOTTO);
				System.out.println("Bread test001 Bread Type: " + test001.getBreadType());
				System.out.println("Bread test001 Bread Calories:  " + test001.getBreadCalories());
				System.out.println();
				System.out.println(Bread.MOTTO);
				System.out.println("Bread test002 Bread Type: " + test002.getBreadType());
				System.out.println("Bread test002 Bread Calories:  " + test002.getBreadCalories());
				System.out.println();
				System.out.println(Bread.MOTTO);
				System.out.println("Bread test003 Bread Type: " + test003.getBreadType());
				System.out.println("Bread test003 Bread Calories:  " + test003.getBreadCalories());
			}
	}
