package Student;
/**
 * Project:  Java Programming
 * Package:  NewStudent
 * File:  NewShowStudent
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 17-Jun-2014
 * At: 7:34 PM
 * <p/>
 * Write a class named ShowStudent that instantiates a Student object from the class you created and assign values to
 * its fields. Compute the Student grade point average, and then display all the values associated with the Student.
 * Save the application as ShowStudent.java.
 */
public class ShowStudent
	{
		public static void main(String[] args)
			{
				Student test001 = new Student();
				test001.setStudentId(45678);
				test001.setCreditHoursEarned(16);
				test001.setPointsEarned(64);
				test001.setGradePointAverage();
				test001.displayStudentDetails();
			}
	}
