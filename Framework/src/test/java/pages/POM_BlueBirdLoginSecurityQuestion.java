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

public class POM_BlueBirdLoginSecurityQuestion extends SeleniumHelper{

   //Variables
	public WebDriver driver;
	private ExtentTest logger;
	private Actions action;
	public WebDriverWait wait;
	private JavascriptExecutor executor;
	public String PAGE_Title = "Log In | Bluebird from American Express";
	public String PAGE_URL = "https://secure.bluebird.com/User/Login/Verify";

   //Constructor
	public POM_BlueBirdLoginSecurityQuestion(WebDriver driver, ExtentTest Inlogger){
		this.driver = driver;
		this.logger = Inlogger;
		logger.info("Page Title: " +driver.getTitle());
		wait = new WebDriverWait(driver, 5);
	}

   //Locators
	By SecurityAnswer_Field = By.xpath("//input[@type='password']");
	By RememberMe_CheckBox = By.xpath("//input[@id='RememberMe']");
	By Reset_my_security_Q_A_link = By.xpath("//*[@class='t-body-med']/a[1]");
	By Continue_Button = By.xpath("//input[@class='btn-primary']");
	By Security_QA_text = By.xpath("//h1[contains(text(),'Security QA')]");
	By Question_text = By.xpath("//header[contains(text(),'Question')]");

   //Methods

   // SecurityAnswer_Field
	public boolean SecurityAnswer_Field_DISPLAYED(){
	    return VerifyElement(driver,logger,SecurityAnswer_Field,"displayed","SecurityAnswer_Field");
	}
	public boolean SecurityAnswer_Field_ENABLED(){
	    return VerifyElement(driver,logger,SecurityAnswer_Field,"enabled","SecurityAnswer_Field");
	}
	public void SecurityAnswer_Field_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(SecurityAnswer_Field);
	    action.moveToElement(we).build().perform();
	}
	public void SecurityAnswer_Field_MOVETOANDCLICK(){
	    Element_Click(driver,logger,SecurityAnswer_Field, "moveToAndClick","SecurityAnswer_Field");
 	}
	public void SecurityAnswer_Field_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,SecurityAnswer_Field, "javaClick","SecurityAnswer_Field");
  	}
	public void SecurityAnswer_Field_CLICK(){
	    Element_Click(driver,logger,SecurityAnswer_Field, "click","SecurityAnswer_Field");
  
	}
	public String SecurityAnswer_Field_GETTEXT(){
	    return driver.findElement(SecurityAnswer_Field).getText();
	}
	public void SecurityAnswer_Field_SENDKEYS(String textToInput){
	    driver.findElement(SecurityAnswer_Field).clear();	    driver.findElement(SecurityAnswer_Field).sendKeys(textToInput);
	}

   // RememberMe_CheckBox
	public boolean RememberMe_CheckBox_DISPLAYED(){
	    return VerifyElement(driver,logger,RememberMe_CheckBox,"displayed","RememberMe_CheckBox");
	}
	public boolean RememberMe_CheckBox_ENABLED(){
	    return VerifyElement(driver,logger,RememberMe_CheckBox,"enabled","RememberMe_CheckBox");
	}
	public void RememberMe_CheckBox_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(RememberMe_CheckBox);
	    action.moveToElement(we).build().perform();
	}
	public void RememberMe_CheckBox_MOVETOANDCLICK(){
	    Element_Click(driver,logger,RememberMe_CheckBox, "moveToAndClick","RememberMe_CheckBox");
 	}
	public void RememberMe_CheckBox_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,RememberMe_CheckBox, "javaClick","RememberMe_CheckBox");
  	}
	public void RememberMe_CheckBox_CLICK(){
	    Element_Click(driver,logger,RememberMe_CheckBox, "click","RememberMe_CheckBox");
  
	}
	public String RememberMe_CheckBox_GETTEXT(){
	    return driver.findElement(RememberMe_CheckBox).getText();
	}
	public void RememberMe_CheckBox_SENDKEYS(String textToInput){
	    driver.findElement(RememberMe_CheckBox).clear();	    driver.findElement(RememberMe_CheckBox).sendKeys(textToInput);
	}

   // Reset_my_security_Q_A_link
	public boolean Reset_my_security_Q_A_link_DISPLAYED(){
	    return VerifyElement(driver,logger,Reset_my_security_Q_A_link,"displayed","Reset_my_security_Q_A_link");
	}
	public boolean Reset_my_security_Q_A_link_ENABLED(){
	    return VerifyElement(driver,logger,Reset_my_security_Q_A_link,"enabled","Reset_my_security_Q_A_link");
	}
	public void Reset_my_security_Q_A_link_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Reset_my_security_Q_A_link);
	    action.moveToElement(we).build().perform();
	}
	public void Reset_my_security_Q_A_link_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Reset_my_security_Q_A_link, "moveToAndClick","Reset_my_security_Q_A_link");
 	}
	public void Reset_my_security_Q_A_link_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Reset_my_security_Q_A_link, "javaClick","Reset_my_security_Q_A_link");
  	}
	public void Reset_my_security_Q_A_link_CLICK(){
	    Element_Click(driver,logger,Reset_my_security_Q_A_link, "click","Reset_my_security_Q_A_link");
  
	}
	public String Reset_my_security_Q_A_link_GETTEXT(){
	    return driver.findElement(Reset_my_security_Q_A_link).getText();
	}

   // Continue_Button
	public boolean Continue_Button_DISPLAYED(){
	    return VerifyElement(driver,logger,Continue_Button,"displayed","Continue_Button");
	}
	public boolean Continue_Button_ENABLED(){
	    return VerifyElement(driver,logger,Continue_Button,"enabled","Continue_Button");
	}
	public void Continue_Button_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Continue_Button);
	    action.moveToElement(we).build().perform();
	}
	public void Continue_Button_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Continue_Button, "moveToAndClick","Continue_Button");
 	}
	public void Continue_Button_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Continue_Button, "javaClick","Continue_Button");
  	}
	public void Continue_Button_CLICK(){
	    Element_Click(driver,logger,Continue_Button, "click","Continue_Button");
  
	}
	public String Continue_Button_GETTEXT(){
	    return driver.findElement(Continue_Button).getText();
	}
	public void Continue_Button_SENDKEYS(String textToInput){
	    driver.findElement(Continue_Button).clear();	    driver.findElement(Continue_Button).sendKeys(textToInput);
	}

   // Security_QA_text
	public boolean Security_QA_text_DISPLAYED(){
	    return VerifyElement(driver,logger,Security_QA_text,"displayed","Security_QA_text");
	}
	public boolean Security_QA_text_ENABLED(){
	    return VerifyElement(driver,logger,Security_QA_text,"enabled","Security_QA_text");
	}
	public void Security_QA_text_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Security_QA_text);
	    action.moveToElement(we).build().perform();
	}
	public void Security_QA_text_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Security_QA_text, "moveToAndClick","Security_QA_text");
 	}
	public void Security_QA_text_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Security_QA_text, "javaClick","Security_QA_text");
  	}
	public void Security_QA_text_CLICK(){
	    Element_Click(driver,logger,Security_QA_text, "click","Security_QA_text");
  
	}
	public String Security_QA_text_GETTEXT(){
	    return driver.findElement(Security_QA_text).getText();
	}

   // Question_text
	public boolean Question_text_DISPLAYED(){
	    return VerifyElement(driver,logger,Question_text,"displayed","Question_text");
	}
	public boolean Question_text_ENABLED(){
	    return VerifyElement(driver,logger,Question_text,"enabled","Question_text");
	}
	public void Question_text_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Question_text);
	    action.moveToElement(we).build().perform();
	}
	public void Question_text_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Question_text, "moveToAndClick","Question_text");
 	}
	public void Question_text_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Question_text, "javaClick","Question_text");
  	}
	public void Question_text_CLICK(){
	    Element_Click(driver,logger,Question_text, "click","Question_text");
  
	}
	public String Question_text_GETTEXT(){
	    return driver.findElement(Question_text).getText();
	}

}