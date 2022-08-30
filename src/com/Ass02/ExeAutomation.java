package com.Ass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExeAutomation {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", ".\\Executable\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		d.get("https://demosite.executeautomation.com/Login.html");
		
		System.out.println("Page Title: "+d.getTitle());
		System.out.println("Page title length"+d.getTitle().length());
		
		String url=d.getCurrentUrl();
		String eurl="https://demosite.executeautomation.com/Login.html";
		System.out.println("Validate URL : "+url.equals(eurl));
		
		d.findElement(By.name("UserName")).sendKeys("execution");
		d.findElement(By.name("Password")).sendKeys("admin");
		d.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		System.out.println("Page title: "+d.getTitle());
		System.out.println("Page title: "+d.getCurrentUrl());
		
//		d.findElement(By.)
	}

}
