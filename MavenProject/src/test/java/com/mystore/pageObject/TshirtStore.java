package com.mystore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtStore {

	WebDriver driver;
	public TshirtStore(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(linkText="More")
	WebElement more;		
	
		
	public void clickOnMore() {
		more.click();
	}
		
}
