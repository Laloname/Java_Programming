package Dog_Boarding;
import javax.swing.*;
import java.util.*;
/**
 * Project: Java Programming
 * Package:  Dog_Boarding
 * File:  DogBoarding
 * Created by:  Kimberly Henry
 * On 4/15/2014 at 4:32 AM.
 * The Happy Yappy Kennel boards dogs at a cost of 50 cents per pound per day. Write
 * a class that accepts a dog’s weight and number of days to be boarded and displays the
 * total price for boarding. Save the class as DogBoarding.java.
 */
public class DogBoarding
	{
		public static void main(String[] args)
			{
				double costPerPound = .50;
				int dogsWeight;
				int daysBoarding;
				Scanner enter = new Scanner(System.in);
				System.out.println("Please tell us how much your dog weights >> ");
				dogsWeight = enter.nextInt();
				enter.nextLine();
				JOptionPane.showMessageDialog(null, "You entered " + dogsWeight);
				System.out.println("How many days will your pet be with us?   ");
				daysBoarding = enter.nextInt();
				enter.nextLine();
				double dailyCostForPet = costPerPound * dogsWeight;
				double costForStay = dailyCostForPet * daysBoarding;
				JOptionPane.showMessageDialog(null, "The cost for boarding your pet is " + costForStay);
			}
	}
