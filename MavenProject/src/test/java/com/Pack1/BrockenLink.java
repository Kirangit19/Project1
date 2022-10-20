package com.Pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class BrockenLink extends Utilities {
	
	@BeforeClass
	public void StartTest() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test
	public void Test1() {
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		List finalList=new ArrayList();
		for(WebElement element: links) {
			if(element.getAttribute("href")!=null) {
				finalList.add(element);
			}
		}
		System.out.println(finalList);
	}
	
	@AfterClass
	public void endTest() {
		driver.close();
	}
	
}
