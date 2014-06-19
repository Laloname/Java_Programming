package Blood;
/**
 * Project:  Java Programming
 * Package:  Blood
 * File:  TestBloodData
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 18-Jun-2014
 * At: 9:53 PM
 *
 * Create an application named TestBloodData that demonstrates
 * that each method works correctly. Save the application as TestBloodData.java.
 */
public class TestBloodData
	{
		public static void main(String[] args)
			{
				BloodData test001 = new BloodData();
				System.out.println("Blood Type: " + test001.getBloodType());
				System.out.println("RH Factor: " + test001.getRhFactor());
				BloodData test002 = new BloodData();
				test001.setBloodType("A");
				test002.setRhFactor('-');
				System.out.println();
				System.out.println("Blood Type: " + test002.getBloodType());
				System.out.println("RH Factor: " + test002.getRhFactor());
				System.out.println();
				BloodData test003 = new BloodData("B", '+');
				System.out.println("Blood Type: " + test003.getBloodType());
				System.out.println("RH Factor: " + test003.getRhFactor());
			}
	}
