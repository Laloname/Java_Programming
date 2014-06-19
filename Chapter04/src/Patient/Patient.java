package Patient;
import Blood.BloodData;
/**
 * Project:  Java Programming
 * Package:  Blood
 * File:  Patient
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 18-Jun-2014
 * At: 10:08 PM
 *
 * Create a class named Patient that includes an ID number, age, and BloodData.
 * Provide a default constructor that sets the ID number to “0”, the age to 0, and the
 * BloodData to “O” and “+”. Create an overloaded constructor that provides
 * values for each field. Also provide get methods for each field. Save the file as
 * Patient.java. Create an application named TestPatient that demonstrates that
 * each method works correctly, and save it as TestPatient.java.
 */
public class Patient
	{
		private int patientIdentification;
		private int patientAge;
		private BloodData patientBloodData;
		public Patient()
			{
				patientIdentification = 0;
				patientAge = 0;
				patientBloodData = new BloodData("O", '-');
				class BloodData
					{
						String type;
						char factor;
						public BloodData(String typ, char fact)
							{
								type = typ;
								factor = fact;
							}
					}
			}
		public Patient(int id, int age, String type, char factor)
			{
				patientIdentification = id;
				patientAge = age;
				BloodData patientBloodData = new BloodData("O", '+');
			}
		public int getPatientIdentification()
			{
				return patientIdentification;
			}
		public int getPatientAge()
			{
				return patientAge;
			}
		public String getPatientBloodData(String type)
			{
				return type;
			}
		public char getPatientBloodData(char factor)
			{
				return factor;
			}
	}
