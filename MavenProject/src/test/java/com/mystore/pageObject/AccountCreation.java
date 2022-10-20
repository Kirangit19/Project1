package com.mystore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Pack1.Utilities;

public class AccountCreation extends Utilities {

	WebDriver driver;
	public AccountCreation(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="id_gender1")
	WebElement titleMr;	
	@FindBy(id="customer_firstname")
	WebElement firstName;	
	@FindBy(id="customer_lastname")
	WebElement lastName;	
	@FindBy(id="passwd")
	WebElement password;	
	
	@FindBy(id="firstname")
	WebElement addfirstname;	
	@FindBy(id="lastname")
	WebElement addlastname;	
	@FindBy(id="address1")
	WebElement address;	
	@FindBy(id="city")
	WebElement city;	
	@FindBy(id="id_state")
	WebElement state;	
	@FindBy(id="postcode")
	WebElement postalCode;	
	
	@FindBy(id="id_country")
	WebElement country;	
	@FindBy(id="phone_mobile")
	WebElement mobile;	
	@FindBy(id="alias")
	WebElement alias;	
	@FindBy(id="submitAccount")
	WebElement submitAccount;	
	
	
	
	public void SelecttitleMr() {
		titleMr.click();
	}
	public void enterCustomerFirstName(String Cfname) {
		firstName.sendKeys(Cfname);
	}
	public void enterCustomerLastName(String Clname) {
		lastName.sendKeys(Clname);
	}
	public void enterPassword(String Cpass) {
		password.sendKeys(Cpass);
	}
	public void enterAddFirstName(String Afname) {
		addfirstname.sendKeys(Afname);
	}
	public void enterAddLastName(String Alname) {
		addlastname.sendKeys(Alname);
	}
	public void enterAddress(String address1) {
		address.sendKeys(address1);
	}
	public void enterCity(String city1) {
		city.sendKeys(city1);
	}
	public void selectState(String city1) {
//		Select obj=new Select(state);
//		obj.selectByVisibleText(city1);
		selectByVisibleText(state, city1);		
	}
	public void enterPostCode(String Pcode) {
		postalCode.sendKeys(Pcode);
	}
	public void selectCountry(String country1) {
		selectByVisibleText(country, country1);		
	}
	public void enterMobilePhone(String mphone) {
		mobile.sendKeys(mphone);
	}
	public void enterAlias(String eAlias) {
		alias.sendKeys(eAlias);
	}
	public void clickOnRegister() {
		submitAccount.click();
	}
	
	
	
}
