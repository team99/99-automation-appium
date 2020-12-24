package android.ninetynine.pageobjects;
import org.openqa.selenium.By;

import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class User_AssertEqual extends Base_Test {
	GeneralUtilities function;
	public User_AssertEqual(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
	}

	//Agent Profile Page
	By User_Agent_CreditTopUp = By.xpath("//*[@id='btnCreditTopup']");
	By User_Agent_CoinTopUp = By.xpath("//*[@id='btnCoinTopup']");
	By User_Agent_CreditTrans = By.xpath("//*[@id='btnCreditTransactions']");
	By User_Agent_CoinTrans = By.xpath("//*[@id='btnCoinTransactions']");
	
	
	//Unver Profile Page
	By User_Unver_VerifyPhone = By.xpath("(//*[@id='llVerifySection']/*[@text='Verify your phone number'])[2]");
	By User_Unver_SetupTenant = By.xpath("//*[@text='Setup tenant profile']");
	By User_Unver_SetupBuyer = By.xpath("//*[@text='Setup buyer profile']");
	
	//This method to verify credit top up button in agent page
			public boolean Verify_Agent_CreditTopUp() {
				boolean verify=false;
				verify=driver.findElement(User_Agent_CreditTopUp).isDisplayed();
				return verify;
			}
			
			//This method to verify credit trans button in agent page
			public boolean Verify_Agent_CreditTrans() {
				boolean verify=false;
				verify=driver.findElement(User_Agent_CreditTrans).isDisplayed();
				return verify;
			}
			
			//This method to verify coin top up button in agent page
			public boolean Verify_Agent_CoinTopUp() {
				boolean verify=false;
				verify=driver.findElement(User_Agent_CoinTopUp).isDisplayed();
				return verify;
			}
			
			//This method to verify coin trans button in agent page
			public boolean Verify_Agent_CoinTrans() {
				boolean verify=false;
				verify=driver.findElement(User_Agent_CoinTrans).isDisplayed();
				return verify;
			}
			
			
			//This method to verify verify phone number
			public boolean Verify_Unver_VerifyPhone() {
				boolean verify=false;
				verify=driver.findElement(User_Unver_VerifyPhone).isDisplayed();
				return verify;
			}
			
			//This method to verify setup tenant profile
			public boolean Verify_Unver_Tenant() {
				boolean verify=false;
				verify=driver.findElement(User_Unver_SetupTenant).isDisplayed();
				return verify;
			}
			
			//This method to verify setup buyer profile
			public boolean Verify_Unver_Buyer() {
				boolean verify=false;
				verify=driver.findElement(User_Unver_SetupBuyer).isDisplayed();
				return verify;
			}
	
		
	
}
	

	