package pages;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import utility.BrowserFactory;
import utility.ConfigDataProvider;
import utility.ExcelDataProvider;
import utility.Helper;

public class BaseClass {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider configdata;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setUpSuite()
	{
		Reporter.log("Inside setUpSuite",true);
		//excel = new ExcelDataProvider();
		//configdata = new ConfigDataProvider();		
		//ExtentSparkReporter extent= new ExtentSparkReporter(new File(System.getProperty("user.dir") + "/Reports/FreeCRM_" + Helper.getCurrentDateTime()  + ".html"));
		//ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "/Reports/FreeCRM_" + Helper.getCurrentDateTime()  + ".html"));
		//report = new ExtentReports();
		//report.attachReporter(extent);	
	}
	
	  @BeforeClass public void presetup()
	  { 
		  Reporter.log("Inside presetup",true);
			excel = new ExcelDataProvider();
			configdata = new ConfigDataProvider();
			ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "/Reports/FreeCRM_" + Helper.getCurrentDateTime()  + ".html"));
			report = new ExtentReports();
			report.attachReporter(extent);	
			
			driver = BrowserFactory.startBrowser(driver, configdata.getBrowser()); 
	  } 
	 
	  
	  @AfterClass public void tearDown() { 
		  Reporter.log("Inside tearDown",true);
		  BrowserFactory.quitBrowser(driver); 
	 }	  

			
	 @AfterMethod public void tearDownMethod(ITestResult result) 
	 { 
		 Reporter.log("Inside tearDown",true);
		 String  pngpath = Helper.captureScreenshot(driver,"LastPage");
		  if(result.getStatus()==ITestResult.FAILURE) 
		  { 
			  try 
			  {
				  	logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(pngpath).build());
			  } 
			  catch (IOException e) 
			  {
					// TODO Auto-generated catch block
					e.printStackTrace();
			  }  			  
		  }
		  else if(result.getStatus()==ITestResult.SUCCESS) 
		  {
			  try {
				logger.pass("Test Passed", MediaEntityBuilder.createScreenCaptureFromPath(pngpath).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		  
		  report.flush();  
			  
	}
			 

}
