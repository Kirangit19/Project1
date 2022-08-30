package com.Assignmenet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		// 1. Launch web Browser
		WebDriver d = new ChromeDriver();
		// 2. Open URL
		d.get("http://www.facebook.com");
		// 3.actual Home page title and expected title
		String hp=d.getTitle();
		String hpt="Facebook – log in or sign up";
		System.out.println("Verify actual & expected Home page title : "+hp.equals(hpt));
		//5.Print home page title on console
		System.out.println("Home page title : "+hp);
		// 6.close the browser
		d.close();

	}
}
