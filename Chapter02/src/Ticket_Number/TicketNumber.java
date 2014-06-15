package Ticket_Number;
import javax.swing.*;
/**
 * Project:  Java Programming
 * Package:  Ticket_Number
 * File:  TicketNumber
 * Created by:  Kimberly Henry
 * On 4/17/2014 at 4:56 PM.
 *
 * Travel Tickets Company sells tickets for airlines, tours, and other travel-related services. Because ticket agents
 * frequently mistype long ticket numbers, Travel Tickets has asked you to write an application that indicates invalid
 * ticket number entries. The class prompts a ticket agent to enter a six-digit ticket number. Ticket numbers are
 * designed so that if you drop the last digit of the number, then divide the number by 7, the remainder of the
 * division will be identical to the last dropped digit.  This process is illustrated in the following example:
 * ********************************************************************************************************************
 * Accept the ticket number from the agent and verify whether it is a valid number.
 * Test the application with the following ticket numbers:
 * l 123454; the comparison should evaluate to true
 * l 147103; the comparison should evaluate to true
 * l 154123; the comparison should evaluate to false
 * Save the program as TicketNumber.java.
 * *******************************************************************************************************************
 * Step 1 Enter the ticket number; for example, 123454.
 * Step 2 Remove the last digit, leaving 12345.
 * Step 3 Determine the remainder when the ticket number is divided by 7. In this  case, 12345 divided by 7 leaves a
 * remainder of 4.
 * Step 4 Assign the Boolean value of the comparison between the remainder and the digit dropped from a ticket number.
 * Step 5 Display the result&mdash;true or false&mdash;in a message box.
 * *******************************************************************************************************************
 */
public class TicketNumber
	{
		public static void main(String[] args)
			{
				String ticketNumber = JOptionPane.showInputDialog(null, "Please enter the six digit ticket number: ",
				                                                  "6 DIGIT TICKET NUMBER", JOptionPane.QUESTION_MESSAGE);
				int ticket = Integer.parseInt(ticketNumber);
				int newTicket = ticket / 10;
				int numberRemoved = ticket % 10;
				int confirmNumber = (newTicket % 7);
				boolean validTicket = (numberRemoved == confirmNumber);
				int selection = JOptionPane.showConfirmDialog(null, "Is the ticket valid?  No# Removed:  " + numberRemoved +
				                                                    " Confirm No#:  " + confirmNumber + "?",
				                                              "TICKET VALIDATION", JOptionPane.YES_NO_OPTION);
				validTicket = (selection == JOptionPane.YES_NO_OPTION);
				JOptionPane.showMessageDialog(null, "You indicated " + validTicket + " to the question, Is the ticket valid?");
			}
	}
