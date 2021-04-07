package android.ninetynine.pageobjects;
import org.openqa.selenium.By;

import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AssertEqual_List extends Base_Test {
	GeneralUtilities function;
	public AssertEqual_List(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
	}
	
	By Homepage_Text = By.xpath("//*[@text='Listings specially curated by 99 for a better home buying experience.']");
	By Me_Edit = By.xpath("//*[@text='Edit']");
	
	//LDP
	By ChatWithAgent = By.xpath("//*[@text='Chat with agent']");
	By CWA_Success = By.xpath("//*[@text='Message sent!']");
	
	//SRP
	By CallAgent = By.xpath("//*[@text='Call agent']");
	
	//Error
	By Error_InvalidOTP = By.xpath("//*[@text='The verification code you provided is incorrect. Please check the code you entered and try again.']");
	By Confirm_Button = By.xpath("//*[@id='btnConfirm']");
	
	By EnquiryConfirmButton = By.xpath("//*[@text='CONFIRM']");
	
	//Homepage text 
	public boolean Verify_HomepageText() {
		boolean verify=false;
		verify=driver.findElement(Homepage_Text).isDisplayed();
		return verify;
	}
	
	//This method to verify if the state is logged in 
		public boolean Verify_LoggedIn() {
			boolean verify=false;
			verify=driver.findElement(Me_Edit).isDisplayed();
			return verify;
		}
	
		
		
	//LDP assert equal
		//This method to verify 'chat enquire form displayed
		public boolean Verify_ModalChatWithAgent() {
			boolean verify=false;
			verify=driver.findElement(ChatWithAgent).isDisplayed();
			return verify;
		}
		
		//LDP chat with agent success modal
				//This method to verify success in chat with agent modal
				public boolean Verify_SuccessModalChatWithAgent() {
					boolean verify=false;
					verify=driver.findElement(CWA_Success).isDisplayed();
					return verify;
				}
				
		//SRP assert equal
		//This method to verify call agent enquire form displayed
		public boolean Verify_ModalCallAgent() {
		boolean verify=false;
		verify=driver.findElement(CallAgent).isDisplayed();
		return verify;
				}
		
		//Invalid OTP Notification assert equal
		//This method to verify invalid otp notification
		public boolean Verify_InvalidOTP() {
			boolean verify=false;
			verify=driver.findElement(Error_InvalidOTP).isDisplayed();
			return verify;
		}
		
		//Call after not filled OTP 
		//This method to verify if the confirm button still there (it shouldn't)
		public boolean Verify_ConfirmButton() {
			boolean verify=false;
			verify=driver.findElement(Confirm_Button).isDisplayed();
			return verify;
		}
	
		
		
}
	

	