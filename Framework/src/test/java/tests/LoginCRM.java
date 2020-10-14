package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.HomePage;
import pages.IndexPage;
import pages.LoginPage;
import utility.Helper;


public class LoginCRM extends BaseClass{
		
	@Test()
	public void loginApp() {
		//String pngpath = "";
		logger = report.createTest("Login to CRM");
		Reporter.log("Login to CRM",true);
		// Navigating To
		driver.get(configdata.getStagingUrl());
		
		IndexPage indexpage = PageFactory.initElements(driver, IndexPage.class);
		Helper.captureScreenshot(driver,"IndexPage");
		indexpage.LoginButtonClick();
		
		logger.info("On Login Page");
		Reporter.log("On Login Page",true);
		
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
		Reporter.log("On Home Page",true);
		
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		Helper.captureScreenshot(driver, "HomePage");
		homepage.VerifyUserName("Mark Zilch");
		
		logger.pass("Login Success");
		Reporter.log("Login Success",true);
	}


}
