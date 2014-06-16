package Salary;
import javax.swing.*;
/**
 * Project:     Java Programming
 * Package:     Salary
 * Filename:    Salary
 * Created By:  Kimberly Henry
 * On: 16-Jun-2014 At: 7:47 AM
 *
 * Write an application that calculates and displays the weekly salary for an employee. The main() method prompts the
 * user for an hourly pay rate, regular hours, and overtime hours. Create a separate method to calculate overtime pay,
 * which is regular hours times the pay rate plus overtime hours times 1.5 times the pay rate; return the result to
 * the main() method to be displayed. Save the program as Salary.java.
 */
public class Salary
	{
		public static void main(String[] args)
			{
				String payRate1 = JOptionPane.showInputDialog(null, "Please enter your pay rate:  ",
				                                              "PAY RATE", JOptionPane.QUESTION_MESSAGE);
				double payRate = Double.parseDouble(payRate1);
				String regHours = JOptionPane.showInputDialog(null, "Please enter regular hours worked:  ",
				                                              "REGULAR HOURS", JOptionPane.QUESTION_MESSAGE);
				int regHoursWorked = Integer.parseInt(regHours);
				String overtimeHours = JOptionPane.showInputDialog(null, "Please enter overtime hours worked: ",
				                                                   "OVERTIME HOURS", JOptionPane.QUESTION_MESSAGE);
				int overtimeHoursWorked = Integer.parseInt(overtimeHours);
				double grossPay = calculateRegularPay(payRate, regHoursWorked) +
				                  calculateOvertimePay(payRate, overtimeHoursWorked);
				System.out.println("Total Hours Worked:  " + (regHoursWorked + overtimeHoursWorked));
				System.out.println("Regular Pay:  " + calculateRegularPay(payRate, regHoursWorked));
				System.out.println("Overtime Pay:  " + calculateOvertimePay(payRate, overtimeHoursWorked));
				System.out.println("Gross Pay:  " + grossPay);
			}
		public static double calculateRegularPay(double payRate, int regHoursWorked)
			{
				return payRate * regHoursWorked;
			}
		public static double calculateOvertimePay(double payRate, int overtimeHoursWorked)
			{
				return (payRate * 1.5) * overtimeHoursWorked;
			}
	}
