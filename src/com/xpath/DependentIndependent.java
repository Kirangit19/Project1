package com.xpath;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DependentIndependent {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		WebDriverWait w=new WebDriverWait(d, 20);
		Wait<WebDriver>w1=new FluentWait<WebDriver>(d)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);		
		d.findElement(By.xpath("//a[text()=\"Mobiles\"]")).sendKeys(Keys.ENTER);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Starting ₹6,999')]")));
		
		d.findElement(By.xpath("//span[contains(text(),'Starting ₹6,999')]")).click();
		
		WebElement phone=d.findElement(By.xpath
		("//div[div[h2[a[span[text()=\"OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage)\"]]]]]/div[3]/div[2]"));
		System.out.println("OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage : "+phone.getText());
				
		d.close();
	}

}
