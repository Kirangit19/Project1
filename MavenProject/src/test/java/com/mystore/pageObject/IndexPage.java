package com.mystore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	
	WebDriver driver;
	
	public IndexPage(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Sign in")
	WebElement signIn;	
	
	public void clickOnSignIn() {
		signIn.click();
	}
	

}
