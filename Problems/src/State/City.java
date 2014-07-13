package State;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * on 07-Jul-2014 at 8:16 AM.
 * Project: Java Programming
 * Package: State
 * File: ${FILE_NAME}
 */
public class City
	{
		private static String capitalName;
		private static int capitalPopulation;
		public City(String cap, int pop)
			{
				capitalName = cap;
				capitalPopulation = pop;
			}
		public static void setCapitalName(String cap)
			{
				capitalName = cap;
			}
		public static String getCapitalName()
			{
				return capitalName;
			}
		public static int getCapitalPopulation()
			{
				return capitalPopulation;
			}
	}
