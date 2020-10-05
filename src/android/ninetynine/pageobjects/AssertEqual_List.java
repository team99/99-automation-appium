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
	
	
}
	

	