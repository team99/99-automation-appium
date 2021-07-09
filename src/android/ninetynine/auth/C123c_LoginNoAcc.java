package android.ninetynine.auth;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C123c_LoginNoAcc extends Base_Test {
	private Login login;
	private GeneralUtilities util;
	
	
	@Test
	public void C123c_Login_NoAccUser() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		util = new GeneralUtilities(driver);
		By Home_Login_Invalid = By.xpath("//*[@id='tvErrorLabel']");
		
		System.out.println("=========");
		System.out.println("TestCase : C123c");	
		System.out.println("Log in for user with no account");	
		System.out.println("---------");		 
		System.out.println("#Given I am a logged-in, verified user");
		wait_Long();
		login.Click_Home_Account();
		
		if (util.verifyLogin()) {
			System.out.println("State: Logged in");
			driver.swipe(620, 1114, 604, 235, 2845);
			driver.swipe(633, 1162, 612, 493, 3771);
		    driver.swipe(597, 1204, 622, 593, 2131);
			login.Click_Logout();
			login.Click_Logout_Confirm();
			wait_Long();
			
			login.Click_Home_Account();
			login.Click_Account_Login();
			wait_Low();
			login.Click_Welcome_Login();
			login.Login_Input_Email(CONFIG.getProperty("JinHao_NoAcc_Email"));
			login.Login_Input_Password(CONFIG.getProperty("Jinhao_NoAcc_Pass"));
			login.Click_Login_Login();
			
			System.out.println("=========");
		}
		
		else {
			System.out.println("State: Logged out");
			login.Click_Home_Account();
			login.Click_Account_Login();
			wait_Low();
			login.Click_Welcome_Login();
			login.Login_Input_Email(CONFIG.getProperty("Jinhao_NoAcc_Email"));
			login.Login_Input_Password(CONFIG.getProperty("Jinhao_NoAcc_Pass"));
			login.Click_Login_Login();
			//driver.findElement(login.Home_Login_Invalid).isDisplayed();
			
			System.out.println("=========");
		}

		
		

		
		
	}
}
