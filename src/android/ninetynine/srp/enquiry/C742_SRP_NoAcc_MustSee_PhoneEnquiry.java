package android.ninetynine.srp.enquiry;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C742_SRP_NoAcc_MustSee_PhoneEnquiry extends Base_Test {
	
	private Login login;
	private AssertEqual_List asl;
	private Homepage hp;
	private GeneralUtilities util;
	private Landing_Page ldp;
	private SearchResultPage srp;
	
	@Test
	public void C742_SRP_NoAcc_MustSee_Phone_Enquiry() throws Exception {
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
		 System.out.println("TestCase : C742");	
		 System.out.println("Must see -Phone Enquiry for logged out, user has no account");	
		 System.out.println("---------");		 
		 System.out.println("#Given I am a logged-out, has no account user");
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
		     
		     
		     System.out.println("#And I am on search page");
			 ldp.Click_LdpSaleResult();
			 
		
			srp.Click_Srp_BtPhone();
			System.out.println("#When click call button");	
			  
			 
			 try {
					assertEquals(asl.Verify_ModalCallAgent(), true, "#And the Chat enquiry form should display as expected");
					System.out.println("State : Call Enquiry Form displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Call Enquiry For Not Shown as expected");
					
				}
			 
			   System.out.println("#And the form will ask for my name, phone number, and email address"); 
			   srp.Ca_InputName(CONFIG.getProperty("NoAcc_Name"));
			   srp.Ca_InputPhone(CONFIG.getProperty("NoAcc_Phone"));
			   srp.Ca_InputEmail(CONFIG.getProperty("NoAcc_Email"));
			 
			   System.out.println("#And I send enquiry"); 
			   srp.Click_CA_BtConfirm();
			   
			   driver.findElement(By.xpath("//*[@id='etPinEdit']")).sendKeys(CONFIG.getProperty("otpnoacc"));

		} else {
			
				System.out.println("State : Logged out");
				hp.Click_Homepage();
				wait_Long();
			 	 hp.Click_HomeSale();		     
			     wait_Med();
			         
			     System.out.println("#And I am on search page");
				 ldp.Click_LdpSaleResult();
				 
				srp.Click_Srp_BtPhone();
				System.out.println("#When click call button");	
				  	 
				 try {
						assertEquals(asl.Verify_ModalCallAgent(), true, "#And the Chat enquiry form should display as expected");
						System.out.println("State : Call Enquiry Form displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Call Enquiry For Not Shown as expected");
						
					}
				 
				   System.out.println("#And the form will ask for my name, phone number, and email address"); 
				   srp.Ca_InputName(CONFIG.getProperty("NoAcc_Name"));
				   srp.Ca_InputPhone(CONFIG.getProperty("NoAcc_Phone"));
				   srp.Ca_InputEmail(CONFIG.getProperty("NoAcc_Email"));
				 
				   System.out.println("#And I send enquiry"); 
				   srp.Click_CA_BtConfirm();
				   
				   driver.findElement(By.xpath("//*[@id='etPinEdit']")).sendKeys(CONFIG.getProperty("otpnoacc"));

			
		}
		wait_Med();
		 System.out.println("=========");
		 System.out.println("=========");
		
	}

}
