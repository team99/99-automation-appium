package android.ninetynine.pagerendering;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C33405_PageRendering_Homepage_AgentLogin extends Base_Test {
	
	private Login login;
	private Homepage hp;
	private GeneralUtilities util;
	private Homepage_AssertEqual hpae;
	
	@Test
	public void C4_PageRendering_Homepage_Agent_Login() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		hp = new Homepage(driver);
		util = new GeneralUtilities(driver);
		hpae = new Homepage_AssertEqual(driver);
			
		 System.out.println("=========");
		 System.out.println("TestCase : C33405");	
		 System.out.println("Page Rendering Homepage - Agent User");	
		 System.out.println("---------");		 
		 System.out.println("#Given I am a logged-in, has agent user");
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
		     
			     System.out.println("#When I go to homepage");			
					
			     //This method for check if the Text in homepage displayed
				 try {
						assertEquals(hpae.Verify_HomeText(), true, "#And the text in Homepage 'Listing specially curated' displayed");
						System.out.println("State : Text displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Text For Not Shown as expected");
						
					}
				 
				 //This method for check if search displayed
				 try {
						assertEquals(hpae.Verify_Search(), true, "#And the search in Homepage displayed");
						System.out.println("State : Search displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Search For Not Shown as expected");
						
					}	
				 
				 //This method for check if sale displayed
				 try {
						assertEquals(hpae.Verify_Sale(), true, "#And the sale in Homepage displayed");
						System.out.println("State : Sale displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Sale For Not Shown as expected");
						
					}	
				 
				 //This method for check if rent displayed
				 try {
						assertEquals(hpae.Verify_Rent(), true, "#And the rent in Homepage displayed");
						System.out.println("State : Rent displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Rent For Not Shown as expected");
						
					}	
				 
				 //This method for check if new launch displayed
				 try {
						assertEquals(hpae.Verify_NewLaunch(), true, "#And the new launch in Homepage displayed");
						System.out.println("State : New Launch displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : New Launch For Not Shown as expected");
						
					}
				 
				 //This method for check if commercial displayed
				 try {
						assertEquals(hpae.Verify_Commercial(), true, "#And the commercial in Homepage displayed");
						System.out.println("State : Commercial displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Commercial For Not Shown as expected");
						
					}	
				 
				 //This method for check if calculator displayed
				 try {
						assertEquals(hpae.Verify_Calculator(), true, "#And the calculator in Homepage displayed");
						System.out.println("State : Calculator displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Calculator For Not Shown as expected");
						
					}	
				 
				 //This method for check if mortagage displayed
				 try {
						assertEquals(hpae.Verify_Mortgages(), true, "#And the mortagage in Homepage displayed");
						System.out.println("State : Mortgages displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Mortgages For Not Shown as expected");
						
					}	
				 
				 //This method for check if blog displayed
				 try {
						assertEquals(hpae.Verify_Blog(), true, "#And the blog in Homepage displayed");
						System.out.println("State : Blog displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Blog For Not Shown as expected");
						
					}	
				 
				 //This method for check if bar home displayed
				 try {
						assertEquals(hpae.Verify_BarHome(), true, "#And the bar home in Homepage displayed");
						System.out.println("State : Home in bar displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Home in bar Not Shown as expected");
						
					}	
				 
				 //This method for check if bar chat displayed
				 try {
						assertEquals(hpae.Verify_BarChat(), true, "#And the chat home in Homepage displayed");
						System.out.println("State : Chat in bar displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Chat in bar Not Shown as expected");
						
					}	
				 
				 //This method for check if bar shortlist displayed
				 try {
						assertEquals(hpae.Verify_BarShortlist(), true, "#And the bar shortlist in Homepage displayed");
						System.out.println("State : Shorlist in bar displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Shorlist in bar Not Shown as expected");
						
					}	
				 
				 //This method for check if bar me displayed
				 try {
						assertEquals(hpae.Verify_BarMe(), true, "#And the bar me in Homepage displayed");
						System.out.println("State : Me in bar displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Me in bar Not Shown as expected");
						
					}	
				 
				 
				 
				 //This method for check if bar my listings displayed
				 try {
						assertEquals(hpae.Verify_BarMyListings(), true, "#And the bar my listings in Homepage displayed");
						System.out.println("State :  MyListings  in bar displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : MyListings in bar Not Shown as expected");
						
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
				
				
				     System.out.println("#When I go to homepage");			
						
				     //This method for check if the Text in homepage displayed
					 try {
							assertEquals(hpae.Verify_HomeText(), true, "#And the text in Homepage 'Listing specially curated' displayed");
							System.out.println("State : Text displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Text For Not Shown as expected");
							
						}
					 
					 //This method for check if search displayed
					 try {
							assertEquals(hpae.Verify_Search(), true, "#And the search in Homepage displayed");
							System.out.println("State : Search displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Search For Not Shown as expected");
							
						}	
					 
					 //This method for check if sale displayed
					 try {
							assertEquals(hpae.Verify_Sale(), true, "#And the sale in Homepage displayed");
							System.out.println("State : Sale displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Sale For Not Shown as expected");
							
						}	
					 
					 //This method for check if rent displayed
					 try {
							assertEquals(hpae.Verify_Rent(), true, "#And the rent in Homepage displayed");
							System.out.println("State : Rent displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Rent For Not Shown as expected");
							
						}	
					 
					 //This method for check if new launch displayed
					 try {
							assertEquals(hpae.Verify_NewLaunch(), true, "#And the new launch in Homepage displayed");
							System.out.println("State : New Launch displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : New Launch For Not Shown as expected");
							
						}
					 
					 //This method for check if commercial displayed
					 try {
							assertEquals(hpae.Verify_Commercial(), true, "#And the commercial in Homepage displayed");
							System.out.println("State : Commercial displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Commercial For Not Shown as expected");
							
						}	
					 
					 //This method for check if calculator displayed
					 try {
							assertEquals(hpae.Verify_Calculator(), true, "#And the calculator in Homepage displayed");
							System.out.println("State : Calculator displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Calculator For Not Shown as expected");
							
						}	
					 
					 //This method for check if mortagage displayed
					 try {
							assertEquals(hpae.Verify_Mortgages(), true, "#And the mortagage in Homepage displayed");
							System.out.println("State : Mortgages displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Mortgages For Not Shown as expected");
							
						}	
					 
					 //This method for check if blog displayed
					 try {
							assertEquals(hpae.Verify_Blog(), true, "#And the blog in Homepage displayed");
							System.out.println("State : Blog displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Blog For Not Shown as expected");
							
						}	
					 
					 //This method for check if bar home displayed
					 try {
							assertEquals(hpae.Verify_BarHome(), true, "#And the bar home in Homepage displayed");
							System.out.println("State : Home in bar displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Home in bar Not Shown as expected");
							
						}	
					 
					 //This method for check if bar chat displayed
					 try {
							assertEquals(hpae.Verify_BarChat(), true, "#And the chat home in Homepage displayed");
							System.out.println("State : Chat in bar displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Chat in bar Not Shown as expected");
							
						}	
					 
					 //This method for check if bar shortlist displayed
					 try {
							assertEquals(hpae.Verify_BarShortlist(), true, "#And the bar shortlist in Homepage displayed");
							System.out.println("State : Shorlist in bar displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Shorlist in bar Not Shown as expected");
							
						}	
					 
					 //This method for check if bar me displayed
					 try {
							assertEquals(hpae.Verify_BarMe(), true, "#And the bar me in Homepage displayed");
							System.out.println("State : Me in bar displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Me in bar Not Shown as expected");
							
						}	
					 
					 //This method for check if bar my listings displayed
					 try {
							assertEquals(hpae.Verify_BarMyListings(), true, "#And the bar my listings in Homepage displayed");
							System.out.println("State :  MyListings  in bar displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : MyListings in bar Not Shown as expected");
							
						}	
					 
				
			}
			
			 System.out.println("#Then the homepage already displayed");	
			wait_Med();
			System.out.println("=========");
			System.out.println("=========");
			
		}

	}