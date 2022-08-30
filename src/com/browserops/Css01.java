package com.browserops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://demosite.executeautomation.com/Login.html");
		
		d.findElement(By.name("UserName")).sendKeys("execution");
		d.findElement(By.name("Password")).sendKeys("admin");
		d.findElement(By.cssSelector("input[name='Login']")).click();
		//Css Selector
		//Tag and Id
		d.findElement(By.cssSelector("#Initial")).sendKeys("Id");
		d.findElement(By.cssSelector("input#FirstName")).sendKeys("Kiran");
		//Tag and Attributes
		d.findElement(By.cssSelector("input[name=MiddleName]")).sendKeys("Dhawale");
		
//		d.close();
			
	}

}
/*
1. Open chrome browser and enter url as https://demosite.executeautomation.com/Login.html
2. enter username as execution
3. enter password as admin
4. click on login button
5. click on logout button
6. close the browser
 */ 