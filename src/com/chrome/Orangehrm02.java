package com.chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm02 {

	public static void main(String[] args) {
/*	
		Perform following operations on the application
		1. Open any browser
		2. Enter the url as https://opensource-demo.orangehrmlive.com/
		3. verify login page
		4. enter username and password
		*/
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement user=d.findElement(By.id("txtUsername"));
		System.out.println("User name displayed : "+user.isDisplayed());
		System.out.println("User name Enable : "+user.isEnabled());
		user.sendKeys("Admin");
		user.click();
		
		WebElement pass=d.findElement(By.id("txtPassword"));
		System.out.println("User name displayed : "+pass.isDisplayed());
		System.out.println("User name Enable : "+pass.isEnabled());
		pass.sendKeys("admin123");
		pass.click();

		WebElement forgate=d.findElement(By.id("forgotPasswordLink"));
		System.out.println("Forgate pass field displayed: "+forgate.isDisplayed());
		System.out.println("Forgate pass field enable: "+forgate.isEnabled());
				
		WebElement button=d.findElement(By.name("Submit"));
		System.out.println("User name displayed : "+button.isDisplayed());
		System.out.println("User name Enable : "+button.isEnabled());
		button.click();
				
//		d.close();
	}

}
