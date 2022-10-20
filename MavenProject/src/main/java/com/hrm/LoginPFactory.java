package com.hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPFactory {

	WebDriver driver;
	public LoginPFactory(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver	, this);
	}
	
	@FindBy(name="username")WebElement user;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(css="[type='submit']")
	WebElement submit;
	
	public void username(String name) {
		user.sendKeys(name);
	}
	public void password(String word) {
		pass.sendKeys(word);
	}
	public void Loginbutton() {
		submit.click();;
	}
}
