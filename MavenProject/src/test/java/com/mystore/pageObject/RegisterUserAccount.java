package com.mystore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserAccount {

	WebDriver driver;
	public RegisterUserAccount(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//a[@title='View my customer account']")
	WebElement userName;		
	
	@FindBy(linkText="Sign out")WebElement signOut;
	@FindBy(css="div[id='block_top_menu']>ul>li:nth-child(3)>a")
	WebElement Tshirt;
	public String getUserName() {
		String text=userName.getText();
		return text;
	}
	
	public void clickOnSignOut() {
		signOut.click();
	}
	public void clickOnTshirt() {
		Tshirt.click();
	}
	
}
