package Circle;
/**
 * Project:  Java Programming
 * Package:  Circle
 * File:  Circle
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 19-Jun-2014
 * At: 10:43 PM
 *
 * Create a class named TestCircle whose main() method declares several
 * Circle objects. Using the setRadius() method, assign one Circle a small
 * radius value, and assign another a larger radius value. Do not assign a value to
 * the radius of the third circle; instead, retain the value assigned at construction.
 * Display all the values for all the Circle objects. Save the application as
 * TestCircle.java.
 */
public class Circle
	{
		private double radius;
		private double diameter;
		private double area;
		public Circle()
			{
				setRadius();
			}
		public void setRadius()
			{
				this.radius = 1;
				diameter = 2 * radius;
				area = Math.PI * radius * Math.pow(radius, 2);
			}
		public double getRadius()
			{
				return radius;
			}
		public double getDiameter()
			{
				return diameter;
			}
		public double getArea()
			{
				return area;
			}
	}
