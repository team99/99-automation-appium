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
		
		
		//LDP Sale Search Must See
		By Ldp_Seach_Sale = By.xpath("//*[@text='Pollen & Bleu' and @id='tvSearchTitle']");
		
		//LDP Chat With Agent Modal
		By CWA_Name = By.xpath("//*[@id='etName']");
		By CWA_Phone = By.xpath("//*[@id='etPhone']");
		By CWA_Email = By.xpath("//*[@id='etEmail']");
		By CWA_Button_EnquireNow = By.xpath("//*[@id='btnEnquireNow']");
		By CWA_Confirm_Phone = By.xpath("//*[@id='etOtp']");
		By CWA_Button_Confirm = By.xpath("//*[@text='CONFIRM']");
		
		//method below for click home
			public void Click_LdpSaleResult() throws Exception{
				function.click(Ldp_Seach_Sale);
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
			

		
}
	
