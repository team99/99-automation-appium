package android.ninetynine.pageobjects;
import org.openqa.selenium.By;

import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Homepage extends Base_Test {
	GeneralUtilities function;
	public Homepage(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
	}
	

	By Home_Sale = By.xpath("(//*[@id='rvHSWidgetsHorizontalGridView']/*/*[@id='ivAgentItemIcon'])[1]");
	By Home_Rent = By.xpath("(//*[@id='rvHSWidgetsHorizontalGridView']/*/*[@id='ivAgentItemIcon'])[2]");
	By Home_Page = By.xpath("//*[@id='llHomeScreenBottomBar']");
	By Home_MyListings = By.xpath("//*[@id='llMyListingBottomBar']");
	By NotNow = By.xpath("//*[@text='Not Now']");
	By Back = By.xpath("//*[@id='back']");

	//Agent logged in homepage
	By Home_Agent_Rent = By.xpath("(//*[@id='rvHSWidgetsHorizontalGridView']/*/*[@id='ivAgentItemIcon' and ./parent::*[@class='android.view.ViewGroup']])[2]");
	By SRP_Agent_BtSearch = By.xpath("//*[@id='btnSearch']");
	
	//method below for click srp search button agent
		public void Click_SRP_Agent_BtSearch() throws Exception{
			function.click(SRP_Agent_BtSearch);
		}
	
	//method below for click homepage agent rent
	public void Click_Home_Agent_Rent() throws Exception{
		function.click(Home_Agent_Rent);
	}
	
	
	//method below for click not now in homepage
			public void Click_NotNow() throws Exception{
				function.click(NotNow);
			}
			
			//method below for click rent button
			public void Click_Home_Rent() throws Exception{
				function.click(Home_Rent);
			}
	
	
	//method below for click sale in home
		public void Click_HomeSale() throws Exception{
			function.click(Home_Sale);
		}
		
		//method below for click home
		public void Click_Homepage() throws Exception{
			function.click(Home_Page);
		}
		
		//method below for click my listings
		public void Click_MyListings() throws Exception{
			function.click(Home_MyListings);
		}
		

		
}
		
//	//method below for input username
//		public void InputUsername(String username) throws Exception {
//			function.input(Username, username);
//		}
//		
