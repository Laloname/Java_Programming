package State;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * on 07-Jul-2014 at 8:52 AM.
 * Project: Java Programming
 * Package: State
 * File: ${FILE_NAME}
 */
public class TestState
	{
		public static void main(String[] args)
			{
				State test001 = new State("Massachusetts", 864220, "Boston", 432110, "Springfield", 22550);
				System.out.println("State: " + test001.getStateName());
				System.out.println("State Population: " + test001.getStatePopulation());
				System.out.println("Capital Name: " + City.getCapitalName());
				System.out.println("Capital Population: " + City.getCapitalPopulation());
			}
	}
