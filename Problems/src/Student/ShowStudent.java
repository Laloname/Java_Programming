package Student;
/**
 * Project:     Java Programming
 * Package:     Student
 * Filename:    ShowStudent
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 9:49 AM
 * */
//todo  This class should be done over; does not function as intended.
/**
 * Write a class named ShowStudent that instantiates a Student object from the class you created and assign values to
 * its fields. Compute the Student grade point average, and then display all the values associated with the Student.
 * Save the application as ShowStudent.java.
 */
public class ShowStudent
	{
		public static void main(String[] args)
			{
				Student Kimberly = new Student();
				Kimberly.getData();
				Student Stewart = new Student();
				System.out.println("Students ID is " + Kimberly.getStudentID());
				System.out.println("Students credit hours are:  " + Kimberly.getStudentCreditHours());
				System.out.println("Students points earned are: " + Kimberly.getStudentPointsEarned());
				System.out.println("The students GPA is " + Kimberly.calculateGpa());
				System.out.println("Students ID is " + Stewart.getStudentID());
				System.out.println("Students credit hours are:  " + Stewart.getStudentCreditHours());
				System.out.println("Students points earned are: " + Stewart.getStudentPointsEarned());
				System.out.println("The students GPA is " + Stewart.calculateGpa());
				Student Eric = new Student(2431654, 8, 24);
				System.out.println("Students ID is " + Eric.getStudentID());
				System.out.println("Students credit hours are:  " + Eric.getStudentCreditHours());
				System.out.println("Students points earned are: " + Eric.getStudentPointsEarned());
				System.out.println("The students GPA is " + Eric.calculateGpa());
			}
	}