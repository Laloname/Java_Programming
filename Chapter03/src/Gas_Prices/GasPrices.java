package Gas_Prices;
import java.util.*;
/**
 * Project:     Java Programming
 * Package:     Gas_Prices
 * Filename:    GasPrices
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 1:48 AM
 *
 *
 * When gasoline is $100 per barrel, then the consumer’s price at the pump is between $3.50
 * and $4.00 per gallon. Create a class named GasPrices. Its main() method holds an integer
 * variable named pricePerBarrel to which you will assign a value entered by a user at the
 * keyboard.
 * Create a method to which you pass pricePerBarrel. The method displays the range of possible
 * prices per gallon. For example, if gas is $120 per barrel, then the price at the pump should
 * be between $4.20 and $4.80. Save the application as GasPrices.java.
 */
public class GasPrices
	{
		public static void main(String[] args)
			{
				Scanner enter = new Scanner(System.in);
				System.out.println("Please enter the price of gas per barrel");
				int pricePerBarrel = enter.nextInt();
				calculateMinPricePerGallon(pricePerBarrel);
			}
		public static void calculateMinPricePerGallon(int pricePerBarrel)
			{
				double MIN = (float) (pricePerBarrel * 0.035);
				double MAX = (float) (pricePerBarrel * 0.040);
				System.out.println("If gas is " + pricePerBarrel + " per barrel the minimum at the pump " +
				                   "would be " + MIN + " per gallon and the maximum would be "
				                   + MAX + " per gallon.");
			}
	}
