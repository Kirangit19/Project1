package com.Utilities;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentTestManager {

	/*create an instance of HashMap class*/
    static Map<Integer, ExtentTest> extentTestMap = new HashMap<Integer, ExtentTest>();
    /*Get the instance of ExtentReports*/
    static ExtentReports extent = ExtentManager.getReporter();
 
    public static synchronized ExtentTest getTest() {
        return (ExtentTest)extentTestMap.get((int)(Thread.currentThread().getId()));
    }
 
    public static synchronized void endTest() {
        extent.endTest((ExtentTest)extentTestMap.get((int)(Thread.currentThread().getId())));
    }
 
    public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = extent.startTest(testName, desc);
        extentTestMap.put((int)(Thread.currentThread().getId()), test);
        return test;
    }
}
