package Student;
import java.util.*;
/**
 * Project:     Java Programming
 * Package:     Student
 * Filename:    Student
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 9:47 AM**/
//todo  This class should be done over; does not function as intended.
/**
 * Create a class named Student. A Student has fields for an ID number, number of credit hours earned, and number of
 * points earned. (For example, many schools compute grade point averages based on a scale of 4, so a three-credit-hour
 * class in which a student earns an A is worth 12 points.) Include methods to assign values to all fields. A Student
 * also has a field for grade point average. Include a method to compute the grade point average field by dividing
 * points by credit hours earned. Write methods to display the values in each Student field. Save this class
 * as Student.java.
 */
public class Student
	{
		//		code does not function as intended.
		private int studentID;
		private int studentCreditHours;
		private int studentPointsEarned;
		double gpa;
		//Default constructor
		public Student()
			{
				studentID = 9999;
				studentCreditHours = 12;
				studentPointsEarned = 16;
			}
		//Parameters and setters constructor
		public Student(int id, int hours, int earned)
			{
				this.studentID = id;
				this.studentCreditHours = hours;
				this.studentPointsEarned = earned;
			}
		//Constructor to get data interactively
		public static void getData()
			{
				Scanner enter = new Scanner(System.in);
				System.out.println("Enter Student Id:  ");
				int studentID = enter.nextInt();
				System.out.println("Enter Student Credit Hours:  ");
				int studentCreditHours = enter.nextInt();
				System.out.println("Enter Points Earned:  ");
				int studentPointsEarned = enter.nextInt();
			}
		public int getStudentID()
			{
				return this.studentID;
			}
		public int getStudentCreditHours()
			{
				return this.studentCreditHours;
			}
		public int getStudentPointsEarned()
			{
				return this.studentPointsEarned;
			}
		public double calculateGpa()
			{
				this.gpa = this.getStudentPointsEarned() / this.getStudentCreditHours();
				return this.gpa;
			}
	}
