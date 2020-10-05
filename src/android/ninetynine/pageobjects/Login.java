package android.ninetynine.pageobjects;
import org.openqa.selenium.By;

import android.ninetynine.util.Base_Test;
import android.ninetynine.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Login extends Base_Test {
	GeneralUtilities function;
	public Login(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
	}
	
	//99
	By Home_Me = By.xpath("//*[@id='ivProfileBottomBar']");
	By Home_Search = By.xpath("//*[@id='icon' and ./parent::*[@id='action_search']]");
	By Modal_NotNow = By.xpath("//*[@text='Not Now']");

	
	//Login modal
	By Login = By.xpath("//*[@id='btnLogin']");
	By Username = By.xpath("//*[@id='etEmail']");	
	By Password = By.xpath("//*[@id='etPassword']");
	
	
	//Me section
	By Me_Login = By.xpath("//*[@id='rlNonLogin']");
	By Me_Button_Login = By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='btnLogin']]");
	By Me_Button_Logout = By.xpath("//*[@text='Logout']");
	By Logout_Conf = By.xpath("//*[@text='OK']");

	//method below for logout confirmation
	public void Click_ConfLogout() throws Exception{
		function.click(Logout_Conf);
	}

	
	//method below for click logout in me
		public void Click_MeLogout() throws Exception{
			function.click(Me_Button_Logout);
		}
	

	//method below for click login in home
	public void Click_Home_Me() throws Exception{
		function.click(Home_Me);
	}
	
	//method below for click login in screen
		public void Click_ModalNotNow() throws Exception{
			function.click(Modal_NotNow);
		}	
	
	//method below for click login in screen
	public void Click_Login() throws Exception{
		function.click(Login);
	}	
	//method below for click login in account
	public void Click_MeLogin() throws Exception{
		function.click(Me_Login);
	}
		
	//method below for click button login
		public void Click_ButtonLogin() throws Exception{
			function.click(Me_Button_Login);
		}
		
	
	//method below for click login in home
		public void Click_HomeSearch() throws Exception{
			function.click(Home_Search);
		}
		
	//method below for input username
		public void InputUsername(String username) throws Exception {
			function.input(Username, username);
		}
		
	//method below for input password
		public void InputPassword(String password) throws Exception {
			function.input(Password, password);
		}
		
}
