package State;
import java.util.Scanner;
/**
 * Project:  Java Programming
 * Package:  State
 * File:  TestState
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 20-Jun-2014
 * At: 8:25 PM
 */
public class TestState
	{
		public static void main(String[] args)
			{
				Scanner enter = new Scanner(System.in);
				State test001 = new State();
				test001.setStateName("Massachusetts");
				test001.setStatePopulation(enter.nextInt());
			}
	}
