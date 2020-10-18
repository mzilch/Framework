package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;



public class BrowserFactory{
	
	
	
	public static WebDriver startBrowser(WebDriver driver,String browserName)
	{
		Reporter.log("Inside startBrowser",true);
		
		if(browserName.equals("Chrome"))
		{
			//bclass.logger.info("--- Launching Chrome browser");
	    	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	    	driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			//bclass.logger.info("--- Launching Firefox browser");
	     	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	    	driver = new FirefoxDriver();
		}
		else if(browserName.equals("Edge"))
		{
			//bclass.logger.info("--- Launching Edge browser");
	     	System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
	    	driver = new EdgeDriver();
		}
		else if(browserName.equals("IE"))
		{
			//bclass.logger.info("--- Launching Internet Explorer browser");
	     	System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
	    	driver = new InternetExplorerDriver();
		}
		else
		{
			//bclass.logger.info("We do not support this browser");
		}
		//bclass.logger.info("Starting Application");
    	// Manage browser and timeouts
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		
		Reporter.log("Inside quitBrowser",true);
		//bclass.logger.info("driver.quit");
		driver.quit();
	}
	

}
