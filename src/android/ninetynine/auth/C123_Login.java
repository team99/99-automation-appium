package android.ninetynine.auth;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C123_Login extends Base_Test {
	private Login login;
	private GeneralUtilities util;
	private AssertEqual_List asl;
	

	@Test
	public void C123_Login_VerUser() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		util = new GeneralUtilities(driver);
		asl = new AssertEqual_List(driver);
		
		System.out.println("=========");
		System.out.println("TestCase : C123");	
		System.out.println("Log in for verified user");	
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
			login.Login_Input_Email(CONFIG.getProperty("Jinhao_VerUser_Email"));
			login.Login_Input_Password(CONFIG.getProperty("Jinhao_VerUser_Pass"));
			login.Click_Login_Login();
			
			System.out.println("=========");
		}
		
		else {
			System.out.println("State: Logged out");
			login.Click_Home_Account();
			login.Click_Account_Login();
			wait_Low();
			login.Click_Welcome_Login();
			login.Login_Input_Email(CONFIG.getProperty("Jinhao_VerUser_Email"));
			login.Login_Input_Password(CONFIG.getProperty("Jinhao_VerUser_Pass"));
			login.Click_Login_Login();
			
			System.out.println("=========");
		}
		
		try {
			assertEquals(asl.Verify_HomepageText(), true, "Verify the homepage text");
			System.out.println("Homepage Shown as expected");
			
		} catch (Exception e){
					
			System.out.println("Homepage Not Shown as expected");
			
		}

		
		

		
		
	}
}