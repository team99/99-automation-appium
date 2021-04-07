package android.ninetynine.shortlist;



import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C2_LoginUnver_Shortlist extends Base_Test {
	
	private Login login;
	private Homepage hp;
	private GeneralUtilities util;
	private Landing_Page ldp;
	private SearchResultPage srp;
	
	@Test
	public void C2_LoginUnverShortlist() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		hp = new Homepage(driver);
		util = new GeneralUtilities(driver);
		ldp = new Landing_Page(driver); 
		srp = new SearchResultPage(driver);
			
		 System.out.println("=========");
		 System.out.println("TestCase : C2");	
		 System.out.println("Login Unver - Shortlist");	
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
	     
		     //LDP search method in SRP
		     hp.Click_HomeSale();
		     wait_Med();			

		     System.out.println("#And I am on search page");
			 ldp.Click_LdpSaleResult();
			 
			 srp.Click_SRP_Shortlist();
			 srp.Click_SRP_Shortlist_Done();
			
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
				
				 System.out.println("#And I am on search page");
				 ldp.Click_LdpSaleResult();
				 
			
				 srp.Click_SRP_Shortlist();
				 srp.Click_SRP_Shortlist_Done();
			
		} 
		wait_Med();
		System.out.println("=========");
		System.out.println("=========");
		
	}

}
