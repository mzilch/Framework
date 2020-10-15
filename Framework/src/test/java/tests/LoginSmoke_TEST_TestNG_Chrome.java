package tests;

import org.testng.annotations.Test;
//import org.testng.annotations.AfterMethod; New maven style DELETE
//import org.testng.annotations.BeforeMethod; New maven style DELETE
import org.testng.Assert;
// import java.util.concurrent.TimeUnit;  New maven style DELETE
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;  New maven style DELETE
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import pages.POM_BlueBirdLoginPage;// New maven style >>> pages.
import utility.Helper;
import pages.BaseClass;// New maven style >>> pages. + Reference
import pages.POM_BlueBirdHomePage;// New maven style >>> pages.


public class LoginSmoke_TEST_TestNG_Chrome extends BaseClass{

	//WebDriver driver; New maven style DELETE
	Actions action;
	// New maven style DELETE >>> String driverPath = "C:\\Users\\HPPro600SFFW7P64\\Desktop\\XPath Assistant\\Selenium WebDrivers\\ChromeDriver Versions\\ChromeDriver_85";
	POM_BlueBirdLoginPage Local_POM_BlueBirdLoginPage;
	POM_BlueBirdHomePage Local_POM_BlueBirdHomePage;

	@Test()
	public void LoginSmoke(){ //New maven style DELETE throws Interuption
		logger = report.createTest("LoginSmoke");// New maven style ADD
		logger.info("--- Started Test");
    	logger.info("Launching Browser for LoginSmoke test");

    	//Navigating To
    	driver.get("https://secure.bluebird.com/login?intlink=us-bluebird-marketing-home-prospectslp-incomm2018-header-login");
    	logger.info("Just navigated to start url");
    	// New Page
    	Local_POM_BlueBirdLoginPage = new POM_BlueBirdLoginPage(driver,logger);// New maven style ADD ,logger
    	Local_POM_BlueBirdLoginPage.UserName_SENDKEYS("mzilchwbb");
    	Local_POM_BlueBirdLoginPage.Password_Field_SENDKEYS("mzBBilch2019");
    	Local_POM_BlueBirdLoginPage.LogIn_Button_MOVETOANDCLICK();
    	
    	logger.info("Just click to get to  POM_BlueBirdHomePage");
    	// New Page
    	Local_POM_BlueBirdHomePage = new POM_BlueBirdHomePage(driver,logger);// New maven style ADD ,logger
    	Local_POM_BlueBirdHomePage.Pay_Transfer_MOUSEOVER();
    	Helper.captureScreenshot(driver, "Local_POM_BlueBirdHomePage.Pay_Transfer_MOUSEOVER");
    	
    	if(Local_POM_BlueBirdHomePage.Add_Funds_GETTEXT().equals("Add Funds"))
    	{
	    	String capturedText_0 = Local_POM_BlueBirdHomePage.Direct_Deposit_GETTEXT();
	    	Assert.assertEquals(capturedText_0, "Direct Deposit", "capturedText_0 - Failed");
	    	logger.info("This text was Verified -> \"" + capturedText_0 + "\"");

    	}
    	else if(Local_POM_BlueBirdHomePage.Pay_a_Bill_GETTEXT().equals("Pay a Bill"))
    	{
	    	String capturedText_1 = Local_POM_BlueBirdHomePage.Write_a_Check_GETTEXT();
	    	Assert.assertEquals(capturedText_1, "Write a Check", "capturedText_1 - Failed");
	    	logger.info("This text was Verified -> \"" + capturedText_1 + "\"");

	    	String capturedText_2 = Local_POM_BlueBirdHomePage.Money_Transfer_GETTEXT();
	    	Assert.assertEquals(capturedText_2, "Money Transfer", "capturedText_2 - Failed");
	    	logger.info("This text was Verified -> \"" + capturedText_2 + "\"");

    	}
    	else
    	{
	    	String capturedText_3 = Local_POM_BlueBirdHomePage.Withdraw_Funds_GETTEXT();
	    	Assert.assertEquals(capturedText_3, "Withdraw Funds", "capturedText_3 - Failed");
	    	logger.info("This text was Verified -> \"" + capturedText_3 + "\"");

	    	String capturedText_4 = Local_POM_BlueBirdHomePage.Send_Money_GETTEXT();
	    	Assert.assertEquals(capturedText_4, "Send Money", "capturedText_4 - Failed");
	    	logger.info("This text was Verified -> \"" + capturedText_4 + "\"");

	    	String capturedText_5 = Local_POM_BlueBirdHomePage.Request_Money_GETTEXT();
	    	Assert.assertEquals(capturedText_5, "Request Money", "capturedText_5 - Failed");
	    	logger.info("This text was Verified -> \"" + capturedText_5 + "\"");

    	}
    	logger.pass("End of Test Steps for LoginSmoke test");
	}

}
