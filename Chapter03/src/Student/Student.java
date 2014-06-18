package Student;
/**
 * Project:  Java Programming
 * Package:  NewStudent
 * File:  Student
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 17-Jun-2014
 * At: 6:14 PM
 * <p/>
 * Create a class named Student. A Student has fields for an ID number, number of credit hours earned, and number of
 * points earned. (For example, many schools compute grade point averages based on a scale of 4, so a three-credit-hour
 * class in which a student earns an A is worth 12 points.) Include methods to assign values to all fields. A Student
 * also has a field for grade point average. Include a method to compute the grade point average field by dividing
 * points by credit hours earned. Write methods to display the values in each Student field. Save this class
 * as Student.java.
 */
public class Student
	{
		private int studentId;
		private int creditHoursEarned;
		private int pointsEarned;
		private double gradePointAverage;
		public Student()
			{
				this.studentId = 9999;
				this.creditHoursEarned = 3;
				this.pointsEarned = 12;
			}
		public void setStudentId(int id)
			{
				studentId = id;
			}
		public int getStudentId()
			{
				return studentId;
			}
		public void setCreditHoursEarned(int che)
			{
				creditHoursEarned = che;
			}
		public int getCreditHoursEarned()
			{
				return creditHoursEarned;
			}
		public void setPointsEarned(int pe)
			{
				pointsEarned = pe;
			}
		public int getPointsEarned()
			{
				return pointsEarned;
			}
		public void setGradePointAverage()
			{
				gradePointAverage = pointsEarned / creditHoursEarned;
			}
		public double getGradePointAverage()
			{
				return gradePointAverage;
			}
		public void displayStudentDetails()
			{
				System.out.println("Student Id: " + getStudentId());
				System.out.println("Credit Hours Earned: " + getCreditHoursEarned());
				System.out.println("Points Earned: " + getPointsEarned());
				System.out.println("Grade Point Average: " + getGradePointAverage());
			}
	}
