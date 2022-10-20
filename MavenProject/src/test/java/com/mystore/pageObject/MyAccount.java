package com.mystore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {

WebDriver driver;
	
	public MyAccount(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email_create")
	WebElement emailId;
	
	@FindBy(id="SubmitCreate")
	WebElement submitCreate;	
	
	//Already registered users
		@FindBy(id = "email") 
		WebElement registeredUsersEmail;
		
		@FindBy(id = "passwd") 
		WebElement registeredUsersPwd;
		
		@FindBy(id = "SubmitLogin")
		WebElement submitLogin;
	
	public void enterEmailAdd(String email) {
		emailId.sendKeys(email);;
	}
	
	public void clickOnSubmit() {
		submitCreate.click();
	}
	
	public void enterEmailAddress(String emailAdd) 
	{
		registeredUsersEmail.sendKeys(emailAdd);
	}

	public void enterPassword(String pwd) 
	{
		registeredUsersPwd.sendKeys(pwd);
	}

	
	public void clickSignIn()
	{
		submitLogin.click();
	}
}
