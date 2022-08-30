package com.cssAtributes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement signInButton=driver.findElement(By.cssSelector("button[type='submit']"));
		String fontSize=signInButton.getCssValue("font-size");
		String fontColor=signInButton.getCssValue("color");//RGBA format color code
		String fontBackgroundColor=signInButton.getCssValue("background-image");//RGBA format color code
		
		System.out.println("Font Size: "+fontSize);
		System.out.println("Font color: "+fontColor);
		System.out.println("Font Background Color: "+fontBackgroundColor);
		
		
		String forgotPasswordLinkColor=driver.findElement(By.cssSelector(".forgotPasswordLink")).getCssValue("color");
		System.out.println("forgotPasswordLink color: "+forgotPasswordLinkColor);//RGBA format color code
	}

}
