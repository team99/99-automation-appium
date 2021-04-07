package android.ninetynine.ldp.enquiry;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C1352_LDP_Unver_Reg_PhoneEnquiry extends Base_Test {
	
	private Login login;
	private AssertEqual_List asl;
	private Homepage hp;
	private GeneralUtilities util;
	private Landing_Page ldp;
	private SearchResultPage srp;
	
	@Test
	public void C1352_LDP_Unver_Reg_Phone_Enquiry() throws Exception {
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
		 System.out.println("TestCase : C1352");	
		 System.out.println("Regular - Phone Enquiry for logged out, unverified user");	
		 System.out.println("---------");		 
		 System.out.println("#Given I am a logged-out, unverified user");
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
			 //driver.swipe(620, 1114, 604, 235, 2845);
			 srp.Click_Srp_Reg_List();
			 System.out.println("#And I am on Regular listing detail page");
			 
			 driver.swipe(620, 1114, 604, 235, 2845);
			 driver.swipe(633, 1162, 612, 493, 3771);
		     driver.swipe(597, 1204, 622, 593, 2131);
		     driver.swipe(620, 1114, 604, 235, 2845);
			 driver.swipe(633, 1162, 612, 493, 3771);
		     driver.swipe(597, 1204, 622, 593, 2131);
			 driver.swipe(620, 1114, 604, 235, 2845);
			 driver.swipe(633, 1162, 612, 493, 3771);
			 driver.swipe(620, 1114, 604, 235, 2845);
			 driver.swipe(633, 1162, 612, 493, 3771);
		     
		     ldp.Click_Bt_ShowPhone();
//			ldp.Click_BtPhone();
//			System.out.println("#When click Call button in sticky bar");	
//	
//			 try {
//					assertEquals(asl.Verify_ModalCallAgent(), true, "#And the Chat enquiry form should display as expected");
//					System.out.println("State : Call Enquiry Form displayed as expected");
//					
//				} catch (Exception e){
//							
//					System.out.println("State : Call Enquiry For Not Shown as expected");
//					
//				}
			 
			   System.out.println("#And the form will ask for my name, phone number, and email address"); 
			   srp.Ca_InputName(CONFIG.getProperty("Unver_Name"));
			   srp.Ca_InputPhone(CONFIG.getProperty("UnverID_Phone"));
			   srp.Ca_InputEmail(CONFIG.getProperty("Unver_Email"));
			 
			   System.out.println("#And I send enquiry"); 
			   srp.Click_CA_BtConfirm();
		
			   driver.findElement(By.xpath("//*[@id='etPinEdit']")).sendKeys(CONFIG.getProperty("otp_unverID"));
					

		} else {
			
				System.out.println("State : Logged out");
				hp.Click_Homepage();
				wait_Long();
				hp.Click_HomeSale();
				wait_Med();			
				
			     //LDP search method in SRP
				 driver.findElement(By.xpath("//*[@id='etAutocomplete']")).sendKeys("Pollen & Blue");
				 srp.Click_Srp_ResultPollen();
				// driver.swipe(620, 1114, 604, 235, 2845);
				 srp.Click_Srp_Reg_List();
				 System.out.println("#And I am on Regular listing detail page");
								
				 
				 driver.swipe(620, 1114, 604, 235, 2845);
				 driver.swipe(633, 1162, 612, 493, 3771);
			     driver.swipe(597, 1204, 622, 593, 2131);
			     driver.swipe(620, 1114, 604, 235, 2845);
				 driver.swipe(633, 1162, 612, 493, 3771);
			     driver.swipe(597, 1204, 622, 593, 2131);
				 driver.swipe(620, 1114, 604, 235, 2845);
				 driver.swipe(633, 1162, 612, 493, 3771);
				 driver.swipe(620, 1114, 604, 235, 2845);
				 driver.swipe(633, 1162, 612, 493, 3771);
			     
			     ldp.Click_Bt_ShowPhone();
				 
//				ldp.Click_BtPhone();
//				System.out.println("#When click Call button in sticky bar");			
//								
//				 try {
//						assertEquals(asl.Verify_ModalCallAgent(), true, "#And the Chat enquiry form should display as expected");
//						System.out.println("State : Call Enquiry Form displayed as expected");
//						
//					} catch (Exception e){
//								
//						System.out.println("State : Call Enquiry For Not Shown as expected");
//						
//					}
				 
				   System.out.println("#And the form will ask for my name, phone number, and email address"); 
				   srp.Ca_InputName(CONFIG.getProperty("Unver_Name"));
				   srp.Ca_InputPhone(CONFIG.getProperty("UnverID_Phone"));
				   srp.Ca_InputEmail(CONFIG.getProperty("Unver_Email"));
				   
				   System.out.println("#And I send enquiry"); 
				   srp.Click_CA_BtConfirm();
				   
				   driver.findElement(By.xpath("//*[@id='etPinEdit']")).sendKeys(CONFIG.getProperty("otp_unverID"));
						
		}	
		 
		wait_Med();
		System.out.println("=========");
		System.out.println("=========");
		
	}

}
