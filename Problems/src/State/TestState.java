package State;
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
				State test001 = new State("Massachusetts", 86954, "Boston", 45683);
				System.out.println("The State is: " + test001.getStateName());
				System.out.println("The population of " + test001.getStateName() + " is " + test001.getStatePopulation());
				CapitalCity capitalCity;
				System.out.println(State.CapitalCity.cap);
			}
	}
