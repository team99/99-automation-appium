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
//	By Home_Page = By.xpath("//*[@id='ivHomeScreenBottomBar']");
	
	//Login modal
	By Login = By.xpath("//*[@id='btnLogin']");
	By Username = By.xpath("//*[@id='etEmail']");	
	By Password = By.xpath("//*[@id='etPassword']");
	By SignUp = By.xpath("//*[@text='Sign up']");
	
	//SignUp modal
	By SignUp_Name = By.xpath("//*[@id='etName']");
	By SignUp_Email = By.xpath("//*[@id='etEnterEmail']");
	By SignUp_Pass = By.xpath("//*[@id='etPassword']");
	By SignUp_Button = By.xpath("//*[@text='Sign up' and ./parent::*[@id='btnSignup']]");
	By SignUp_Skip = By.xpath("//*[@text='Skip']");
	
	//Me section
	By Me_Login = By.xpath("//*[@id='rlNonLogin']");
	By Me_Button_Login = By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='btnLogin']]");
	By Me_Button_Logout = By.xpath("//*[@text='Logout']");
	By Logout_Conf = By.xpath("//*[@text='OK']");
	
	//Jinhao
	// Home button
	By Home_Account = By.xpath("//*[@id='ivProfileBottomBar']");

	// Account page
	By Home_Account_Login= By.xpath("//*[@id='rlNonLogin']");

	// Welcome modal
	By Home_Welcome_Login = By.xpath("//*[@id='btnLogin']");

	// Login modal
	By Home_Login_Email = By.xpath("//*[@id='etEmail']");
	By Home_Login_Password = By.xpath("//*[@id='etPassword']");
	By Home_Login_Login = By.xpath("//*[@class='android.widget.TextView' and ./parent::*[@id='btnLogin']]");
	
	// Logout
	By Home_Logout = By.xpath("//*[@id='tvLogOut']");
	By Home_Logout_Conf = By.xpath("//*[@id='button1']");
	
	//no account user error
	By Home_Login_Invalid = By.xpath("//*[@id='tvErrorLabel']");
	
	//Login//
	//method for home button
	public void Click_Home_Account() throws Exception{
		function.click(Home_Account);
	}
	
	//Account page//
	//method for account page
	public void Click_Account_Login() throws Exception{
		function.click(Home_Account_Login);
	}

	//Welcome modal//
	//method for login button on home page
	public void Click_Welcome_Login() throws Exception{
		function.click(Home_Welcome_Login);
	}

	//Login modal//
	//method to input email in login modal
	public void Login_Input_Email(String email) throws Exception{
		function.input(Home_Login_Email, email);
	}
	
	//method to input password in login modal
	public void Login_Input_Password(String pass) throws Exception{
		function.input(Home_Login_Password, pass);
	}

	//method for clicking on login button 
	public void Click_Login_Login() throws Exception{
		function.click(Home_Login_Login);
	}
	
	public void Click_Logout() throws Exception{
		function.click(Home_Logout);
	}
	
	public void Click_Logout_Confirm() throws Exception{
		function.click(Home_Logout_Conf);
	}
	
	//SignUp//
	//method below for sign up button 
	public void Click_SignUp_Button() throws Exception{
		function.click(SignUp);
		
	}
	
	//method below for click sign up in home
			public void Click_Sign_Up() throws Exception{
				function.click(SignUp);
	}
			
	//method below for input name
	public void SignUp_InputName(String name) throws Exception {
	function.input(SignUp_Name, name);
			}	
	
	//method below for input email
	public void SignUp_InputEmail(String email) throws Exception {
	function.input(SignUp_Email, email);
				}		
			
	//method below for input password
	public void SignUp_InputPass(String pass) throws Exception {
	function.input(SignUp_Pass, pass);
				}		
	
	//method below for sign up button 
	public void Click_SignUp() throws Exception{
		function.click(SignUp_Button);
		
	}
	
	//method below for click skip in sign up in modal
	public void Click_Skip() throws Exception{
		function.click(SignUp_Skip);
}
	
	
	
	//Logout//
	//method below for logout confirmation
	public void Click_ConfLogout() throws Exception{
		function.click(Logout_Conf);
		
		
	}

	
	//method below for click logout in me
		public void Click_MeLogout() throws Exception{
			function.click(Me_Button_Logout);
		}
	

		
		
	//Login//	
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
