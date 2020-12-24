package android.ninetynine.pagerendering;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C5_PageRendering_User_AgentLogin extends Base_Test {
	
	private Login login;
	private AssertEqual_List asl;
	private Homepage hp;
	private GeneralUtilities util;
	private Landing_Page ldp;
	private SearchResultPage srp;
	private User_AssertEqual uae;
	
	@Test
	public void C5_PageRendering_User_Agent_Login() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		asl = new AssertEqual_List(driver);
		hp = new Homepage(driver);
		util = new GeneralUtilities(driver);
		ldp = new Landing_Page(driver); 
		srp = new SearchResultPage(driver);
		uae = new User_AssertEqual(driver);
			
		 System.out.println("=========");
		 System.out.println("TestCase : C5");	
		 System.out.println("Page Rendering User - Agent User");	
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
		     
			     System.out.println("#When I go to user page");	
			     login.Click_Home_Me();
					
			     //This method for check if the credit top up button displayed
				 try {
						assertEquals(uae.Verify_Agent_CreditTopUp(), true, "#And TopUp Button displayed");
						System.out.println("State : TopUp Button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : TopUp Button Not Shown as expected");
						
					}
				 
			     //This method for check if the credit trans button displayed
							 try {
									assertEquals(uae.Verify_Agent_CreditTrans(), true, "#And Credit Trans Button displayed");
									System.out.println("State : Credit Trans Button displayed as expected");
									
								} catch (Exception e){
											
									System.out.println("State : Credit Trans Button Not Shown as expected");
									
								}
				 
			     //This method for check if the coin top up button displayed
				 try {
						assertEquals(uae.Verify_Agent_CoinTopUp(), true, "#And Coin TopUp Button displayed");
						System.out.println("State : Coin TopUp Button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Coin TopUp Button Not Shown as expected");
						
					}

				 //This method for check if the coin trans button displayed
				 try {
						assertEquals(uae.Verify_Agent_CoinTrans(), true, "#And Coin Trans Button displayed");
						System.out.println("State : Coin Trans Button displayed as expected");
						
					} catch (Exception e){
								
						System.out.println("State : Coin Trans Button Not Shown as expected");
						
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
				
				
				    System.out.println("#When I go to user page");	
				     login.Click_Home_Me();
						
				     //This method for check if the credit top up button displayed
					 try {
							assertEquals(uae.Verify_Agent_CreditTopUp(), true, "#And TopUp Button displayed");
							System.out.println("State : TopUp Button displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : TopUp Button Not Shown as expected");
							
						}
					 
				     //This method for check if the credit trans button displayed
								 try {
										assertEquals(uae.Verify_Agent_CreditTrans(), true, "#And Credit Trans Button displayed");
										System.out.println("State : Credit Trans Button displayed as expected");
										
									} catch (Exception e){
												
										System.out.println("State : Credit Trans Button Not Shown as expected");
										
									}
					 
				     //This method for check if the coin top up button displayed
					 try {
							assertEquals(uae.Verify_Agent_CoinTopUp(), true, "#And Coin TopUp Button displayed");
							System.out.println("State : Coin TopUp Button displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Coin TopUp Button Not Shown as expected");
							
						}

					 //This method for check if the coin trans button displayed
					 try {
							assertEquals(uae.Verify_Agent_CoinTrans(), true, "#And Coin Trans Button displayed");
							System.out.println("State : Coin Trans Button displayed as expected");
							
						} catch (Exception e){
									
							System.out.println("State : Coin Trans Button Not Shown as expected");
							
						}
					
			}
			
			 System.out.println("#Then the user page already displayed");	
			wait_Med();
			System.out.println("=========");
			System.out.println("=========");
			
		}

	}