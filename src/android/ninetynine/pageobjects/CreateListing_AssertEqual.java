package android.ninetynine.pageobjects;
import org.openqa.selenium.By;

import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CreateListing_AssertEqual extends Base_Test {
	GeneralUtilities function;
	public CreateListing_AssertEqual(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
	}
	
	
	By CL_MustSeeText = By.xpath("//*[@text and ./parent::*[@id='toolbar']]");
	By CL_Residential = By.xpath("(//*[@id='flCreateListingSelectionRow']/*[@id='tvToogleBox'])[1]");
	By CL_Commercial = By.xpath("(//*[@id='flCreateListingSelectionRow']/*[@id='tvToogleBox'])[2]");
	By CL_MustSee_PostalCode = By.xpath("//*[@id='tvCreateListingTitleRow']");
	
	By CL_ListingType = By.xpath("(//*[@id='rvCreateEditListing']/*/*[@id='tvCreateListingTitleRow'])[1]");
	By CL_BtSale = By.xpath("((//*[@id='rvCreateEditListing']/*/*/*[@id='flCreateListingSelectionRow'])[2]/*[@id='tvToogleBox'])[1]");
	By CL_BtRent = By.xpath("((//*[@id='rvCreateEditListing']/*/*/*[@id='flCreateListingSelectionRow'])[2]/*[@id='tvToogleBox'])[2]");
	By CL_UnitNumber = By.xpath("//*[@id='tvTitleCreateListingTextPicker']");
	By CL_SubmitListing = By.xpath("//*[@id='btnCreateEditListing']");
	
	
	//Reg
	By CL_RegText = By.xpath("//*[@text and ./parent::*[@id='toolbar']]");
	By CL_PropertySegment = By.xpath("//*[@id='tvCreateListingSelectionRow']");
	By CL_Industrial = By.xpath("(//*[@id='flCreateListingSelectionRow']/*[@id='tvToogleBox'])[3]");
	By CL_Land = By.xpath("(//*[@id='flCreateListingSelectionRow']/*[@id='tvToogleBox'])[4]");
	By CL_BtSubmit = By.xpath("//*[@id='btnCreateEditListing']");
	
	//This method for check if the industrial button displayed
			public boolean Verify_CL_BtIndustrial() {
				boolean verify=false;
				verify=driver.findElement(CL_Industrial).isDisplayed();
				return verify;
			}
			
			//This method for check if the reg submit button displayed
			public boolean Verify_CL_Reg_BtSubmit() {
				boolean verify=false;
				verify=driver.findElement(CL_BtSubmit).isDisplayed();
				return verify;
			}
			
			//This method for check if the land button displayed
			public boolean Verify_CL_BtLand() {
				boolean verify=false;
				verify=driver.findElement(CL_Land).isDisplayed();
				return verify;
			}
	
	//This method for check if the Create Must See listing text displayed
		public boolean Verify_CL_MustSeeText() {
			boolean verify=false;
			verify=driver.findElement(CL_MustSeeText).isDisplayed();
			return verify;
		}
		
		//This method for check if the Create reg listing text displayed
				public boolean Verify_CL_RegText() {
					boolean verify=false;
					verify=driver.findElement(CL_RegText).isDisplayed();
					return verify;
				}
		
		//This method to verify if postal code input is displayed
		public boolean Verify_CL_PostalCode() {
			boolean verify=false;
			verify=driver.findElement(CL_MustSee_PostalCode).isDisplayed();
			return verify;
		}
		
		//This method to verify if listing type text is displayed
		public boolean Verify_CL_ListingType() {
			boolean verify=false;
			verify=driver.findElement(CL_ListingType).isDisplayed();
			return verify;
		}
		
		//This method to verify if sale button is displayed
				public boolean Verify_CL_BtSale() {
					boolean verify=false;
					verify=driver.findElement(CL_BtSale).isDisplayed();
					return verify;
				}
				
				//This method to verify if rent button is displayed
				public boolean Verify_CL_BtRent() {
					boolean verify=false;
					verify=driver.findElement(CL_BtRent).isDisplayed();
					return verify;
				}
				
				//This method to verify if unit number is displayed
				public boolean Verify_CL_UnitNumber() {
					boolean verify=false;
					verify=driver.findElement(CL_UnitNumber).isDisplayed();
					return verify;
				}
				
				//This method to verify if submit button is displayed
				public boolean Verify_CL_BtSubmit() {
					boolean verify=false;
					verify=driver.findElement(CL_SubmitListing).isDisplayed();
					return verify;
				}
				
				
		
		
	
	
	
}
	

	