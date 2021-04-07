package android.ninetynine.auth;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C1259_LoginUnverUser extends Base_Test {
	
	private Login login;
	private GeneralUtilities util;

	
	@Test
	public void C1259_Login_UnverUser() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		util = new GeneralUtilities(driver);

		
		if (util.verifyLogin()) {
			
			 System.out.println("State : Logged in");			
			 driver.swipe(620, 1114, 604, 235, 2845);
			 driver.swipe(633, 1162, 612, 493, 3771);
		     driver.swipe(597, 1204, 622, 593, 2131);
		     login.Click_MeLogout();
		     login.Click_ConfLogout();		  
		     wait_Long();		     
		     
		     login.Click_Home_Me();
			 login.Click_MeLogin();
			 login.Click_Login();
			 login.InputUsername(CONFIG.getProperty("Unver_Email"));
			 login.InputPassword(CONFIG.getProperty("Unver_Pass"));
			 login.Click_ButtonLogin(); 
		     wait_Long();
		
		} else {
			System.out.println("State : Logged out");

			login.Click_Home_Me();
			login.Click_MeLogin();
			login.Click_Login();
			login.InputUsername(CONFIG.getProperty("Unver_Email"));
			login.InputPassword(CONFIG.getProperty("Unver_Pass"));
			login.Click_ButtonLogin();
			
		}
		
		wait_Med();
		System.out.println("=========");
		System.out.println("=========");
		
		
	}

}
