package report;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Utilities.Utilities;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.ScreenCapture;

public class TestReport extends Utilities {
	
	static ExtentReports reports;
	static ExtentTest test;
	
	@BeforeClass
	public void StartTest() {
		reports=new ExtentReports(".\\target\\Reporthtml\\report1");
		test = reports.startTest("GooglePageReport");
	}
	
	@Test
	public void ReportTest1() throws IOException {
		WebDriver driver=setUp("chrome", "https://www.google.com");
		
		if(pageTitle().equals("Google")) {
			test.log(LogStatus.PASS, test.addScreenCapture(screenShot(driver)),"Navigate to google home page");
		}else {
			test.log(LogStatus.FAIL, test.addScreenCapture(screenShot(driver)),"Test case fail");
		}
	}

	public static String screenShot(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File(".\\target\\screenshot\\report.png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		}
	@AfterClass
	public void endTest() {
		reports.endTest(test);
		reports.flush();
		cleanUp();
	}
}
