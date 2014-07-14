package Digital_Camera;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 1:08 PM.
 * Project: Java Programming
 * Package: Digital_Camera
 * File:  DigitalCamera
 * Create a class for Shutterbug’s Camera Store, which is having a digital camera
 * sale. The class is named DigitalCamera, and it contains data fields for a brand,
 * the number of megapixels in the resolution, and price. Include a constructor that
 * takes arguments for the brand and megapixels. If the megapixel parameter is
 * greater than 10, the constructor sets it to 10. The sale price is set based on the
 * resolution; any camera with 6 megapixels or fewer is $99, and all other cameras
 * are $129. Also include a method that displays DigitalCamera details. Save the file
 * as DigitalCamera.java
 */
public class DigitalCamera
	{
		private String brand;
		private int megapixels;
		private double price;
		public DigitalCamera(String brd, int pixels)
			{
				brand = brd;
				if (pixels > 10)
					{
						megapixels = 10;
					}
				else
					{
						megapixels = pixels;
					}
				if (pixels <= 6)
					{
						price = 99.00;
					}
				else
					{
						price = 129.00;
					}
			}
		public void displayDigitalCamera()
			{
				System.out.println("Brand Name: " + brand);
				System.out.println("Megapixels: " + megapixels);
				System.out.println("Price: " + price);
			}
	}
