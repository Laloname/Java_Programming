package Bakery;
/**
 * Project:     Java Programming
 * Package:     Bakery.Bakery
 * Filename:    TestSandwich
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 7:55 AM
 *
 *
 * Create an application named TestSandwich that instantiates one Sandwich object and demonstrates the use of the
 * set and get methods. Save this application as TestSandwich.java.
 */
public class TestSandwich
	{
		public static void main(String[] args)
			{
				Sandwich firstSandwich = new Sandwich();
				System.out.println(firstSandwich.getSandwichFilling());
				System.out.println(firstSandwich.getTypeBread());
				System.out.println(firstSandwich.getSandwichPrice());
				//Instantiate second sandwich with direct constructor
				Sandwich secondSandwich = new Sandwich("Ham", "Wheat", 6.99);
				System.out.println(secondSandwich.getSandwichFilling());
				System.out.println(secondSandwich.getTypeBread());
				System.out.println(secondSandwich.getSandwichPrice());
				//Instantiate third sandwich interactively
				Sandwich thirdSandwich = Sandwich.getSandwichData();
				System.out.println(thirdSandwich.getSandwichFilling());
				System.out.println(thirdSandwich.getTypeBread());
				System.out.println(thirdSandwich.getSandwichPrice());
			}
	}

