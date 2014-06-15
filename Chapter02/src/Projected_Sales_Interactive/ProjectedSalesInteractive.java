package Projected_Sales_Interactive;
import javax.swing.*;
import java.text.*;
/**
 * Project:  Java Programming
 * Package:  Projected_Sales_Interactive
 * File:  ProjectedSalesInteractive
 * Created by:  Kimberly
 * On 4/14/2014 at 11:24 PM.
 * <p/>
 * Convert the ProjectedSales class to an interactive application. Instead of
 * assigning values to the North and South current year sales variables, accept them
 * from the user as input. Save the revised class as ProjectedSalesInteractive.java.
 */
public class ProjectedSalesInteractive
	{
		public static void main(String[] args)
			{
				double increase;
				String percent;
				double salesNorth;
				String northSales;
				double salesSouth;
				String southSales;
				percent = JOptionPane.showInputDialog(null, "Please enter the anticipated percent increase ", "PERCENT INCREASE", JOptionPane.QUESTION_MESSAGE);
				increase = Double.parseDouble(percent);
				northSales = JOptionPane.showInputDialog(null, "Please enter North Division last years total sales", "NORTH TOTAL SALES LAST YEAR", JOptionPane.QUESTION_MESSAGE);
				salesNorth = Double.parseDouble(northSales);
				southSales = JOptionPane.showInputDialog(null, "Please enter South Division last years total sales", "SOUTH TOTAL SALES LAST YEAR", JOptionPane.QUESTION_MESSAGE);
				salesSouth = Double.parseDouble(southSales);
				double projectedIncreaseNorth = salesNorth * increase;
				double projectedIncreaseSouth = salesSouth * increase;
				double projectedSalesNorth = salesNorth + projectedIncreaseNorth;
				double projectedSalesSouth = salesSouth + projectedIncreaseSouth;
				DecimalFormat aFormat = new DecimalFormat("###,###,###,###.00");
				System.out.println("The anticipated increase is " + increase + "%");
				System.out.println("Total Sales North: " + aFormat.format(salesNorth));
				System.out.println("Total Sales South: " + aFormat.format(salesSouth));
				System.out.println("Projected Increase North: " + aFormat.format(projectedIncreaseNorth));
				System.out.println("Projected Increase South: " + aFormat.format(projectedIncreaseSouth));
				System.out.println("Projected Sales North: " + aFormat.format(projectedSalesNorth));
				System.out.println("Projected Sales South: " + aFormat.format(projectedSalesSouth));
			}
	}
