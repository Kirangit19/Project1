package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Utilities.Utilities;

public class ParallelExecution extends Utilities{
	
	@Parameters({"browser","username","password"})
	@Test
	public void loginVtiger(String browser,String username,String password) {
		
		if(browser.equals("firefox")) {
			setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
		}else if(browser.equals("Chrome")) {
			setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
		}
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
		
	} 
}
