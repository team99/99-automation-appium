package android.ninetynine.pagerendering;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C33413_PageRendering_LDP_Reg_NonLogin extends Base_Test {
	
	private Login login;
	private Homepage hp;
	private GeneralUtilities util;
	private SearchResultPage srp;
	private LDP_AssertEqual ldpae;
	
	@Test
	public void C33413_PageRendering_LDP_Reg_Non_Login() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		hp = new Homepage(driver);
		util = new GeneralUtilities(driver);
		srp = new SearchResultPage(driver);
		ldpae = new LDP_AssertEqual(driver);
			
		 System.out.println("=========");
		 System.out.println("TestCase : C33414");	
		 System.out.println("Page Rendering LDP Regular - Non login");	
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
		     
		     hp.Click_Home_Rent();
		     wait_Med();   
		     driver.findElement(By.xpath("//*[@id='etAutocomplete']")).sendKeys("Pollen & Blue");
			 srp.Click_Srp_ResultPollen();
	
			 srp.Click_Srp_Reg_List();
		     wait_Long();
		     
		     
		 	 
		     System.out.println("#When I go to regular LDP");			
				
		     //This method for check if the must see label displayed
			 try {
					assertEquals(ldpae.Verify_LDP_Must_See_Label(), true, "#Must see label must be not displayed");
					System.out.println("State : Must see label displayed not as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Must see label Not Shown on Regular LDP as expected");
					
				}
			 
			  //This method for check if the enquiry chat button displayed
			 try {
					assertEquals(ldpae.Verify_LDP_Must_See_EnqChat(), true, "#Enquiry chat button must displayed");
					System.out.println("State : Enquiry chat button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Enquiry chat button Not Shown as expected");
					
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
			 
			  //This method for check if the View on map button displayed
			 try {
					assertEquals(ldpae.Verify_LDP_Reg_Map(), true, "#View on map button must displayed");
					System.out.println("State : View on map button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : View on map button Not Shown as expected");
					
				}
			 
			
			 

		} else {
			
				System.out.println("State : Logged out");
				hp.Click_Homepage();
				wait_Long();
				
			     hp.Click_Home_Rent();
			     wait_Med();
			     driver.findElement(By.xpath("//*[@id='etAutocomplete']")).sendKeys("Pollen & Blue");
				 srp.Click_Srp_ResultPollen();

				 srp.Click_Srp_Reg_List();
			     wait_Long();
			     
				
			     System.out.println("#When I go to regular LDP");			
					
			     //This method for check if the must see label displayed
				 try {
						assertEquals(ldpae.Verify_LDP_Must_See_Label(), true, "#Must see label must be not displayed");
						System.out.println("State : Must see label displayed not as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Must see label Not Shown on Regular LDP as expected");
						
					}
				 
				  //This method for check if the enquiry chat button displayed
				 try {
						assertEquals(ldpae.Verify_LDP_Must_See_EnqChat(), true, "#Enquiry chat button must displayed");
						System.out.println("State : Enquiry chat button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Enquiry chat button Not Shown as expected");
						
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
				 
				  //This method for check if the View on map button displayed
				 try {
						assertEquals(ldpae.Verify_LDP_Reg_Map(), true, "#View on map button must displayed");
						System.out.println("State : View on map button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : View on map button Not Shown as expected");
						
					}
				 
				 		   
		}
		  System.out.println("#Then the LDP Must See already displayed");	
		wait_Med();
		 System.out.println("=========");
		 System.out.println("=========");
		
	}

}
