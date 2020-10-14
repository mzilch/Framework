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

public class POM_BlueBirdAddFamilyAccount extends SeleniumHelper{

   //Variables
	public WebDriver driver;
	private ExtentTest logger;
	private Actions action;
	public WebDriverWait wait;
	private JavascriptExecutor executor;
	public String PAGE_Title = "Add Family Account | Family Accounts | Bluebird from American Express";
	public String PAGE_URL = "https://secure.bluebird.com/Manage/FamilyAccount/Create";

   //Constructor
	public POM_BlueBirdAddFamilyAccount(WebDriver driver, ExtentTest Inlogger){
		this.driver = driver;
		this.logger = Inlogger;
		logger.info("Page Title: \"" +driver.getTitle() + "\"");
		wait = new WebDriverWait(driver, 5);
	}

   //Locators
	By change_your_address1 = By.xpath("//a[@tabindex='28']");
	By Privacy_Statement_1 = By.xpath("//a[@href='https://www.americanexpress.com/privacycenter']");
	By Consent_Statement = By.xpath("//a[@tabindex='33']");

   //Methods

   // change_your_address1
	public boolean change_your_address1_DISPLAYED(){
	    return VerifyElement(driver,logger, change_your_address1,"displayed","change_your_address1");
	}
	public boolean change_your_address1_ENABLED(){
	    return VerifyElement(driver,logger,change_your_address1,"enabled","change_your_address1");
	}
	public void change_your_address1_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(change_your_address1);
	    action.moveToElement(we).build().perform();
	}
	public void change_your_address1_MOVETOANDCLICK(){
	    Element_Click(driver,logger,change_your_address1, "moveToAndClick","change_your_address1");
 	}
	public void change_your_address1_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,change_your_address1, "javaClick","change_your_address1");
  	}
	public void change_your_address1_CLICK(){
	    Element_Click(driver,logger,change_your_address1, "click","change_your_address1");
  
	}
	public String change_your_address1_GETTEXT(){
	    return driver.findElement(change_your_address1).getText();
	}

   // Privacy_Statement_1
	public boolean Privacy_Statement_1_DISPLAYED(){
	    return VerifyElement(driver,logger,Privacy_Statement_1,"displayed","Privacy_Statement_1");
	}
	public boolean Privacy_Statement_1_ENABLED(){
	    return VerifyElement(driver,logger,Privacy_Statement_1,"enabled","Privacy_Statement_1");
	}
	public void Privacy_Statement_1_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Privacy_Statement_1);
	    action.moveToElement(we).build().perform();
	}
	public void Privacy_Statement_1_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Privacy_Statement_1, "moveToAndClick","Privacy_Statement_1");
 	}
	public void Privacy_Statement_1_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Privacy_Statement_1, "javaClick","Privacy_Statement_1");
  	}
	public void Privacy_Statement_1_CLICK(){
	    Element_Click(driver,logger,Privacy_Statement_1, "click","Privacy_Statement_1");
  
	}
	public String Privacy_Statement_1_GETTEXT(){
	    return driver.findElement(Privacy_Statement_1).getText();
	}

   // Consent_Statement
	public boolean Consent_Statement_DISPLAYED(){
	    return VerifyElement(driver,logger,Consent_Statement,"displayed","Consent_Statement");
	}
	public boolean Consent_Statement_ENABLED(){
	    return VerifyElement(driver,logger,Consent_Statement,"enabled","Consent_Statement");
	}
	public void Consent_Statement_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Consent_Statement);
	    action.moveToElement(we).build().perform();
	}
	public void Consent_Statement_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Consent_Statement, "moveToAndClick","Consent_Statement");
 	}
	public void Consent_Statement_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Consent_Statement, "javaClick","Consent_Statement");
  	}
	public void Consent_Statement_CLICK(){
	    Element_Click(driver,logger,Consent_Statement, "click","Consent_Statement");
  
	}
	public String Consent_Statement_GETTEXT(){
	    return driver.findElement(Consent_Statement).getText();
	}

}