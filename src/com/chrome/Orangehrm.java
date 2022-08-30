package com.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "K:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://opensource-demo.orangehrmlive.com/");
		
		String pt=d.getTitle();
		String ept="OrangeHRM";
		System.out.println("Page Title : "+pt);
		System.out.println("Page Title Validation : "+pt.contains(ept));
		
		String pu=d.getCurrentUrl();
		String epu="https://opensource-demo.orangehrmlive.com/";
		System.out.println("Page Title : "+pu);
		System.out.println("Page Title Validation : "+pu.contains(epu));
		
		String ps=d.getPageSource();
		System.out.println("Page Source length : "+ps.length());
				
		d.close();
	}

}
