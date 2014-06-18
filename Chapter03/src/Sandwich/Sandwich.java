package Sandwich;
/**
 * Project:     Java Programming
 * Package:     Sandwich
 * Filename:    Sandwich
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 7:54 AM
 * <p/>
 * Create a class named Sandwich. Data fields include a String for the main ingredient (such as "tuna"), a String for
 * bread type (such as "wheat"), and a double for price (such as 4.99). Include methods to get and set values for each
 * of these fields. Save the class as Sandwich.java.
 */
public class Sandwich
	{
		private String mainIngredient;
		private String breadType;
		private double sandwichPrice;
		public void setMainIngredient(String ingredient)
			{
				mainIngredient = ingredient;
			}
		public String getMainIngredient()
			{
				return mainIngredient;
			}
		public void setBreadType(String bread)
			{
				this.breadType = bread;
			}
		public String getBreadType()
			{
				return breadType;
			}
		public void setSandwichPrice(double price)
			{
				this.sandwichPrice = price;
			}
		public double getSandwichPrice()
			{
				return sandwichPrice;
			}
	}
