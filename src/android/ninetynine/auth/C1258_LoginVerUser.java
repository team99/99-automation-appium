package android.ninetynine.auth;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C1258_LoginVerUser extends Base_Test {
	
	private Login login;
	private GeneralUtilities util;

	
	@Test
	public void C1258_Login_VerUser() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		util = new GeneralUtilities(driver);
			
		
		if (util.verifyLogin()) { //method verifyLogin from GeneralUtilities
			
			 System.out.println("State : Logged in");			
			 driver.swipe(620, 1114, 604, 235, 2845); //scroll the page
			 driver.swipe(633, 1162, 612, 493, 3771); //scroll the page
		     driver.swipe(597, 1204, 622, 593, 2131); //scroll the page
		     login.Click_MeLogout(); //method Click_MeLogout from Login
		     login.Click_ConfLogout();	 //method Click_ConfLogout from Login	  
		     wait_Long(); //method from Base_Test     
		     
		     login.Click_Home_Me(); //method Click_Home_Me from Login
			 login.Click_MeLogin(); //method Click_MeLogin from Login
			 login.Click_Login(); //method Click_Login from Login
			 login.InputUsername(CONFIG.getProperty("Ver_Email")); //input verified email from AndroidTestData.properties
			 login.InputPassword(CONFIG.getProperty("Ver_Pass")); //input password from AndroidTestData.properties
			 login.Click_ButtonLogin(); //method Click_ButtonLogn from Login
		     wait_Long(); //method from Best_Test
		
		} else {
			System.out.println("State : Logged out");

			login.Click_Home_Me(); //method Click_Home_Me from Login
			login.Click_MeLogin(); //method Click_MeLogin from Login
			login.Click_Login(); //method Click_Login from Login
			 login.InputUsername(CONFIG.getProperty("Ver_Email")); //input verified email from AndroidTestData.properties
			 login.InputPassword(CONFIG.getProperty("Ver_Pass")); //input password from AndroidTestData.properties
			login.Click_ButtonLogin();  //method Click_ButtonLogn from Login
			
		}
		
		wait_Med(); //method from Base_Test    
		System.out.println("=========");
		System.out.println("=========");
		
		
		
	}

}
