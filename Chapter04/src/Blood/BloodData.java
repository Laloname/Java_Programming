package Blood;
/**
 * Project:  Java Programming
 * Package:  Blood
 * File:  BloodData
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 18-Jun-2014
 * At: 9:32 PM
 *
 * Create a class named BloodData that includes fields that hold a blood type (the
 * four blood types are O, A, B, and AB) and an Rh factor (the factors are + and –).
 * Create a default constructor that sets the fields to “O” and “+”, and an overloaded
 * constructor that requires values for both fields. Include get and set methods for
 * each field. Save this file as BloodData.java.
 */
public class BloodData
	{
		private String bloodType;
		private char rhFactor;
		public BloodData()
			{
				bloodType = "O";
				rhFactor = '+';
			}
		public BloodData(String type, char factor)
			{
				bloodType = type;
				rhFactor = factor;
			}
		public void setBloodType(String type)
			{
				this.bloodType = type;
			}
		public void setRhFactor(char factor)
			{
				this.rhFactor = factor;
			}
		public String getBloodType()
			{
				return bloodType;
			}
		public char getRhFactor()
			{
				return rhFactor;
			}
	}
