package android.ninetynine.srp.enquiry;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C1047_SRP_LoginUnver_MustSee_PhoneEnquiry extends Base_Test {
	
	private Login login;
	private AssertEqual_List asl;
	private Homepage hp;
	private GeneralUtilities util;
	private Landing_Page ldp;
	private SearchResultPage srp;
	
	@Test
	public void C1047_SRP_LoginUnver_MustSee_Phone_Enquiry() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		asl = new AssertEqual_List(driver);
		hp = new Homepage(driver);
		util = new GeneralUtilities(driver);
		ldp = new Landing_Page(driver); 
		srp = new SearchResultPage(driver);
			
		
		 System.out.println("TestCase : C1047");	
		 System.out.println("Must See - Phone Enquiry for logged in, unverified user");	
		 System.out.println("---------");		 
		 System.out.println("#Given I am a logged-in, unverified user");
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
			 login.InputUsername(CONFIG.getProperty("Unver_Email"));
			 login.InputPassword(CONFIG.getProperty("Unver_Pass"));
			 login.Click_ButtonLogin(); 
		     wait_Long();
	     
		     //LDP search method in SRP
		     hp.Click_HomeSale();
		     wait_Med();			
		     System.out.println("#And I am on search page");
//		     lp.Input_Sale_Search(CONFIG.getProperty("RegisteredNumberNonTsel"));
			 ldp.Click_LdpSaleResult();
			 
		
				srp.Click_Srp_BtPhone();
				System.out.println("#When click call button");		
			  
			 
				 try {
						assertEquals(asl.Verify_ModalCallAgent(), true, "#And the Chat enquiry form should display as expected");
						System.out.println("State : Call Enquiry Form displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Call Enquiry For Not Shown as expected");
						
					}
			 
//			   System.out.println("#And the form will ask for my name, phone number, and email address"); 
//			   ldp.Cwa_InputName(CONFIG.getProperty("Unver_Name"));
//			   ldp.Cwa_InputPhone(CONFIG.getProperty("Unver_Phone"));
//			   ldp.Cwa_InputEmail(CONFIG.getProperty("Unver_Name"));
			 
			   System.out.println("#And I send enquiry"); 
			   srp.Click_CA_BtConfirm();
			   
//			   System.out.println("#And I verify phone number"); 
//			   ldp.Cwa_Input_Otp(CONFIG.getProperty("otp"));
//		
//			   
//			   ldp.Click_BtCWABtConfirm();

		} else {
			
				System.out.println("State : Logged out");
				
				login.Click_Home_Me();
				login.Click_MeLogin();
				login.Click_Login();
				login.InputUsername(CONFIG.getProperty("Unver_Email"));
				login.InputPassword(CONFIG.getProperty("Unver_Pass"));
				login.Click_ButtonLogin();
				
				wait_Long();
				hp.Click_HomeSale();
				wait_Med();			
				
				 System.out.println("#And I am on search page");
//			     lp.Input_Sale_Search(CONFIG.getProperty("RegisteredNumberNonTsel"));
				 ldp.Click_LdpSaleResult();
				 
			

					srp.Click_Srp_BtPhone();
					System.out.println("#When click call button");	

				 
					 try {
							assertEquals(asl.Verify_ModalCallAgent(), true, "#And the Chat enquiry form should display as expected");
							System.out.println("State : Call Enquiry Form displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Call Enquiry For Not Shown as expected");
							
						}
				 
//				   System.out.println("#And the form will ask for my name, phone number, and email address"); 
//				   ldp.Cwa_InputName(CONFIG.getProperty("Unver_Name"));
//				   ldp.Cwa_InputPhone(CONFIG.getProperty("Unver_Phone"));
//				   ldp.Cwa_InputEmail(CONFIG.getProperty("Unver_Name"));
//				 
				   System.out.println("#And I send enquiry"); 
				   srp.Click_CA_BtConfirm();
				   
//				   System.out.println("#And I verify phone number"); 
//				   ldp.Cwa_Input_Otp(CONFIG.getProperty("otp"));
//					
//				   ldp.Click_BtCWABtConfirm();
			
		}
		
		 
		wait_Med();
		
		
	}

}
