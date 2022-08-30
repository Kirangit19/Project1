package com.Ass03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "K:\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");

		WebDriver r1 = new ChromeDriver();
		r1.manage().window().maximize();
		r1.get("https://www.amazon.in/");
		r1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String r2 = r1.getTitle();   // Data type variable=Literal;
		System.out.println("page title : " + r2);
		String r3 = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.out.println("page title validation : " + r2.contains(r3));

		String eurl=r1.getCurrentUrl();
		String url = "https://www.amazon.in/";
		System.out.println("page url:" + eurl);
		Thread.sleep(2000);
		System.out.println("page url validation:" + eurl.contains(url));

		String ps = r1.getPageSource();
		System.out.println("page source length:" + ps.length());
		Thread.sleep(2000);
		
		
		r1.findElement(By.cssSelector("div>div>div#nav-xshop>a")).click();
		r1.navigate().back();
		String r4=r1.getTitle();
		System.out.println("Title page validation : "+r2.equals(r4));
		r1.close();
	}

}
