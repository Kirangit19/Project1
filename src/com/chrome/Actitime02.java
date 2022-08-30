package com.chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime02 {

	public static void main(String[] args) throws Exception {
/*		
		Perform following operations on the application
		1. Open any browser
		2. Enter the url as https://demo.actitime.com/login.do
		3. Verify login page elements
*/
		String path=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver d = new ChromeDriver();
		
		d.get("https://demo.actitime.com/login.do");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement user=d.findElement(By.id("username"));
		System.out.println("Username is displayed : "+user.isDisplayed());
		System.out.println("Username is enable : "+user.isEnabled());
		
		WebElement pass=d.findElement(By.name("pwd"));
		System.out.println("Password is displayed : "+pass.isDisplayed());
		System.out.println("Password is enable : "+pass.isEnabled());
		String pplace=pass.getAttribute("placeholder");
		System.out.println("Password Placeholder: "+pplace.equals("Password"));
		
		WebElement button=d.findElement(By.id("loginButton"));
		System.out.println("Button is displayed : "+button.isDisplayed());
		System.out.println("Button is enable : "+button.isEnabled());
		
		
		WebElement keepmlogin=d.findElement(By.id("keepLoggedInLabel"));
		keepmlogin.click();
		System.out.println("Keepmelogin field displayed: "+keepmlogin.isDisplayed());
		System.out.println("Keepmelogin field enable: "+keepmlogin.isEnabled());
		Thread.sleep(5000);
		System.out.println("Keepmelogin field selected: "+keepmlogin.isSelected());
		String text=keepmlogin.getText();
		System.out.println("Kmli Text: " +text);
		
		WebElement login=d.findElement(By.id("loginButton"));
		System.out.println("login button displayed: "+keepmlogin.isDisplayed());
		System.out.println("login button enable: "+keepmlogin.isEnabled());
		
		
		d.close();
	}

}
/**
 * In order to perform any operation on any element first identify it from WebPage, for that use findElement()
 * 
 * WebElement element= findElement(By.locator()); --> use to identify the element from the Web page and return WebElement
 * 				---> By ---> predefined class which has several static method known as locators
 * 						--->id(string), name(string), linkText(string), partialLinkText(string)
 * 							className(string), tagName(string), cssSelector(String), xpath(String)
 * Once you identified the element, you can perform the required operation like-
 * 1. type				--> element.sendKeys("");
 * 2. click				--> element.click();
 * 3. delete existing text-> element.clear();
 */
