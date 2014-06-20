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
				SandwichFilling test001 = new SandwichFilling("Chicken Salad", 417);
				SandwichFilling test002 = new SandwichFilling("Tuna Salad", 383);
				SandwichFilling test003 = new SandwichFilling("Cucumber", 46);
				System.out.println("Sandwich Filling test001 Type Filling: " + test001.getTypeFilling());
				System.out.println("Sandwich Calories test001 Filling Calories:  " + test001.getFillingCalories());
				System.out.println();
				System.out.println("Sandwich Filling test002 Type Filling: " + test002.getTypeFilling());
				System.out.println("Sandwich Calories test002 Filling Calories:  " + test002.getFillingCalories());
				System.out.println();
				System.out.println("Sandwich Filling test003 Type Filling: " + test003.getTypeFilling());
				System.out.println("Sandwich Calories test003 Filling Calories:  " + test003.getFillingCalories());
			}
	}
