package Student;
/**
 * Project:     Java Programming
 * Package:     Student
 * Filename:    ShowStudent2
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 9:51 AM
 *
 *
 * Create a constructor for the Student class you created. The constructor should initialize each Student’s ID number
 * to 9999, his or her points earned to 12, and credit hours to 3 (resulting in a grade point average of 4.0).
 * Write a program that demonstrates that the constructor works by instantiating an object and displaying the initial
 * values. Save the application as ShowStudent2.java.
 */
public class ShowStudent2
	{
		public static void main(String[] args)
			{
				Student Kamilah = new Student(9999, 3, 12);
				System.out.println("Students ID is " + Kamilah.getStudentID());
				System.out.println("Students credit hours are:  " + Kamilah.getStudentCreditHours());
				System.out.println("Students points earned are: " + Kamilah.getStudentPointsEarned());
				System.out.println("The students GPA is " + Kamilah.calculateGpa());
			}
	}
