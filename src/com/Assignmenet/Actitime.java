package com.Assignmenet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		
	String dir=System.getProperty("user.dir");
	String path=dir+("\\Executable\\chromedriver.exe");
	// 1.Launch a new chrome browser
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver d=new ChromeDriver();
	//2.Open https://demo.actitime.com/
	d.get("https://demo.actitime.com/");
	// 3.Get page title name and title length and print on console
	String pt=d.getTitle();
	String et="actiTIME - Login";
	System.out.println("Page Title : "+pt +"Expected Title : "+et );
	System.out.println("Title Validation : "+pt.equals(et));
	int pl=d.getTitle().length();
	System.out.println("Page Title Length : "+pl);
	// 5.Get page url and verify if it is a correct page opened
	String pu=d.getCurrentUrl();
	String eu="https://demo.actitime.com/";
	System.out.println("Page Validation : "+pu.contains(eu));
	// 6.Get page  source and page length
	int psl=d.getPageSource().length();
	System.out.println("Page source length : "+psl);
	//Close the browser
	d.close();
	}

}
