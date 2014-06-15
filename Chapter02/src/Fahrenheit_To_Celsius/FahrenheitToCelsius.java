package Fahrenheit_To_Celsius;
import javax.swing.*;
/**
 * Project:  Java Programming
 * Package:  Fahrenheit_To_Celsius
 * File:  FahrenheitToCelsius
 * Created by:  Kimberly Henry
 * On 4/17/2014 at 3:27 AM.
 * <p/>
 * Write a program that accepts a temperature in Fahrenheit from a user and converts
 * it to Celsius by subtracting 32 from the Fahrenheit value and multiplying the result
 * by 5/9. Display both values. Save the class as FahrenheitToCelsius.java.
 */
public class FahrenheitToCelsius
	{
		public static void main(String[] args)
			{
				double tempFahrenheit;
				String temps;
				temps = JOptionPane.showInputDialog(null, "Please enter the patients temperature in fahrenheit?",
				                                    "PATIENTS TEMPERATURE", JOptionPane.QUESTION_MESSAGE);
				tempFahrenheit = Double.parseDouble(temps);
				double tempCelsius = (tempFahrenheit - 32) / 1.8;
				JOptionPane.showMessageDialog(null, "The patients temperature in celsisus is " + tempCelsius + ".",
				                              "CELSIUS TEMPERATURE", JOptionPane.PLAIN_MESSAGE);
			}
	}
