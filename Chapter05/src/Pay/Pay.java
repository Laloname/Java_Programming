package Pay;
import java.util.Scanner;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 9:18 PM.
 * Project: Java Programming
 * Package: Pay
 * File: Pay
 */
public class Pay
	{
		//fields to calculate pay
		public static int skillLevel;
		public static double hoursWorked;
		public static final double LEVEL1_PAY = 17.00;
		public static final double LEVEL2_PAY = 20.00;
		public static final double LEVEL3_PAY = 22.00;
		public static final double INVALID = 0;
		//fields to display hours worked and calculate pay
		public static double overtimeHours;
		public static double regularHours;
		public static double regularPayRate;
		public static double overtimePayRate;
		public static double regularPay;
		public static double grossPay;
		public static double overtimePay;
		public static Scanner enter = new Scanner(System.in);
		public static int insuranceSelections;
		public static double medical;
		public static double dental;
		public static double disability;
		public static double retirement;
		public static double retirementPremium;
		public static final double MEDICAL_PAY = 32.50;
		public static final double DENTAL_PAY = 20.00;
		public static final double DISABILITY_PAY = 10.00;
		public static final double RETIREMENT_RATE = 0.03;
		public static double insurancePremiums;
		public static double netPay;
		public static void main(String[] args)
			{
				setPayRates();
				calculateHoursWorked();
				calculatePay();
				setInsuranceSelections();
				calculateNetPay();
				displayDetail();
			}
		//method to associate skillLevel and set pay rate
		public static void setPayRates()
			{
				System.out.println("What is your skill level?");
				System.out.println("-----------------");
				System.out.println("1 - Level 1");
				System.out.println("2 - Level 2");
				System.out.println("3 - Level 3");
				System.out.println("-----------------");
				skillLevel = enter.nextInt();
				switch (skillLevel)
					{
						case 1:
							regularPayRate = LEVEL1_PAY;
							break;
						case 2:
							regularPayRate = LEVEL2_PAY;
							break;
						case 3:
							regularPayRate = LEVEL3_PAY;
							break;
						default:
							regularPayRate = INVALID;
							System.out.println("INVALID Selection");
							setPayRates();
					}
				overtimePayRate = regularPayRate * 1.5;
			}
		//calculates regular and overtime hours worked.
		public static void calculateHoursWorked()
			{
				System.out.println("How many hours did you work last week?");
				hoursWorked = enter.nextInt();
				if (hoursWorked < 41)
					{
						regularHours = 40;
					}
				else
					{
						overtimeHours = hoursWorked - 40;
						regularHours = hoursWorked - overtimeHours;
					}
			}
		//calculate gross pay
		public static void calculatePay()
			{
				regularPay = regularHours * regularPayRate;
				overtimePay = overtimeHours * overtimePayRate;
				grossPay = regularPay + overtimePay;
			}
		//select insurance and calculate total insurance payment
		public static void setInsuranceSelections()
			{
				System.out.println("Please select insurance 1, 2, 3, or 4 your type: ");
				System.out.println("To End Selections Enter 0");
				System.out.println("-----------------");
				System.out.println("1 - Medical ");
				System.out.println("2 - Dental ");
				System.out.println("3 - Disability ");
				System.out.println("4 - Retirement");
				System.out.println("-----------------");
				insuranceSelections = enter.nextInt();
				switch (insuranceSelections)
					{
						case 1:
							medical = MEDICAL_PAY;
							setInsuranceSelections();
							break;
						case 2:
							dental = DENTAL_PAY;
							setInsuranceSelections();
							break;
						case 3:
							disability = DISABILITY_PAY;
							setInsuranceSelections();
							break;
						default:
							break;
					}
				if (insuranceSelections == 4)
					{
						getSkillLevel();
					}
				if (skillLevel == 3)
					{
						retirement = RETIREMENT_RATE;
						retirementPremium = grossPay * retirement;
					}
				else
					{
						retirementPremium = 0;
					}
				insurancePremiums = medical + dental + disability + retirementPremium;
			}
		//calculate net pay
		public static void calculateNetPay()
			{
				netPay = grossPay - insurancePremiums;
			}
		public static int getSkillLevel()
			{
				return skillLevel;
			}
		public static void displayDetail()
			{
				System.out.println("Hourly Pay Rate: " + regularPayRate);
				System.out.println("Overtime Pay Rate: " + overtimePayRate);
				System.out.println("Regular Hours Worked: " + regularHours);
				System.out.println("Overtime Hours Worked: " + overtimeHours);
				System.out.println("Regular Pay: " + regularPay);
				System.out.println("Overtime Pay: " + overtimePay);
				System.out.println("Gross Pay: " + grossPay);
				System.out.println("Medical Premium: " + medical);
				System.out.println("Dental Premium: " + dental);
				System.out.println("Disability Premium: " + disability);
				System.out.println("Retirement Rate Percentage: " + retirement);
				System.out.println("Retirement Premium: " + retirementPremium);
				System.out.println("Total Insurance Payments " + insurancePremiums);
				System.out.println("Net Pay: " + netPay);
			}
	}





