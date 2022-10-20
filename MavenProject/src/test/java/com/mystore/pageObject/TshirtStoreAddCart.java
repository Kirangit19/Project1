package com.mystore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Pack1.Utilities;

public class TshirtStoreAddCart extends Utilities {

	WebDriver driver;
	public TshirtStoreAddCart(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="quantity_wanted")
	WebElement quantity;		
	
	@FindBy(id="group_1")
	WebElement Size;		
	
	@FindBy(name="Submit")
	WebElement addToCart;		
	
	@FindBy(linkText="Proceed to checkout")
	WebElement proceedTocheckout;		
	
		
	public void AddQuantity(String qty) {
		quantity.clear();
		quantity.sendKeys(qty);
	}
	public void AddSize(String size) {
		selectByVisibleText(Size, size);
	}
	public void clickOnAddToCart() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addToCart.click();
	}
	public void clickOnProceedTocheckout() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		proceedTocheckout.click();
	}
		
}
