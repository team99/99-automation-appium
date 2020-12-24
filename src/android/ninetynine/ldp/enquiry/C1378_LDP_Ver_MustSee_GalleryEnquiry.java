package android.ninetynine.ldp.enquiry;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C1378_LDP_Ver_MustSee_GalleryEnquiry extends Base_Test {
	
	private Login login;
	private AssertEqual_List asl;
	private Homepage hp;
	private GeneralUtilities util;
	private Landing_Page ldp;
	private SearchResultPage srp;
	
	@Test
	public void C1378_LDP_Ver_MustSee_Gallery_Enquiry() throws Exception {
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
		 System.out.println("TestCase : C1378");	
		 System.out.println("Must See - Chat Enquiry for logged out, verified user");	
		 System.out.println("---------");		 
		 System.out.println("#Given I am a logged-out, verified user");
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
			 ldp.Click_LdpSaleResult();
			
			 srp.Click_Srp_Ldp_MustSeeList();
			 System.out.println("#And I am on Must see listing detail page");
			 
			 ldp.Click_PhotoGallery();
			 System.out.println("#When I open the Listing photo Gallery");
				
			 ldp.CWA_Photo_BtEnquire();
			 System.out.println("#And I click enquire buttons");	
			
			 ldp.Click_BtChatWithAgent();
			 System.out.println("#And I click Chat with agent");	
			
			 try {
					assertEquals(asl.Verify_ModalChatWithAgent(), true, "#And the Chat enquiry form should display as expected");
					System.out.println("State : Chat Enquiry Form displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Chat Enquiry For Not Shown as expected");
					
				}
			 
			   System.out.println("#And the form will ask for my name, phone number, and email address"); 
			   ldp.Cwa_InputName(CONFIG.getProperty("Ver_Name"));
			   ldp.Cwa_InputPhone(CONFIG.getProperty("Ver_Phone"));
			   ldp.Cwa_InputEmail(CONFIG.getProperty("Ver_Email"));
			 
			   System.out.println("#And I send enquiry"); 
			   ldp.Click_CWA_BtEnquireNow();
		
			   System.out.println("#And I verify phone number"); 
			   ldp.Cwa_Input_Otp(CONFIG.getProperty("otp_verID"));
			   ldp.Click_BtCWABtConfirm();
			   
			   try {
					assertEquals(asl.Verify_SuccessModalChatWithAgent(), true, "#And the Chat enquiry form should display as expected");
					System.out.println("State : Send Enquiry success as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Send Enquiry not success");
					
				}	

		} else {
			
				System.out.println("State : Logged out");
				hp.Click_Homepage();
				wait_Long();
				hp.Click_HomeSale();
				wait_Med();			
				
			    //LDP search method in SRP
				ldp.Click_LdpSaleResult(); 
				 
				srp.Click_Srp_Ldp_MustSeeList(); 
				System.out.println("#And I am on Must see listing detail page");	
					
				ldp.Click_PhotoGallery();
				System.out.println("#When I open the Listing photo Gallery");
					
				ldp.CWA_Photo_BtEnquire();
				System.out.println("#And I click enquire buttons");	
				
				ldp.Click_BtChatWithAgent();
				System.out.println("#And I click Chat with agent");	
								
				 try {
						assertEquals(asl.Verify_ModalChatWithAgent(), true, "#And the Chat enquiry form should display as expected");
						System.out.println("State : Chat Enquiry Form displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Chat Enquiry For Not Shown as expected");
						
					}
				 
				   System.out.println("#And the form will ask for my name, phone number, and email address"); 
				   ldp.Cwa_InputName(CONFIG.getProperty("Ver_Name"));
				   ldp.Cwa_InputPhone(CONFIG.getProperty("Ver_Phone"));
				   ldp.Cwa_InputEmail(CONFIG.getProperty("Ver_Email"));
				   
				   System.out.println("#And I send enquiry"); 
				   ldp.Click_CWA_BtEnquireNow();
				   
				   System.out.println("#And I verify phone number"); 
				   ldp.Cwa_Input_Otp(CONFIG.getProperty("otp_verID"));
				   ldp.Click_BtCWABtConfirm();
				   
				   try {
						assertEquals(asl.Verify_SuccessModalChatWithAgent(), true, "#And the Chat enquiry form should display as expected");
						System.out.println("State : Send Enquiry success as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Send Enquiry not success");
						
					}   
			
		}
		 
		wait_Med();
		System.out.println("=========");
		System.out.println("=========");
		
	}

}
