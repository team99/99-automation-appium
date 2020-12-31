package android.ninetynine.pageobjects;
import org.openqa.selenium.By;

import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ListingCreation extends Base_Test {
	GeneralUtilities function;
	public ListingCreation(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
	}
	

	By LC_GotItButton = By.xpath("//*[@text='Got it!']");

	By LC_CreateListing = By.xpath("//*[@text='Create listing']");
	By LC_CreateMustSee = By.xpath("//*[@text='Create Must See listing']");
	By LC_CreateReg = By.xpath("//*[@id='createRegularListing']");
	
	By LC_EnterPostalCode = By.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup']]");
	By LC_InputPostalCode = By.xpath("//*[@id='etSearchLocation']");
	
	By LC_Result_534040 = By.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup']]");
	By LC_Result_544720 = By.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup']]");
	
	//Listing creation flow
	By LC_Rent = By.xpath("//*[@text='Rental']");
	By LC_UnitNumber = By.xpath("//*[@id='tvValueCreateListingTextPicker']");
	By LC_UnitNumber_Done = By.xpath("//*[@text='Done']");
	By LC_Bedroom = By.xpath("//*[@id='etCreateListingTextRow' and (./preceding-sibling::* | ./following-sibling::*)[@text='Bedrooms']]");
	By LC_Bedroom_Studio = By.xpath("//*[@text='STUDIO']");
	By LC_Size = By.xpath("//*[@id='etCreateListingTextRow' and (./preceding-sibling::* | ./following-sibling::*)[@text='Size']]");
	By LC_Prize = By.xpath("//*[@id='etCreateListingTextRow' and (./preceding-sibling::* | ./following-sibling::*)[@text='Price']]");
	
	//method below for click Create Listing button
	public void Click_GotItButton() throws Exception{
		function.click(LC_GotItButton);
	}
	
	//method below for click Create Listing button
	public void Click_CreateReg() throws Exception{
		function.click(LC_CreateReg);
	}
	
		//method below for click Create Listing button
		public void Click_CreateListing() throws Exception{
			function.click(LC_CreateListing);
		}
		
		//method below for click create must see
		public void Click_PostalCode() throws Exception{
			function.click(LC_EnterPostalCode);
		}
		
		//method below for click create must see
		public void Click_CreateMustSee() throws Exception{
			function.click(LC_CreateMustSee);
		}
		
		//method below for click Create Listing button
		public void Click_Result543030() throws Exception{
			function.click(LC_Result_534040);
		}
		
		//method below for click Create Listing button
		public void Click_Result544720() throws Exception{
			function.click(LC_Result_544720);
		}
		
		
		//Listing Creation Flow
		//method below for click rent
		public void Click_BtRent() throws Exception{
			function.click(LC_Rent);
				}
		
		//method below for click rent
		public void Click_UnitNumber() throws Exception{
			function.click(LC_UnitNumber);
				}
		
		//method below for click rent
		public void Click_UnitNumberDone() throws Exception{
			function.click(LC_UnitNumber_Done);
				}
		
		//method below for click rent
		public void Click_Size() throws Exception{
			function.click(LC_Size);
				}	
		//method below for click rent
		public void Click_Price() throws Exception{
			function.click(LC_Prize);
				}	
		
		
		//method below for click rent
		public void Click_Bedroom() throws Exception{
			function.click(LC_Bedroom);
				}
		
		//method below for click rent
		public void Click_BedroomStudio() throws Exception{
			function.click(LC_Bedroom_Studio);
				}					
}
		
//	//method below for input username
//		public void InputUsername(String username) throws Exception {
//			function.input(Username, username);
//		}
//		
