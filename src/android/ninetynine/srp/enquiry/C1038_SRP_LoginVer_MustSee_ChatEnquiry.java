package android.ninetynine.srp.enquiry;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C1038_SRP_LoginVer_MustSee_ChatEnquiry extends Base_Test {
	
	private Login login;
	private AssertEqual_List asl;
	private Homepage hp;
	private GeneralUtilities util;
	private Landing_Page ldp;
	private SearchResultPage srp;
	
	@Test
	public void C1038_SRP_LoginVer_MustSee_Chat_Enquiry() throws Exception {
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
		 System.out.println("TestCase : C1038");	
		 System.out.println("Must See - Chat Enquiry for logged in, verified user");	
		 System.out.println("---------");		 
		 System.out.println("#Given I am a logged-in, verified user");
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
			 login.InputUsername(CONFIG.getProperty("Ver2_Email"));
			 login.InputPassword(CONFIG.getProperty("Ver2_Pass"));
			 login.Click_ButtonLogin(); 
		     wait_Long();
	     
		     //LDP search method in SRP
		     hp.Click_HomeSale();
		     wait_Med();			
		     System.out.println("#And I am on search page");
			 ldp.Click_LdpSaleResult();

			srp.Click_Srp_BtChat();
			System.out.println("#When click chat button");	
			  
			 
			 try {
					assertEquals(asl.Verify_ModalChatWithAgent(), true, "#And the Chat enquiry form should display as expected");
					System.out.println("State : Chat Enquiry Form displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Chat Enquiry For Not Shown as expected");
					
				}
			 
			   System.out.println("#And I send enquiry"); 
			   ldp.Click_CWA_BtEnquireNow();
		   
			   ldp.Click_BtCWABtConfirm();

		} else {
			
				System.out.println("State : Logged out");
				
				login.Click_Home_Me();
				login.Click_MeLogin();
				login.Click_Login();
				login.InputUsername(CONFIG.getProperty("Ver2_Email"));
				login.InputPassword(CONFIG.getProperty("Ver2_Pass"));
				login.Click_ButtonLogin();
				
				wait_Long();
				hp.Click_HomeSale();
				wait_Med();			
				
				 System.out.println("#And I am on search page");
				 ldp.Click_LdpSaleResult();			 
			
				srp.Click_Srp_BtChat();
				System.out.println("#When click chat button");	

				 
				 try {
						assertEquals(asl.Verify_ModalChatWithAgent(), true, "#And the Chat enquiry form should display as expected");
						System.out.println("State : Chat Enquiry Form displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Chat Enquiry For Not Shown as expected");
						
					}
				 
					 
				   System.out.println("#And I send enquiry"); 
				   ldp.Click_CWA_BtEnquireNow();
				   
				   ldp.Click_BtCWABtConfirm();
			
		}
		
		wait_Med();
		System.out.println("=========");
		System.out.println("=========");
	
	}

}
