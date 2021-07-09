package android.ninetynine.util;

import java.time.*;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import io.appium.java_client.TouchAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
/*import static io.appium.java_client.touch.offset.PointOption.point;*/
import org.openqa.selenium.Point;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
/*import io.qameta.allure.Attachment;*/

import static java.time.Duration.ofMillis;
/*import static io.appium.java_client.touch.WaitOptions.waitOptions;*/
public class Base_Test {
	public Duration duration = ofMillis(3000);
	Point poin;
	Dimension size;
	Dimension size1;
	protected AndroidDriver<AndroidElement> driver = null;
	public WebDriverWait wait=null;
	DesiredCapabilities capabilities = new DesiredCapabilities();
	public Properties CONFIG = null;
	public String configs = System.getProperty("user.dir")+"//src//android//ninetynine//config//Config.properties";
	public String test_data = System.getProperty("user.dir")+"//src//android//ninetynine//config//AndroidTestData.properties";
	
	//App_Package 99
	String ninentynineAppPackageName = "co.ninetynine.android.dev";
	String ninetynineActivityName = "co.ninetynine.android.Launcher";
	
	//App_Package Google Chrome
	String chromeAppPackageName = "com.android.chrome";
	String chromeAppActivityName = "com.google.android.apps.chrome.Main";
	/*===========*/
	
	//Change_App to 99 Apps
	public void changed_ninentynineApps() {
		driver.startActivity(ninentynineAppPackageName, ninetynineActivityName);
	}

	//Change_App to Chrome
	public void changed_chromeApps() {
		driver.startActivity(ninentynineAppPackageName, ninetynineActivityName);
	}
	
	
	public void BACK() throws Exception {
		driver.navigate().back();
	}
	
	 public void wait_Low()throws Exception {
		  Thread.sleep(3000);
	  }
	 
	 public void wait_Med()throws Exception {
		  Thread.sleep(5000);
	  }
	 
	 public void wait_Long()throws Exception {
		  Thread.sleep(8000);
	  }
	  
	  
	  
	  @BeforeMethod
	  public void setUp() throws Exception{
		  CONFIG = new Properties();
		  FileInputStream fsconf = new FileInputStream(configs);
		  CONFIG.load(fsconf);
		  //Set up desired capabilities and pass the Android app-activity and app-package to Appium
	  	capabilities.setCapability("platformName",CONFIG.getProperty("platformName"));
	  	capabilities.setCapability("VERSION",  CONFIG.getProperty("VERSION")); 
	  	capabilities.setCapability("deviceName",CONFIG.getProperty("DeviceName"));
	  	capabilities.setCapability("automationName",CONFIG.getProperty("automationName"));
	  	capabilities.setCapability("reportDirectory", CONFIG.getProperty("reportDirectory"));
	    capabilities.setCapability("appPackage", CONFIG.getProperty("APP_PACKAGE"));
	  	capabilities.setCapability("appActivity",CONFIG.getProperty("APP_ACTIVITY")); // This is Launcher activity of your app (you can get it from apk info app)
	    /*capabilities.setCapability("noReset", "true");
	    capabilities.setCapability("fullReset", "false");*/
	  	driver = new AndroidDriver<AndroidElement>(new URL(CONFIG.getProperty("LocalHostURL")), capabilities);
		 
	  }
	  @AfterMethod
	  public void tearDown() {
		  driver.quit();
		  //driver.close();
	  }
	  
}
