package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import utility.SeleniumHelper;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;

public class POM_BlueBirdSettingsPage extends SeleniumHelper{

   //Variables
	public WebDriver driver;
	private ExtentTest logger;
	private Actions action;
	public WebDriverWait wait;
	private JavascriptExecutor executor;
	public String PAGE_Title = "Settings | Bluebird from American Express";
	public String PAGE_URL = "https://secure.bluebird.com/Manage/Settings/AccountSettings";

   //Constructor
	public POM_BlueBirdSettingsPage(WebDriver driver, ExtentTest Inlogger){
		this.driver = driver;
		this.logger = Inlogger;
		logger.info("Page Title: " +driver.getTitle());
		wait = new WebDriverWait(driver, 5);
	}

   //Locators
	By Salt_Lake_City_UT_84184 = By.xpath("//*[contains(text(),'Salt Lake City, UT 84184')]");
	By A4315_South_2700_West = By.xpath("//*[@class='details']/div[6]");
	By American_Express_National_Bank = By.xpath("//*[@class='details']/div[5]");
	By Account_Number = By.xpath("//*[@class='details']/div[1]");
	By Routing_Number = By.xpath("//*[@class='details']/div[2]");

   //Methods

   // Salt_Lake_City_UT_84184
	public boolean Salt_Lake_City_UT_84184_DISPLAYED(){
	    return VerifyElement(driver,logger,Salt_Lake_City_UT_84184,"displayed","Salt_Lake_City_UT_84184");
	}
	public boolean Salt_Lake_City_UT_84184_ENABLED(){
	    return VerifyElement(driver,logger,Salt_Lake_City_UT_84184,"enabled","Salt_Lake_City_UT_84184");
	}
	public void Salt_Lake_City_UT_84184_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Salt_Lake_City_UT_84184);
	    action.moveToElement(we).build().perform();
	}
	public void Salt_Lake_City_UT_84184_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Salt_Lake_City_UT_84184, "moveToAndClick","Salt_Lake_City_UT_84184");
 	}
	public void Salt_Lake_City_UT_84184_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Salt_Lake_City_UT_84184, "javaClick","Salt_Lake_City_UT_84184");
  	}
	public void Salt_Lake_City_UT_84184_CLICK(){
	    Element_Click(driver,logger,Salt_Lake_City_UT_84184, "click","Salt_Lake_City_UT_84184");
  
	}
	public String Salt_Lake_City_UT_84184_GETTEXT(){
	    return driver.findElement(Salt_Lake_City_UT_84184).getText();
	}

   // A4315_South_2700_West
	public boolean A4315_South_2700_West_DISPLAYED(){
	    return VerifyElement(driver,logger,A4315_South_2700_West,"displayed","A4315_South_2700_West");
	}
	public boolean A4315_South_2700_West_ENABLED(){
	    return VerifyElement(driver,logger,A4315_South_2700_West,"enabled","A4315_South_2700_West");
	}
	public void A4315_South_2700_West_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(A4315_South_2700_West);
	    action.moveToElement(we).build().perform();
	}
	public void A4315_South_2700_West_MOVETOANDCLICK(){
	    Element_Click(driver,logger,A4315_South_2700_West, "moveToAndClick","A4315_South_2700_West");
 	}
	public void A4315_South_2700_West_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,A4315_South_2700_West, "javaClick","A4315_South_2700_West");
  	}
	public void A4315_South_2700_West_CLICK(){
	    Element_Click(driver,logger,A4315_South_2700_West, "click","A4315_South_2700_West");
  
	}
	public String A4315_South_2700_West_GETTEXT(){
	    return driver.findElement(A4315_South_2700_West).getText();
	}

   // American_Express_National_Bank
	public boolean American_Express_National_Bank_DISPLAYED(){
	    return VerifyElement(driver,logger,American_Express_National_Bank,"displayed","American_Express_National_Bank");
	}
	public boolean American_Express_National_Bank_ENABLED(){
	    return VerifyElement(driver,logger,American_Express_National_Bank,"enabled","American_Express_National_Bank");
	}
	public void American_Express_National_Bank_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(American_Express_National_Bank);
	    action.moveToElement(we).build().perform();
	}
	public void American_Express_National_Bank_MOVETOANDCLICK(){
	    Element_Click(driver,logger,American_Express_National_Bank, "moveToAndClick","American_Express_National_Bank");
 	}
	public void American_Express_National_Bank_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,American_Express_National_Bank, "javaClick","American_Express_National_Bank");
  	}
	public void American_Express_National_Bank_CLICK(){
	    Element_Click(driver,logger,American_Express_National_Bank, "click","American_Express_National_Bank");
  
	}
	public String American_Express_National_Bank_GETTEXT(){
	    return driver.findElement(American_Express_National_Bank).getText();
	}

   // Account_Number
	public boolean Account_Number_DISPLAYED(){
	    return VerifyElement(driver,logger,Account_Number,"displayed","Account_Number");
	}
	public boolean Account_Number_ENABLED(){
	    return VerifyElement(driver,logger,Account_Number,"enabled","Account_Number");
	}
	public void Account_Number_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Account_Number);
	    action.moveToElement(we).build().perform();
	}
	public void Account_Number_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Account_Number, "moveToAndClick","Account_Number");
 	}
	public void Account_Number_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Account_Number, "javaClick","Account_Number");
  	}
	public void Account_Number_CLICK(){
	    Element_Click(driver,logger,Account_Number, "click","Account_Number");
  
	}
	public String Account_Number_GETTEXT(){
	    return driver.findElement(Account_Number).getText();
	}

   // Routing_Number
	public boolean Routing_Number_DISPLAYED(){
	    return VerifyElement(driver,logger,Routing_Number,"displayed","Routing_Number");
	}
	public boolean Routing_Number_ENABLED(){
	    return VerifyElement(driver,logger,Routing_Number,"enabled","Routing_Number");
	}
	public void Routing_Number_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Routing_Number);
	    action.moveToElement(we).build().perform();
	}
	public void Routing_Number_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Routing_Number, "moveToAndClick","Routing_Number");
 	}
	public void Routing_Number_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Routing_Number, "javaClick","Routing_Number");
  	}
	public void Routing_Number_CLICK(){
	    Element_Click(driver,logger,Routing_Number, "click","Routing_Number");
  
	}
	public String Routing_Number_GETTEXT(){
	    return driver.findElement(Routing_Number).getText();
	}

}