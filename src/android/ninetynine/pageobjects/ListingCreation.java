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
	
	By LC_ResultPostalCode = By.xpath("//*[@class='android.view.View' and ./parent::*[@class='android.view.ViewGroup']]");
	
	//Listing creation flow
	By LC_Sale = By.xpath("//*[@text='Sale']");
	By LC_Rent = By.xpath("//*[@text='Rental']");
	By LC_RoomRent = By.xpath("//*[@text='Room Rental']");
	By LC_MasterRoom = By.xpath("//*[@text='Master Room']");
	By LC_CommonRoom = By.xpath("//*[@text='Common Room']");
	By LC_SubCategory = By.xpath("//*[@id='etCreateListingTextRow' and (./preceding-sibling::* | ./following-sibling::*)[@text='Sub Category']]");
	By LC_SubCategory_Terrace = By.xpath("//*[@text='Terrace House']");
	By LC_BuildUpArea = By.xpath("//*[@id='etCreateListingTextRow' and (./preceding-sibling::* | ./following-sibling::*)[@text='Build-Up Area'] and (./preceding-sibling::* | ./following-sibling::*)[@id='ivCreateListingTextRow']]");
	By LC_UnitNumber = By.xpath("//*[@id='tvValueCreateListingTextPicker']");
	By LC_UnitNumber_Done = By.xpath("//*[@text='Done']");
	By LC_Bedroom = By.xpath("//*[@id='etCreateListingTextRow' and (./preceding-sibling::* | ./following-sibling::*)[@text='Bedrooms']]");
	By LC_Bedroom_Studio = By.xpath("//*[@text='STUDIO']");
	By LC_Size = By.xpath("//*[@id='etCreateListingTextRow' and (./preceding-sibling::* | ./following-sibling::*)[@text='Size']]");
	By LC_RoomSize = By.xpath("//*[@id='etCreateListingTextRow' and (./preceding-sibling::* | ./following-sibling::*)[@text='Room Size']]");
	By LC_Prize = By.xpath("//*[@id='etCreateListingTextRow' and (./preceding-sibling::* | ./following-sibling::*)[@text='Price']]");
	By LC_CreateFreeListing = By.xpath("//*[@text='Create free listing']");
	By LC_CreateFreeListingModal = By.xpath("//*[@id='tvCreateListingFree']");
	By LC_SkipAndCreateListing = By.xpath("//*[@text='Skip and create free listing']");
	By Listing_created = By.xpath("//*[@text='Listing created!']");
	By LC_ButtonToDashboard = By.xpath("//*[@id='btnToDashboard']");
	
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
	public void Click_Result() throws Exception{
		function.click(LC_ResultPostalCode);
	}
		
	//Listing Creation Flow
	//method below for clicking sale
	public void Click_BtSale() throws Exception{
		function.click(LC_Sale);
	}
	
	//method below for click rent
	public void Click_BtRent() throws Exception{
		function.click(LC_Rent);
	}

	//method below for click room rental
	public void Click_BtRoomRent() throws Exception{
		function.click(LC_RoomRent);
	}
	
	//method below for clicking master room for room rental
	public void Click_MasterRoom() throws Exception{
		function.click(LC_MasterRoom);
	}
	
	//method below for clicking common room for room rental
	public void Click_CommonRoom() throws Exception{
		function.click(LC_CommonRoom);
	}
	
	//method below for click unit number
	public void Click_UnitNumber() throws Exception{
		function.click(LC_UnitNumber);
	}
	
	//method below for click unit number done
	public void Click_UnitNumberDone() throws Exception{
		function.click(LC_UnitNumber_Done);
	}
	
	//method below for click size
	public void Click_Size() throws Exception{
		function.click(LC_Size);
	}	
	
	//method below for clicking Room Size for room rental
	public void Click_RoomSize() throws Exception{
		function.click(LC_RoomSize);
	}
	
	//method below for click price
	public void Click_Price() throws Exception{
		function.click(LC_Prize);
	}	
	
	//method below for landed property listing creation
	public void Click_SubCategory() throws Exception{
		function.click(LC_SubCategory);
	}
	
	//method below for selecting landed property category
	public void Click_SubCategoryTerrace() throws Exception{
		function.click(LC_SubCategory_Terrace);
	}
	
	//method below for selecting build up area(BUA)
	public void Click_BUA() throws Exception{
		function.click(LC_BuildUpArea);
	}
	
	
	//method below for click rent
	public void Click_Bedroom() throws Exception{
		function.click(LC_Bedroom);
	}
	
	//method below for click rent
	public void Click_BedroomStudio() throws Exception{
		function.click(LC_Bedroom_Studio);
	}
	
	//method below for clicking on create free listing button
	public void Click_CreateFreeListing() throws Exception{
		function.click(LC_CreateFreeListing);
	}
	
	//method below for clicking on create free listing button for pop up
	public void Click_CreateFreeListingModal() throws Exception{
		function.click(LC_CreateFreeListingModal);
	}
	
	//method below for clicking on skip and create listing
	public void Click_SkipAndCreateListing() throws Exception{
		function.click(LC_SkipAndCreateListing);
	}
	
	//method below for clicking back to dashboard after listing created
	public void Click_ButtonToDashboard() throws Exception{
		function.click(LC_ButtonToDashboard);
	}
	
	public boolean Verify_ListingCreation() {
		boolean verify=false;
		verify=driver.findElement(Listing_created).isDisplayed();
		return verify;
	}
}
		
//	//method below for input username
//		public void InputUsername(String username) throws Exception {
//			function.input(Username, username);
//		}
//		
