package Arithmetic;
/**
 * Project:     Java Programming
 * Package:     Arithmetic
 * Filename:    ArithmeticMethods
 * Created By:  Kimberly Henry
 * On: 15-Jun-2014 At: 11:27 PM
 *
 * Create an application named ArithmeticMethods whose main() method holds
 * two integer variables. Assign values to the variables. In turn, pass each
 * value to methods named displayNumberPlus10(), displayNumberPlus100(), and
 * displayNumberPlus1000(). Create each method to perform the task its name
 * implies. Save the application as ArithmeticMethods.java.
 */
public class ArithmeticMethods
	{
		public static void main(String[] args)
			{
				int a = 5;
				int b = 8;
				displayNumberPlus10(a, b);
				displayNumberPlus100(a, b);
				displayNumberPlus1000(a, b);
			}
		public static void displayNumberPlus10(int a, int b)
			{
				System.out.println("Integer a is " + a + " and integer b is " + b);
				System.out.println(a + " + 10 = " + (a + 10));
				System.out.println(b + " + 10 = " + (b + 10));
			}
		public static void displayNumberPlus100(int a, int b)
			{
				System.out.println("Integer a is " + a + " and integer b is " + b);
				System.out.println(a + " + 100 = " + (a + 100));
				System.out.println(b + " + 100 = " + (b + 100));
			}
		public static void displayNumberPlus1000(int a, int b)
			{
				System.out.println("Integer a is " + a + " and integer b is " + b);
				System.out.println(a + " + 1000 = " + (a + 1000));
				System.out.println(b + " + 1000 = " + (b + 1000));
			}
	}
