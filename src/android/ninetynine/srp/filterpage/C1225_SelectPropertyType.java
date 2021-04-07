package android.ninetynine.srp.filterpage;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C1225_SelectPropertyType extends Base_Test {
	
	private Login login;
	private AssertEqual_List asl;
	private Homepage hp;
	private GeneralUtilities util;
	private Landing_Page ldp;
	private SearchResultPage srp;
	
	@Test
	public void C1225_SelectProperty_Type() throws Exception {
	
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
			 System.out.println("TestCase : C1225");	
			 System.out.println("Select Property Type");
			 System.out.println("---------");
			 
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
		     
			     hp.Click_HomeSale();
			     wait_Med();			
				 ldp.Click_LdpSaleResult();
				 System.out.println("#Given I am on SRP");	
					
				 System.out.println("#When I click filter icon");	
				 srp.Click_SRP_Filter();
				 
				 System.out.println("#And I search for property type");	
				 srp.Click_SRP_Filter_PropertyType();
				 
				 System.out.println("#And I select one property type");	
				 srp.Click_SRP_Filter_PropTypeCondo();
				 
				 srp.Click_SRP_Filter_PropTypeBack();
				 
				 System.out.println("#And I click search");	
				 srp.Click_SRP_Filter_Search();	
					

			} else {
				
					System.out.println("State : Logged out");
					
					login.Click_Home_Me();
					login.Click_MeLogin();
					login.Click_Login();
					login.InputUsername(CONFIG.getProperty("Unver_Email"));
					login.InputPassword(CONFIG.getProperty("Unver_Pass"));
					login.Click_ButtonLogin();
					
					 wait_Long();
					 hp.Click_HomeSale();
				     wait_Med();			
					 ldp.Click_LdpSaleResult();
					 System.out.println("#Given I am on SRP");	
						
					 System.out.println("#When I click filter icon");	
					 srp.Click_SRP_Filter();
					 
					 System.out.println("#And I search for property type");	
					 srp.Click_SRP_Filter_PropertyType();
					 
					 System.out.println("#And I select one property type");	
					 srp.Click_SRP_Filter_PropTypeCondo();
					 
					 srp.Click_SRP_Filter_PropTypeBack();
					 
					 System.out.println("#And I click search");	
					 srp.Click_SRP_Filter_Search();	

				
			} 
			wait_Med();
			System.out.println("=========");
			System.out.println("=========");
			
		}

		
		
	}
