package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	
	public static String captureScreenshot(WebDriver driver, String picName)
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentTime = getCurrentDateTime();
		String screenshotPath=System.getProperty("user.dir")+ "\\Screeenshots\\" + currentTime + " --- " + picName + ".png";
		//String screenshotPath= "./Screeenshots/FreeCRM_" + currentTime + ".png";
		try {
			FileHandler.copy(src, new File("./Screenshots/" + currentTime + " --- " + picName + ".png"));
			//FileHandler.copy(src, new File(screenshotPath));
			System.out.println("Screenshot captured");
			return screenshotPath;
		} catch (IOException e) {
			System.out.println("Unable to capture screenshot\r\n" + e.getMessage());
		}
		
		return screenshotPath;
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_H_m_ss");
		java.util.Date currentDate=new java.util.Date();
		return customFormat.format(currentDate);
		 
	}
}
