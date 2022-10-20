package com.hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginwithoutPFactory {

	WebDriver driver;
	public LoginwithoutPFactory(WebDriver d) {
		this.driver=d;
	}
	
	By user =By.name("username");
	By pass=By.name("password");
	By submit=By.cssSelector("[type='submit']");
	
	public void username(String name) {
		driver.findElement(user).sendKeys(name);
	}
	public void password(String word) {
		driver.findElement(pass).sendKeys(word);
	}
	public void loginButton() {
		driver.findElement(submit).click();
	}
}
