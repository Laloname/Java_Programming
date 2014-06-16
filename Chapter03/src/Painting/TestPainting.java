package Painting;
import java.util.Scanner;
/**
 * Project:     Java Programming
 * Package:     Painting
 * Filename:    TestPainting
 * Created By:  Kimberly Henry
 * On: 15-Jun-2014 At: 11:33 PM
 *
 * Create a class named TestPainting whose main() method declares
 * three Painting items.  Create a method that prompts the user for
 * and accepts values for two of the Painting objects, and leave the
 * third with the default values supplied by the constructor. Then
 * display each completed object.  Finally, display a message that
 * explains the gallery commission rate. Save the application as
 * TestPainting.java.
 */
public class TestPainting
	{
		public static void main(String[] args)
			{
				Painting art001 = new Painting();              //Create a class named TestPainting
				Painting art002 = new Painting();                //whose main() method declares
				Painting art003 = new Painting();               //three Painting items.
				artSale(art001, art002);
				showArtSales(art001, art002, art003);
				displayCommissionExplanation();
			}
		//Create a method that prompts the user for and
		//accepts values for two of the Painting objects,
		public static void artSale(Painting art001, Painting art002)
			{
				Scanner enter = new Scanner(System.in);
				System.out.println("Enter Art Title:  ");
				art001.setArtTitle(enter.nextLine());
				System.out.println("Enter Artist First Name:  ");
				art001.setArtFirstName(enter.nextLine());
				System.out.println("Enter Artist Last Name:  ");
				art001.setArtLastName(enter.nextLine());
				System.out.println("Enter Art Medium:  ");
				art001.setArtMedium(enter.nextLine());
				System.out.println("Enter Art Price:  ");
				art001.setArtPrice(enter.nextDouble());
				enter.nextLine();
				System.out.println("Enter Art Title:  ");
				art002.setArtTitle(enter.nextLine());
				System.out.println("Enter Artist First Name:  ");
				art002.setArtFirstName(enter.nextLine());
				System.out.println("Enter Artist Last Name:  ");
				art002.setArtLastName(enter.nextLine());
				System.out.println("Enter Art Medium:  ");
				art002.setArtMedium(enter.nextLine());
				System.out.println("Enter Art Price:  ");
				art002.setArtPrice(enter.nextDouble());
				enter.nextLine();
			}
		//Then display each completed object.
		public static void showArtSales(Painting art001, Painting art002, Painting art003)
			{
				System.out.println("ART TITLE: " + art001.getArtTitle());
				System.out.println("ARTIST:  " + art001.getArtFirstName() + " " + art001.getArtLastName());
				System.out.println("ART MEDIUM: " + art001.getArtMedium());
				System.out.println("ART PRICE:  " + art001.getArtPrice());
				System.out.println("GALLERY COMMISSION:  " + art001.getArtGalleryCommission());
				System.out.println("ART TITLE: " + art002.getArtTitle());
				System.out.println("ARTIST:  " + art002.getArtFirstName() + " " + art002.getArtLastName());
				System.out.println("ART MEDIUM: " + art002.getArtMedium());
				System.out.println("ART PRICE:  " + art002.getArtPrice());
				System.out.println("GALLERY COMMISSION:  " + art002.getArtGalleryCommission());
				System.out.println("ART TITLE: " + art003.getArtTitle());
				System.out.println("ARTIST:  " + art003.getArtFirstName() + " " + art003.getArtLastName());
				System.out.println("ART MEDIUM: " + art003.getArtMedium());
				System.out.println("ART PRICE:  " + art003.getArtPrice());
				System.out.println("GALLERY COMMISSION:  " + art003.getArtGalleryCommission());
			}
		//Display a message that explains the gallery commission rate.
		public static void displayCommissionExplanation()
			{
				System.out.println("A 20% commission is deducted from the price of each sale.");
			}
	}
