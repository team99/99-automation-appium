package android.ninetynine.auth;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.pageobjects.*;

public class RegUnverUser extends Base_Test {
	
	private Login login;
	private AssertEqual_List asl;
	
	@Test
	public void C_RegUnverUser() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		asl = new AssertEqual_List(driver);
			
		
		login.Click_Home_Me();
		login.Click_MeLogin();
		login.Click_SignUp_Button();

		
		login.SignUp_InputName(CONFIG.getProperty("SignUp_UnverUser_Name"));
		login.SignUp_InputEmail(CONFIG.getProperty("SignUp_UnverUser_Email"));
		login.SignUp_InputPass(CONFIG.getProperty("SignUp_UnverUser_Pass"));
		login.Click_SignUp();
		
		login.Click_Skip();
		
	wait_Long();
		
		try {
			assertEquals(asl.Verify_HomepageText(), true, "Verify the homepage text");
			System.out.println("Homepage Shown as expected");
			
		} catch (Exception e){
					
			System.out.println("Homepage Not Shown as expected");
			
		}
		
		wait_Med();
		
		
	}

}
