package com.browserops;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazePhoneCount {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://www.demoblaze.com/");
		
		List<WebElement> devicename=d.findElements(By.cssSelector("div#tbodyid>div>div>div>h4"));
		List<WebElement> deviceprice=d.findElements(By.cssSelector("div#tbodyid>div>div>div>h5"));
		
		System.out.println("No. of device :"+devicename.size());
		for(WebElement c :devicename) 
			System.out.println("Device name :"+c.getText());
		//   Or
		for(int i=0;i<devicename.size();i++) {
			System.out.println(devicename.get(i).getText()+": "+deviceprice.get(i).getText());
		}
		d.close();
		
	}

}
