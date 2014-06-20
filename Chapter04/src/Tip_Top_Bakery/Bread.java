package Tip_Top_Bakery;
/**
 * Project:  Java Programming
 * Package:  Bread
 * File:  Bread
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 18-Jun-2014
 * At: 6:48 PM
 *
 * Create a class for the Tip Top Bakery named Bread with data fields for bread
 * type (such as “rye”) and calories per slice. Include a constructor that takes
 * parameters for each field, and include get methods that return the values of
 * the fields. Also include a public final static String named MOTTO and
 * initialize it to The staff of life. Write an application named TestBread to
 * instantiate three Bread objects with different values, and then display all the
 * data, including the motto, for each object. Save both the Bread.java and
 * TestBread.java files.
 */
public class Bread
	{
		private String breadType;
		private int breadCalories;
		public final static String MOTTO = "The Staff Of Life";
		public Bread(String type, int calories)
			{
				this.breadType = type;
				this.breadCalories = calories;
			}
		public String getBreadType()
			{
				return breadType;
			}
		public int getBreadCalories()
			{
				return breadCalories;
			}
	}
