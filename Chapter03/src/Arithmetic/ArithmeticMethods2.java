package Arithmetic;
import java.util.*;
/**
 * Project:     Java Programming
 * Package:     Arithmetic
 * Filename:    ArithmeticMethods2
 * Created By:  Kimberly Henry
 * On: 15-Jun-2014 At: 11:28 PM
 *
 *
 * Modify the ArithmeticMethods class to accept the values of the two integers from
 * a user at the keyboard. Save the file as ArithmeticMethods2.java.
 */
public class ArithmeticMethods2
	{
		public static void main(String[] args)
			{
				Scanner enter = new Scanner(System.in);
				System.out.println("Enter an integer:  ");
				int a = enter.nextInt();
				System.out.println("Enter another integer:  ");
				int b = enter.nextInt();
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
