package com.chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm01 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement user=d.findElement(By.cssSelector("[name=\"username\"]"));
		System.out.println("User name displayed : "+user.isDisplayed());
		System.out.println("User name Enable : "+user.isEnabled());
		
		WebElement pass=d.findElement(By.cssSelector("[name=\"password\"]"));
		System.out.println("User name displayed : "+pass.isDisplayed());
		System.out.println("User name Enable : "+pass.isEnabled());

		WebElement button=d.findElement(By.className("orangehrm-login-button"));
		System.out.println("User name displayed : "+button.isDisplayed());
		System.out.println("User name Enable : "+button.isEnabled());
//		
//		WebElement forgate=d.findElement(By.id("forgotPasswordLink"));
//		System.out.println("Forgate pass field displayed: "+forgate.isDisplayed());
//		System.out.println("Forgate pass field enable: "+forgate.isEnabled());
		
		d.close();
	}

}
/**
 * Username input field:
 * 			1. display
 * 			2. editable
 * 			3. default
 * Login button:
 * 			1. display
 * 			2. functional
 * 			3. button name
 * Keep me logged in check-box/radio button:
 * 			1. display
 * 			2. functional
 * 			3. selection
 * link:
 *			1. display
 * 			2. functional
 * 			3. link name
 * dropdown:
 * 			1. display
 * 			2. functional
 * 			3. default value
 * 			4. change value is reflecting or not
 * 			5. total option
 * 			6. multi select 
 * 
 * isDisplayed() --> To check visibility of any WebElement we can user this
 * 				true --> display/visible
 * 				false--> not displayed / not visible
 * isEnabled() ---> to check whether the WebElemenet is functional or not
 * 				true --> editable/functional
 * 				false --> non editable/non-functional
 * isSelected()---> to check whether radio button/check box is selected or not
 * 				true ---> selected
 * 				false---> not selected
 * getAttribute("attribute_name")--> use to get the attribute name which is passed in
 * 									 this method as parameter in form String
 * getText()--> give the inner text for the WebElement from HTML
 * 
 *	<p> inner text</p>
 *	<a...> inner text</a>
 *	<div..> inner text</div>
 */	