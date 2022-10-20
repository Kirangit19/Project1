package com.mystore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Pack1.Utilities;

public class TshirtOrderPayment extends Utilities {

	WebDriver driver;
	public TshirtOrderPayment(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(d, this);
	}	
	
	@FindBy(css="[type='submit']")
	WebElement confirmorder;		
	
	public void clickOnconfirmorder() {
		confirmorder.click();
	}
		
}
