package Circle;
/**
 * Project:  Java Programming
 * Package:  Circle
 * File:  Circle
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 19-Jun-2014
 * At: 10:43 PM
 *
 * Create a class named Circle with fields named radius, diameter, and area.
 * Include a constructor that sets the radius to 1 and calculates the other two values.
 * Also include methods named setRadius()and getRadius(). The setRadius()
 * method not only sets the radius but also calculates the other two values. (The
 * diameter of a circle is twice the radius, and the area of a circle is pi multiplied by
 * the square of the radius. Use the Math class PI constant for this calculation.) Save
 * the class as Circle.java.
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
