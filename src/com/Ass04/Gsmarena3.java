package com.Ass04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena3 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://www.gsmarena.com/samsung-phones-9.php");
		
		d.findElement(By.cssSelector("a[href=\"samsung-phones-9.php\"]")).click();
		List<WebElement> page=d.findElements(By.cssSelector("div.review-nav>div>a"));
		System.out.println("Pagination links: "+page.size());
		System.out.println("Mobiles :");
		for(WebElement i : page) {
			Thread.sleep(2000);
			System.out.print(i.getText()+" ; ");
			WebElement pages=i.findElement(By.cssSelector("div.review-nav>div>a"));
			System.out.println(pages.getText());
			pages.click();
		}
		d.close();
	}

}
