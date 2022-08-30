package com.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "K:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");

		ChromeDriver d = new ChromeDriver();

		d.get("https://demo.opencart.com/admin/");
		
		d.findElement(By.name("username")).sendKeys("demo");
		d.findElement(By.name("password")).sendKeys("demo");
		d.findElement(By.cssSelector("#form-login > div.text-end > button")).click();

		d.close();
	}

}
