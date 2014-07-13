package CondoSales;
import java.util.Scanner;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 10:22 AM.
 * Project: Java Programming
 * Package: CondoSales
 * File: CondoSales
 * Write an application for the Summerdale Condo Sales office; the program
 * determines the price of a condominium. Ask the user to choose 1 for park view,
 * 2 for golf course view, or 3 for lake view.
 * The output is the name of the chosen view as well as the price of the condo.
 * Park view condos are $150,000,
 * condos with golf course views are $170,000,
 * and condos with lake views are $210,000.
 * If the user enters an invalid code, set the price to 0. Save the file as CondoSales.java.
 */
public class CondoSales
	{
		public static final double PARKVIEW_PRICE = 150000.00;
		public static final double GOLFVIEW_PRICE = 170000.00;
		public static final double LAKEVIEW_PRICE = 210000.00;
		public static final String P = "You selected the Park View Condo with a sales price of ";
		public static final String G = "You selected the Golf View Condo with a sales price of ";
		public static final String L = "You selected the Lake View Condo with a sales price of ";
		public static final String I = "You selected an INVALID response, sales price is set to ";
		static int condoSelection;
		static double salesPrice;
		public static void main(String[] args)
			{
				Scanner enter = new Scanner(System.in);
				System.out.println("Please enter your condominium selection:\n1 - Park View\n2 - Golf " +
				                   "Course View\n3 - Lake View");
				condoSelection = enter.nextInt();
				boolean invalidResponse = (condoSelection > 3 || condoSelection < 0);
				if (condoSelection == 1)
					{
						salesPrice = PARKVIEW_PRICE;
						System.out.println(P + salesPrice);
					}
				else if (condoSelection == 2)
					{
						salesPrice = GOLFVIEW_PRICE;
						System.out.println(G + salesPrice);
					}
				else if (condoSelection == 3)
					{
						salesPrice = LAKEVIEW_PRICE;
						System.out.println(L + salesPrice);
					}
				else if (invalidResponse)
					{
						salesPrice = 0;
						System.out.println(I + salesPrice);
					}
			}
	}
