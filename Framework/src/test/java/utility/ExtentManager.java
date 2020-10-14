package utility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {
	
    private static ExtentHtmlReporter extent;
    
    public synchronized static ExtentHtmlReporter getReporter() {
        if (extent == null) {
            //Set HTML reporting file location
            String workingDir = System.getProperty("user.dir");
            extent = new ExtentHtmlReporter(new File(workingDir + "\\Reports\\ExtentReportResults.html"));
            
			//ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "/Reports/FreeCRM_" + Helper.getCurrentDateTime()  + ".html"));
			ExtentReports report = new ExtentReports();
			report.attachReporter(extent);	
        }
        return extent;
    }
}


