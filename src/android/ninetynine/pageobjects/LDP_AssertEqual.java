package android.ninetynine.pageobjects;
import org.openqa.selenium.By;

import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LDP_AssertEqual extends Base_Test {
	GeneralUtilities function;
	public LDP_AssertEqual(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
	}

	//Agent Profile Page
	By User_Agent_CreditTopUp = By.xpath("//*[@id='btnCreditTopup']");
	
	//MustSee Page
	By LDP_MustSee_Label = By.xpath("//*[@text='MUST SEE']");
	By LDP_MustSee_BtEnquireChat = By.xpath("//*[@id='tvChatWithAgent']");	
	By LDP_MustSee_BtEnquirePhone = By.xpath("//*[@id='ivCallBtn']");
	By LDP_MustSee_BtEnquireWA = By.xpath("//*[@id='ivWhatsappBtn']");
	By LDP_MustSee_BtShortlist = By.xpath("//*[@id='menu_shortlist']");
	By LDP_MustSee_BtShare = By.xpath("//*[@id='menu_share']");
	By LDP_MustSee_Photos = By.xpath("(//*[@class='androidx.recyclerview.widget.RecyclerView']/*/*[@id='tvCaption'])[1]");
	By LDP_MustSee_Floorplan = By.xpath("(//*[@class='androidx.recyclerview.widget.RecyclerView']/*/*[@id='tvCaption'])[2]");
	By LDP_MustSee_MapView = By.xpath("(//*[@class='androidx.recyclerview.widget.RecyclerView']/*/*[@id='tvCaption'])[3]");
	By LDP_MustSee_Street = By.xpath("(//*[@class='androidx.recyclerview.widget.RecyclerView']/*/*[@id='tvCaption'])[4]");
	
	//Reg Page
	By LDP_Reg_ViewOnMap = By.xpath("//*[@text and ./parent::*[@id='llListingOverviewAddressViewOnMap']]");
	
			//This method to verify must see label
			public boolean Verify_LDP_Must_See_Label() {
				boolean verify=false;
				verify=driver.findElement(LDP_MustSee_Label).isDisplayed();
				return verify;
			}
			
			//This method to verify must see label
			public boolean Verify_LDP_Reg_Map() {
				boolean verify=false;
				verify=driver.findElement(LDP_Reg_ViewOnMap).isDisplayed();
				return verify;
			}
			
			//This method to verify enquiry chat button
			public boolean Verify_LDP_Must_See_EnqChat() {
				boolean verify=false;
				verify=driver.findElement(LDP_MustSee_BtEnquireChat).isDisplayed();
				return verify;
			}
			
			//This method to verify enquiry phone button
			public boolean Verify_LDP_Must_See_EnqPhone() {
				boolean verify=false;
				verify=driver.findElement(LDP_MustSee_BtEnquirePhone).isDisplayed();
				return verify;
			}
			
			//This method to verify enquiry wa button
			public boolean Verify_LDP_Must_See_EnqWA() {
				boolean verify=false;
				verify=driver.findElement(LDP_MustSee_BtEnquireWA).isDisplayed();
				return verify;
			}

			//This method to verify enquiry shortlist button
			public boolean Verify_LDP_Must_See_Shortlist() {
				boolean verify=false;
				verify=driver.findElement(LDP_MustSee_BtShortlist).isDisplayed();
				return verify;
			}
			
			//This method to verify enquiry share button
			public boolean Verify_LDP_Must_See_Share() {
				boolean verify=false;
				verify=driver.findElement(LDP_MustSee_BtShare).isDisplayed();
				return verify;
			}
			
			//This method to verify enquiry photos button
			public boolean Verify_LDP_Must_See_Photos() {
				boolean verify=false;
				verify=driver.findElement(LDP_MustSee_Photos).isDisplayed();
				return verify;
			}
			
			//This method to verify enquiry floorplan button
			public boolean Verify_LDP_Must_See_Floorplan() {
				boolean verify=false;
				verify=driver.findElement(LDP_MustSee_Floorplan).isDisplayed();
				return verify;
			}
			
			//This method to verify enquiry mapview button
			public boolean Verify_LDP_Must_See_MapView() {
				boolean verify=false;
				verify=driver.findElement(LDP_MustSee_MapView).isDisplayed();
				return verify;
			}
			
			//This method to verify enquiry street button
			public boolean Verify_LDP_Must_See_Street() {
				boolean verify=false;
				verify=driver.findElement(LDP_MustSee_Street).isDisplayed();
				return verify;
			}


	
}
	

	