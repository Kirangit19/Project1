package com.Ass04;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://www.google.com/");
		
		d.findElement(By.cssSelector("input[class=\"gLFyf gsfi\"]")).sendKeys("Selenium Interview questions");
		List<WebElement> search=d.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
		System.out.println("No of search element :"+search.size());
		for(WebElement c: search) {
			System.out.println(c.getText());
		}
		
		d.close();
	}

}
