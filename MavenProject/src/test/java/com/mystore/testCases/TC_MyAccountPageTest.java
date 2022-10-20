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

public class TC_MyAccountPageTest extends Utilities {

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

	@Test
	public void verifyLogin() throws IOException {

		IndexPage pg = new IndexPage(driver);
		pg.clickOnSignIn();
		logger.info("Clicked on sign in link");

		MyAccount mapg = new MyAccount(driver);
		mapg.enterEmailAddress("kigs12dk@gmail.com");
		mapg.enterPassword("Deva123");
		mapg.clickSignIn();

		RegisterUserAccount rua = new RegisterUserAccount(driver);
		String userName = rua.getUserName();
		if (userName.equals("Kishna Deva")) {
			logger.info("Verify-Login passed");
			Assert.assertTrue(true);
		} else {
			logger.info("Verify-Login failed");
			captureScreenShot(driver, "verifyLogin");
			Assert.assertFalse(true);
		}

	}

}
