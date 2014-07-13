package Scholarship;
import java.util.Scanner;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 10:25 PM.
 * Project: Java Programming
 * Package: Scholarship
 * File: Scholarship
 * Modify the Scholarship application so that if a user enters a
 * grade point average under 0 or over 4.0, or a negative value
 * for either of the activities, an error message appears.
 * Save the file as Scholarship2.java.
 */
public class Scholarship2
	{
		public static double gradePointAverage;
		public static int activityExtra;
		public static int activityService;
		public static String scholarship = "Scholarship Candidate";
		public static String noScholarship = "Not A Candidate";
		public static void main(String[] args)
			{
				Scanner enter = new Scanner(System.in);
				System.out.println("Please enter your grade point average: ");
				gradePointAverage = enter.nextDouble();
				System.out.println("Enter the number of extra curriculum activities: ");
				activityExtra = enter.nextInt();
				System.out.println("Enter the number of service activities: ");
				activityService = enter.nextInt();
				boolean firstScholarship = (gradePointAverage >= 3.8 && activityExtra > 0 && activityService > 0);
				boolean secondScholarship = (gradePointAverage < 3.8 && gradePointAverage > 3.3 && (activityExtra > 2 && activityService > 2));
				boolean thirdScholarship = ((gradePointAverage < 3.4 && gradePointAverage > 2.9) && (activityExtra >= 2 && activityService >= 3));
				if (gradePointAverage > 4.0 || gradePointAverage < 0)
					{
						System.out.println("Grade Point Average is not in valid range.");
					}
				if (activityExtra < 0)
					{
						System.out.println("Extra Curricular activities is not valid.");
					}
				if (activityService < 0)
					{
						System.out.println("Service activities is not valid.");
					}
				if (firstScholarship)
					{
						System.out.println(scholarship);
					}
				else if (secondScholarship)
					{
						System.out.println(scholarship);
					}
				else if (thirdScholarship)
					{
						System.out.println(scholarship);
					}
				else
					{
						System.out.println(noScholarship);
					}
			}
	}
