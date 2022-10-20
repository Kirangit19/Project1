package com.mystore.testCases;

import java.io.IOException;

import org.apache.logging.log4j.core.layout.internal.IncludeChecker;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pack1.Utilities;
import com.mystore.pageObject.AccountCreation;
import com.mystore.pageObject.IndexPage;
import com.mystore.pageObject.MyAccount;
import com.mystore.pageObject.RegisterUserAccount;
import com.mystore.pageObject.TshirtOrder;
import com.mystore.pageObject.TshirtOrderAdd;
import com.mystore.pageObject.TshirtOrderPayment;
import com.mystore.pageObject.TshirtOrderShip;
import com.mystore.pageObject.TshirtStore;
import com.mystore.pageObject.TshirtStoreAddCart;

public class TC_MyAccountPageTestDataDrivenTesting extends Utilities {

	@Test		(enabled=false)
	public void verifyRegistrationAndLogin() {
		driver.get(url);
		logger.info("url opened");

		IndexPage pg = new IndexPage(driver);
		pg.clickOnSignIn();
		logger.info("Clicked on sign in link");

		MyAccount mapg = new MyAccount(driver);
		mapg.enterEmailAdd("kigs12dk@gmail.com");
		logger.info("Email Add enter in create account section");
		mapg.clickOnSubmit();
		logger.info("Clicked on create account button");

		AccountCreation accCreationPg = new AccountCreation(driver);
		accCreationPg.SelecttitleMr();
		accCreationPg.enterCustomerFirstName("Kishna");
		accCreationPg.enterCustomerLastName("Deva");
		accCreationPg.enterPassword("Deva123");
		accCreationPg.enterAddFirstName("Devnagari");
		accCreationPg.enterAddLastName("Devas");
		accCreationPg.enterAddress("Dwarka");
		accCreationPg.enterCity("Mathura");
		accCreationPg.selectState("Alaska");
		accCreationPg.enterPostCode("00000");
		accCreationPg.selectCountry("United States");
		accCreationPg.enterMobilePhone("12345123");
		accCreationPg.enterAlias("United States");
		accCreationPg.clickOnRegister();
		logger.info("Clicked on Register button");

		RegisterUserAccount rua = new RegisterUserAccount(driver);
		String userName = rua.getUserName();
		Assert.assertEquals("Kishna Deva", userName);
		logger.info("User is Register");
	}

	@Test	(enabled=false,dataProvider="LoginDataProvider",dataProviderClass=Utilities.class)
	public void verifyLogin(String email,String password,String result) throws IOException {

		IndexPage pg = new IndexPage(driver);
		pg.clickOnSignIn();
		logger.info("Clicked on sign in link");

		MyAccount mapg = new MyAccount(driver);
		mapg.enterEmailAddress(email);
		mapg.enterPassword(password);
		mapg.clickSignIn();

		RegisterUserAccount rua = new RegisterUserAccount(driver);
		String userName = rua.getUserName();
		if (userName.equals(result)) {
			logger.info("Verify-Login passed");
			Assert.assertTrue(true);
			rua.clickOnSignOut();
		} else {
			logger.info("Verify-Login failed");
			captureScreenShot(driver, "verifyLogin");
			Assert.assertTrue(false);
		}

	}
	@Test	(dataProvider="LoginDataProvider",dataProviderClass=Utilities.class)
	public void purchaseProduct(String email,String password,String result) throws IOException {
		
		IndexPage pg = new IndexPage(driver);
		pg.clickOnSignIn();
		logger.info("Clicked on sign in link");
		
		MyAccount mapg = new MyAccount(driver);
		mapg.enterEmailAddress(email);
		mapg.enterPassword(password);
		mapg.clickSignIn();
		logger.info("Sign in successful");
		
		RegisterUserAccount rua = new RegisterUserAccount(driver);
		rua.clickOnTshirt();
		logger.info("Clicked on TShirt");
		
		TshirtStore tss=new TshirtStore(driver);
		tss.clickOnMore();
		logger.info("Clicked on More");
		
		TshirtStoreAddCart tssac=new TshirtStoreAddCart(driver);
		tssac.AddQuantity("2");
		tssac.AddSize("M");
		tssac.clickOnAddToCart();
		tssac.clickOnProceedTocheckout();
		logger.info("TShirt added in Cart");
		
		TshirtOrder tso=new TshirtOrder(driver);
		tso.clickOnProceedTocheckout();
		logger.info("Clicked on Proceed to checkout");
		
		TshirtOrderAdd tsoa=new TshirtOrderAdd(driver);
		tsoa.clickOnProceedTocheckout();
		logger.info("Clicked on Proceed to checkout");
		
		TshirtOrderShip tsos=new TshirtOrderShip(driver);
		tsos.clickOnCheckbox();
		tsos.clickOnProceedTocheckout();
		tsos.clickOnpayByCheck();
		logger.info("Clicked on Proceed to checkout");
		
		TshirtOrderPayment tsop=new TshirtOrderPayment(driver);
		tsop.clickOnconfirmorder();

		logger.info("Clicked on Confirm Order");
		
	}

}
