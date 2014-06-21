package State;
/**
 * Project:  Java Programming
 * Package:  State
 * File:  State
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 20-Jun-2014
 * At: 7:51 PM
 *
 * Create a class named State that holds the following fields: a String for the
 * name of the state, an integer for the population, and two
 *
 * The State constructor requires six parameters that represent the names
 * and populations of the state, its capital, and its most populous city.
 * Provide get methods for each field.
 *
 * Create the City class to be a non- static, private inner class within the State
 * class;
 * the City class contains a city’s name and population.
 *
 * Create a class to assign values to and display values from two State objects. Save the files as
 * State.java and TestState.java.
 */
public class State
	{
		private String stateName;
		private int statePopulation;
		private CapitalCity capitalCity;
		public State(String stateName, int statePopulation, String cap, int pop)
			{
				this.stateName = stateName;
				this.statePopulation = statePopulation;
				this.capitalCity = new CapitalCity(cap, pop);
			}
		public void setStateName(String state)
			{
				stateName = state;
			}
		public String getStateName()
			{
				return stateName;
			}
		public int getStatePopulation()
			{
				return statePopulation;
			}
		public void setStatePopulation(int population)
			{
				statePopulation = population;
			}
		private static class CapitalCity
			{
				static String capital;
				static int population;
				public CapitalCity(String cap, int pop)
					{
						capital = cap;
						population = pop;
						{
							getCapitaCityl();
							{
								return capital;
							}
						public void setCapital (String cap)
						{
							capital = cap;
						}
						public String getCapital ()
						{
							return capital;
						}
						public void setPopulation ( int pop)
						{
							population = pop;
						}
						public int getPopulation ()
						{
							return population;
						}
						}
					}
