package Sandwich;
/**
 * Project:     Java Programming
 * Package:     Sandwich
 * Filename:    TestSandwich
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 7:55 AM
 * <p/>
 * Create an application named TestSandwich that instantiates one Sandwich object and demonstrates the use of the
 * set and get methods. Save this application as TestSandwich.java.
 */
public class TestSandwich
	{
		public static void main(String[] args)
			{
				Sandwich test001 = new Sandwich();
				test001.setBreadType("White");
				test001.setMainIngredient("Tuna");
				test001.setSandwichPrice(3.33);
				System.out.println("Bread type is " + test001.getBreadType());
				System.out.println("Main ingredient is " + test001.getMainIngredient());
				System.out.println("Price of sandwich is " + test001.getSandwichPrice());
			}
	}

