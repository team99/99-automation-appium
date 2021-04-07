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
	
		By Srp_Search = By.xpath("//*[@id='etAutocomplete']");
		By Srp_Tanglin = By.xpath("//*[@class='android.view.View' and ./parent::*[@id='flAutoComplete'] and (./preceding-sibling::* | ./following-sibling::*)[@text='D10 - Tanglin / Holland']]");
		By Srp_UnverTanglinList = By.xpath("//*[@class='android.view.ViewGroup' and ./*[./*[@text='Holland Gems']] and ./*[@id='flSearchResultPageGallery']]");
		
		By Srp_Sort = By.xpath("//*[@id='btnSortBy']");
		By Srp_Filter = By.xpath("//*[@text='Filters']");
		By Srp_Sort_Newest = By.xpath("//*[@text='Newest']");
		By Srp_Filter_PropertyType = By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@id='llRowTitleWrapper' and ./*[@text='Property type']]]");
		By Srp_Filter_PropType_Condo = By.xpath("//*[@text='Condo']");
		By Srp_Filter_PropType_Back = By.xpath("//*[@contentDescription='Kembali ke atas']");
		By Srp_Filter_Search = By.xpath("//*[@text='Search']");
		
		//Shortlist
		By Srp_Shortlist = By.xpath("//*[@id='cbSearchResultPageShortList' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[./*[@id='ivSearchResultPageForRegularListing']]]]]]");
		By Srp_Shortlist_Done = By.xpath("//*[@id='btnShortlistDone']");
		
		//SRP Rent
		By Srp_MustSee_Rent = By.xpath("(//*[@id='rvAutocomplete']/*/*[@id='tvAutocompleteCategoryTitle'])[2]");
		By Srp_MustSee_Rent_Listing = By.xpath("//*[@id='cvSearchListingViewContent' and ./*[./*[@id='llSearchResultPageAgent']]]");
			
		//SRP sale
		By Srp_Listing = By.xpath("//*[@id='cvSearchListingViewContent']");
		By Srp_Reg_Listing = By.xpath("//*[@id='cvSearchListingViewContent' and ./*[./*[./*[@id='llSearchResultPagePhotoInfo']]]]");
		By Srp_MustSee_Listing = By.xpath("//*[@class='android.view.ViewGroup' and ./*[./*[@text]] and ./*[@id='flSearchResultPageGallery']]");
		
		//SRP Pollen & Blue result
		By Srp_Result_PollenBlue = By.xpath("//*[@class='android.view.View' and ./parent::*[@id='flAutoComplete'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Pollen & Bleu']]");
		
		//Listing
		By Srp_Button_Chat = By.xpath("//*[@id='tvSearchResultPageChatWithAgent']");
		By Srp_Button_Phone = By.xpath("//*[@id='ivSearchResultPageCall']");

		//Call Agent Modal
		By CA_Name = By.xpath("//*[@id='etConfirmEnquiryName']");
		By CA_Phone = By.xpath("//*[@id='etPhone']");
		By CA_Email = By.xpath("//*[@id='etConfirmEnquiryEmail']");
		By CA_Button_Confirm = By.xpath("//*[@text='Verify & continue']");
		By CA_ContinueToCall = By.xpath("//*[@text='Continue to Call']");
		
		By Srp_Anywhere = By.xpath("(//*[@id='rvAutocomplete']/*/*[@id='tvAutocompleteCategoryTitle'])[2]");
		By Srp_Anywhere_LDP = By.xpath("//*[@class='android.view.ViewGroup' and ./*[@id='flSearchResultPageGallery' and ./*[@id='vpSearchResultPageGallery']]]");
		
		//method below for click anywhere in sg rent
		public void Click_Unver_Listing() throws Exception{
			function.click(Srp_UnverTanglinList);
		}
		
		//method below for click anywhere in sg rent
				public void Click_AnywhereInSG() throws Exception{
					function.click(Srp_Anywhere);
				}
		
		//method below for click anywhere in sg rent
		public void Click_Srp_Tanglin() throws Exception{
			function.click(Srp_Tanglin);
		}
		
		//method below for click anywhere in sg rent
		public void Click_AnywhereInSG_LDP() throws Exception{
			function.click(Srp_Anywhere_LDP);
		}
		
		//method below for click anywhere in sg rent
		public void Click_Rent_Srp() throws Exception{
			function.click(Srp_MustSee_Rent);
		}
		
		//method below for click must see rent listing
				public void Click_Rent_Listing() throws Exception{
					function.click(Srp_MustSee_Rent_Listing);
				}
		
		//method below for click SRP result Pollen & Blue
		public void Click_Srp_ResultPollen() throws Exception{
			function.click(Srp_Result_PollenBlue);
		}
		
		
		//method below for click Continue To Call Agent button in SRP
		public void Click_ContCallAgent() throws Exception{
			function.click(CA_ContinueToCall);
		}
		
		
		//method below for click listing in SRP
			public void Click_Srp_Ldp_List() throws Exception{
				function.click(Srp_Listing);
			}
			
			//method below for click listing in SRP ver user
			public void Click_Srp_Ldp_MustSeeList() throws Exception{
				function.click(Srp_MustSee_Listing);
			}
			
			//method below for click reg listing in SRP
			public void Click_Srp_Reg_List() throws Exception{
				function.click(Srp_Reg_Listing);
			}
			
			//method below for click chat button in SRP
			public void Click_Srp_BtChat() throws Exception{
				function.click(Srp_Button_Chat);
			}
			
			//method below for click chat button in SRP
			public void Click_Srp_BtPhone() throws Exception{
				function.click(Srp_Button_Phone);
			}
			
			
			//Call Agent Modal
		//Chat with agent input name	
			public void Ca_InputName(String ca_name) throws Exception { 
				function.input(CA_Name, ca_name);
			}
			
			//Chat with agent input phone	
			public void Ca_InputPhone(String ca_phone) throws Exception { 
				function.input(CA_Phone, ca_phone);
			}
			
			//Chat with agent input email	
			public void Ca_InputEmail(String ca_email) throws Exception { 
				function.input(CA_Email, ca_email);
			}
			
			//method below for click confirm button in SRP call
			public void Click_CA_BtConfirm() throws Exception{
				function.click(CA_Button_Confirm);
			}
			
			
			//method below for click sort by
			public void Click_SRP_SortBy() throws Exception{
				function.click(Srp_Sort);
			}
			
			//method below for click sort by newest
			public void Click_SRP_SortByNewest() throws Exception{
				function.click(Srp_Sort_Newest);
			}
			
			//method below for click filter
			public void Click_SRP_Filter() throws Exception{
				function.click(Srp_Filter);
			}
			
			//method below for click filter - property type  
			public void Click_SRP_Filter_PropertyType() throws Exception{
				function.click(Srp_Filter_PropertyType);
			}
			
			//method below for click filter - property type  - condo
			public void Click_SRP_Filter_PropTypeCondo() throws Exception{
				function.click(Srp_Filter_PropType_Condo);
			}
			
			//method below for click filter - property type  - back
			public void Click_SRP_Filter_PropTypeBack() throws Exception{
				function.click(Srp_Filter_PropType_Back);
			}
			
			//method below for click filter -  search
			public void Click_SRP_Filter_Search() throws Exception{
				function.click(Srp_Filter_Search);
			}
			
			//method below for click shortlist
			public void Click_SRP_Shortlist() throws Exception{
				function.click(Srp_Shortlist);
			}
			
			//method below for click shortlist - done
			public void Click_SRP_Shortlist_Done() throws Exception{
				function.click(Srp_Shortlist_Done);
			}
		
}
	
