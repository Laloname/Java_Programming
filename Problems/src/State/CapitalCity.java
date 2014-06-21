package State;
/**
 * Project:  Java Programming
 * Package:  State
 * File:  CapitalCity
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 21-Jun-2014
 * At: 12:31 PM
 */
public class CapitalCity
	{
		private static String capitalCity;
		private static int capitalPopulation;
		public CapitalCity(String cap, int pop)
			{
				capitalCity = cap;
				capitalPopulation = pop;
			}
		public String getCapitalCity()
			{
				return capitalCity;
			}
		public int getCapitalPopulation()
			{
				return capitalPopulation;
			}
	}
