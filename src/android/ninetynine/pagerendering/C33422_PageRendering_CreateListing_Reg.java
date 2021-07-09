package android.ninetynine.pagerendering;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C33422_PageRendering_CreateListing_Reg extends Base_Test {
	
	private Login login;
	private Homepage hp;
	private GeneralUtilities util;
	private ListingCreation lc;
	private CreateListing_AssertEqual clae;
	
	@Test
	public void  C21_PageRendering_Create_Listing_Reg() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		hp = new Homepage(driver);
		util = new GeneralUtilities(driver);
		lc = new ListingCreation(driver);
		clae = new CreateListing_AssertEqual(driver);
			
		 System.out.println("=========");
		 System.out.println("TestCase : C22422");	
		 System.out.println("Page Rendering - Create Listing Regular");	
		 System.out.println("---------");		 
		 System.out.println("#Given I am an agent");
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
			 login.InputUsername(CONFIG.getProperty("Agent_Email"));
			 login.InputPassword(CONFIG.getProperty("Agent_Pass"));
			 login.Click_ButtonLogin(); 
		     wait_Long();
		     hp.Click_NotNow();
	     
		     //Click My Listings
		     System.out.println("#And I click MyListings tab on homepage");
			 hp.Click_MyListings();
			 lc.Click_GotItButton();
			 
			  //Click create listing button
		     System.out.println("#And I click Create Listing button");
			 hp.Click_MyListings();
			 lc.Click_CreateListing();
			 lc.Click_CreateReg();
			 
			 //This method for check if the Create Regular listing text displayed
			 try {
					assertEquals(clae.Verify_CL_RegText(), true, "#Create Regular listing text must displayed");
					System.out.println("State : Create Regular listing text displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Create Regular listing text Not Shown as expected");
					
				}
			 
			 //This method for check if the postal code displayed
			 try {
					assertEquals(clae.Verify_CL_PostalCode(), true, "#Postal code input must displayed");
					System.out.println("State : Postal code input displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Postal code input Not Shown as expected");
					
				}
			 
			 //This method for check if the Industrial button displayed
			 try {
					assertEquals(clae.Verify_CL_BtIndustrial(), true, "#Industrial button must displayed");
					System.out.println("State : Industrial button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Industrial button Not Shown as expected");
					
				}
			 
			 //This method for check if the Land button displayed
			 try {
					assertEquals(clae.Verify_CL_BtLand(), true, "#Land button must displayed");
					System.out.println("State : Land button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Land button Not Shown as expected");
					
				}
			 
			 
			 
			 //Listing creation flow
		     System.out.println("#And I input listing details");
			 lc.Click_PostalCode();
			 driver.findElement(By.xpath("//*[@id='etSearchLocation']")).sendKeys("544720");
			 lc.Click_Result();
			 wait_Long();
			 
			 //This method for check if the listing type text displayed
			 try {
					assertEquals(clae.Verify_CL_ListingType(), true, "#Listing type text must displayed");
					System.out.println("State : Listing type text displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Listing type text Not Shown as expected");
					
				}
			
			 //This method for check if the Sale button displayed
			 try {
					assertEquals(clae.Verify_CL_BtSale(), true, "#Sale button must displayed");
					System.out.println("State : Sale button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Sale button Not Shown as expected");
					
				}
			 
			 //This method for check if the Rent button displayed
			 try {
					assertEquals(clae.Verify_CL_BtRent(), true, "#Rent button must displayed");
					System.out.println("State : Rent button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Rent button Not Shown as expected");
					
				}
			 
			 //This method for check if the Submit button displayed
			 try {
					assertEquals(clae.Verify_CL_Reg_BtSubmit(), true, "#Submit button must displayed");
					System.out.println("State : Submit button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Submit button Not Shown as expected");
					
				}
			 
			 
			 
			 
		} else {
			
				System.out.println("State : Logged out");
				login.Click_Home_Me();
				login.Click_MeLogin();
				login.Click_Login();
				login.InputUsername(CONFIG.getProperty("Agent_Email"));
				login.InputPassword(CONFIG.getProperty("Agent_Pass"));
				login.Click_ButtonLogin();
				wait_Long();
			    hp.Click_NotNow();
				
			     //Click My Listings
			     System.out.println("#And I click MyListings tab on homepage");
				 hp.Click_MyListings();
				 lc.Click_GotItButton();
				 
				  //Click create listing button
			     System.out.println("#And I click Create Listing button");
				 hp.Click_MyListings();
				 lc.Click_CreateListing();
				 lc.Click_CreateReg();
				 
				 //This method for check if the Create Regular listing text displayed
				 try {
						assertEquals(clae.Verify_CL_RegText(), true, "#Create Regular listing text must displayed");
						System.out.println("State : Create Regular listing text displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Create Regular listing text Not Shown as expected");
						
					}
				 
				 //This method for check if the postal code displayed
				 try {
						assertEquals(clae.Verify_CL_PostalCode(), true, "#Postal code input must displayed");
						System.out.println("State : Postal code input displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Postal code input Not Shown as expected");
						
					}
				 
				 //This method for check if the Industrial button displayed
				 try {
						assertEquals(clae.Verify_CL_BtIndustrial(), true, "#Industrial button must displayed");
						System.out.println("State : Industrial button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Industrial button Not Shown as expected");
						
					}
				 
				 //This method for check if the Land button displayed
				 try {
						assertEquals(clae.Verify_CL_BtLand(), true, "#Land button must displayed");
						System.out.println("State : Land button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Land button Not Shown as expected");
						
					}
				 
				 
				 
				 //Listing creation flow
			     System.out.println("#And I input listing details");
				 lc.Click_PostalCode();
				 driver.findElement(By.xpath("//*[@id='etSearchLocation']")).sendKeys("544720");
				 lc.Click_Result();
				 wait_Long();
				 
				 //This method for check if the listing type text displayed
				 try {
						assertEquals(clae.Verify_CL_ListingType(), true, "#Listing type text must displayed");
						System.out.println("State : Listing type text displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Listing type text Not Shown as expected");
						
					}
				
				 //This method for check if the Sale button displayed
				 try {
						assertEquals(clae.Verify_CL_BtSale(), true, "#Sale button must displayed");
						System.out.println("State : Sale button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Sale button Not Shown as expected");
						
					}
				 
				 //This method for check if the Rent button displayed
				 try {
						assertEquals(clae.Verify_CL_BtRent(), true, "#Rent button must displayed");
						System.out.println("State : Rent button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Rent button Not Shown as expected");
						
					}
				 
				 //This method for check if the Submit button displayed
				 try {
						assertEquals(clae.Verify_CL_Reg_BtSubmit(), true, "#Submit button must displayed");
						System.out.println("State : Submit button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Submit button Not Shown as expected");
						
					}
				 
			
		}
		
		 
		wait_Med();
		  System.out.println("#Then the create listing must see displayed");	
		wait_Med();
		 System.out.println("=========");
		 System.out.println("=========");
		
	}

}
