package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import utility.Helper;
import utility.SeleniumHelper;

public class IndexPage extends SeleniumHelper{
	
	private WebDriver driver;
	private ExtentTest logger;
	public WebDriverWait wait;
	
	public IndexPage(WebDriver ldriver,ExtentTest Inlogger) 
	{
		this.driver = ldriver;
		this.logger = Inlogger;
		logger.info("Page Title: " + driver.getTitle());
		wait = new WebDriverWait(driver, 5);
		Helper.captureScreenshot(driver, "IndexPage");
	}
	
	By loginButton = By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a");
	
	public void LoginButtonClick() {
		Element_Click(driver,logger,loginButton, "moveToAndClick","loginButton");		
	}

}
