package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) 
	{
		this.driver = ldriver;
	}
	@FindBy(name="email") WebElement uname;
	@FindBy(name="password") WebElement pword;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]") WebElement loginButton;
	
	public void LoginToCRM(String userName, String passWord) {
		uname.sendKeys(userName);
		pword.sendKeys(passWord);
		loginButton.click();
	}

}
