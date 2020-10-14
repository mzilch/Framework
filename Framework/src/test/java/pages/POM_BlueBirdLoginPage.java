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

public class POM_BlueBirdLoginPage extends SeleniumHelper{

   //Variables
	public WebDriver driver;
	private ExtentTest logger;
	private Actions action;
	public WebDriverWait wait;
	private JavascriptExecutor executor;
	public String PAGE_Title = "Log In | Bluebird from American Express";
	public String PAGE_URL = "https://secure.bluebird.com/login?intlink=us-bluebird-marketing-home-prospectslp-incomm2018-header-login";

   //Constructor
	public POM_BlueBirdLoginPage(WebDriver driver, ExtentTest Inlogger){
		this.driver = driver;
		this.logger = Inlogger;
		logger.info("Page Title: " +driver.getTitle());
		wait = new WebDriverWait(driver, 5);
	}

   //Locators
	By UserName = By.xpath("//input[@id='UserName']");
	By Password_Field = By.xpath("//input[@id='Password']");
	By RememberMe_Checkbox = By.xpath("//input[@aria-labelledby='label-check']");
	By LogIn_Button = By.xpath("//input[@class='btn-primary']");
	By Create_an_Account = By.xpath("//a[@class='create-account-link']");
	By UsernameSection = By.xpath("//*[contains(text(),'Username')]");
	By Legal = By.xpath("//a[@href='https://www.bluebird.com/legal']");
	By Privacy_Center = By.xpath("//*[@class='first-col-linklist']/ul[1]/li[3]/a");

   //Methods

   // UserName
	public boolean UserName_DISPLAYED(){
	    return VerifyElement(driver,logger,UserName,"displayed","UserName");
	}
	public boolean UserName_ENABLED(){
	    return VerifyElement(driver,logger,UserName,"enabled","UserName");
	}
	public void UserName_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(UserName);
	    action.moveToElement(we).build().perform();
	}
	public void UserName_MOVETOANDCLICK(){
	    Element_Click(driver,logger,UserName, "moveToAndClick","UserName");
 	}
	public void UserName_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,UserName, "javaClick","UserName");
  	}
	public void UserName_CLICK(){
	    Element_Click(driver,logger,UserName, "click","UserName");
  
	}
	public String UserName_GETTEXT(){
	    return driver.findElement(UserName).getText();
	}
	public void UserName_SENDKEYS(String textToInput){
	    driver.findElement(UserName).clear();	    driver.findElement(UserName).sendKeys(textToInput);
	}

   // Password_Field
	public boolean Password_Field_DISPLAYED(){
	    return VerifyElement(driver,logger,Password_Field,"displayed","Password_Field");
	}
	public boolean Password_Field_ENABLED(){
	    return VerifyElement(driver,logger,Password_Field,"enabled","Password_Field");
	}
	public void Password_Field_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Password_Field);
	    action.moveToElement(we).build().perform();
	}
	public void Password_Field_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Password_Field, "moveToAndClick","Password_Field");
 	}
	public void Password_Field_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Password_Field, "javaClick","Password_Field");
  	}
	public void Password_Field_CLICK(){
	    Element_Click(driver,logger,Password_Field, "click","Password_Field");
  
	}
	public String Password_Field_GETTEXT(){
	    return driver.findElement(Password_Field).getText();
	}
	public void Password_Field_SENDKEYS(String textToInput){
	    driver.findElement(Password_Field).clear();	    driver.findElement(Password_Field).sendKeys(textToInput);
	}

   // RememberMe_Checkbox
	public boolean RememberMe_Checkbox_DISPLAYED(){
	    return VerifyElement(driver,logger,RememberMe_Checkbox,"displayed","RememberMe_Checkbox");
	}
	public boolean RememberMe_Checkbox_ENABLED(){
	    return VerifyElement(driver,logger,RememberMe_Checkbox,"enabled","RememberMe_Checkbox");
	}
	public void RememberMe_Checkbox_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(RememberMe_Checkbox);
	    action.moveToElement(we).build().perform();
	}
	public void RememberMe_Checkbox_MOVETOANDCLICK(){
	    Element_Click(driver,logger,RememberMe_Checkbox, "moveToAndClick","RememberMe_Checkbox");
 	}
	public void RememberMe_Checkbox_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,RememberMe_Checkbox, "javaClick","RememberMe_Checkbox");
  	}
	public void RememberMe_Checkbox_CLICK(){
	    Element_Click(driver,logger,RememberMe_Checkbox, "click","RememberMe_Checkbox");
  
	}
	public String RememberMe_Checkbox_GETTEXT(){
	    return driver.findElement(RememberMe_Checkbox).getText();
	}
	public void RememberMe_Checkbox_SENDKEYS(String textToInput){
	    driver.findElement(RememberMe_Checkbox).clear();	    driver.findElement(RememberMe_Checkbox).sendKeys(textToInput);
	}

   // LogIn_Button
	public boolean LogIn_Button_DISPLAYED(){
	    return VerifyElement(driver,logger,LogIn_Button,"displayed","LogIn_Button");
	}
	public boolean LogIn_Button_ENABLED(){
	    return VerifyElement(driver,logger,LogIn_Button,"enabled","LogIn_Button");
	}
	public void LogIn_Button_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(LogIn_Button);
	    action.moveToElement(we).build().perform();
	}
	public void LogIn_Button_MOVETOANDCLICK(){
	    Element_Click(driver,logger,LogIn_Button, "moveToAndClick","LogIn_Button");
 	}
	public void LogIn_Button_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,LogIn_Button, "javaClick","LogIn_Button");
  	}
	public void LogIn_Button_CLICK(){
	    Element_Click(driver,logger,LogIn_Button, "click","LogIn_Button");
  
	}
	public String LogIn_Button_GETTEXT(){
	    return driver.findElement(LogIn_Button).getText();
	}
	public void LogIn_Button_SENDKEYS(String textToInput){
	    driver.findElement(LogIn_Button).clear();	    driver.findElement(LogIn_Button).sendKeys(textToInput);
	}

   // Create_an_Account
	public boolean Create_an_Account_DISPLAYED(){
	    return VerifyElement(driver,logger,Create_an_Account,"displayed","Create_an_Account");
	}
	public boolean Create_an_Account_ENABLED(){
	    return VerifyElement(driver,logger,Create_an_Account,"enabled","Create_an_Account");
	}
	public void Create_an_Account_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Create_an_Account);
	    action.moveToElement(we).build().perform();
	}
	public void Create_an_Account_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Create_an_Account, "moveToAndClick","Create_an_Account");
 	}
	public void Create_an_Account_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Create_an_Account, "javaClick","Create_an_Account");
  	}
	public void Create_an_Account_CLICK(){
	    Element_Click(driver,logger,Create_an_Account, "click","Create_an_Account");
  
	}
	public String Create_an_Account_GETTEXT(){
	    return driver.findElement(Create_an_Account).getText();
	}

   // UsernameSection
	public boolean UsernameSection_DISPLAYED(){
	    return VerifyElement(driver,logger,UsernameSection,"displayed","UsernameSection");
	}
	public boolean UsernameSection_ENABLED(){
	    return VerifyElement(driver,logger,UsernameSection,"enabled","UsernameSection");
	}
	public void UsernameSection_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(UsernameSection);
	    action.moveToElement(we).build().perform();
	}
	public void UsernameSection_MOVETOANDCLICK(){
	    Element_Click(driver,logger,UsernameSection, "moveToAndClick","UsernameSection");
 	}
	public void UsernameSection_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,UsernameSection, "javaClick","UsernameSection");
  	}
	public void UsernameSection_CLICK(){
	    Element_Click(driver,logger,UsernameSection, "click","UsernameSection");
  
	}
	public String UsernameSection_GETTEXT(){
	    return driver.findElement(UsernameSection).getText();
	}

   // Legal
	public boolean Legal_DISPLAYED(){
	    return VerifyElement(driver,logger,Legal,"displayed","Legal");
	}
	public boolean Legal_ENABLED(){
	    return VerifyElement(driver,logger,Legal,"enabled","Legal");
	}
	public void Legal_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Legal);
	    action.moveToElement(we).build().perform();
	}
	public void Legal_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Legal, "moveToAndClick","Legal");
 	}
	public void Legal_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Legal, "javaClick","Legal");
  	}
	public void Legal_CLICK(){
	    Element_Click(driver,logger,Legal, "click","Legal");
  
	}
	public String Legal_GETTEXT(){
	    return driver.findElement(Legal).getText();
	}

   // Privacy_Center
	public boolean Privacy_Center_DISPLAYED(){
	    return VerifyElement(driver,logger,Privacy_Center,"displayed","Privacy_Center");
	}
	public boolean Privacy_Center_ENABLED(){
	    return VerifyElement(driver,logger,Privacy_Center,"enabled","Privacy_Center");
	}
	public void Privacy_Center_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Privacy_Center);
	    action.moveToElement(we).build().perform();
	}
	public void Privacy_Center_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Privacy_Center, "moveToAndClick","Privacy_Center");
 	}
	public void Privacy_Center_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Privacy_Center, "javaClick","Privacy_Center");
  	}
	public void Privacy_Center_CLICK(){
	    Element_Click(driver,logger,Privacy_Center, "click","Privacy_Center");
  
	}
	public String Privacy_Center_GETTEXT(){
	    return driver.findElement(Privacy_Center).getText();
	}

}