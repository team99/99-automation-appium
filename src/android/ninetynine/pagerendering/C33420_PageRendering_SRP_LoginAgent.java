package android.ninetynine.pagerendering;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C33420_PageRendering_SRP_LoginAgent extends Base_Test {
	
	private Login login;
	private Homepage hp;
	private GeneralUtilities util;
	private SearchResultPage srp;
	private SRP_AssertEqual srpae;
	
	@Test
	public void C19_PageRendering_SRP_Login_Agent() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		hp = new Homepage(driver);
		util = new GeneralUtilities(driver);
		srp = new SearchResultPage(driver);
		srpae = new SRP_AssertEqual(driver);
			
		 System.out.println("=========");
		 System.out.println("TestCase : C33420");	
		 System.out.println("Page Rendering SRP - Agent user");	
		 System.out.println("---------");		 
		 System.out.println("#Given I am a logged-in, Agent user");
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
			 wait_Long();
		     
		     hp.Click_Home_Agent_Rent();
		     wait_Med();
		     srp.Click_Rent_Srp();
		     wait_Low();
		     hp.Click_SRP_Agent_BtSearch();
		     wait_Long();
		     
		     
		 	 
		     System.out.println("#When I go to SRP");			
				
		     //This method for check if the saved search button is displayed
			 try {
					assertEquals(srpae.Verify_SRP_SavedSearch(), true, "#Saved search button must displayed");
					System.out.println("State : Saved seacrh button displayed as expected");
					
				} catch (Exception e){
							
					System.out.println("State : Saved search button Not Shown as expected");
					
				}
			 
			    //This method for check if the filter search button is displayed
						 try {
								assertEquals(srpae.Verify_SRP_FilterSearch(), true, "#Filter search button must displayed");
								System.out.println("State : Filter searh button displayed as expected");
								
							} catch (Exception e){
										
								System.out.println("State : Filter searh button Not Shown as expected");
								
							}
						 
						   //This method for check if the filter search input is displayed
						 try {
								assertEquals(srpae.Verify_SRP_SearchInput(), true, "#Search input must displayed");
								System.out.println("State : Search input displayed as expected");
								
							} catch (Exception e){
										
								System.out.println("State : Search input Not Shown as expected");
								
							}
			 						 
						   //This method for check if the listing button is displayed
						 try {
								assertEquals(srpae.Verify_SRP_Listings(), true, "#Listing button must displayed");
								System.out.println("State : Listing button displayed as expected");
								
							} catch (Exception e){
										
								System.out.println("State : Listing button Not Shown as expected");
								
							}
						 
						   //This method for check if the project button is displayed
						 try {
								assertEquals(srpae.Verify_SRP_Projects(), true, "#Project button must displayed");
								System.out.println("State : Project button displayed as expected");
								
							} catch (Exception e){
										
								System.out.println("State : Project button Not Shown as expected");
								
							}
						 
						   //This method for check if the map button is displayed
						 try {
								assertEquals(srpae.Verify_SRP_Map(), true, "#Map button must displayed");
								System.out.println("State : Map button displayed as expected");
								
							} catch (Exception e){
										
								System.out.println("State : Map button Not Shown as expected");
								
							}
						 
						   //This method for check if the chat button is displayed
						 try {
								assertEquals(srpae.Verify_SRP_BtChat(), true, "#Chat button must displayed");
								System.out.println("State : Chat button displayed as expected");
								
							} catch (Exception e){
										
								System.out.println("State : Chat button Not Shown as expected");
								
							}
						 
						   //This method for check if the Phone button is displayed
						 try {
								assertEquals(srpae.Verify_SRP_BtPhone(), true, "#Phone button must displayed");
								System.out.println("State : Phone button displayed as expected");
								
							} catch (Exception e){
										
								System.out.println("State : Phone button Not Shown as expected");
								
							}
						 

						   //This method for check if the WA button is displayed
						 try {
								assertEquals(srpae.Verify_SRP_BtWA(), true, "#WA button must displayed");
								System.out.println("State : WA button displayed as expected");
								
							} catch (Exception e){
										
								System.out.println("State : WA button Not Shown as expected");
								
							}
						 
						   //This method for check if the Check Out button is displayed
								 try {
										assertEquals(srpae.Verify_SRP_BtCheckOut(), true, "#Check Out button must displayed");
										System.out.println("State : Check Out button displayed as expected");
										
									} catch (Exception e){
												
										System.out.println("State : Check Out button Not Shown as expected");
										
									}
					 
			 
		
		} else {
			
				System.out.println("State : Logged out");
				hp.Click_Homepage();
				wait_Long();
				
				login.Click_Home_Me();
				login.Click_MeLogin();
				login.Click_Login();
				login.InputUsername(CONFIG.getProperty("Agent_Email"));
				login.InputPassword(CONFIG.getProperty("Agent_Pass"));
				login.Click_ButtonLogin();
			    wait_Long();
			    hp.Click_NotNow();
				wait_Long();
				
			     hp.Click_Home_Agent_Rent();
			     wait_Med();
			     srp.Click_Rent_Srp();
			     wait_Low();
			     hp.Click_SRP_Agent_BtSearch();
			     wait_Long();
			     
			     System.out.println("#When I go to SRP");			
					
			     //This method for check if the saved search button is displayed
				 try {
						assertEquals(srpae.Verify_SRP_SavedSearch(), true, "#Saved search button must displayed");
						System.out.println("State : Saved searh button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Saved searh button Not Shown as expected");
						
					}
				 
				    //This method for check if the filter search button is displayed
							 try {
									assertEquals(srpae.Verify_SRP_FilterSearch(), true, "#Filter search button must displayed");
									System.out.println("State : Filter searh button displayed as expected");
									
								} catch (Exception e){
											
									System.out.println("State : Filter searh button Not Shown as expected");
									
								}
							 
							   //This method for check if the filter search input is displayed
							 try {
									assertEquals(srpae.Verify_SRP_SearchInput(), true, "#Search input must displayed");
									System.out.println("State : Search input displayed as expected");
									
								} catch (Exception e){
											
									System.out.println("State : Search input Not Shown as expected");
									
								}
				 						 
							   //This method for check if the listing button is displayed
							 try {
									assertEquals(srpae.Verify_SRP_Listings(), true, "#Listing button must displayed");
									System.out.println("State : Listing button displayed as expected");
									
								} catch (Exception e){
											
									System.out.println("State : Listing button Not Shown as expected");
									
								}
							 
							   //This method for check if the project button is displayed
							 try {
									assertEquals(srpae.Verify_SRP_Projects(), true, "#Project button must displayed");
									System.out.println("State : Project button displayed as expected");
									
								} catch (Exception e){
											
									System.out.println("State : Project button Not Shown as expected");
									
								}
							 
							   //This method for check if the map button is displayed
							 try {
									assertEquals(srpae.Verify_SRP_Map(), true, "#Map button must displayed");
									System.out.println("State : Map button displayed as expected");
									
								} catch (Exception e){
											
									System.out.println("State : Map button Not Shown as expected");
									
								}
							 
							   //This method for check if the chat button is displayed
							 try {
									assertEquals(srpae.Verify_SRP_BtChat(), true, "#Chat button must displayed");
									System.out.println("State : Chat button displayed as expected");
									
								} catch (Exception e){
											
									System.out.println("State : Chat button Not Shown as expected");
									
								}
							 
							   //This method for check if the Phone button is displayed
							 try {
									assertEquals(srpae.Verify_SRP_BtPhone(), true, "#Phone button must displayed");
									System.out.println("State : Phone button displayed as expected");
									
								} catch (Exception e){
											
									System.out.println("State : Phone button Not Shown as expected");
									
								}
							 

							   //This method for check if the WA button is displayed
							 try {
									assertEquals(srpae.Verify_SRP_BtWA(), true, "#WA button must displayed");
									System.out.println("State : WA button displayed as expected");
									
								} catch (Exception e){
											
									System.out.println("State : WA button Not Shown as expected");
									
								}
							 
							   //This method for check if the Check Out button is displayed
									 try {
											assertEquals(srpae.Verify_SRP_BtCheckOut(), true, "#Check Out button must displayed");
											System.out.println("State : Check Out button displayed as expected");
											
										} catch (Exception e){
													
											System.out.println("State : Check Out button Not Shown as expected");
											
										}
				 		   
		}
		  System.out.println("#Then the SRP already displayed");	
		wait_Med();
		 System.out.println("=========");
		 System.out.println("=========");
		
	}

}
