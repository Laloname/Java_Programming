package Tip_Top_Bakery;
/**
 * Project:  Java Programming
 * Package:  Tip_Top_Bakery
 * File:  TestSandwichFilling
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 19-Jun-2014
 * At: 7:18 AM
 *
 * Write an application named TestSandwichFilling to instantiate three
 * SandwichFilling objects with different values, and then display all the data for
 * each object. Save both the SandwichFilling.java and TestSandwichFilling.java
 * files.
 */
public class TestSandwichFilling
	{
		public static void main(String[] args)
			{
				SandwichFilling test001 = new SandwichFilling("Tuna", 125);
				SandwichFilling test002 = new SandwichFilling("Egg Salad", 100);
				SandwichFilling test003 = new SandwichFilling("Chicken", 80);
				System.out.println("Filling Type:  " + test001.getFillingSandwich());
				System.out.println("Filling Calories:  " + test001.getFillingCalories());
				System.out.println();
				System.out.println("Filling Type:  " + test002.getFillingSandwich());
				System.out.println("Filling Calories:  " + test002.getFillingCalories());
				System.out.println();
				System.out.println("Filling Type:  " + test003.getFillingSandwich());
				System.out.println("Filling Calories:  " + test003.getFillingCalories());
			}
	}
