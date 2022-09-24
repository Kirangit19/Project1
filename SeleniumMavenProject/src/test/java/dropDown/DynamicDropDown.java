package dropDown;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Utilities.Utilities;

public class DynamicDropDown {

	public static WebDriver driver = null;
	@Test
	public void start() {
//		Utilities.setUp("chrome", "https://www.tripodeal.com/");	
		Utilities.setUp("firefox","https://www.google.com/" );
		
	}
	@Test
	public void  makemytrip () {
//		driver.findElement(By.id("origin_pl_mob")).sendKeys("mu");
		
	}
}
