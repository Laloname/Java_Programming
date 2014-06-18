package Student;
/**
 * Project:  Java Programming
 * Package:  Student
 * File:  ShowStudent2
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 17-Jun-2014
 * At: 7:52 PM
 * <p/>
 * Create a constructor for the Student class you created. The constructor should
 * initialize each Student’s ID number to 9999, his or her points earned to 12, and
 * credit hours to 3 (resulting in a grade point average of 4.0). Write a program that
 * demonstrates that the constructor works by instantiating an object and displaying
 * the initial values. Save the application as ShowStudent2.java.
 */
public class ShowStudent2
	{
		public static void main(String[] args)
			{
				Student test002 = new Student();
				test002.setGradePointAverage();
				test002.displayStudentDetails();
			}
	}
