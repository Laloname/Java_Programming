package Coffee;
import java.util.Scanner;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 1:40 AM.
 * Project: Java Programming
 * Package: Coffee
 * File:  ${FILE}
 */
public class Coffee
	{
		public static int menuSelection;
		public static final int AMERICAN_CODE = 1;
		public static final int ESPRESSO_CODE = 2;
		public static final int LATTE_CODE = 3;
		public static double firstBill = 0;
		public static double secondBill = 0;
		public static double thirdBill = 0;
		public static final double AMERICAN = 1.99;
		public static final double ESPRESSO = 2.50;
		public static final double LATTE = 2.15;
		public static void main(String[] args)
			{
				firstMenuSelection();
				secondMenuSelection();
				thirdMenuSelection();
				System.out.println("Your total bill is " + (firstBill + secondBill + thirdBill));
				System.exit(0);
			}
		public static void displayMenu()
			{
				System.out.println("Please select menu item by number, enter 0 to exit");
				System.out.println("----------------------------------");
				System.out.println("(1) American                 1.99");
				System.out.println("(2) Espresso                 2.50");
				System.out.println("(3) Latte                    2.15");
				System.out.println("----------------------------------");
				Scanner enter = new Scanner(System.in);
				menuSelection = enter.nextInt();
			}
		public static double firstMenuSelection()
			{
				displayMenu();
				if (menuSelection == AMERICAN_CODE)
					{
						firstBill = firstBill + AMERICAN;
					}
				else if (menuSelection == ESPRESSO_CODE)
					{
						firstBill = firstBill + ESPRESSO;
					}
				else if (menuSelection == LATTE_CODE)
					{
						firstBill = firstBill + LATTE;
					}
				else if (menuSelection < 0 || menuSelection > 3)
					{
						firstBill = 0;
					}
				System.out.println("Your selection will cost " + firstBill);
				return firstBill;
			}
		public static double secondMenuSelection()
			{
				displayMenu();
				if (menuSelection == AMERICAN_CODE)
					{
						secondBill = secondBill + AMERICAN;
					}
				else if (menuSelection == ESPRESSO_CODE)
					{
						secondBill = secondBill + ESPRESSO;
					}
				else if (menuSelection == LATTE_CODE)
					{
						secondBill = secondBill + LATTE;
					}
				else if (menuSelection < 0 || menuSelection > 3)
					{
						secondBill = 0;
					}
				System.out.println("Your selection will cost " + secondBill);
				return secondBill;
			}
		public static double thirdMenuSelection()
			{
				displayMenu();
				if (menuSelection == AMERICAN_CODE)
					{
						thirdBill = thirdBill + AMERICAN;
					}
				else if (menuSelection == ESPRESSO_CODE)
					{
						thirdBill = thirdBill + ESPRESSO;
					}
				else if (menuSelection == LATTE_CODE)
					{
						thirdBill = thirdBill + LATTE;
					}
				else if (menuSelection < 0 || menuSelection > 3)
					{
						thirdBill = 0;
					}
				System.out.println("Your selection will cost " + thirdBill);
				return thirdBill;
			}
	}





