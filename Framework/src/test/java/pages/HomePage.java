package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import utility.Helper;
import utility.SeleniumHelper;

public class HomePage extends SeleniumHelper{

	
	private WebDriver driver;
	private ExtentTest loggerpage;
	public WebDriverWait wait;
	
	public HomePage(WebDriver ldriver,ExtentTest Inlogger) 
	{
		this.driver = ldriver;
		this.loggerpage = Inlogger;
		Inlogger.info("Page Title: " + driver.getTitle());
		wait = new WebDriverWait(driver, 5);
		Helper.captureScreenshot(driver, "HomePage");
	}
	
	By unameDisplayed = By.xpath("//*[@id=\"top-header-menu\"]/div[3]/span[1]");
	By pword = By.name("password");
	By loginButton = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]");
	
	
	public void VerifyUserName(String userName) {
		VerifyTextEquals(driver, loggerpage,unameDisplayed,userName,"unameDisplayed");
		/*
		 * String unamer = Element_GetText(driver,
		 * loggerpage,unameDisplayed,"","unameDisplayed"); System.out.println(unamer);
		 * System.out.println(userName); Assert.assertEquals(unamer,
		 * userName,"Expected: "+ userName + "\r\nFound: " + unamer);
		 * System.out.println("Expected: "+ userName + "\r\nFound: " + unamer);
		 * loggerpage.pass("Expected: "+ userName + "\r\nFound: " + unamer);
		 */
	}
}
