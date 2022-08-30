package com.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {

	public static void main(String[] args) {
		
	/*
	 * Perform following operations on the application

1. Open any browser
2. Enter the url as https://opensource-demo.orangehrmlive.com/
3. Verify login page
3. Username as Admin
4. password as admin123
5. click on Login button 
6. verify home page
7. close the browser


Perform following operations on the application

1. Open any browser
2. Enter the url as https://demo.actitime.com/login.do
3. Verify login page
3. Username as admin
4. password as manager
5. click on Login button 
6. close the brows	
	 */
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/");
		WebElement user=d.findElement(By.id("txtUsername"));
		user.clear();
		user.sendKeys("Admin");
		user.click();
		
		WebElement pass=d.findElement(By.name("txtPassword"));
		pass.clear();
		pass.sendKeys("admin123");
		pass.click();
		
		WebElement Button=d.findElement(By.className("button"));
		Button.click();
		
//		d.close();
	}
}
/*
 * Perform following operations on the application
1. Open any browser
2. Enter the url as https://opensource-demo.orangehrmlive.com/
3. Verify login page elements


Perform following operations on the application
1. Open any browser
2. Enter the url as https://demo.actitime.com/login.do
3. Verify login page elements

Perform following operations on the application
1. Open any browser
2. Enter the url as https://opensource-demo.orangehrmlive.com/
3. verify login page
4. enter username and password
 */
