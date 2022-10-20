package com.Pack1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer{
	int count=0;
	int retrylimit=2;

	public boolean retry(ITestResult result) {
		if(count<retrylimit) {
			count++;
			return true;
		}
		
		return false;
	}
	
	
}
