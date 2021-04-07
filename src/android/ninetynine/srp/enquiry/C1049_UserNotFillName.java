package android.ninetynine.srp.enquiry;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C1049_UserNotFillName extends Base_Test {
	
	private Login login;
	private AssertEqual_List asl;
	private Homepage hp;
	private GeneralUtilities util;
	private Landing_Page ldp;
	private SearchResultPage srp;
	
	@Test
	public void C1049_UserNotFill_Name() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		asl = new AssertEqual_List(driver);
		hp = new Homepage(driver);
		util = new GeneralUtilities(driver);
		ldp = new Landing_Page(driver); 
		srp = new SearchResultPage(driver);
			
		 System.out.println("=========");
		 System.out.println("TestCase : C1049");	
		 System.out.println("User do not fill up the name field on enquiry form");	
		 System.out.println("---------");		 
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
		 	 hp.Click_HomeSale();		     
		     wait_Med();
		     
		     //LDP search method in SRP
		     driver.findElement(By.xpath("//*[@id='etAutocomplete']")).sendKeys("Pollen & Blue");  
			 srp.Click_Srp_ResultPollen();
			 driver.swipe(620, 1114, 604, 235, 2845);
		
			srp.Click_Srp_BtChat();
			System.out.println("#Given the enquiry form are shown");	 
			 try {
					assertEquals(asl.Verify_ModalChatWithAgent(), true, "#And the Chat enquiry form should display as expected");
					System.out.println("State : Chat Enquiry Form displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Chat Enquiry For Not Shown as expected");
					
				}
			 
			   System.out.println("#When I don't fill up name field"); 
			   //ldp.Cwa_InputName(CONFIG.getProperty("NoAcc_Name"));
			   ldp.Cwa_InputPhone(CONFIG.getProperty("NoAcc_Phone"));
			   ldp.Cwa_InputEmail(CONFIG.getProperty("NoAcc_Email"));
			 
			   System.out.println("#Then the continue button is NOT clickable"); 
			  
			   
			   ldp.Click_CWA_BtEnquireNow();
			   

			   
			  // System.out.println("#And I verify phone number"); 
			   //ldp.Cwa_Input_Otp(CONFIG.getProperty("otpnoacc"));
		
			   
			  // ldp.Click_BtCWABtConfirm();

		} else {  
			
				System.out.println("State : Logged out");
				hp.Click_Homepage();
				wait_Long();
				hp.Click_HomeSale();
				wait_Med();			
				
			     //LDP search method in SRP
			     driver.findElement(By.xpath("//*[@id='etAutocomplete']")).sendKeys("Pollen & Blue");  
				 srp.Click_Srp_ResultPollen();
				 driver.swipe(620, 1114, 604, 235, 2845);
				
				 srp.Click_Srp_BtChat();
					System.out.println("#Given the enquiry form are shown");	 
					 try {
							assertEquals(asl.Verify_ModalChatWithAgent(), true, "#And the Chat enquiry form should display as expected");
							System.out.println("State : Chat Enquiry Form displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Chat Enquiry For Not Shown as expected");
							
						}
					 
					   System.out.println("#When I don't fill up name field"); 
					   //ldp.Cwa_InputName(CONFIG.getProperty("NoAcc_Name"));
					   ldp.Cwa_InputPhone(CONFIG.getProperty("NoAcc_Phone"));
					   ldp.Cwa_InputEmail(CONFIG.getProperty("NoAcc_Email"));
					 
					   System.out.println("#Then the continue button is NOT clickable"); 
					  ldp.Click_CWA_BtEnquireNow();
					   
					
					   
					  // System.out.println("#And I verify phone number"); 
					   //ldp.Cwa_Input_Otp(CONFIG.getProperty("otpnoacc"));
				
					   
					  // ldp.Click_BtCWABtConfirm();
					 
		}

		 wait_Med();
		 System.out.println("=========");
		 System.out.println("=========");
	}

}
