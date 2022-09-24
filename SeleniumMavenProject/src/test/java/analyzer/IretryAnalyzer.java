package analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class IretryAnalyzer implements IRetryAnalyzer,IAnnotationTransformer {
		
	int count =0;
	int retrylimit=2;
	public boolean retry(ITestResult result) {
		if(count<retrylimit) {
			return true;
		}
		return false;
	}
	
	public void transform(ITestAnnotation annotation,Class testClass,Constructor testConstructor,Method testMethod) {
		annotation.setRetryAnalyzer(IretryAnalyzer.class);
	}
	
}
