package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.HomePage;
import pages.IndexPage;
import pages.LoginPage;
import utility.Helper;


public class LoginCRM2 extends BaseClass{
		
	@Test(priority=1)
	public void loginApp() {
		//String pngpath = "";
		logger = report.createTest("Login to CRM");
		
		
		IndexPage indexpage = PageFactory.initElements(driver, IndexPage.class);
		Helper.captureScreenshot(driver,"IndexPage");
		indexpage.LoginButtonClick();
		
		logger.info("On Login Page");
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		Helper.captureScreenshot(driver, "LoginPage");
		loginpage.LoginToCRM(configdata.getUser(), configdata.getPword());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("On Home Page");
		
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		Helper.captureScreenshot(driver, "HomePage");
		homepage.VerifyUserName("Mark Zilch");
		
		logger.pass("Login Success");
	}


}
