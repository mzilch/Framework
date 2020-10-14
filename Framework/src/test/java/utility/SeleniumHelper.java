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

import com.aventstack.extentreports.ExtentTest;

import pages.BaseClass;

public class SeleniumHelper{
	
	public WebDriver driver;
	private ExtentTest logger;
	private Actions action;
	public WebDriverWait wait;
	private JavascriptExecutor executor;

	
	public boolean VerifyElement(WebDriver Indriver, ExtentTest InLogger, By InByLocator, String VerificationType, String eleName)
	{
		this.driver = Indriver;
		this.logger = InLogger;
		wait = new WebDriverWait(driver, 5);
		
	    try
	    {
	        WebElement EllyMont = driver.findElement(InByLocator);
	        wait.until(ExpectedConditions.visibilityOf(EllyMont));

	        switch (VerificationType)
	        {
	            case "displayed":
	                if (EllyMont.isDisplayed())
	                {
	                    logger.pass("PASSED - " + eleName + " element is Displayed");
	                    return true;
	                }
	                else
	                {
	                	logger.fail("FAILED - " + eleName + " element is NOT Displayed");
	                    return false;
	                }
	            case "enabled":
	                if (EllyMont.isEnabled())
	                {
	                	logger.pass("PASSED - " + eleName + " element is Enabled");
	                    return true;
	                }
	                else
	                {
	                	logger.fail("FAILED - " + eleName + " element is NOT Enabled");
	                    return false;
	                }
	        }
	        return true;
	    }
	    catch (TimeoutException e)
	    {
	        System.out.println("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ");
	        System.out.println("'TimeOut' Exception - WebDriver Waited and couldn’t locate the element");
	        System.out.println(e.getMessage());
	        return false;
	    }
	    catch (NoSuchElementException e1)
	    {
	        System.out.println("FAILED - " + eleName + " element is NOT Displayed XPath Failed: ");
	        System.out.println("'NoSuchElementException' Exception - WebDriver couldn’t locate the element");
	        System.out.println(e1.getMessage());
	        return false;
	    }
	    catch (ElementNotVisibleException e2)
	    {
	        System.out.println("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ");
	        System.out.println("'ElementNotVisibleException' Exception - Element present in the DOM but Not Visisble. May be hidden");
	        System.out.println(e2.getMessage());
	        return false;
	    }
	    catch (ElementNotSelectableException e3)
	    {
	        System.out.println("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ");
	        System.out.println("'ElementNotSelectableException' Exception - Element present in the DOM but not selectable");
	        System.out.println(e3.getMessage());
	        return false;
	    }
	    catch (StaleElementReferenceException e4)
	    {
	        System.out.println("WARNING - " + eleName + " element is stale XPath Found element: ");
	        System.out.println("'ElementNotSelectableException' Exception - Element is no longer present on the DOM page");
	        System.out.println(e4.getMessage());
	        return false;
	    }
	}

	public void Element_Click(WebDriver Indriver,  ExtentTest InLogger, By InByLocator, String Click_How, String eleName)
	{
		this.driver = Indriver;
	    try
	    {
	        switch (Click_How)
	        {
	            case "click":
	                driver.findElement(InByLocator).click();
	                logger.pass("PASSED - " + eleName + " element was Clicked");
	                break;
	            case "javaClick":
	                executor = (JavascriptExecutor)driver;
	                WebElement we = driver.findElement(InByLocator);
	                executor.executeScript("arguments[0].click(); ", we);
	                logger.pass("PASSED - " + eleName + " element was javaClicked");
	                break;
	            case "moveToAndClick":
	                action = new Actions(driver);
	                WebElement we1 = driver.findElement(InByLocator);
	                action.moveToElement(we1).click().build().perform();
	                logger.pass("PASSED - " + eleName + " element was movedToAndClicked");
	                break;
	        }
	    }
	    catch (TimeoutException e)
	    {
	        System.out.println("FAILED - " + eleName + " Wait for element has timed out XPath Failed: ");
	        System.out.println("'TimeOut' Exception - WebDriver Waited and couldn’t locate the element");
	        System.out.println(e.getMessage());
	    }
	    catch (NoSuchElementException e1)
	    {
	        System.out.println("FAILED - " + eleName + " element is NOT Displayed XPath Failed: ");
	        System.out.println("'NoSuchElementException' Exception - WebDriver couldn’t locate the element");
	        System.out.println(e1.getMessage());
	    }
	    catch (ElementNotVisibleException e2)
	    {
	        System.out.println("FAILED - " + eleName + " element is NOT Visible in the DOM XPath Found element: ");
	        System.out.println("'ElementNotVisibleException' Exception - Element present in the DOM but Not Visisble. May be hidden");
	        System.out.println(e2.getMessage());
	    }
	    catch (ElementNotSelectableException e3)
	    {
	        System.out.println("FAILED - " + eleName + " element is NOT Selectable XPath Found element: ");
	        System.out.println("'ElementNotSelectableException' Exception - Element present in the DOM but not selectable");
	        System.out.println(e3.getMessage());
	    }
	    catch (StaleElementReferenceException e4)
	    {
	        System.out.println("WARNING - " + eleName + " element is stale XPath Found element: ");
	        System.out.println("'ElementNotSelectableException' Exception - Element is no longer present on the DOM page");
	        System.out.println(e4.getMessage());
	    }
	}
}
