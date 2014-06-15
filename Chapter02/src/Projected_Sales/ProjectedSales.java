package Projected_Sales;
import java.text.*;
/**
 * Project:  Java Programming
 * Package:  Projected_Sales
 * File:  ProjectedSales
 * Created by:  Kimberly
 * On 4/14/2014 at 10:08 PM.
 * <p/>
 * Write a Java class that declares a named constant that represents next year’s anticipated 10 percent increase
 * in sales for each division of a company. (You can represent 10 percent as 0.10.) Also declare variables to
 * represent this year’s sales total in dollars for the North and South divisions. Assign appropriate values to
 * the variables—for example, 4000 and 5500. Compute and display, with explanatory text, next year’s projected
 * sales for each division. Save the class as ProjectedSales
 */
public class ProjectedSales
	{
		public static void main(String[] args)
			{
				double increase = 0.10;
				double salesNorth = 56000.00;
				double salesSouth = 4561236.00;
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
