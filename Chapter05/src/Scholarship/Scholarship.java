package Scholarship;
import java.util.Scanner;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 10:25 PM.
 * Project: Java Programming
 * Package: Scholarship
 * File: Scholarship
 * The Williamsburg Women’s Club offers scholarships to local high school
 * students who meet any of several criteria. Write an application that prompts
 * the user for a student’s numeric high school grade point average (for example,
 * 3.2), the student’s number of extracurricular activities, and the student’s
 * number of service activities.
 * <p/>
 * Display the message “Scholarship candidate” if
 * the student has any of the following:
 * 1.  A grade point average of 3.8 or above and at least one extracurricular
 * activity and one service activity.
 * <p/>
 * 2. A grade point average below 3.8 but at least 3.4 and a total of at least
 * three extracurricular and service activities.
 * <p/>
 * 3. A grade point average below 3.4 but at least 3.0 and at least two
 * extracurricular activities and three service activities.
 * If the student does not meet any of the qualification criteria, display
 * “Not a candidate.” Save the file as Scholarship.java.
 */
public class Scholarship
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
				if (firstScholarship == true)
					{
						System.out.println(scholarship);
					}
				else if (secondScholarship == true)
					{
						System.out.println(scholarship);
					}
				else if (thirdScholarship == true)
					{
						System.out.println(scholarship);
					}
				else
					{
						System.out.println(noScholarship);
					}
			}
	}
