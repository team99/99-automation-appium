package android.ninetynine.auth;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.pageobjects.*;

public class C1260_LogoutVerUser extends Base_Test {
	
	private Login login;
	private AssertEqual_List asl; 
	
	@Test
	public void C1260_Logout_VerUser() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		asl = new AssertEqual_List(driver);
		
		login.Click_Home_Me();
		
		try {
			assertEquals(asl.Verify_LoggedIn(), true, "Verify the homepage text");
			System.out.println("State : Logged in");
			
		} catch (Exception e){
					
			System.out.println("State : Logged out");
			
		}
		
		
		 driver.swipe(620, 1114, 604, 235, 2845);
		 driver.swipe(633, 1162, 612, 493, 3771);
	     driver.swipe(597, 1204, 622, 593, 2131);

	     
	     
	     login.Click_MeLogout();
	     login.Click_ConfLogout();
	     
	     wait_Med();
		 login.Click_Home_Me();
		 
			try {
				assertEquals(asl.Verify_LoggedIn(), true, "Verify the homepage text");
				System.out.println("State : Logged in");
				
			} catch (Exception e){
						
				System.out.println("State : Logged out");
				
			}
	
		
	}
	
	

}
