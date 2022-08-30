package com.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleapp {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "K:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
		
		WebDriver r1=new ChromeDriver();
		
		r1.get("http://sampleapp.tricentis.com/101/");
		
		String r2 =r1.getTitle();
		System.out.println("page title : "+r2);
		String r3="Tricentis Vehicle Insurance";
		System.out.println("page title validation : "+r2.contains(r3));
		
		r1.getCurrentUrl();
		String url="http://sampleapp.tricentis.com/101/";
		System.out.println("page url:"+r1);         
		System.out.println("page url validation:"+url.contains(url));         
		
		String ps=r1.getPageSource();
		System.out.println("page source length:"+ps.length());
		r1.close();
	}

}
