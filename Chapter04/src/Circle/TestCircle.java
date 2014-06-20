package Circle;
/**
 * Project:  Java Programming
 * Package:  Circle
 * File:  TestCircle
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 19-Jun-2014
 * At: 10:45 PM
 */
public class TestCircle
	{
		public static void main(String[] args)
			{
				Circle test001 = new Circle();
				test001.setRadius();
				System.out.println("Test001 Circle Radius:  " + test001.getRadius());
				System.out.println("Test001 Circle Area:  " + test001.getArea());
				System.out.println("Test001 Circle Diameter: " + test001.getDiameter());
			}
	}
