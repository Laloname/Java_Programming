package Tip_Top_Bakery;
/**
 * Project:  Java Programming
 * Package:  Tip_Top_Bakery
 * File:  TestSandwich
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 19-Jun-2014
 * At: 8:48 AM
 */
public class TestSandwich
	{
		public static void main(String[] args)
			{
				Sandwich test001 = new Sandwich("White", 220, "Tuna", 180);
				Sandwich test002 = new Sandwich("Wheat", 110, "Chicken", 90);
				Sandwich test003 = new Sandwich("Rye", 55, "Water Crest", 45);
				System.out.println("TEST001");
				System.out.println(Bread.MOTTO);
				System.out.println("Bread Type: " + test001.getBreadType());
				System.out.println("Bread Calories: " + test001.getBreadCalories());
				System.out.println("Filling Type:  " + test001.getTypeFilling());
				System.out.println("Filling Calories:  " + test001.getFillingCalories());
				System.out.println("Sub Total Calorie: " + ((test001.getBreadCalories() * 2) + test001.getFillingCalories()));
				System.out.println();
				System.out.println("TEST002");
				System.out.println("Bread Type: " + test002.getBreadType());
				System.out.println("Bread Calories: " + test002.getBreadCalories());
				System.out.println("Filling Type:  " + test002.getTypeFilling());
				System.out.println("Filling Calories:  " + test002.getFillingCalories());
				System.out.println("Sub Total Calorie: " + ((test002.getBreadCalories() * 2) + test002.getFillingCalories()));
				System.out.println();
				System.out.println("TEST003");
				System.out.println("Bread Type: " + test003.getBreadType());
				System.out.println("Bread Calories: " + test003.getBreadCalories());
				System.out.println("Filling Type:  " + test003.getTypeFilling());
				System.out.println("Filling Calories:  " + test003.getFillingCalories());
				System.out.println("Sub Total Calorie: " + ((test003.getBreadCalories() * 2) + test003.getFillingCalories()));
				System.out.println("Total Calories All Sandwiches: " + (((test001.getBreadCalories() * 2) + test001.getFillingCalories())
				                                                        + ((test002.getBreadCalories() * 2) + test002.getFillingCalories())
				                                                        + ((test002.getBreadCalories() * 2) + test002.getFillingCalories())));
			}
	}
