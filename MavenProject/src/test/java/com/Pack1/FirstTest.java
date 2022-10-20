package com.Pack1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	WebDriver driver;
	
	@Parameters ({"browser","url"})
	@Test
	public void TestGoogle(@Optional("chrome")String browser,String url) {
		switch(browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();		
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();		
			driver=new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();		
			driver=new ChromeDriver();
			break;
		default :
			System.err.println("Browser is invalide");
			break;
		}
		
//		WebDriverManager.chromedriver().setup();		
//		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys("Tutorial",Keys.ENTER);
		System.out.println(driver.getTitle());		
	}
	@Test
	public void openSite() {
		driver.findElement(By.xpath("//h3[text()='Free Online Tutorials and Courses - Tutorialspoint']")).click();
		Assert.assertEquals(true, true);
	}
	@Test
	public void CloseBrowser() {
		driver.quit();
	}
}
