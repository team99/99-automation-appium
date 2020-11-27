package android.ninetynine.pageobjects;
import org.openqa.selenium.By;

import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SearchResultPage extends Base_Test {
	GeneralUtilities function;
	public SearchResultPage(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
		
	}

		//SRP
		By Srp_Listing = By.xpath("//*[@id='cvSearchListingViewContent']");
		By Srp_Reg_Listing = By.xpath("//*[@id='cvSearchListingViewContent' and ./*[./*[./*[./*[@id='ivSearchResultPagePhoto']] and ./*[@id='ivSearchResultPageForRegularListing']]]]");
		


		//method below for click listing in SRP
			public void Click_Srp_Ldp_List() throws Exception{
				function.click(Srp_Listing);
			}
			
			//method below for click reg listing in SRP
			public void Click_Srp_Reg_List() throws Exception{
				function.click(Srp_Reg_Listing);
			}
			
	
		
}
	
