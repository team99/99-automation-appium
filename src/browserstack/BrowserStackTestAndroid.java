package browserstack;

import java.net.URL;
import java.util.function.Function;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
      
public class  BrowserStackTestAndroid{

  public static void main(String[] args) throws MalformedURLException, InterruptedException {
    
      DesiredCapabilities caps = new DesiredCapabilities();
      
      // Set your access credentials
      caps.setCapability("browserstack.user", "dania35");
      caps.setCapability("browserstack.key", "5e6B3cyJzcdt1y8rszz9");
      
      // Set URL of the application under test
      caps.setCapability("app", "bs://a504dbb1d729ba3519d78aea636baf74786acdb6");
      
      // Specify device and os_version for testing
      caps.setCapability("device", "Google Pixel 3");
      caps.setCapability("os_version", "9.0");
        
      // Set other BrowserStack capabilities
      caps.setCapability("project", "First Java Project");
      caps.setCapability("build", "Java Android");
      caps.setCapability("name", "first_test");
        
      
      // Initialise the remote Webdriver using BrowserStack remote URL
      // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
            new URL("http://hub.browserstack.com/wd/hub"), caps);
        

      /* Write your Custom code here */
        
        
      // Invoke driver.quit() after the test is done to indicate that the test is completed.
      driver.quit();
    
    }
      
  }