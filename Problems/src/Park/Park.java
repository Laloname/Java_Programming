package Park;
import java.util.Scanner;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 2:47 PM.
 * Project: Java Programming
 * Package: Park
 * File: Park
 * Create a class for the Parks Department in Cloverdale. The class is named Park,
 * and it contains a String field for the name of the park, an integer field for
 * the size in acres, and four Boolean fields that hold whether the park has each
 * of these features: picnic facilities, a tennis court, a playground, and a
 * swimming pool.
 * Include get and set methods for each field.
 * Include code in the method that sets the number of acres and does not allow a negative
 * number or a number over 400.
 * Save the file as Park.java.
 */
public class Park
	{
		private String parkName;
		private int parkAcres;
		private boolean hasPicnic;
		private boolean hasTennisCourt;
		private boolean hasPlayground;
		private boolean hasSwimming;
		public Scanner enter = new Scanner(System.in);
		public void setParkName(String park)
			{
				parkName = park;
			}
		public void setParkAcres()
			{
				int acres;
				System.out.println("Enter the number of acres for park: ");
				acres = enter.nextInt();
				if (acres < 0)
					{
						System.out.println("Acres is INVALID.  Please enter a number greater than 0.");
						setParkAcres();
					}
				else if (parkAcres > 400)
					{
						System.out.println("Acres is INVALID.  Please enter a number less than 401.");
						setParkAcres();
					}
				else
					{
						parkAcres = acres;
					}
			}
		public void setHasPicnic()
			{
				int picnic;
				System.out.println("Does park have picnic area?");
				System.out.println("1 - YES\n0 - NO");
				picnic = enter.nextInt();
				switch (picnic)
					{
						case 1:
							picnic = 1;
							hasPicnic = (1 > 0);
							break;
						case 2:
							picnic = 0;
							hasPicnic = (0 > 1);
							break;
					}
			}
		public void setHasTennisCourt()
			{
				int tennis;
				System.out.println("Does park have a Tennis Court?");
				System.out.println("1 - YES\n0 - NO");
				tennis = enter.nextInt();
				switch (tennis)
					{
						case 1:
							tennis = 1;
							hasTennisCourt = (1 > 0);
							break;
						case 2:
							tennis = 0;
							hasTennisCourt = (0 > 1);
							break;
					}
			}
		public void setHasPlayground()
			{
				int playground;
				System.out.println("Does park have a Playground?");
				System.out.println("1 - YES\n0 - NO");
				playground = enter.nextInt();
				switch (playground)
					{
						case 1:
							playground = 1;
							hasPlayground = (1 > 0);
							break;
						case 2:
							playground = 0;
							hasPlayground = (0 > 1);
							break;
					}
			}
		public void setHasSwimming()
			{
				int swimming;
				System.out.println("Does park have a Swimming Pool?");
				System.out.println("1 - YES\n0 - NO");
				swimming = enter.nextInt();
				switch (swimming)
					{
						case 1:
							swimming = 1;
							hasSwimming = (1 > 0);
							break;
						case 2:
							swimming = 0;
							hasSwimming = (0 > 1);
							break;
					}
			}
		public String getParkName()
			{
				return parkName;
			}
		public int getParkAcres()
			{
				return parkAcres;
			}
		public boolean isHasPicnic()
			{
				return hasPicnic;
			}
		public boolean isHasTennisCourt()
			{
				return hasTennisCourt;
			}
		public boolean isHasPlayground()
			{
				return hasPlayground;
			}
		public boolean isHasSwimming()
			{
				return hasSwimming;
			}
	}
