package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage {
	
	WebDriver driver;
	
	public IndexPage(WebDriver ldriver) 
	{
		this.driver = ldriver;
	}

	@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a") WebElement loginButton;
	
	public void LoginButtonClick() {
	
		loginButton.click();
	}

}
