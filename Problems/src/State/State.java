package State;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * on 06-Jul-2014 at 1:23 AM.
 * Project: Java Programming
 * Package: State
 * File: State
 * Create a class named State that holds the following fields: a String for the
 * name of the state, an integer for the population, and two City objects that hold
 * data about the capital city and the most populous city. The State constructor
 * requires six parameters that represent the names and populations of the state,
 * its capital, and its most populous city. Provide get methods for each field.
 * Create the City class to be a nonstatic, private inner class within the State
 * class; the City class contains a city’s name and population. Create a class to
 * assign values to and display values from two State objects. Save the files as
 * State.java and TestState.java.
 */
public class State
	{
		private String stateName;
		private int statePopulation;
		private City capital;
		private State.City population;
		public State(String state, int statepop, String cap, int pop, String city, int citypop)
			{
				stateName = state;
				this.statePopulation = statepop;
				City capital = new City(city, citypop);
				State.City population = new State.City(cap, pop);
			}
		public String getStateName()
			{
				return stateName;
			}
		public int getStatePopulation()
			{
				return statePopulation;
			}
		private class City
			{
				private String cityName;
				private int cityPopulation;
				public City(String city, int citypop)
					{
						cityName = city;
						cityPopulation = citypop;
					}
				public void displayCity()
					{
						System.out.println("City Name: " + cityName);
						System.out.println("City Population: " + cityPopulation);
					}
			}
	}
