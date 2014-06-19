package Patient;
/**
 * Project:  Java Programming
 * Package:  Blood
 * File:  TestPatient
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 18-Jun-2014
 * At: 10:20 PM
 */
public class TestPatient
	{
		public static void main(String[] args)
			{
				Patient test001 = new Patient();
				System.out.println("Patient Identification: " + test001.getPatientIdentification());
				System.out.println("Patient Age: " + test001.getPatientAge());
				System.out.println("Blood Type:  " + test001.getPatientBloodData("0"));
				System.out.println("RH Factor:  " + test001.getPatientBloodData('-'));
			}
	}
