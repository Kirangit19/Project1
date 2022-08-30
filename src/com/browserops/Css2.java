package com.browserops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Css2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		d.findElement(By.cssSelector("div>button[type='submit']")).click();
		d.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();
		d.findElement(By.cssSelector("[data-name=\"CalendarActivities\"]")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();
		d.findElement(By.cssSelector("[data-name=\"GroupedBySalesPerson\"]")).click();
		
		d.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();
		d.findElement(By.cssSelector("[data-name=\"GroupedBySalesStage\"]")).click();
		
		d.findElement(By.cssSelector(".userName")).click();
		d.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
		
		d.close();
			
	}

}
/*
1. Open chrome browser and enter url as https://demosite.executeautomation.com/Login.html
2. enter username as execution
3. enter password as admin
4. click on login button
5. click on logout button
6. close the browser
 */ 