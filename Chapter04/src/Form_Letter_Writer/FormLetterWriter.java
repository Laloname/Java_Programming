package Form_Letter_Writer;
/**
 * Project:  Java Programming
 * Package:  Form_Letter_Writer
 * File:  FormLetterWriter
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 18-Jun-2014
 * At: 12:43 AM
 * <p/>
 * Create a class named FormLetterWriter that includes two overloaded methods
 * named displaySalutation(). The first method takes one String parameter that
 * represents a customer’s last name, and it displays the salutation “Dear Mr. or Ms.”
 * followed by the last name. The second method accepts two String parameters that
 * represent a first and last name, and it displays the greeting “Dear” followed by the first
 * name, a space, and the last name. After each salutation, display the rest of a short
 * business letter: “Thank you for your recent order.” Write a main() method that tests
 * each overloaded method. Save the file as FormLetterWriter.java.
 */
public class FormLetterWriter
	{
		private static final String SALUTATION1 = "Dear Mr. or Ms. ";
		private static final String SALUTATION2 = "Dear ";
		public String lastName;
		public String firstName;
		private static final String LETTER_END = "Thank you for your recent order";
		public void displaySalutation(String last)
			{
				lastName = last;
				System.out.println(SALUTATION1 + lastName);
			}
		public void displaySalutation(String last, String first)
			{
				lastName = last;
				firstName = first;
				System.out.println(SALUTATION2 + firstName + " " + lastName);
			}
		public void displayLetter()
			{
				System.out.println(LETTER_END);
			}
		public static void main(String[] args)
			{
				FormLetterWriter test001 = new FormLetterWriter();
				FormLetterWriter test002 = new FormLetterWriter();
				test001.displaySalutation("Henry");
				test001.displayLetter();
				test002.displaySalutation("Henry", "Kimberly");
				test002.displayLetter();
			}
	}
