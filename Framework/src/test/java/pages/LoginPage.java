package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import utility.Helper;
import utility.SeleniumHelper;

public class LoginPage extends SeleniumHelper{
	
	private WebDriver driver;
	private ExtentTest logger;
	public WebDriverWait wait;
	
	public LoginPage(WebDriver ldriver,ExtentTest Inlogger) 
	{
		this.driver = ldriver;
		this.logger = Inlogger;
		logger.info("Page Title: " + driver.getTitle());
		wait = new WebDriverWait(driver, 5);
		Helper.captureScreenshot(driver, "LoginPage");
	}
	By uname = By.name("email");
	By pword = By.name("password");
	By loginButton = By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]");
	
	public void LoginToCRM(String userName, String passWord) {
		EnterText(driver,logger,uname,"text",userName);
		EnterText(driver,logger,pword,"text",passWord);
		Element_Click(driver,logger,loginButton, "moveToAndClick","loginButton");

	}

}
