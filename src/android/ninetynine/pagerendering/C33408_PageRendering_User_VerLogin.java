package android.ninetynine.pagerendering;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C33408_PageRendering_User_VerLogin extends Base_Test {
	
	private Login login;
	private GeneralUtilities util;
	private User_AssertEqual uae;
	
	@Test
	public void C7_PageRendering_User_Ver_Login() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		util = new GeneralUtilities(driver);
		uae = new User_AssertEqual(driver);
			
		 System.out.println("=========");
		 System.out.println("TestCase : C33408");	
		 System.out.println("Page Rendering User - Verified User");	
		 System.out.println("---------");		 
		 System.out.println("#Given I am a logged-in, has Verfied user");
		 wait_Long();	
		 login.Click_Home_Me();
		 
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
				 login.InputUsername(CONFIG.getProperty("Ver_Email"));
				 login.InputPassword(CONFIG.getProperty("Ver_Pass"));
				 login.Click_ButtonLogin(); 
			     wait_Long();
		     
			     System.out.println("#When I go to user page");	
			     login.Click_Home_Me();
					
			 
			     //This method for check if the setup tenant profile button is displayed
						 try {
								assertEquals(uae.Verify_Unver_Tenant(), true, "#And Verify Setup Tenant Profile Button displayed");
								System.out.println("State : Verify Tenant Profile Button displayed as expected");
								
							} catch (Exception e){
										
								System.out.println("State : Verify Tenant Profile Button Not Shown as expected");
								
							}
						 
						 //This method for check if the setup buyer profile button is displayed
						 try {
								assertEquals(uae.Verify_Unver_Buyer(), true, "#And Verify Setup Buyer Profile Button displayed");
								System.out.println("State : Verify Buyer Profile Button displayed as expected");
								
							} catch (Exception e){
										
								System.out.println("State : Verify Buyer Profile Button Not Shown as expected");
								
							}
			    
			} else {
				
					System.out.println("State : Logged out");
					
					login.Click_Home_Me();
					login.Click_MeLogin();
					login.Click_Login();
					login.InputUsername(CONFIG.getProperty("Ver_Email"));
					login.InputPassword(CONFIG.getProperty("Ver_Pass"));					login.Click_ButtonLogin();
					wait_Long();
				
				    System.out.println("#When I go to user page");	
				     login.Click_Home_Me();
	
					 
				     //This method for check if the setup tenant profile button is displayed
							 try {
									assertEquals(uae.Verify_Unver_Tenant(), true, "#And Verify Setup Tenant Profile Button displayed");
									System.out.println("State : Verify Tenant Profile Button displayed as expected");
									
								} catch (Exception e){
											
									System.out.println("State : Verify Tenant Profile Button Not Shown as expected");
									
								}
							 
							 //This method for check if the setup buyer profile button is displayed
							 try {
									assertEquals(uae.Verify_Unver_Buyer(), true, "#And Verify Setup Buyer Profile Button displayed");
									System.out.println("State : Verify Buyer Profile Button displayed as expected");
									
								} catch (Exception e){
											
									System.out.println("State : Verify Buyer Profile Button Not Shown as expected");
									
								}
					
			}
			
			 System.out.println("#Then the user page already displayed");	
			wait_Med();
			System.out.println("=========");
			System.out.println("=========");
			
		}

	}