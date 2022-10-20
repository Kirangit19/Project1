package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.Pack1.Utilities;
import com.fasterxml.jackson.databind.Module.SetupContext;
import com.nop.PageObject.LoginWebPage;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefnop extends Utilities {
	
	public WebDriver driver;
	public LoginWebPage lwp;
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		lwp=new LoginWebPage(driver);
	}
//	@When	("^User open URL (.+)$")
	@When("User open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
	}

	@When("click on Login")
	public void click_on_login() {
		lwp.clickOnSubmitButton();
	}

	@Then("page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@When("user click on log out")
	public void user_click_on_log_out() {
		lwp.clickOnLogOutButton();
	}

	@Then("Page Title should be {string}")
	public void page_titleShould_be(String expectedTitle) {
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}
}
