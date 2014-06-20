package Tip_Top_Bakery;
/**
 * Project:  Java Programming
 * Package:  Tip_Top_Bakery
 * File:  Sandwich
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 19-Jun-2014
 * At: 8:15 AM
 *
 * Create a class named Sandwich. Include a Bread field and a SandwichFilling
 * field. Include a constructor that takes parameters for each field needed in the two
 * objects and assigns them to each object’s constructor. Write an application
 * named TestSandwich to instantiate three Sandwich objects with different values,
 * and then display all the data for each object, including the total calories in a
 * Sandwich, assuming that each Sandwich is made using two slices of Bread. Save
 * both the Sandwich.java and TestSandwich.java files.
 */
public class Sandwich
	{
		private Bread bread;
		private SandwichFilling sandwichFilling;
		public Sandwich(String type, int calories, String filling, int cals)
			{
				bread = new Bread(type, calories);
				sandwichFilling = new SandwichFilling(filling, cals);
			}
		public String getBreadType()
			{
				return bread.getBreadType();
			}
		public int getBreadCalories()
			{
				return bread.getBreadCalories();
			}
		public String getTypeFilling()
			{
				return sandwichFilling.getTypeFilling();
			}
		public int getFillingCalories()
			{
				return sandwichFilling.getFillingCalories();
			}
	}



