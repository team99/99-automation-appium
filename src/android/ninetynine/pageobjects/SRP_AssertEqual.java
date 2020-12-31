package android.ninetynine.pageobjects;
import org.openqa.selenium.By;

import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SRP_AssertEqual extends Base_Test {
	GeneralUtilities function;
	public SRP_AssertEqual(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
	}


	By SRP_SavedSearch = By.xpath("//*[@id='menu_saved_search']");
	By SRP_FilterSearch = By.xpath("//*[@id='menu_filter']");
	By SRP_SearchInput = By.xpath("//*[@id='tvSearchResultPageSearchTitle']");
	By SRP_Listings = By.xpath("(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='tab_layout']]/*/*[@text])[1]");
	By SRP_Projects = By.xpath("(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='tab_layout']]/*/*[@text])[2]");
	By SRP_Map = By.xpath("(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='tab_layout']]/*/*[@text])[3]");
	By SRP_BtChat = By.xpath("//*[@id='tvSearchResultPageChatWithAgent']");
	By SRP_BtPhone = By.xpath("//*[@id='ivSearchResultPageCall']");
	By SRP_BtWA = By.xpath("//*[@id='ivSearchResultPageWhatsApp']");
	By SRP_CheckBox = By.xpath("//*[@id='cbSearchResultPageSelection' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text]]]]");
	
			//This method to verify saved search button
			public boolean Verify_SRP_SavedSearch() {
				boolean verify=false;
				verify=driver.findElement(SRP_SavedSearch).isDisplayed();
				return verify;
			}
			
			//This method to verify filter search button
			public boolean Verify_SRP_FilterSearch() {
				boolean verify=false;
				verify=driver.findElement(SRP_FilterSearch).isDisplayed();
				return verify;
			}
			
			
			//This method to verify search input button
			public boolean Verify_SRP_SearchInput() {
				boolean verify=false;
				verify=driver.findElement(SRP_SearchInput).isDisplayed();
				return verify;
			}
			
			//This method to verify listing button
			public boolean Verify_SRP_Listings() {
				boolean verify=false;
				verify=driver.findElement(SRP_Listings).isDisplayed();
				return verify;
			}
			
			//This method to verify project button
			public boolean Verify_SRP_Projects() {
				boolean verify=false;
				verify=driver.findElement(SRP_Projects).isDisplayed();
				return verify;
			}
			
			//This method to verify map button
			public boolean Verify_SRP_Map() {
				boolean verify=false;
				verify=driver.findElement(SRP_Map).isDisplayed();
				return verify;
			}
			
			//This method to verify chat button
			public boolean Verify_SRP_BtChat() {
				boolean verify=false;
				verify=driver.findElement(SRP_BtChat).isDisplayed();
				return verify;
			}
			
			//This method to verify phone button
			public boolean Verify_SRP_BtPhone() {
				boolean verify=false;
				verify=driver.findElement(SRP_BtPhone).isDisplayed();
				return verify;
			}
			
			//This method to verify wa button
			public boolean Verify_SRP_BtWA() {
				boolean verify=false;
				verify=driver.findElement(SRP_BtWA).isDisplayed();
				return verify;
			}
			
			//This method to verify check out button
			public boolean Verify_SRP_BtCheckOut() {
				boolean verify=false;
				verify=driver.findElement(SRP_CheckBox).isDisplayed();
				return verify;
			}
			
	
	
}
	

	