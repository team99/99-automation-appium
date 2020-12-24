package android.ninetynine.pageobjects;
import org.openqa.selenium.By;

import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Homepage_AssertEqual extends Base_Test {
	GeneralUtilities function;
	public Homepage_AssertEqual(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
	}
	
	By Homepage_Text = By.xpath("//*[@text='Listings specially curated by 99 for a better home buying experience.']");	
	By Homepage_StartaSearch = By.xpath("//*[@text='Start a search']");
	
	By Homepage_Sale = By.xpath("(//*[@id='rvHSWidgetsHorizontalGridView']/*/*[@id='ivAgentItemIcon'])[1]");
	By Homepage_Rent = By.xpath("(//*[@id='rvHSWidgetsHorizontalGridView']/*/*[@id='ivAgentItemIcon'])[2]");
	By Homepage_NewLaunch = By.xpath("(//*[@id='rvHSWidgetsHorizontalGridView']/*/*[@id='ivAgentItemIcon'])[3]");
	By Homepage_Commercial = By.xpath("(//*[@id='rvHSWidgetsHorizontalGridView']/*/*[@id='ivAgentItemIcon'])[4]");
	By Homepage_Calculators = By.xpath("(//*[@id='rvHSWidgetsHorizontalGridView']/*/*[@id='ivAgentItemIcon'])[5]");
	By Homepage_Mortgages = By.xpath("(//*[@id='rvHSWidgetsHorizontalGridView']/*/*[@id='ivAgentItemIcon'])[6]");
	By Homepage_Blog = By.xpath("(//*[@id='rvHSWidgetsHorizontalGridView']/*/*[@id='ivAgentItemIcon'])[7]");
	
	By Homepage_Home = By.xpath("//*[@id='llHomeScreenBottomBar']");
	By Homepage_MyListings = By.xpath("//*[@id='llMyListingBottomBar']");
	By Homepage_Chat = By.xpath("//*[@id='ivInboxBottomBar']");
	By Homepage_Shortlist = By.xpath("//*[@id='ivShortlistBar']");
	By Homepage_Me = By.xpath("//*[@id='ivProfileBottomBar']");
	
	//This method to verify input start a search
			public boolean Verify_Search() {
				boolean verify=false;
				verify=driver.findElement(Homepage_StartaSearch).isDisplayed();
				return verify;
			}
			

	//This method to verify sale
			public boolean Verify_Sale() {
				boolean verify=false;
						verify=driver.findElement(Homepage_Sale).isDisplayed();
						return verify;
					}			
			
	//This method to verify rent
			public boolean Verify_Rent() {
				boolean verify=false;
						verify=driver.findElement(Homepage_Rent).isDisplayed();
						return verify;
					}			
	
	//This method to verify new launch
			public boolean Verify_NewLaunch() {
				boolean verify=false;
				verify=driver.findElement(Homepage_NewLaunch).isDisplayed();
				return verify;
			}
			
	//This method to verify commercial
			public boolean Verify_Commercial() {
				boolean verify=false;
				verify=driver.findElement(Homepage_Commercial).isDisplayed();
				return verify;
			}			
			
	//This method to verify calculator
			public boolean Verify_Calculator() {
				boolean verify=false;
				verify=driver.findElement(Homepage_Calculators).isDisplayed();
				return verify;
			}	
			
			
			//This method to verify mortgages
			public boolean Verify_Mortgages() {
				boolean verify=false;
				verify=driver.findElement(Homepage_Mortgages).isDisplayed();
				return verify;
			}	
			
			
			//This method to verify blog
			public boolean Verify_Blog() {
				boolean verify=false;
				verify=driver.findElement(Homepage_Blog).isDisplayed();
				return verify;
			}	
			
			
			
	
		//This method to verify homepage text
		public boolean Verify_HomeText() {
			boolean verify=false;
			verify=driver.findElement(Homepage_Text).isDisplayed();
			return verify;
		}
	
		//This method to bar home
		public boolean Verify_BarHome() {
			boolean verify=false;
			verify=driver.findElement(Homepage_Home).isDisplayed();
			return verify;
		}	
		
		
		//This method to verify bar my listings
		public boolean Verify_BarMyListings() {
			boolean verify=false;
			verify=driver.findElement(Homepage_MyListings).isDisplayed();
			return verify;
		}	
		
		//This method to verify bar chat
		public boolean Verify_BarChat() {
			boolean verify=false;
			verify=driver.findElement(Homepage_Chat).isDisplayed();
			return verify;
		}	
		

		//This method to verify bar shortlist
		public boolean Verify_BarShortlist() {
			boolean verify=false;
			verify=driver.findElement(Homepage_Shortlist).isDisplayed();
			return verify;
		}	
		

		//This method to verify bar me
		public boolean Verify_BarMe() {
			boolean verify=false;
			verify=driver.findElement(Homepage_Me).isDisplayed();
			return verify;
		}	
		
	
}
	

	