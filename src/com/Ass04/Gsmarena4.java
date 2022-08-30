package com.Ass04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena4 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://www.gsmarena.com/samsung-phones-9.php");

		d.findElement(By.cssSelector("a[href=\"samsung-phones-9.php\"]")).click();
		List<WebElement> page = d.findElements(By.cssSelector(".nav-pages>a"));
		System.out.println("Pagination links: " + page.size());
		if (page.size() > 0) {
			System.out.println("Pagination Exist");
		} else {
			System.out.println("Pagination not exist");
		}
		System.out.println("Mobiles Pages:");
		for (WebElement element : page) {
			Thread.sleep(2000);
			System.out.print(element.getText() + " ; ");
		}
		System.out.println();
		System.out.println(d.getCurrentUrl());
		for(int i=0;i<page.size();i++) {
			
			page.get(i).click();
			Thread.sleep(2000);
			System.out.println(d.getCurrentUrl());
			page=d.findElements(By.cssSelector(".nav-pages>a"));
		}
		d.close();
	}

}
