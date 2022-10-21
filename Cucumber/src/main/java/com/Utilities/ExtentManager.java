package com.Utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	/*create an instance of ExtendRrports*/
	  private static ExtentReports extent;
	/**
	 * this method will help us to set your ExtentReports report HTML file location
	 * @return extent
	 */
	  public synchronized static ExtentReports getReporter(){
	      if(extent == null){
	          /*Set HTML reporting file location*/
	          String workingDir = System.getProperty("user.dir");
	          extent = new ExtentReports(workingDir+"\\ExtentReports\\ExtentReportResults.html", true);
	      }
	      return extent;
	  }
}
