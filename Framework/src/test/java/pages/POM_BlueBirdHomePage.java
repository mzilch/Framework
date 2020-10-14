package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import utility.SeleniumHelper;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;

public class POM_BlueBirdHomePage extends SeleniumHelper{

   //Variables
	public WebDriver driver;
	private ExtentTest logger;
	private Actions action;
	public WebDriverWait wait;
	private JavascriptExecutor executor;
	public String PAGE_Title = "Home | Bluebird from American Express";
	public String PAGE_URL = "https://secure.bluebird.com/Account/Dashboard?omnlogin=US_Login_Bluebird";

   //Constructor
	public POM_BlueBirdHomePage(WebDriver driver, ExtentTest Inlogger){
		this.driver = driver;
		this.logger = Inlogger;
		logger.info("Page Title: " +driver.getTitle());
		wait = new WebDriverWait(driver, 5);
	}

   //Locators
	By Pay_Transfer = By.xpath("//a[text()[contains(.,'Pay & Transfer')]]");
	By Plan_Manage = By.xpath("//*[contains(text(),'Plan & Manage')]");
	By View_Transactions = By.xpath("//*[contains(text(),'View Transactions')]");
	By Add_Funds = By.xpath("//a[@href='/Funds/AddMoney?intlink=US-Bluebird-Secure-MyAcct-Dashboard-Addfunds']");
	By Direct_Deposit = By.xpath("//a[@class='directdeposit-href']");
	By Pay_a_Bill = By.xpath("//a[@href='/Funds/BillPaySummary']");
	By Write_a_Check = By.xpath("//a[@href='/Funds/PreAuthCheck']");
	By Money_Transfer = By.xpath("//a[@href='/Funds/RiaTransferFunds']");
	By Withdraw_Funds = By.xpath("//a[@href='/Funds/WithdrawFunds']");
	By Send_Money = By.xpath("//a[@href='/Funds/SendMoney?intlink=US-Bluebird-Secure-MyAcct-Dashboard-SendMoney']");
	By Request_Money = By.xpath("//*[contains(text(),'Request Money')]");
	By Family_Accounts = By.xpath("//*[contains(text(),'Family Accounts')]");
	By SetAsideSM_Account = By.xpath("//a[@href='/Manage/SegAccount']");
	By Insights = By.xpath("//a[@href='/Manage/Pfm']");
	By Amex_Offers = By.xpath("//a[@href='/Manage/MyOffers']");
	By Freeze_Card = By.xpath("//a[@href='/Manage/CardFreeze']");
	By Settings = By.xpath("//a[@class='item-icon settings']");
	By Logout = By.xpath("//a[@class='item-icon logout']");
	By AvailableBalanceAmt = By.xpath("//div[@id='availableBalanceAmount']");
	By _Add_Funds = By.xpath("//a[@tabindex='2']");
	By About_Bluebird = By.xpath("//a[@href='https://www.bluebird.com/about']");
	By Privacy_Center = By.xpath("//a[@href='https://www.americanexpress.com/privacycenter']");
	By Contact_Us = By.xpath("//a[@href='/Layout/ContactUs']");
	By FAQs = By.xpath("//a[@href='https://www.bluebird.com/faqs']");
	By Refer_a_Friend = By.xpath("//a[@href='/Manage/ReferAFriend']");
	By Lost_or_Stolen_Card = By.xpath("//a[@href='/Manage/CardReplacement']");
	By Terms_of_Service = By.xpath("//a[@href='https://www.bluebird.com/terms-service']");
	By Privacy_Statement = By.xpath("//a[@href='https://www.americanexpress.com/us/content/legal-disclosures/online-privacy-statement.html']");
	By Security_Center = By.xpath("//a[@href='https://www.Bluebird.com/fraud-protection']");
	By Click_here_Legal_moneyservicesbusinessdisclosures = By.xpath("//a[@href='https://www.bluebird.com/legal#money-services-business-disclosures']");
	By Click_here_legal_FDIC = By.xpath("//a[@href='https://www.bluebird.com/legal#fdic']");

   //Methods

   // Pay_Transfer
	public boolean Pay_Transfer_DISPLAYED(){
	    return VerifyElement(driver,logger,Pay_Transfer,"displayed","Pay_Transfer");
	}
	public boolean Pay_Transfer_ENABLED(){
	    return VerifyElement(driver,logger,Pay_Transfer,"enabled","Pay_Transfer");
	}
	public void Pay_Transfer_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Pay_Transfer);
	    action.moveToElement(we).build().perform();
	}
	public void Pay_Transfer_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Pay_Transfer, "moveToAndClick","Pay_Transfer");
 	}
	public void Pay_Transfer_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Pay_Transfer, "javaClick","Pay_Transfer");
  	}
	public void Pay_Transfer_CLICK(){
	    Element_Click(driver,logger,Pay_Transfer, "click","Pay_Transfer");
  
	}
	public String Pay_Transfer_GETTEXT(){
	    return driver.findElement(Pay_Transfer).getText();
	}

   // Plan_Manage
	public boolean Plan_Manage_DISPLAYED(){
	    return VerifyElement(driver,logger,Plan_Manage,"displayed","Plan_Manage");
	}
	public boolean Plan_Manage_ENABLED(){
	    return VerifyElement(driver,logger,Plan_Manage,"enabled","Plan_Manage");
	}
	public void Plan_Manage_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Plan_Manage);
	    action.moveToElement(we).build().perform();
	}
	public void Plan_Manage_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Plan_Manage, "moveToAndClick","Plan_Manage");
 	}
	public void Plan_Manage_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Plan_Manage, "javaClick","Plan_Manage");
  	}
	public void Plan_Manage_CLICK(){
	    Element_Click(driver,logger,Plan_Manage, "click","Plan_Manage");
  
	}
	public String Plan_Manage_GETTEXT(){
	    return driver.findElement(Plan_Manage).getText();
	}

   // View_Transactions
	public boolean View_Transactions_DISPLAYED(){
	    return VerifyElement(driver,logger,View_Transactions,"displayed","View_Transactions");
	}
	public boolean View_Transactions_ENABLED(){
	    return VerifyElement(driver,logger,View_Transactions,"enabled","View_Transactions");
	}
	public void View_Transactions_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(View_Transactions);
	    action.moveToElement(we).build().perform();
	}
	public void View_Transactions_MOVETOANDCLICK(){
	    Element_Click(driver,logger,View_Transactions, "moveToAndClick","View_Transactions");
 	}
	public void View_Transactions_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,View_Transactions, "javaClick","View_Transactions");
  	}
	public void View_Transactions_CLICK(){
	    Element_Click(driver,logger,View_Transactions, "click","View_Transactions");
  
	}
	public String View_Transactions_GETTEXT(){
	    return driver.findElement(View_Transactions).getText();
	}

   // Add_Funds
	public boolean Add_Funds_DISPLAYED(){
	    return VerifyElement(driver,logger,Add_Funds,"displayed","Add_Funds");
	}
	public boolean Add_Funds_ENABLED(){
	    return VerifyElement(driver,logger,Add_Funds,"enabled","Add_Funds");
	}
	public void Add_Funds_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Add_Funds);
	    action.moveToElement(we).build().perform();
	}
	public void Add_Funds_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Add_Funds, "moveToAndClick","Add_Funds");
 	}
	public void Add_Funds_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Add_Funds, "javaClick","Add_Funds");
  	}
	public void Add_Funds_CLICK(){
	    Element_Click(driver,logger,Add_Funds, "click","Add_Funds");
  
	}
	public String Add_Funds_GETTEXT(){
	    return driver.findElement(Add_Funds).getText();
	}

   // Direct_Deposit
	public boolean Direct_Deposit_DISPLAYED(){
	    return VerifyElement(driver,logger,Direct_Deposit,"displayed","Direct_Deposit");
	}
	public boolean Direct_Deposit_ENABLED(){
	    return VerifyElement(driver,logger,Direct_Deposit,"enabled","Direct_Deposit");
	}
	public void Direct_Deposit_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Direct_Deposit);
	    action.moveToElement(we).build().perform();
	}
	public void Direct_Deposit_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Direct_Deposit, "moveToAndClick","Direct_Deposit");
 	}
	public void Direct_Deposit_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Direct_Deposit, "javaClick","Direct_Deposit");
  	}
	public void Direct_Deposit_CLICK(){
	    Element_Click(driver,logger,Direct_Deposit, "click","Direct_Deposit");
  
	}
	public String Direct_Deposit_GETTEXT(){
	    return driver.findElement(Direct_Deposit).getText();
	}

   // Pay_a_Bill
	public boolean Pay_a_Bill_DISPLAYED(){
	    return VerifyElement(driver,logger,Pay_a_Bill,"displayed","Pay_a_Bill");
	}
	public boolean Pay_a_Bill_ENABLED(){
	    return VerifyElement(driver,logger,Pay_a_Bill,"enabled","Pay_a_Bill");
	}
	public void Pay_a_Bill_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Pay_a_Bill);
	    action.moveToElement(we).build().perform();
	}
	public void Pay_a_Bill_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Pay_a_Bill, "moveToAndClick","Pay_a_Bill");
 	}
	public void Pay_a_Bill_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Pay_a_Bill, "javaClick","Pay_a_Bill");
  	}
	public void Pay_a_Bill_CLICK(){
	    Element_Click(driver,logger,Pay_a_Bill, "click","Pay_a_Bill");
  
	}
	public String Pay_a_Bill_GETTEXT(){
	    return driver.findElement(Pay_a_Bill).getText();
	}

   // Write_a_Check
	public boolean Write_a_Check_DISPLAYED(){
	    return VerifyElement(driver,logger,Write_a_Check,"displayed","Write_a_Check");
	}
	public boolean Write_a_Check_ENABLED(){
	    return VerifyElement(driver,logger,Write_a_Check,"enabled","Write_a_Check");
	}
	public void Write_a_Check_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Write_a_Check);
	    action.moveToElement(we).build().perform();
	}
	public void Write_a_Check_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Write_a_Check, "moveToAndClick","Write_a_Check");
 	}
	public void Write_a_Check_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Write_a_Check, "javaClick","Write_a_Check");
  	}
	public void Write_a_Check_CLICK(){
	    Element_Click(driver,logger,Write_a_Check, "click","Write_a_Check");
  
	}
	public String Write_a_Check_GETTEXT(){
	    return driver.findElement(Write_a_Check).getText();
	}

   // Money_Transfer
	public boolean Money_Transfer_DISPLAYED(){
	    return VerifyElement(driver,logger,Money_Transfer,"displayed","Money_Transfer");
	}
	public boolean Money_Transfer_ENABLED(){
	    return VerifyElement(driver,logger,Money_Transfer,"enabled","Money_Transfer");
	}
	public void Money_Transfer_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Money_Transfer);
	    action.moveToElement(we).build().perform();
	}
	public void Money_Transfer_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Money_Transfer, "moveToAndClick","Money_Transfer");
 	}
	public void Money_Transfer_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Money_Transfer, "javaClick","Money_Transfer");
  	}
	public void Money_Transfer_CLICK(){
	    Element_Click(driver,logger,Money_Transfer, "click","Money_Transfer");
  
	}
	public String Money_Transfer_GETTEXT(){
	    return driver.findElement(Money_Transfer).getText();
	}

   // Withdraw_Funds
	public boolean Withdraw_Funds_DISPLAYED(){
	    return VerifyElement(driver,logger,Withdraw_Funds,"displayed","Withdraw_Funds");
	}
	public boolean Withdraw_Funds_ENABLED(){
	    return VerifyElement(driver,logger,Withdraw_Funds,"enabled","Withdraw_Funds");
	}
	public void Withdraw_Funds_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Withdraw_Funds);
	    action.moveToElement(we).build().perform();
	}
	public void Withdraw_Funds_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Withdraw_Funds, "moveToAndClick","Withdraw_Funds");
 	}
	public void Withdraw_Funds_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Withdraw_Funds, "javaClick","Withdraw_Funds");
  	}
	public void Withdraw_Funds_CLICK(){
	    Element_Click(driver,logger,Withdraw_Funds, "click","Withdraw_Funds");
  
	}
	public String Withdraw_Funds_GETTEXT(){
	    return driver.findElement(Withdraw_Funds).getText();
	}

   // Send_Money
	public boolean Send_Money_DISPLAYED(){
	    return VerifyElement(driver,logger,Send_Money,"displayed","Send_Money");
	}
	public boolean Send_Money_ENABLED(){
	    return VerifyElement(driver,logger,Send_Money,"enabled","Send_Money");
	}
	public void Send_Money_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Send_Money);
	    action.moveToElement(we).build().perform();
	}
	public void Send_Money_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Send_Money, "moveToAndClick","Send_Money");
 	}
	public void Send_Money_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Send_Money, "javaClick","Send_Money");
  	}
	public void Send_Money_CLICK(){
	    Element_Click(driver,logger,Send_Money, "click","Send_Money");
  
	}
	public String Send_Money_GETTEXT(){
	    return driver.findElement(Send_Money).getText();
	}

   // Request_Money
	public boolean Request_Money_DISPLAYED(){
	    return VerifyElement(driver,logger,Request_Money,"displayed","Request_Money");
	}
	public boolean Request_Money_ENABLED(){
	    return VerifyElement(driver,logger,Request_Money,"enabled","Request_Money");
	}
	public void Request_Money_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Request_Money);
	    action.moveToElement(we).build().perform();
	}
	public void Request_Money_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Request_Money, "moveToAndClick","Request_Money");
 	}
	public void Request_Money_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Request_Money, "javaClick","Request_Money");
  	}
	public void Request_Money_CLICK(){
	    Element_Click(driver,logger,Request_Money, "click","Request_Money");
  
	}
	public String Request_Money_GETTEXT(){
	    return driver.findElement(Request_Money).getText();
	}

   // Family_Accounts
	public boolean Family_Accounts_DISPLAYED(){
	    return VerifyElement(driver,logger,Family_Accounts,"displayed","Family_Accounts");
	}
	public boolean Family_Accounts_ENABLED(){
	    return VerifyElement(driver,logger,Family_Accounts,"enabled","Family_Accounts");
	}
	public void Family_Accounts_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Family_Accounts);
	    action.moveToElement(we).build().perform();
	}
	public void Family_Accounts_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Family_Accounts, "moveToAndClick","Family_Accounts");
 	}
	public void Family_Accounts_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Family_Accounts, "javaClick","Family_Accounts");
  	}
	public void Family_Accounts_CLICK(){
	    Element_Click(driver,logger,Family_Accounts, "click","Family_Accounts");
  
	}
	public String Family_Accounts_GETTEXT(){
	    return driver.findElement(Family_Accounts).getText();
	}

   // SetAsideSM_Account
	public boolean SetAsideSM_Account_DISPLAYED(){
	    return VerifyElement(driver,logger,SetAsideSM_Account,"displayed","SetAsideSM_Account");
	}
	public boolean SetAsideSM_Account_ENABLED(){
	    return VerifyElement(driver,logger,SetAsideSM_Account,"enabled","SetAsideSM_Account");
	}
	public void SetAsideSM_Account_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(SetAsideSM_Account);
	    action.moveToElement(we).build().perform();
	}
	public void SetAsideSM_Account_MOVETOANDCLICK(){
	    Element_Click(driver,logger,SetAsideSM_Account, "moveToAndClick","SetAsideSM_Account");
 	}
	public void SetAsideSM_Account_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,SetAsideSM_Account, "javaClick","SetAsideSM_Account");
  	}
	public void SetAsideSM_Account_CLICK(){
	    Element_Click(driver,logger,SetAsideSM_Account, "click","SetAsideSM_Account");
  
	}
	public String SetAsideSM_Account_GETTEXT(){
	    return driver.findElement(SetAsideSM_Account).getText();
	}

   // Insights
	public boolean Insights_DISPLAYED(){
	    return VerifyElement(driver,logger,Insights,"displayed","Insights");
	}
	public boolean Insights_ENABLED(){
	    return VerifyElement(driver,logger,Insights,"enabled","Insights");
	}
	public void Insights_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Insights);
	    action.moveToElement(we).build().perform();
	}
	public void Insights_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Insights, "moveToAndClick","Insights");
 	}
	public void Insights_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Insights, "javaClick","Insights");
  	}
	public void Insights_CLICK(){
	    Element_Click(driver,logger,Insights, "click","Insights");
  
	}
	public String Insights_GETTEXT(){
	    return driver.findElement(Insights).getText();
	}

   // Amex_Offers
	public boolean Amex_Offers_DISPLAYED(){
	    return VerifyElement(driver,logger,Amex_Offers,"displayed","Amex_Offers");
	}
	public boolean Amex_Offers_ENABLED(){
	    return VerifyElement(driver,logger,Amex_Offers,"enabled","Amex_Offers");
	}
	public void Amex_Offers_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Amex_Offers);
	    action.moveToElement(we).build().perform();
	}
	public void Amex_Offers_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Amex_Offers, "moveToAndClick","Amex_Offers");
 	}
	public void Amex_Offers_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Amex_Offers, "javaClick","Amex_Offers");
  	}
	public void Amex_Offers_CLICK(){
	    Element_Click(driver,logger,Amex_Offers, "click","Amex_Offers");
  
	}
	public String Amex_Offers_GETTEXT(){
	    return driver.findElement(Amex_Offers).getText();
	}

   // Freeze_Card
	public boolean Freeze_Card_DISPLAYED(){
	    return VerifyElement(driver,logger,Freeze_Card,"displayed","Freeze_Card");
	}
	public boolean Freeze_Card_ENABLED(){
	    return VerifyElement(driver,logger,Freeze_Card,"enabled","Freeze_Card");
	}
	public void Freeze_Card_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Freeze_Card);
	    action.moveToElement(we).build().perform();
	}
	public void Freeze_Card_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Freeze_Card, "moveToAndClick","Freeze_Card");
 	}
	public void Freeze_Card_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Freeze_Card, "javaClick","Freeze_Card");
  	}
	public void Freeze_Card_CLICK(){
	    Element_Click(driver,logger,Freeze_Card, "click","Freeze_Card");
  
	}
	public String Freeze_Card_GETTEXT(){
	    return driver.findElement(Freeze_Card).getText();
	}

   // Settings
	public boolean Settings_DISPLAYED(){
	    return VerifyElement(driver,logger,Settings,"displayed","Settings");
	}
	public boolean Settings_ENABLED(){
	    return VerifyElement(driver,logger,Settings,"enabled","Settings");
	}
	public void Settings_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Settings);
	    action.moveToElement(we).build().perform();
	}
	public void Settings_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Settings, "moveToAndClick","Settings");
 	}
	public void Settings_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Settings, "javaClick","Settings");
  	}
	public void Settings_CLICK(){
	    Element_Click(driver,logger,Settings, "click","Settings");
  
	}
	public String Settings_GETTEXT(){
	    return driver.findElement(Settings).getText();
	}

   // Logout
	public boolean Logout_DISPLAYED(){
	    return VerifyElement(driver,logger,Logout,"displayed","Logout");
	}
	public boolean Logout_ENABLED(){
	    return VerifyElement(driver,logger,Logout,"enabled","Logout");
	}
	public void Logout_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Logout);
	    action.moveToElement(we).build().perform();
	}
	public void Logout_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Logout, "moveToAndClick","Logout");
 	}
	public void Logout_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Logout, "javaClick","Logout");
  	}
	public void Logout_CLICK(){
	    Element_Click(driver,logger,Logout, "click","Logout");
  
	}
	public String Logout_GETTEXT(){
	    return driver.findElement(Logout).getText();
	}

   // AvailableBalanceAmt
	public boolean AvailableBalanceAmt_DISPLAYED(){
	    return VerifyElement(driver,logger,AvailableBalanceAmt,"displayed","AvailableBalanceAmt");
	}
	public boolean AvailableBalanceAmt_ENABLED(){
	    return VerifyElement(driver,logger,AvailableBalanceAmt,"enabled","AvailableBalanceAmt");
	}
	public void AvailableBalanceAmt_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(AvailableBalanceAmt);
	    action.moveToElement(we).build().perform();
	}
	public void AvailableBalanceAmt_MOVETOANDCLICK(){
	    Element_Click(driver,logger,AvailableBalanceAmt, "moveToAndClick","AvailableBalanceAmt");
 	}
	public void AvailableBalanceAmt_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,AvailableBalanceAmt, "javaClick","AvailableBalanceAmt");
  	}
	public void AvailableBalanceAmt_CLICK(){
	    Element_Click(driver,logger,AvailableBalanceAmt, "click","AvailableBalanceAmt");
  
	}
	public String AvailableBalanceAmt_GETTEXT(){
	    return driver.findElement(AvailableBalanceAmt).getText();
	}

   // _Add_Funds
	public boolean _Add_Funds_DISPLAYED(){
	    return VerifyElement(driver,logger,_Add_Funds,"displayed","_Add_Funds");
	}
	public boolean _Add_Funds_ENABLED(){
	    return VerifyElement(driver,logger,_Add_Funds,"enabled","_Add_Funds");
	}
	public void _Add_Funds_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(_Add_Funds);
	    action.moveToElement(we).build().perform();
	}
	public void _Add_Funds_MOVETOANDCLICK(){
	    Element_Click(driver,logger,_Add_Funds, "moveToAndClick","_Add_Funds");
 	}
	public void _Add_Funds_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,_Add_Funds, "javaClick","_Add_Funds");
  	}
	public void _Add_Funds_CLICK(){
	    Element_Click(driver,logger,_Add_Funds, "click","_Add_Funds");
  
	}
	public String _Add_Funds_GETTEXT(){
	    return driver.findElement(_Add_Funds).getText();
	}

   // About_Bluebird
	public boolean About_Bluebird_DISPLAYED(){
	    return VerifyElement(driver,logger,About_Bluebird,"displayed","About_Bluebird");
	}
	public boolean About_Bluebird_ENABLED(){
	    return VerifyElement(driver,logger,About_Bluebird,"enabled","About_Bluebird");
	}
	public void About_Bluebird_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(About_Bluebird);
	    action.moveToElement(we).build().perform();
	}
	public void About_Bluebird_MOVETOANDCLICK(){
	    Element_Click(driver,logger,About_Bluebird, "moveToAndClick","About_Bluebird");
 	}
	public void About_Bluebird_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,About_Bluebird, "javaClick","About_Bluebird");
  	}
	public void About_Bluebird_CLICK(){
	    Element_Click(driver,logger,About_Bluebird, "click","About_Bluebird");
  
	}
	public String About_Bluebird_GETTEXT(){
	    return driver.findElement(About_Bluebird).getText();
	}

   // Privacy_Center
	public boolean Privacy_Center_DISPLAYED(){
	    return VerifyElement(driver,logger,Privacy_Center,"displayed","Privacy_Center");
	}
	public boolean Privacy_Center_ENABLED(){
	    return VerifyElement(driver,logger,Privacy_Center,"enabled","Privacy_Center");
	}
	public void Privacy_Center_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Privacy_Center);
	    action.moveToElement(we).build().perform();
	}
	public void Privacy_Center_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Privacy_Center, "moveToAndClick","Privacy_Center");
 	}
	public void Privacy_Center_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Privacy_Center, "javaClick","Privacy_Center");
  	}
	public void Privacy_Center_CLICK(){
	    Element_Click(driver,logger,Privacy_Center, "click","Privacy_Center");
  
	}
	public String Privacy_Center_GETTEXT(){
	    return driver.findElement(Privacy_Center).getText();
	}

   // Contact_Us
	public boolean Contact_Us_DISPLAYED(){
	    return VerifyElement(driver,logger,Contact_Us,"displayed","Contact_Us");
	}
	public boolean Contact_Us_ENABLED(){
	    return VerifyElement(driver,logger,Contact_Us,"enabled","Contact_Us");
	}
	public void Contact_Us_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Contact_Us);
	    action.moveToElement(we).build().perform();
	}
	public void Contact_Us_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Contact_Us, "moveToAndClick","Contact_Us");
 	}
	public void Contact_Us_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Contact_Us, "javaClick","Contact_Us");
  	}
	public void Contact_Us_CLICK(){
	    Element_Click(driver,logger,Contact_Us, "click","Contact_Us");
  
	}
	public String Contact_Us_GETTEXT(){
	    return driver.findElement(Contact_Us).getText();
	}

   // FAQs
	public boolean FAQs_DISPLAYED(){
	    return VerifyElement(driver,logger,FAQs,"displayed","FAQs");
	}
	public boolean FAQs_ENABLED(){
	    return VerifyElement(driver,logger,FAQs,"enabled","FAQs");
	}
	public void FAQs_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(FAQs);
	    action.moveToElement(we).build().perform();
	}
	public void FAQs_MOVETOANDCLICK(){
	    Element_Click(driver,logger,FAQs, "moveToAndClick","FAQs");
 	}
	public void FAQs_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,FAQs, "javaClick","FAQs");
  	}
	public void FAQs_CLICK(){
	    Element_Click(driver,logger,FAQs, "click","FAQs");
  
	}
	public String FAQs_GETTEXT(){
	    return driver.findElement(FAQs).getText();
	}

   // Refer_a_Friend
	public boolean Refer_a_Friend_DISPLAYED(){
	    return VerifyElement(driver,logger,Refer_a_Friend,"displayed","Refer_a_Friend");
	}
	public boolean Refer_a_Friend_ENABLED(){
	    return VerifyElement(driver,logger,Refer_a_Friend,"enabled","Refer_a_Friend");
	}
	public void Refer_a_Friend_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Refer_a_Friend);
	    action.moveToElement(we).build().perform();
	}
	public void Refer_a_Friend_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Refer_a_Friend, "moveToAndClick","Refer_a_Friend");
 	}
	public void Refer_a_Friend_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Refer_a_Friend, "javaClick","Refer_a_Friend");
  	}
	public void Refer_a_Friend_CLICK(){
	    Element_Click(driver,logger,Refer_a_Friend, "click","Refer_a_Friend");
  
	}
	public String Refer_a_Friend_GETTEXT(){
	    return driver.findElement(Refer_a_Friend).getText();
	}

   // Lost_or_Stolen_Card
	public boolean Lost_or_Stolen_Card_DISPLAYED(){
	    return VerifyElement(driver,logger,Lost_or_Stolen_Card,"displayed","Lost_or_Stolen_Card");
	}
	public boolean Lost_or_Stolen_Card_ENABLED(){
	    return VerifyElement(driver,logger,Lost_or_Stolen_Card,"enabled","Lost_or_Stolen_Card");
	}
	public void Lost_or_Stolen_Card_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Lost_or_Stolen_Card);
	    action.moveToElement(we).build().perform();
	}
	public void Lost_or_Stolen_Card_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Lost_or_Stolen_Card, "moveToAndClick","Lost_or_Stolen_Card");
 	}
	public void Lost_or_Stolen_Card_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Lost_or_Stolen_Card, "javaClick","Lost_or_Stolen_Card");
  	}
	public void Lost_or_Stolen_Card_CLICK(){
	    Element_Click(driver,logger,Lost_or_Stolen_Card, "click","Lost_or_Stolen_Card");
  
	}
	public String Lost_or_Stolen_Card_GETTEXT(){
	    return driver.findElement(Lost_or_Stolen_Card).getText();
	}

   // Terms_of_Service
	public boolean Terms_of_Service_DISPLAYED(){
	    return VerifyElement(driver,logger,Terms_of_Service,"displayed","Terms_of_Service");
	}
	public boolean Terms_of_Service_ENABLED(){
	    return VerifyElement(driver,logger,Terms_of_Service,"enabled","Terms_of_Service");
	}
	public void Terms_of_Service_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Terms_of_Service);
	    action.moveToElement(we).build().perform();
	}
	public void Terms_of_Service_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Terms_of_Service, "moveToAndClick","Terms_of_Service");
 	}
	public void Terms_of_Service_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Terms_of_Service, "javaClick","Terms_of_Service");
  	}
	public void Terms_of_Service_CLICK(){
	    Element_Click(driver,logger,Terms_of_Service, "click","Terms_of_Service");
  
	}
	public String Terms_of_Service_GETTEXT(){
	    return driver.findElement(Terms_of_Service).getText();
	}

   // Privacy_Statement
	public boolean Privacy_Statement_DISPLAYED(){
	    return VerifyElement(driver,logger,Privacy_Statement,"displayed","Privacy_Statement");
	}
	public boolean Privacy_Statement_ENABLED(){
	    return VerifyElement(driver,logger,Privacy_Statement,"enabled","Privacy_Statement");
	}
	public void Privacy_Statement_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Privacy_Statement);
	    action.moveToElement(we).build().perform();
	}
	public void Privacy_Statement_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Privacy_Statement, "moveToAndClick","Privacy_Statement");
 	}
	public void Privacy_Statement_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Privacy_Statement, "javaClick","Privacy_Statement");
  	}
	public void Privacy_Statement_CLICK(){
	    Element_Click(driver,logger,Privacy_Statement, "click","Privacy_Statement");
  
	}
	public String Privacy_Statement_GETTEXT(){
	    return driver.findElement(Privacy_Statement).getText();
	}

   // Security_Center
	public boolean Security_Center_DISPLAYED(){
	    return VerifyElement(driver,logger,Security_Center,"displayed","Security_Center");
	}
	public boolean Security_Center_ENABLED(){
	    return VerifyElement(driver,logger,Security_Center,"enabled","Security_Center");
	}
	public void Security_Center_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Security_Center);
	    action.moveToElement(we).build().perform();
	}
	public void Security_Center_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Security_Center, "moveToAndClick","Security_Center");
 	}
	public void Security_Center_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Security_Center, "javaClick","Security_Center");
  	}
	public void Security_Center_CLICK(){
	    Element_Click(driver,logger,Security_Center, "click","Security_Center");
  
	}
	public String Security_Center_GETTEXT(){
	    return driver.findElement(Security_Center).getText();
	}

   // Click_here_Legal_moneyservicesbusinessdisclosures
	public boolean Click_here_Legal_moneyservicesbusinessdisclosures_DISPLAYED(){
	    return VerifyElement(driver,logger,Click_here_Legal_moneyservicesbusinessdisclosures,"displayed","Click_here_Legal_moneyservicesbusinessdisclosures");
	}
	public boolean Click_here_Legal_moneyservicesbusinessdisclosures_ENABLED(){
	    return VerifyElement(driver,logger,Click_here_Legal_moneyservicesbusinessdisclosures,"enabled","Click_here_Legal_moneyservicesbusinessdisclosures");
	}
	public void Click_here_Legal_moneyservicesbusinessdisclosures_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Click_here_Legal_moneyservicesbusinessdisclosures);
	    action.moveToElement(we).build().perform();
	}
	public void Click_here_Legal_moneyservicesbusinessdisclosures_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Click_here_Legal_moneyservicesbusinessdisclosures, "moveToAndClick","Click_here_Legal_moneyservicesbusinessdisclosures");
 	}
	public void Click_here_Legal_moneyservicesbusinessdisclosures_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Click_here_Legal_moneyservicesbusinessdisclosures, "javaClick","Click_here_Legal_moneyservicesbusinessdisclosures");
  	}
	public void Click_here_Legal_moneyservicesbusinessdisclosures_CLICK(){
	    Element_Click(driver,logger,Click_here_Legal_moneyservicesbusinessdisclosures, "click","Click_here_Legal_moneyservicesbusinessdisclosures");
  
	}
	public String Click_here_Legal_moneyservicesbusinessdisclosures_GETTEXT(){
	    return driver.findElement(Click_here_Legal_moneyservicesbusinessdisclosures).getText();
	}

   // Click_here_legal_FDIC
	public boolean Click_here_legal_FDIC_DISPLAYED(){
	    return VerifyElement(driver,logger,Click_here_legal_FDIC,"displayed","Click_here_legal_FDIC");
	}
	public boolean Click_here_legal_FDIC_ENABLED(){
	    return VerifyElement(driver,logger,Click_here_legal_FDIC,"enabled","Click_here_legal_FDIC");
	}
	public void Click_here_legal_FDIC_MOUSEOVER(){
	    action = new Actions(driver);
	    WebElement we = driver.findElement(Click_here_legal_FDIC);
	    action.moveToElement(we).build().perform();
	}
	public void Click_here_legal_FDIC_MOVETOANDCLICK(){
	    Element_Click(driver,logger,Click_here_legal_FDIC, "moveToAndClick","Click_here_legal_FDIC");
 	}
	public void Click_here_legal_FDIC_CLICK_JAVASCRIPT(){
	    Element_Click(driver,logger,Click_here_legal_FDIC, "javaClick","Click_here_legal_FDIC");
  	}
	public void Click_here_legal_FDIC_CLICK(){
	    Element_Click(driver,logger,Click_here_legal_FDIC, "click","Click_here_legal_FDIC");
  
	}
	public String Click_here_legal_FDIC_GETTEXT(){
	    return driver.findElement(Click_here_legal_FDIC).getText();
	}

}