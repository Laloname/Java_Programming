package Tip_Top_Bakery;
/**
 * Project:  Java Programming
 * Package:  Tip_Top_Bakery
 * File:  SandwichFilling
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 19-Jun-2014
 * At: 7:04 AM
 *
 * Create a class named SandwichFilling. Include a field for the filling type (such as
 * “egg salad”) and another for the calories in a serving. Include a constructor that
 * takes parameters for each field, and include get methods that return the values of
 * the fields.
 */
public class SandwichFilling
	{
		private String typeFilling;
		private int fillingCalories;
		public SandwichFilling(String filling, int cals)
			{
				this.typeFilling = filling;
				this.fillingCalories = cals;
			}
		public String getTypeFilling()
			{
				return typeFilling;
			}
		public int getFillingCalories()
			{
				return fillingCalories;
			}
	}
