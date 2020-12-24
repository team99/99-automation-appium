package android.ninetynine.login;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.pageobjects.*;

public class Regression_Login extends Base_Test {
	
	private Login login;
	private AssertEqual_List asl;
	
	@Test
	public void Regression_Login_Account() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		asl = new AssertEqual_List(driver);
		

		login.Click_MeLogin();
		
		login.Click_Login();
		
		login.InputUsername(CONFIG.getProperty("AccUsername"));
		login.InputPassword(CONFIG.getProperty("AccPassword"));
		
		login.Click_ButtonLogin();
		//login.Click_HomeSearch(); 
		
		wait_Med();
		login.Click_ModalNotNow();
		wait_Med();
		
		try {
			assertEquals(asl.Verify_HomepageText(), true, "Verify the homepage text");
			System.out.println("Homepage Shown as expected");
			
		} catch (Exception e){
					
			System.out.println("Homepage Not Shown as expected");
			
		}
		
		wait_Med();
		
		
		
	}

}
