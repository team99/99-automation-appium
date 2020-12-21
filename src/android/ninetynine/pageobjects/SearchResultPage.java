package android.ninetynine.pageobjects;
import org.openqa.selenium.By;

import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SearchResultPage extends Base_Test {
	GeneralUtilities function;
	public SearchResultPage(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
		
	}

		//SRP
		By Srp_Listing = By.xpath("//*[@id='cvSearchListingViewContent']");
		By Srp_Reg_Listing = By.xpath("//*[@id='cvSearchListingViewContent' and ./*[./*[./*[@id='ivSearchResultPageForRegularListing'] and ./*[@id='llSearchResultPagePhotoInfo']]]]");
		By Srp_MustSee_Listing = By.xpath("//*[@id='cvSearchListingViewContent' and ./*[./*[./*[@id='vpSearchResultPageGallery'] and ./*[@id='llSearchResultPagePhotoInfo']]]]");
		
		//SRP Pollen & Blue result
		By Srp_Result_PollenBlue = By.xpath("//*[@class='android.view.View' and ./parent::*[@id='flAutoComplete'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Pollen & Bleu']]");
		
		//Listing
		By Srp_Button_Chat = By.xpath("//*[@text='Chat']");
		By Srp_Button_Phone = By.xpath("//*[@id='ivSearchResultPageCall']");

		//Call Agent Modal
		By CA_Name = By.xpath("//*[@id='etConfirmEnquiryName']");
		By CA_Phone = By.xpath("//*[@id='etPhone']");
		By CA_Email = By.xpath("//*[@id='etConfirmEnquiryEmail']");
		By CA_Button_Confirm = By.xpath("//*[@text='Verify & continue']");
		By CA_ContinueToCall = By.xpath("//*[@text='Continue to Call']");
		
		
		//method below for click SRP result Pollen & Blue
		public void Click_Srp_ResultPollen() throws Exception{
			function.click(Srp_Result_PollenBlue);
		}
		
		
		//method below for click Continue To Call Agent button in SRP
		public void Click_ContCallAgent() throws Exception{
			function.click(CA_ContinueToCall);
		}
		
		
		//method below for click listing in SRP
			public void Click_Srp_Ldp_List() throws Exception{
				function.click(Srp_Listing);
			}
			
			//method below for click listing in SRP ver user
			public void Click_Srp_Ldp_MustSeeList() throws Exception{
				function.click(Srp_MustSee_Listing);
			}
			
			//method below for click reg listing in SRP
			public void Click_Srp_Reg_List() throws Exception{
				function.click(Srp_Reg_Listing);
			}
			
			//method below for click chat button in SRP
			public void Click_Srp_BtChat() throws Exception{
				function.click(Srp_Button_Chat);
			}
			
			//method below for click chat button in SRP
			public void Click_Srp_BtPhone() throws Exception{
				function.click(Srp_Button_Phone);
			}
			
			
			//Call Agent Modal
		//Chat with agent input name	
			public void Ca_InputName(String ca_name) throws Exception { 
				function.input(CA_Name, ca_name);
			}
			
			//Chat with agent input phone	
			public void Ca_InputPhone(String ca_phone) throws Exception { 
				function.input(CA_Phone, ca_phone);
			}
			
			//Chat with agent input email	
			public void Ca_InputEmail(String ca_email) throws Exception { 
				function.input(CA_Email, ca_email);
			}
			
			//method below for click confirm button in SRP call
			public void Click_CA_BtConfirm() throws Exception{
				function.click(CA_Button_Confirm);
			}
			
			
			
	
		
}
	
