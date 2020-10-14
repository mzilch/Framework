package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import utility.BrowserFactory;
import pages.BaseClass;
import pages.POM_BlueBirdHomePage;
import pages.POM_BlueBirdLoginPage;

public class ValidateBBPages_TEST_TestNG_Chrome extends BaseClass {

	// WebDriver driver;
	Actions action;
	// String driverPath = "C:\\Users\\HPPro600SFFW7P64\\Desktop\\XPath
	// Assistant\\Selenium WebDrivers\\ChromeDriver Versions\\ChromeDriver_85";
	POM_BlueBirdLoginPage Local_POM_BlueBirdLoginPage;
	POM_BlueBirdHomePage Local_POM_BlueBirdHomePage;

	@Test()
	public void ValidateBBPages() throws InterruptedException {
		logger = report.createTest("ValidateBBPages");
		System.out.println("--- Started Test");
		logger.info("Launching Browser");
		
		// Navigating To
		driver.get("https://secure.bluebird.com/login?intlink=us-bluebird-marketing-home-prospectslp-incomm2018-header-login");

		// New Page
		Local_POM_BlueBirdLoginPage = new POM_BlueBirdLoginPage(driver,logger);
		Local_POM_BlueBirdLoginPage.UserName_SENDKEYS("mzilchwbb");
		Local_POM_BlueBirdLoginPage.Password_Field_SENDKEYS("mzBBilch2019");
		Local_POM_BlueBirdLoginPage.RememberMe_Checkbox_DISPLAYED();
		Local_POM_BlueBirdLoginPage.Create_an_Account_DISPLAYED();
		Local_POM_BlueBirdLoginPage.UsernameSection_DISPLAYED();
		Local_POM_BlueBirdLoginPage.Legal_DISPLAYED();
		Local_POM_BlueBirdLoginPage.Privacy_Center_DISPLAYED();
		Local_POM_BlueBirdLoginPage.LogIn_Button_MOVETOANDCLICK();

		// New Page
		Local_POM_BlueBirdHomePage = new POM_BlueBirdHomePage(driver,logger);		
		Local_POM_BlueBirdHomePage.View_Transactions_DISPLAYED();
		Local_POM_BlueBirdHomePage.Plan_Manage_DISPLAYED();
		Local_POM_BlueBirdHomePage.Pay_Transfer_MOUSEOVER();
		Local_POM_BlueBirdHomePage.Add_Funds_CLICK();

		// Browser Navigation
		logger.info("Page Title: " +driver.getTitle());
		driver.navigate().back();
		logger.info("Browser Navigation - BACK");
		logger.info("Page Title: " +driver.getTitle());

		Local_POM_BlueBirdHomePage.Pay_Transfer_MOUSEOVER();
		Local_POM_BlueBirdHomePage.Direct_Deposit_CLICK();

		// Browser Navigation
		logger.info("Page Title: " +driver.getTitle());
		driver.navigate().back();
		logger.info("Browser Navigation - BACK");
		logger.info("Page Title: " +driver.getTitle());

		Local_POM_BlueBirdHomePage.Pay_Transfer_MOUSEOVER();
		Local_POM_BlueBirdHomePage.Pay_a_Bill_CLICK();

		// Browser Navigation
		logger.info("Page Title: " +driver.getTitle());
		driver.navigate().back();
		logger.info("Browser Navigation - BACK");
		logger.info("Page Title: " +driver.getTitle());

		Local_POM_BlueBirdHomePage.Pay_Transfer_MOUSEOVER();
		Local_POM_BlueBirdHomePage.Write_a_Check_DISPLAYED();

		logger.pass("End of Test Steps");
	}

	/*
	 * @BeforeMethod public void beforeMethod() { logger =
	 * report.createTest("ValidateBBPages"); driver =
	 * BrowserFactory.startApplication(driver, "Chrome",
	 * "https://secure.bluebird.com/login?intlink=us-bluebird-marketing-home-prospectslp-incomm2018-header-login"
	 * );
	 * 
	 * System.out.println("--- Launching Chrome browser");
	 * System.setProperty("webdriver.chrome.driver",driverPath +
	 * "\\chromedriver.exe"); driver = new ChromeDriver();
	 * 
	 * // Manage browser and timeouts driver.manage().window().maximize();
	 * driver.manage().deleteAllCookies();
	 * driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * 
	 * }
	 */

	/*
	 * @AfterMethod public void afterMethod() { BrowserFactory.quitBrowser(driver);
	 * System.out.println("--- Finished Test"); }
	 */
}
