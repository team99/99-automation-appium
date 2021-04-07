package android.ninetynine.shortlist;



import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import android.ninetynine.pageobjects.*;

public class C1_NoAcc_Shortlist extends Base_Test {
	
	private Login login;
	private Homepage hp;
	private GeneralUtilities util;
	private Landing_Page ldp;
	private SearchResultPage srp;
	
	@Test
	public void C1_NoAccShortlist() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		login = new Login(driver);
		hp = new Homepage(driver);
		util = new GeneralUtilities(driver);
		ldp = new Landing_Page(driver); 
		srp = new SearchResultPage(driver);
			
		 System.out.println("=========");
		 System.out.println("TestCase : C1");	
		 System.out.println("No Acc - Shortlist");	
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
		 	 hp.Click_HomeSale();		     
		     wait_Med();
		     
		     
		     System.out.println("#And I am on search page");
			 ldp.Click_LdpSaleResult();
			 
			 srp.Click_SRP_Shortlist();
			 

		} else {
			
				System.out.println("State : Logged out");
				hp.Click_Homepage();
				wait_Long();
				hp.Click_HomeSale();
				wait_Med();			
				
			     System.out.println("#And I am on search page");
//			     lp.Input_Sale_Search(CONFIG.getProperty("RegisteredNumberNonTsel"));
				 ldp.Click_LdpSaleResult();
				 
			
				 srp.Click_SRP_Shortlist();
				 
			
		}
		
		 
		wait_Med();
		 System.out.println("=========");
		 System.out.println("=========");
		
	}

}
