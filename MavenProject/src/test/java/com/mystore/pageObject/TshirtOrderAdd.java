package com.mystore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Pack1.Utilities;

public class TshirtOrderAdd extends Utilities {

	WebDriver driver;
	public TshirtOrderAdd(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(d, this);
	}	
	
	@FindBy(css="[type='submit']")
	WebElement proceedTocheckout;		
	
	public void clickOnProceedTocheckout() {
		proceedTocheckout.click();
	}
		
}
