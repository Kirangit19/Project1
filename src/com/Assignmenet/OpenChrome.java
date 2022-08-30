package com.Assignmenet;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "K:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");

		ChromeDriver d = new ChromeDriver();

		d.get("https://www.google.co.in/");
		// Fetch current URL and print on console
		String cu=d.getCurrentUrl();
		System.out.println("Current URL : "+cu);
		// Fetch page source of current web page & Print length in console
		System.out.println(+d.getPageSource().length());
		d.close();
	}

}
