package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

	
	WebDriver driver;
	
	public HomePage(WebDriver ldriver) 
	{
		this.driver = ldriver;
	}
	@FindBy(name="email") WebElement uname;
	@FindBy(name="password") WebElement pword;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]") WebElement UserNameDisplayed;
	
	public void VerifyUserName(String userName) {
		String unameDisplayed = UserNameDisplayed.getText();
		Assert.assertEquals(unameDisplayed, userName);
		System.out.println("Expected: "+ userName + "\r\nFound: " + unameDisplayed);
	}
}
