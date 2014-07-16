package Park;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 2:50 PM.
 * Project: Java Programming
 * Package: Park
 * File:  TestPark
 * <p/>
 * <p/>
 * •	Accepts a Park parameter and returns a Boolean value that indicates
 * whether the Park has both picnic facilities and a playground.
 * <p/>
 * •	Accepts a Park parameter and four Boolean parameters that represent
 * requests for the previously mentioned Park features. The method returns
 * true if the Park has all the requested features.
 * <p/>
 * •	Accepts a Park parameter and four Boolean parameters that represent
 * requests for the previously mentioned Park features. The method returns
 * true if the Park has exactly all the requested features and no others.
 * <p/>
 * •	Accepts a Park parameter and returns the number of facilities that
 * the Park features.
 * <p/>
 * •	Accepts two Park parameters and returns the larger Park.
 * Declare at least three Park objects, and demonstrate that all the methods
 * work correctly. Save the program as TestPark.java.
 */
public class TestPark
	{
		public static void main(String[] args)
			{
				Park test001 = new Park();
				test001.isHasPicnic();
				test001.isHasPlayground();
			}
	}
