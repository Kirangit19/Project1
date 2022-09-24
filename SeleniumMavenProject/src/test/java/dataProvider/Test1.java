package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Utilities.SeleniumUtilities;
import com.Utilities.Utilities;

public class Test1 extends Utilities{

	@DataProvider
	public Object[][] getUserDetails(){
		
		Object[][]data=new Object[2][3];
		data[0][0]="chrome";
		data[0][1]="admin";
		data[0][2]="Test@123";
		
		data[1][0]="firefox";
		data[1][1]="admin";
		data[1][2]="Test@123";
		return data;
	}
	@Test(dataProvider ="getUserDetails")
	public void loginVtiger(String browser,String user,String pass) {
		setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(pass, Keys.ENTER);
		driver.close();
	}
}
