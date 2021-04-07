package android.ninetynine.pagerendering;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C33410_PageRendering_LDP_MustSee_LoginUnver extends Base_Test {
	
	private Login login;
	private Homepage hp;
	private GeneralUtilities util;
	private SearchResultPage srp;
	private LDP_AssertEqual ldpae;
	
	@Test
	public void C33410_PageRendering_LDP_MustSee_Login_Unver() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		hp = new Homepage(driver);
		util = new GeneralUtilities(driver);
		srp = new SearchResultPage(driver);
		ldpae = new LDP_AssertEqual(driver);
			
		 System.out.println("=========");
		 System.out.println("TestCase : C33410");	
		 System.out.println("Page Rendering LDP - Unverified user");	
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
		     
		     hp.Click_Home_Rent();
		     wait_Med();
		     driver.findElement(By.xpath("//*[@id='etAutocomplete']")).sendKeys("Tanglin");
			   
		     srp.Click_Srp_Tanglin();
		     wait_Low();
		     srp.Click_Rent_Listing();
		     wait_Long();
		     
		     
		 	 
		     System.out.println("#When I go to must see LDP");			
				
		     //This method for check if the must see label displayed
			 try {
					assertEquals(ldpae.Verify_LDP_Must_See_Label(), true, "#Must see label must displayed");
					System.out.println("State : Must see label displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Must see label Not Shown as expected");
					
				}
			 
			  //This method for check if the enquiry chat button displayed
			 try {
					assertEquals(ldpae.Verify_LDP_Must_See_EnqChat(), true, "#Enquiry chat button must displayed");
					System.out.println("State : Enquiry chat button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Enquiry chat button Not Shown as expected");
					
				}
			 

			  //This method for check if the enquiry phone button displayed
			 try {
					assertEquals(ldpae.Verify_LDP_Must_See_EnqPhone(), true, "#Enquiry phone button must displayed");
					System.out.println("State : Enquiry phone button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Enquiry phone button Not Shown as expected");
					
				}
			 
			  //This method for check if the enquiry wa button displayed
			 try {
					assertEquals(ldpae.Verify_LDP_Must_See_EnqWA(), true, "#Enquiry WA button must displayed");
					System.out.println("State : Enquiry WA button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Enquiry WA button Not Shown as expected");
					
				}
			 
			  //This method for check if the shortlist button displayed
			 try {
					assertEquals(ldpae.Verify_LDP_Must_See_Shortlist(), true, "#Shortlist button must displayed");
					System.out.println("State : Shortlist button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Shortlist button Not Shown as expected");
					
				}
			 
			  //This method for check if the Share button displayed
			 try {
					assertEquals(ldpae.Verify_LDP_Must_See_Share(), true, "#Share button must displayed");
					System.out.println("State : Share button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Share button Not Shown as expected");
					
				}
			 
			  //This method for check if the Photos button displayed
			 try {
					assertEquals(ldpae.Verify_LDP_Must_See_Photos(), true, "#Photos button must displayed");
					System.out.println("State : Photos button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Photos button Not Shown as expected");
					
				}
			 
			  //This method for check if the Floorplan button displayed
			 try {
					assertEquals(ldpae.Verify_LDP_Must_See_Floorplan(), true, "#Floorplan button must displayed");
					System.out.println("State : Floorplan button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Floorplan button Not Shown as expected");
					
				}
			 
			  //This method for check if the Mapview button displayed
			 try {
					assertEquals(ldpae.Verify_LDP_Must_See_MapView(), true, "#Mapview button must displayed");
					System.out.println("State : Mapview button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Mapview button Not Shown as expected");
					
				}
			
			  //This method for check if the Street button displayed
			 try {
					assertEquals(ldpae.Verify_LDP_Must_See_Street(), true, "#Streets button must displayed");
					System.out.println("State : Street button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Street button Not Shown as expected");
					
				}
			 
			
			 

		} else {
			
				System.out.println("State : Logged out");
				
				login.Click_Home_Me();
				login.Click_MeLogin();
				login.Click_Login();
				login.InputUsername(CONFIG.getProperty("Unver_Email"));
				login.InputPassword(CONFIG.getProperty("Unver_Pass"));
				login.Click_ButtonLogin();
				
				wait_Long();
				
			     hp.Click_Home_Rent();
			     wait_Med();
			     driver.findElement(By.xpath("//*[@id='etAutocomplete']")).sendKeys("Tanglin");
				   
			     srp.Click_Srp_Tanglin();
			     wait_Low();
			     srp.Click_Rent_Listing();
			     wait_Long();
			     
			    System.out.println("#When I go to must see LDP");			
				
			     //This method for check if the must see label displayed
				 try {
						assertEquals(ldpae.Verify_LDP_Must_See_Label(), true, "#Must see label must displayed");
						System.out.println("State : Must see label displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Must see label Not Shown as expected");
						
					}
				 
				  //This method for check if the enquiry chat button displayed
				 try {
						assertEquals(ldpae.Verify_LDP_Must_See_EnqChat(), true, "#Enquiry chat button must displayed");
						System.out.println("State : Enquiry chat button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Enquiry chat button Not Shown as expected");
						
					}
				 

				  //This method for check if the enquiry phone button displayed
				 try {
						assertEquals(ldpae.Verify_LDP_Must_See_EnqPhone(), true, "#Enquiry phone button must displayed");
						System.out.println("State : Enquiry phone button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Enquiry phone button Not Shown as expected");
						
					}
				 
				  //This method for check if the enquiry wa button displayed
				 try {
						assertEquals(ldpae.Verify_LDP_Must_See_EnqWA(), true, "#Enquiry WA button must displayed");
						System.out.println("State : Enquiry WA button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Enquiry WA button Not Shown as expected");
						
					}
				 
				  //This method for check if the shortlist button displayed
				 try {
						assertEquals(ldpae.Verify_LDP_Must_See_Shortlist(), true, "#Shortlist button must displayed");
						System.out.println("State : Shortlist button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Shortlist button Not Shown as expected");
						
					}
				 
				  //This method for check if the Share button displayed
				 try {
						assertEquals(ldpae.Verify_LDP_Must_See_Share(), true, "#Share button must displayed");
						System.out.println("State : Share button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Share button Not Shown as expected");
						
					}
				 
				  //This method for check if the Photos button displayed
				 try {
						assertEquals(ldpae.Verify_LDP_Must_See_Photos(), true, "#Photos button must displayed");
						System.out.println("State : Photos button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Photos button Not Shown as expected");
						
					}
				 
				  //This method for check if the Floorplan button displayed
				 try {
						assertEquals(ldpae.Verify_LDP_Must_See_Floorplan(), true, "#Floorplan button must displayed");
						System.out.println("State : Floorplan button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Floorplan button Not Shown as expected");
						
					}
				 
				  //This method for check if the Mapview button displayed
				 try {
						assertEquals(ldpae.Verify_LDP_Must_See_MapView(), true, "#Mapview button must displayed");
						System.out.println("State : Mapview button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Mapview button Not Shown as expected");
						
					}
				
				  //This method for check if the Street button displayed
				 try {
						assertEquals(ldpae.Verify_LDP_Must_See_Street(), true, "#Streets button must displayed");
						System.out.println("State : Street button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Street button Not Shown as expected");
						
					}
				 		   
		}
		  System.out.println("#Then the LDP Must See already displayed");	
		wait_Med();
		 System.out.println("=========");
		 System.out.println("=========");
		
	}

}
