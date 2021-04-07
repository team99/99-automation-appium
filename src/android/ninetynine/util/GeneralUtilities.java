package android.ninetynine.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
/*import io.qameta.allure.Attachment;
import io.appium.java_client.android.Activity;*/
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class GeneralUtilities{
	
	By Me_Edit = By.xpath("//*[@text='Edit']");
	
	
	Dimension size;
	/*Activity change;*/
	AndroidDriver<AndroidElement> driver;
	public GeneralUtilities(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
	}
	

	 //Text attachments for Allure
    /*@Attachment(value = "Page screenshot", type = "image/png")*/
    public byte[] saveScreenshotPNG (AndroidDriver<AndroidElement> driver) throws Exception {
    	Thread.sleep(500);
        return (driver.getScreenshotAs(OutputType.BYTES));
    }
   
	/**
	 * verify element
	 */
	public boolean verifyelemen(By Object)throws Exception {
		Thread.sleep(3000);
		boolean enabled=false;
		if(driver.findElements(Object).size() > 0) {
			enabled=true;
			saveScreenshotPNG(driver);
		}else {
			saveScreenshotPNG(driver);
			Assert.fail("Object not found step failed");
		}
		return enabled;
	}
	
	/**
	 * Click Function
	 */
	public void click(By Object) throws Exception{
		if(verifyelemen(Object)){
			 driver.findElement(Object).click();
			Thread.sleep(1000);
			 saveScreenshotPNG(driver);
			}else {
				System.out.println("Object Tidak Ditemukan");
			}
	}
	
	/**
	 * Input String
	 */
	public void input(By Object,String Words)throws Exception {
		driver.findElement(Object).sendKeys(Words);
		 saveScreenshotPNG(driver);
	}
	/**
	 * verifyinput
	 */
	public String Gettext(By Object)throws Exception {
		String a = driver.findElement(Object).getText();
		return a;
	}
	
	public boolean verifyLogin() {
		boolean login=false;
		      
		try {
			login = driver.findElement(Me_Edit).isDisplayed();
		} catch (Exception e) {
			
		}
		
		return login;
		
	}
	
	
	
	
}
