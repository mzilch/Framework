package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;


public class SeleniumHelper{
	
	public WebDriver driver;
	//public ExtentTest logger;
	private Actions action;
	public WebDriverWait wait;
	private JavascriptExecutor executor;
	


	
	public String VerifyTextEquals(WebDriver Indriver, ExtentTest InLogger, By InByLocator, String DataText, String eleName)
	{
		this.driver = Indriver;
		wait = new WebDriverWait(driver, 5);
		String returnString = "";
		
	    try
	    {	    	
	        WebElement EllyMont = driver.findElement(InByLocator);
	        wait.until(ExpectedConditions.visibilityOf(EllyMont));
	    	String returnedText = EllyMont.getText();
	    	Assert.assertEquals(returnedText, DataText,"Expected: "+ DataText + "\r\nFound: " + returnedText);
	    	System.out.println("Expected: "+ DataText + "\r\nFound: " + returnedText);
	    	InLogger.pass("Expected: "+ DataText + "\r\nFound: " + returnedText);
	    	Reporter.log("Expected: "+ DataText + "\r\nFound: " + returnedText,true);    	

	        return returnString;
	    }
	    catch (TimeoutException e)
	    {
	    	InLogger.info("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ");
	        InLogger.info("'TimeOut' Exception - WebDriver Waited and couldn't locate the element");
	        System.out.println(e.getMessage());
	        return returnString;
	    }
	    catch (NoSuchElementException e1)
	    {
	    	InLogger.info("FAILED - " + eleName + " element is NOT Displayed XPath Failed: ");
	        InLogger.info("'NoSuchElementException' Exception - WebDriver couldn't locate the element");
	        System.out.println(e1.getMessage());
	        return returnString;
	    }
	    catch (ElementNotVisibleException e2)
	    {
	    	InLogger.info("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ");
	        InLogger.info("'ElementNotVisibleException' Exception - Element present in the DOM but Not Visisble. May be hidden");
	        System.out.println(e2.getMessage());
	        return returnString;
	    }
	    catch (ElementNotSelectableException e3)
	    {
	    	InLogger.info("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ");
	        InLogger.info("'ElementNotSelectableException' Exception - Element present in the DOM but not selectable");
	        System.out.println(e3.getMessage());
	        return returnString;
	    }
	    catch (StaleElementReferenceException e4)
	    {
	    	InLogger.info("WARNING - " + eleName + " element is stale XPath Found element: ");
	        InLogger.info("'ElementNotSelectableException' Exception - Element is no longer present on the DOM page");
	        System.out.println(e4.getMessage());
	        return returnString;
	    }
	}
	
	public String Element_GetText(WebDriver Indriver, ExtentTest InLogger, By InByLocator, String VerificationType, String eleName)
	{
		this.driver = Indriver;
		wait = new WebDriverWait(driver, 5);
		String returnString = "";
		
	    try
	    {
	        WebElement EllyMont = driver.findElement(InByLocator);
	        wait.until(ExpectedConditions.visibilityOf(EllyMont));
	        returnString = EllyMont.getText();
	        InLogger.pass("PASSED - '" + eleName + "' GETTEXT method completed");
	        Reporter.log("PASSED - '" + eleName + "' GETTEXT method completed",true);
	        InLogger.pass("Captured text = '" + returnString + "'");
	        Reporter.log("Captured text = '" + returnString + "'",true);
	        return returnString;
	    }
	    catch (TimeoutException e)
	    {
	    	InLogger.info("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ");
	        InLogger.info("'TimeOut' Exception - WebDriver Waited and couldn't locate the element");
	        System.out.println(e.getMessage());
	        return returnString;
	    }
	    catch (NoSuchElementException e1)
	    {
	    	InLogger.info("FAILED - " + eleName + " element is NOT Displayed XPath Failed: ");
	        InLogger.info("'NoSuchElementException' Exception - WebDriver couldn't locate the element");
	        System.out.println(e1.getMessage());
	        return returnString;
	    }
	    catch (ElementNotVisibleException e2)
	    {
	    	InLogger.info("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ");
	        InLogger.info("'ElementNotVisibleException' Exception - Element present in the DOM but Not Visisble. May be hidden");
	        System.out.println(e2.getMessage());
	        return returnString;
	    }
	    catch (ElementNotSelectableException e3)
	    {
	    	InLogger.info("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ");
	        InLogger.info("'ElementNotSelectableException' Exception - Element present in the DOM but not selectable");
	        System.out.println(e3.getMessage());
	        return returnString;
	    }
	    catch (StaleElementReferenceException e4)
	    {
	    	InLogger.info("WARNING - " + eleName + " element is stale XPath Found element: ");
	        InLogger.info("'ElementNotSelectableException' Exception - Element is no longer present on the DOM page");
	        System.out.println(e4.getMessage());
	        return returnString;
	    }
	}

	public boolean MouseOver(WebDriver Indriver, ExtentTest InLogger, By InByLocator, String TextType, String eleName)
	{
		this.driver = Indriver;	
		wait = new WebDriverWait(driver, 5);
		
		
		try {
			WebElement EllyMont = driver.findElement(InByLocator);
			wait.until(ExpectedConditions.visibilityOf(EllyMont));			
			action = new Actions(driver);     
			action.moveToElement(EllyMont).build().perform();	
			InLogger.pass("PASSED - '" + eleName + "' was MOUSEOVERED");
			Reporter.log("PASSED - '" + eleName + "' was MOUSEOVERED",true);
			return true;
		}
	    catch (TimeoutException e)
	    {
	    	InLogger.info("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ");
	        InLogger.info("'TimeOut' Exception - WebDriver Waited and couldn't locate the element");
	        System.out.println(e.getMessage());
	        return false;
	    }
	    catch (NoSuchElementException e1)
	    {
	    	InLogger.info("FAILED - " + eleName + " element is NOT Displayed XPath Failed: ");
	        InLogger.info("'NoSuchElementException' Exception - WebDriver couldn't locate the element");
	        System.out.println(e1.getMessage());
	        return false;
	    }
	    catch (ElementNotVisibleException e2)
	    {
	    	InLogger.info("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ");
	        InLogger.info("'ElementNotVisibleException' Exception - Element present in the DOM but Not Visisble. May be hidden");
	        System.out.println(e2.getMessage());
	        return false;
	    }
	    catch (ElementNotSelectableException e3)
	    {
	    	InLogger.info("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ");
	        InLogger.info("'ElementNotSelectableException' Exception - Element present in the DOM but not selectable");
	        System.out.println(e3.getMessage());
	        return false;
	    }
	    catch (StaleElementReferenceException e4)
	    {
	    	InLogger.info("WARNING - " + eleName + " element is stale XPath Found element: ");
	        InLogger.info("'ElementNotSelectableException' Exception - Element is no longer present on the DOM page");
	        System.out.println(e4.getMessage());
	        return false;
	    }		
	}
	
	public boolean EnterText(WebDriver Indriver, ExtentTest InLogger, By InByLocator, String eleName, String strToType)
	{
		this.driver = Indriver;	
		try {
		wait = new WebDriverWait(driver, 5);		
		WebElement EllyMont = driver.findElement(InByLocator);
        wait.until(ExpectedConditions.visibilityOf(EllyMont));		
        EllyMont.sendKeys(strToType);
		InLogger.pass("PASSED - '" + strToType + "' TEXT was ENTERED");
		Reporter.log("PASSED - '" + strToType + "' TEXT was ENTERED",true);
		return true;
		}
	    catch (TimeoutException e)
	    {
	    	InLogger.info("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ");
	        InLogger.info("'TimeOut' Exception - WebDriver Waited and couldn't locate the element");
	        System.out.println(e.getMessage());
	        return false;
	    }
	    catch (NoSuchElementException e1)
	    {
	    	InLogger.info("FAILED - " + eleName + " element is NOT Displayed XPath Failed: ");
	        InLogger.info("'NoSuchElementException' Exception - WebDriver couldn't locate the element");
	        System.out.println(e1.getMessage());
	        return false;
	    }
	    catch (ElementNotVisibleException e2)
	    {
	    	InLogger.info("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ");
	        InLogger.info("'ElementNotVisibleException' Exception - Element present in the DOM but Not Visisble. May be hidden");
	        System.out.println(e2.getMessage());
	        return false;
	    }
	    catch (ElementNotSelectableException e3)
	    {
	    	InLogger.info("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ");
	        InLogger.info("'ElementNotSelectableException' Exception - Element present in the DOM but not selectable");
	        System.out.println(e3.getMessage());
	        return false;
	    }
	    catch (StaleElementReferenceException e4)
	    {
	    	InLogger.info("WARNING - " + eleName + " element is stale XPath Found element: ");
	        InLogger.info("'ElementNotSelectableException' Exception - Element is no longer present on the DOM page");
	        System.out.println(e4.getMessage());
	        return false;
	    }
		
	}

	public boolean VerifyElement(WebDriver Indriver, ExtentTest InLogger, By InByLocator, String VerificationType, String eleName)
	{
		this.driver = Indriver;
		//this.logger = InLogger;
		wait = new WebDriverWait(driver, 5);
		if(InLogger == null)
		{
			Reporter.log("InLogger == null",true);
		}
		if(InLogger == null)
		{
			Reporter.log("this.logger == null",true);
		}
		
		int int_VerificationTyper = 0;
		if(VerificationType == "displayed") {
			int_VerificationTyper = 1;
		}
		if(VerificationType == "enabled") {
			int_VerificationTyper = 2;
		}
		
	    try
	    {
	        WebElement EllyMont = driver.findElement(InByLocator);
	        wait.until(ExpectedConditions.visibilityOf(EllyMont));

	        switch (int_VerificationTyper)
	        {
	            case 1:
	                if (EllyMont.isDisplayed())
	                {
	                	InLogger.pass("PASSED - " + eleName + " element is DISPLAYED");
	                	Reporter.log("PASSED - " + eleName + " element is DISPLAYED",true);
	                    return true;
	                }
	                else
	                {
	                	InLogger.fail("FAILED - " + eleName + " element is NOT DISPLAYED");
	                	Reporter.log("FAILED - " + eleName + " element is NOT DISPLAYED",true);
	                    return false;
	                }
	            case 2:
	                if (EllyMont.isEnabled())
	                {
	                	InLogger.pass("PASSED - " + eleName + " element is ENABLED");
	                	Reporter.log("PASSED - " + eleName + " element is ENABLED",true);
	                    return true;
	                }
	                else
	                {
	                	InLogger.fail("FAILED - " + eleName + " element is NOT ENABLED");
	                	Reporter.log("FAILED - " + eleName + " element is NOT ENABLED",true);
	                    return false;
	                }
	        }
	        return true;
	    }
	    catch (TimeoutException e)
	    {
	    	InLogger.fail("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ");
	    	Reporter.log("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ",true);
	        InLogger.info("'TimeOut' Exception - WebDriver Waited and couldn't locate the element");
	        System.out.println(e.getMessage());
	        return false;
	    }
	    catch (NoSuchElementException e1)
	    {
	    	InLogger.fail("FAILED - " + eleName + " element is NOT Displayed ---> XPath Failed: ");
	    	Reporter.log("FAILED - " + eleName + " element is NOT Displayed ---> XPath Failed: ",true);
	        InLogger.info("'NoSuchElementException' Exception - WebDriver couldn't locate the element");
	        System.out.println(e1.getMessage());
	        return false;
	    }
	    catch (ElementNotVisibleException e2)
	    {
	    	InLogger.fail("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ");
	    	Reporter.log("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ",true);
	        InLogger.info("'ElementNotVisibleException' Exception - Element present in the DOM but Not Visisble. May be hidden");
	        System.out.println(e2.getMessage());
	        return false;
	    }
	    catch (ElementNotSelectableException e3)
	    {
	    	InLogger.fail("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ");
	    	Reporter.log("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ",true);
	        InLogger.info("'ElementNotSelectableException' Exception - Element present in the DOM but not selectable");
	        System.out.println(e3.getMessage());
	        return false;
	    }
	    catch (StaleElementReferenceException e4)
	    {
	    	InLogger.fail("WARNING - " + eleName + " element is stale XPath Found element: ");
	    	Reporter.log("WARNING - " + eleName + " element is stale XPath Found element: ",true);
	        InLogger.info("'ElementNotSelectableException' Exception - Element is no longer present on the DOM page");
	        System.out.println(e4.getMessage());
	        return false;
	    }
	}

	public void Element_Click(WebDriver Indriver,  ExtentTest InLogger, By InByLocator, String Click_How, String eleName)
	{
		this.driver = Indriver;
		//this.logger = InLogger;
		
		if(InLogger == null)
		{
			Reporter.log("InLogger == null",true);
		}
		if(InLogger == null)
		{
			Reporter.log("this.logger == null",true);
		}
		int int_ClickTyper = 0;
		if(Click_How == "click") {
			int_ClickTyper = 1;
		}
		if(Click_How == "javaClick") {
			int_ClickTyper = 2;
		}
		if(Click_How == "moveToAndClick") {
			int_ClickTyper = 3;
		}
	    try
	    {
	        switch (int_ClickTyper)
	        {
	            case 1:
	                driver.findElement(InByLocator).click();
	                InLogger.pass("PASSED - " + eleName + " element was CLICKED");
	                Reporter.log("PASSED - " + eleName + " element was CLICKED",true);
	                break;
	            case 2:
	                executor = (JavascriptExecutor)driver;
	                WebElement we = driver.findElement(InByLocator);
	                executor.executeScript("arguments[0].click(); ", we);
	                InLogger.pass("PASSED - " + eleName + " element was javaCLICKED");
	                Reporter.log("PASSED - " + eleName + " element was javaCLICKED",true);
	                break;
	            case 3:
	                action = new Actions(driver);
	                WebElement we1 = driver.findElement(InByLocator);
	                action.moveToElement(we1).click().build().perform();
	                InLogger.pass("PASSED - " + eleName + " element was movedToAndCLICKED");
	                Reporter.log("PASSED - " + eleName + " element was movedToAndCLICKED",true);
	                break;
	        }
	    }
	    catch (TimeoutException e)
	    {
	    	InLogger.info("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ");
	    	Reporter.log("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ",true);
	        InLogger.info("'TimeOut' Exception - WebDriver Waited and couldn't locate the element");
	        System.out.println(e.getMessage());
	    }
	    catch (NoSuchElementException e1)
	    {
	    	InLogger.info("FAILED - " + eleName + " element is NOT Displayed XPath Failed: ");
	    	Reporter.log("FAILED - " + eleName + " element is NOT Displayed XPath Failed: ",true);
	        InLogger.info("'NoSuchElementException' Exception - WebDriver couldn't locate the element");
	        System.out.println(e1.getMessage());
	    }
	    catch (ElementNotVisibleException e2)
	    {
	    	InLogger.info("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ");
	    	Reporter.log("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ",true);
	        InLogger.info("'ElementNotVisibleException' Exception - Element present in the DOM but Not Visisble. May be hidden");
	        System.out.println(e2.getMessage());
	    }
	    catch (ElementNotSelectableException e3)
	    {
	    	InLogger.info("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ");
	    	Reporter.log("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ",true);
	        InLogger.info("'ElementNotSelectableException' Exception - Element present in the DOM but not selectable");
	        System.out.println(e3.getMessage());
	    }
	    catch (StaleElementReferenceException e4)
	    {
	    	InLogger.info("WARNING - " + eleName + " element is stale XPath Found element: ");
	    	Reporter.log("WARNING - " + eleName + " element is stale XPath Found element: ",true);
	        InLogger.info("'ElementNotSelectableException' Exception - Element is no longer present on the DOM page");
	        System.out.println(e4.getMessage());
	    }
	}
}
