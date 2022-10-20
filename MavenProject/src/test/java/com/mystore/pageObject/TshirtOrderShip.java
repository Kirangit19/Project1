package com.mystore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Pack1.Utilities;

public class TshirtOrderShip extends Utilities {

	WebDriver driver;
	public TshirtOrderShip(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(d, this);
	}	
	
	@FindBy(id="cgv")
	WebElement checkbox;		
	@FindBy(css="[type='submit']")
	WebElement proceedTocheckout;	
	
	@FindBy(css="[title='Pay by check.']")
	WebElement payByCheck;		
	
	public void clickOnCheckbox() {
		checkbox.click();
	}
	public void clickOnProceedTocheckout() {
		proceedTocheckout.click();
	}
	public void clickOnpayByCheck() {
		payByCheck.click();
	}
		
}
