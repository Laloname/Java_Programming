package Math_Test;
/**
 * Project:  Java Programming
 * Package:  MathTest
 * File:  MathTest
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 20-Jun-2014
 * At: 1:16 PM
 *
 * Write a Java application that uses the Math class to determine the answers for each of
 * the following:
 * a. The square root of 37
 * b. The sine and cosine of 300
 * c. The value of the floor, ceiling, and round of 22.8
 * d. The larger and the smaller of the character “D” and the integer 71
 * e. A random number between 0 and 20 (Hint: The random() method returns a
 * value between 0 and 1; you want a number that is 20 times larger.)
 */
public class MathTest
	{
		public static void main(String[] args)
			{
				System.out.println("The square root of 37 is " + Math.sqrt(37));
				System.out.println("The sine of 300 is " + Math.sin(300));
				System.out.println("The cosine of 300 is " + Math.cos(300));
				System.out.println("The floor of 22.8 is " + Math.floor(22.8));
				System.out.println("The ceiling of 22.8 is " + Math.ceil(22.8));
				System.out.println("The round of 22.8 is " + Math.round(22.8));
				System.out.println("The larger of D and 71 is " + Math.max('D', 71));
				System.out.println("The smaller of D and 71 is " + Math.min('D', 71));
				System.out.println("A random number between 0 and 20 is " + Math.random() * 20 + 1);
			}
	}
