package com.chrome;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "K:\\Workspace\\SeleniumBasic\\Executable\\geckodriver.exe");

		FirefoxDriver fdriver = new FirefoxDriver();

		fdriver.get("https://www.facebook.com/");

		fdriver.close();

	}

}
