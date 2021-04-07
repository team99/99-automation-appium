package android.ninetynine.pageobjects;
import org.openqa.selenium.By;

import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Landing_Page extends Base_Test {
	GeneralUtilities function;
	public Landing_Page(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
		
	}

		By Sale_Search = By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@id='etAutocomplete']]");
		By Home_Page = By.xpath("//*[@id='llHomeScreenBottomBar']");

		//LDP Element
		By Button_EnquireNow = By.xpath("//*[@text='Enquire now']");
		By Button_ChatWithAgent = By.xpath("(//*[@id='llChatActions']/*[@text])[1]");
		By Button_Phone = By.xpath("//*[@id='ivCallBtn']");
		By Photo_Gallery = By.xpath("//*[@id='ivThumbNailImage']");
		
		//LDP Sale Search Must See
		By Ldp_Seach_Sale = By.xpath("//*[@text='Anywhere in Singapore']");
		By Ldp_Input_Search = By.xpath("//*[@id='tvSearchResultPageSearchTitle']");
		By Ldp_Search_Result = By.xpath("//*[@class='android.view.View' and ./parent::*[@id='flAutoComplete'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Pollen & Bleu']]");
		
		//LDP Sale Search Regular
		By Ldp_Search_Regular = By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@text='Pollen & Bleu']]");

		//LDP Chat With Agent Modal
		By CWA_Name = By.xpath("//*[@id='etName']");
		By CWA_Phone = By.xpath("//*[@id='etPhone']");
		By CWA_Email = By.xpath("//*[@id='etEmail']");
		By CWA_Button_EnquireNow = By.xpath("//*[@id='btnEnquireNow']");
		By CWA_Confirm_Phone = By.xpath("//*[@id='etOtp']");
		By CWA_Button_Confirm = By.xpath("//*[@text='CONFIRM']");
		
		
		
		
		//LDP Chat With Agent Modal (Photo Gallery)
		By CWA_Photo_Button_Enquire = By.xpath("//*[@text='Enquire']");
		
		//LDP Phone 
		By Bt_ContToCall = By.xpath("//*[@text='Continue to Call']");
		By Bt_ShowPhone = By.xpath("//*[@id='tvRegularAgentBioCallShow']");
		
		
		//method below for click continue to call in call agent modal
		public void Click_Bt_ShowPhone() throws Exception{
			function.click(Bt_ShowPhone);
		}
		
		//method below for click continue to call in call agent modal
		public void Click_Bt_ContToCall() throws Exception{
			function.click(Bt_ContToCall);
		}
		
		//method below for click photo gallery
				public void Click_PhotoGallery() throws Exception{
					function.click(Photo_Gallery);
				}
		
		//method below for click home
			public void Click_LdpSaleResult() throws Exception{
				function.click(Ldp_Seach_Sale);
			}
			
			//method below for click phone
			public void Click_BtPhone() throws Exception{
				function.click(Button_Phone);
			}
			
			//method below for click ldp search regular
			public void Click_LdpSearchReg() throws Exception{
				function.click(Ldp_Search_Regular);
			}
			
			//method below for click enquire now button
			public void Click_BtEnquireNow() throws Exception{
				function.click(Button_EnquireNow);
			}
			
			//method below for click chat with agent button
			public void Click_BtChatWithAgent() throws Exception{
				function.click(Button_ChatWithAgent);
			}
			
			//method below for click chat with confirm button
			public void Click_BtCWABtConfirm() throws Exception{
				function.click(CWA_Button_Confirm);
			}
			
			//method below for click home
			public void Click_LdpSearchResult() throws Exception{
				function.click(Ldp_Search_Result);
			}
			


		//method below for input search sale
			public void Input_Sale_Search(String search_input) throws Exception { 
				function.input(Sale_Search, search_input);
			}
			
			
			//Chat With Agent modal
		//Chat with agent input name	
			public void Cwa_InputName(String cwa_name) throws Exception { 
				function.input(CWA_Name, cwa_name);
			}
			
			//Chat with agent input phone number	
			public void Cwa_InputPhone(String cwa_phone) throws Exception { 
				function.input(CWA_Phone, cwa_phone);
			}
			
			//Chat with agent input phone email	
			public void Cwa_InputEmail(String cwa_email) throws Exception { 
				function.input(CWA_Email, cwa_email);
			}
			
			//method below for click chat with agent button
			public void Click_CWA_BtEnquireNow() throws Exception{
				function.click(CWA_Button_EnquireNow);
			}
			
			//Chat with agent input otp
			public void Cwa_Input_Otp(String cwa_otp) throws Exception { 
				function.input(CWA_Confirm_Phone, cwa_otp);
			}
			
			
			
			//Input LDP search
			public void Input_Ldp_Search(String input_search) throws Exception { 
				function.input(Ldp_Input_Search, input_search);
			}
			
			
			//method below for click Enquire button in Photo Gallery
			public void CWA_Photo_BtEnquire() throws Exception{
				function.click(CWA_Photo_Button_Enquire);
			}
			
			
			

		
}
	
