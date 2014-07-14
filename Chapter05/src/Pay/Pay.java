package Pay;
import java.util.Scanner;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 9:18 PM.
 * Project: Java Programming
 * Package: Pay
 * File:  ${FILE}
 */
public class Pay
	{
		public static int employeePayRate;
		public static double hoursWorked;
		public static double overtimeHours;
		public static double regularHours;
		public static final int LEVEL1 = 1;
		public static final int LEVEL2 = 2;
		public static final int LEVEL3 = 3;
		public static double payLevel;
		public static final double LEVEL1_PAY = 17.00;
		public static final double LEVEL2_PAY = 20.00;
		public static final double LEVEL3_PAY = 22.00;
		public static double grossPay;
		public static double regularPay;
		public static double overtimePay;
		public static double overtimeRate;
		public static final int MEDICAL = 1;
		public static final int DENTAL = 2;
		public static final int DISABILITY = 3;
		public static final double MEDICAL_PAY = 32.50;
		public static final double DENTAL_PAY = 20.00;
		public static final double DISABILITY_PAY = 10.00;
		public static final double RETIREMENT_RATE = 0.03;
		public static final double OVERTIME_RATE = 1.5;
		public static void main(String[] args)
			{
				Scanner enter = new Scanner(System.in);
				System.out.println("What is your skill level?");
				System.out.println("-----------------");
				System.out.println("1 - Level 1");
				System.out.println("2 - Level 2");
				System.out.println("3 - Level 3");
				System.out.println("-----------------");
				employeePayRate = enter.nextInt();
				System.out.println("How many hours did you work?");
				hoursWorked = enter.nextDouble();
				hoursWorked();
				/**        calculateBasePay();
				 calculateOvertimePay();
				 calculateTotalPay();
				 selectInsurance();
				 calculateRetirement();
				 calculateNetPay();
				 displayDetails();**/
			}
		public static double hoursWorked()
			{
				if (employeePayRate == LEVEL1 && hoursWorked < 41)
					{
						payLevel = LEVEL1_PAY;
						regularPay = payLevel * hoursWorked;
						if (hoursWorked > 40)
							{
								payLevel = LEVEL1_PAY;
								overtimeHours = hoursWorked - 40;
								regularHours = hoursWorked - overtimeHours;
								regularPay = payLevel * regularHours;
								overtimeRate = LEVEL1_PAY * 1.5;
								overtimePay = overtimeRate * overtimeHours;
								grossPay = regularPay + overtimePay;
								displayPayDetails();
							}
					}
				else if (employeePayRate == LEVEL2 && hoursWorked < 41)
					{
						payLevel = LEVEL2_PAY;
						regularPay = payLevel * hoursWorked;
						if (hoursWorked > 40)
							{
								payLevel = LEVEL2_PAY;
								overtimeHours = hoursWorked - 40;
								regularHours = hoursWorked - overtimeHours;
								regularPay = payLevel * regularHours;
								overtimeRate = LEVEL2_PAY * 1.5;
								overtimePay = overtimeRate * overtimeHours;
								grossPay = regularPay + overtimePay;
								displayPayDetails();
							}
						else if (employeePayRate == LEVEL3 && hoursWorked < 41)
							{
								payLevel = LEVEL3_PAY;
								regularPay = payLevel * hoursWorked;
								if (hoursWorked > 40)
									{
										payLevel = LEVEL3_PAY;
										overtimeHours = hoursWorked - 40;
										regularHours = hoursWorked - overtimeHours;
										regularPay = payLevel * regularHours;
										overtimeRate = LEVEL3_PAY * 1.5;
										overtimePay = overtimeRate * overtimeHours;
										grossPay = regularPay + overtimePay;
										displayPayDetails();
									}
							}
					}
				return grossPay;
			}
		public static void displayPayDetails()
			{
				System.out.println("Hours Worked: " + hoursWorked);
				System.out.println("Hourly Pay Rate: " + payLevel);
				System.out.println("Regular Pay: " + regularPay);
				System.out.println("Overtime Pay Rate: " + overtimeRate);
				System.out.println("Overtime Pay: " + overtimePay);
				System.out.println("Gross Pay: " + grossPay);
			}
	}





