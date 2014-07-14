package Digital_Camera;
/**
 * Created by Kimberly Henry <kimberly.henry@outlook.com>
 * On:  Jul at: 1:10 PM.
 * Project: Java Programming
 * Package: Digital_Camera
 * File:  TestDigitalCamera
 * Write an application named TestDigitalCamera in which you
 * instantiate at least four objects, prompt the user for
 * values for the camera brand and number of mega-pixels,
 * and display all the values.
 */
public class TestDigitalCamera
	{
		public static void main(String[] args)
			{
				DigitalCamera test001 = new DigitalCamera("Cannon", 12);
				DigitalCamera test002 = new DigitalCamera("Nikon", 6);
				DigitalCamera test003 = new DigitalCamera("JVC", 4);
				DigitalCamera test004 = new DigitalCamera("FujiFilm", 10);
				test001.displayDigitalCamera();
				test002.displayDigitalCamera();
				test003.displayDigitalCamera();
				test004.displayDigitalCamera();
			}
	}
