package android.ninetynine.ldp.enquiry;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C1350_Ldp_LoginVer_MustSee_PhoneEnquiry extends Base_Test {
	
	private Login login;
	private AssertEqual_List asl;
	private Homepage hp;
	private GeneralUtilities util;
	private Landing_Page ldp;
	private SearchResultPage srp;
	
	@Test
	public void C1350_Ldp_LoginVer_MustSee_Phone_Enquiry() throws Exception {
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
		 System.out.println("TestCase : C1350");	
		 System.out.println("Must See - Phone Enquiry for logged in, verified user");	
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
			 login.InputUsername(CONFIG.getProperty("Ver_Email"));
			 login.InputPassword(CONFIG.getProperty("Ver_Pass"));
			 login.Click_ButtonLogin(); 
		     wait_Long();
	     
		     //LDP search method in SRP
		     hp.Click_HomeSale();
		     wait_Med();			
		     ldp.Click_LdpSaleResult();
			 
			 
			 srp.Click_Srp_Ldp_MustSeeList();
			 System.out.println("#And I am on Must see listing detail page");
			 
			
			ldp.Click_BtPhone();
			System.out.println("#When click Call button in sticky bar");	
			
			try {
					assertEquals(asl.Verify_ModalCallAgent(), true, "#And the Chat enquiry form should display as expected");
					System.out.println("State : Call Enquiry Form displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Call Enquiry For Not Shown as expected");
					
				}

			 
			   System.out.println("#And I send enquiry"); 
			   ldp.Click_Bt_ContToCall();


		} else {
			
				System.out.println("State : Logged out");
				
				login.Click_Home_Me();
				login.Click_MeLogin();
				login.Click_Login();
				login.InputUsername(CONFIG.getProperty("Ver_Email"));
				login.InputPassword(CONFIG.getProperty("Ver_Pass"));
				login.Click_ButtonLogin();
				
				wait_Long();
				hp.Click_HomeSale();
				wait_Med();			
				
			    //LDP search method in SRP
			     wait_Med();
				 ldp.Click_LdpSaleResult(); 
				 
				 srp.Click_Srp_Ldp_MustSeeList(); 
				 System.out.println("#And I am on Must see listing detail page");	
				
					
				ldp.Click_BtPhone();
				System.out.println("#When click Call button in sticky bar");	
			
				 try {
						assertEquals(asl.Verify_ModalCallAgent(), true, "#And the Chat enquiry form should display as expected");
						System.out.println("State : Call Enquiry Form displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Call Enquiry For Not Shown as expected");
						
					}		 
	
				   System.out.println("#And I send enquiry"); 
				   ldp.Click_Bt_ContToCall();
			
		}
		
		 
		wait_Med();
		System.out.println("=========");
		System.out.println("=========");
		
	}

}
