package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.HomePage;
import pages.IndexPage;
import pages.LoginPage;
import utility.Helper;


public class LoginCRM extends BaseClass{
	
	Actions action;
	JavascriptExecutor executor;
	HomePage Local_HomePage;
	IndexPage Local_IndexPage;
	LoginPage Local_LoginPage;
	
	//@Parameters("urlToBeTested")
	@Test() //(groups={"smokeTest","functionalTest"})
	public void loginApp() {
		
		logger = report.createTest("Login to CRM");
		Reporter.log("Reporter - Login to CRM",true);
		// Navigating To
		//driver.get(urlToBeTested);
		driver.get(configdata.getStagingUrl());		
		
		Local_IndexPage =  new IndexPage(driver,logger);
		//IndexPage indexpage = PageFactory.initElements(driver, IndexPage.class);
		
		Local_IndexPage.LoginButtonClick();
		
		logger.info("On Login Page");
		Reporter.log("Reporter - On Login Page",true);
		
		Local_LoginPage =  new LoginPage(driver,logger);
		//LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		Local_LoginPage.LoginToCRM(configdata.getUser(), configdata.getPword());
		
		logger.info("On Home Page");
		Reporter.log("Reporter - On Home Page",true);
		
		Local_HomePage =  new HomePage(driver,logger);
		//HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		
		Local_HomePage.VerifyUserName("Mark Zilch");
		
		logger.pass("Login Success");
		Reporter.log("Reporter - Login Success",true);
	}


}
