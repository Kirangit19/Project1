package com.nop.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Pack1.Utilities;

public class LoginWebPage extends Utilities {

	WebDriver driver;
	public LoginWebPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[type=\"submit\"]")
	WebElement submitbutton;
	
	@FindBy(linkText = "Logout")
	WebElement logout;
	
	public void clickOnSubmitButton() {
		clickingOnWebElement(submitbutton);
	}
	
	public void clickOnLogOutButton()
	{
		logout.click();
	}
}
