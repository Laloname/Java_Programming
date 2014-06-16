package Paint_Calculator;
import javax.swing.*;
/**
 * Project:     Java Programming
 * Package:     Paint_Calculator
 * Filename:    PaintCalculator
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 2:02 AM
 *
 * Assume that a gallon of paint covers about 350 square feet of wall space. Create an application with a main()
 * method that prompts the user for the length, width, and height of a rectangular room. Pass these three values to
 * a method  that does the following:
 * l. Calculates the wall area for a room
 * 2. Passes the calculated wall area to another method that calculates and returns the number of gallons of
 * paint needed.
 * 3. Displays the number of gallons needed.
 * 4. Computes the price based on a paint price of $32 per gallon, assuming that the painter can buy any fraction of
 * a gallon of paint at the same price as a whole gallon.
 * 5. Returns the price to the main() method.
 * The main() method displays the final price. For example, the cost to paint a 15- by-20-foot room with 10-foot
 * ceilings is $64. Save the application as PaintCalculator.java.
 */
public class PaintCalculator
	{
		public static void main(String[] args)
			{
				String length1 = JOptionPane.showInputDialog(null, "Please enter the length of the wall in feet.inches: "
					, "LENGTH IN FEET.INCHES", JOptionPane.QUESTION_MESSAGE);
				double length = Double.parseDouble(length1);
				String width1 = JOptionPane.showInputDialog(null, "Please enter the width of the wall in feet.inches: "
					, "WIDTH IN FEET.INCHES", JOptionPane.QUESTION_MESSAGE);
				double width = Double.parseDouble(width1);
				String height1 = JOptionPane.showInputDialog(null, "Please enter the height of the wall in feet.inches: "
					, "HEIGHT IN FEET.INCHES", JOptionPane.QUESTION_MESSAGE);
				double height = Double.parseDouble(height1);
				int surfaceArea = calculateSurfaceArea(length, width, height);
				int gallonsPaint = calculateGallonsPaint(surfaceArea);
				double paintCost = computePaintCost(gallonsPaint);
				System.out.println("The surface area of the room is: " + surfaceArea + ".");
				System.out.println("It will require " + gallonsPaint + " gallon(s) of paint.");
				System.out.println("The cost of the paint will be " + paintCost);
			}
		public static int calculateSurfaceArea(double length, double width, double height)
			{
				int newLength = (int) ((((length / 12) * 12) * 12) + (length % 12));
				int newWidth = (int) ((((width / 12) * 12) * 12) + (width % 12));
				int newHeight = (int) ((((height / 12) * 12) * 12) + (height % 12));
				int areaCeiling = newLength * newWidth;
				int areaWall1 = newLength * newHeight;
				int areaWall2 = newWidth * newHeight;
				return areaCeiling + areaWall1 + areaWall1 + areaWall2 + areaWall2;
			}
		public static int calculateGallonsPaint(int surfaceArea)
			{
				int paintCoverage = 350;
				int convertSquareFeet = 144;
				int areaSquareInches = surfaceArea / convertSquareFeet;
				return areaSquareInches / paintCoverage;
			}
		public static double computePaintCost(int gallonsPaint)
			{
				double costPaintGal = 32.00;
				return gallonsPaint * costPaintGal;
			}
	}
