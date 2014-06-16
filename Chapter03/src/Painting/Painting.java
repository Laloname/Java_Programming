package Painting;
/**
 * Project:     Java Programming
 * Package:     Painting
 * Filename:    Painting
 * Created By:  Kimberly Henry
 * On: 15-Jun-2014 At: 11:32 PM
 *
 * Create a class named Painting that contains fields for a painting’s title, artist,
 * medium (such as water color),  price, and gallery commission.  Create a constructor
 * that initializes each field to an appropriate default value, and create instance
 * methods that get and set the fields for title, artist, medium, and price.  The gallery
 * commission field cannot be set from outside the class; it is computed as 20 percent
 * of the price each time the price is set. Save the class as Painting.java.
 */
//Create a class named Painting that contains fields for a painting’s title, artist,
//medium (such as water color), price, and gallery commission.
public class Painting
	{
		private String artTitle;
		private String artFirstName;
		private String artLastName;
		private String artMedium;
		private double artPrice;
		double artGalleryCommission;
		public Painting()   //Create a constructor that initializes
		{                               //each field to an appropriate default value,
			artTitle = " ";
			artFirstName = " ";
			artLastName = " ";
			artMedium = " ";
			artPrice = 0.0;
		}
		public void setArtTitle(String artTit)
			{
				artTitle = artTit;
			}                   //Create instance methods that
		public void setArtFirstName(String artFirNam)
			{
				artFirstName = artFirNam;
			}     //set the fields for title,
		public void setArtLastName(String artLasNam)
			{
				artLastName = artLasNam;
			}       //artist, medium, and price.
		public void setArtMedium(String artMed)
			{
				artMedium = artMed;
			}
		public void setArtPrice(double artPri)
			{
				artPrice = artPri;
			}
		public String getArtTitle()
			{
				return artTitle;
			}                               //Create instance methods that
		public String getArtFirstName()
			{
				return artFirstName;
			}                       //get the fields for title,
		public String getArtLastName()
			{
				return artLastName;
			}                           //artist, medium, and price.
		public String getArtMedium()
			{
				return artMedium;
			}
		public double getArtPrice()
			{
				return artPrice;
			}
		public double getArtGalleryCommission()
			{
				getArtPrice();
				artGalleryCommission = artPrice * .20;
				return artGalleryCommission;
			}
	}
