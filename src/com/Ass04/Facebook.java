package com.Ass04;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
//Day
		d.findElement(By.cssSelector("div._6ltg:nth-of-type(5)")).click();
		WebElement date=d.findElement(By.name("birthday_day"));
		System.out.println("Date Visible : "+date.isDisplayed());
		System.out.println("Date Enable : "+date.isEnabled());
		d.findElement(By.name("birthday_day")).click();
		List<WebElement> s=d.findElements(By.cssSelector("span>span>select#day>option"));	
		System.out.println("Number of Days: "+s.size());
		for(int i=0;i<s.size();i++) {
			System.out.print(s.get(i).getText()+" ; ");
		}
		WebElement d1=d.findElement(By.cssSelector("span>span>select#day>option[selected]"));
		WebElement d2=d.findElement(By.cssSelector("span>span>select#day>option[value=\"19\"]"));
		System.out.println("\n Default Day: "+d1.getText());
		System.out.println("Changed Day: "+d2.getText());		
//Month
		System.out.println("\n******************************");
		d.findElement(By.cssSelector("span>span>select#month")).click();
		WebElement month=d.findElement(By.name("birthday_month"));
		System.out.println("Month Visible : "+date.isDisplayed());
		System.out.println("Month Enable : "+date.isEnabled());
		d.findElement(By.name("birthday_day")).click();
		List<WebElement> s1=d.findElements(By.cssSelector("span>span>select#month>option"));		
		System.out.println("Number of months: "+s1.size());
		for(int i=0;i<s1.size();i++) {
			System.out.print(s1.get(i).getText()+" ; ");
		}
		WebElement m1=d.findElement(By.cssSelector("span>span>select#month>option[selected]"));
		WebElement m2=d.findElement(By.cssSelector("span>span>select#month>option[value=\"5\"]"));
		System.out.println("\n Default Month: "+m1.getText());
		System.out.println("Changed Month: "+m2.getText());
//Year
		System.out.println("\n******************************");
		d.findElement(By.cssSelector("span>span>select#year")).click();
		WebElement year=d.findElement(By.name("birthday_day"));
		System.out.println("Year Visible : "+date.isDisplayed());
		System.out.println("Year Enable : "+date.isEnabled());
		d.findElement(By.name("birthday_day")).click();
		List<WebElement> s2=d.findElements(By.cssSelector("span>span>select#year>option"));		
		System.out.println("Number of years: "+s2.size());
		for(int i=0;i<s2.size();i++) {
			System.out.print(s2.get(i).getText()+" ; ");
		}
		WebElement y1=d.findElement(By.cssSelector("span>span>select#year>option[selected]"));
		WebElement y2=d.findElement(By.cssSelector("span>span>select#year>option[value=\"2020\"]"));
		System.out.println("\n Default year: "+y1.getText());
		System.out.println("Changed year: "+y2.getText());
		d.close();
	}

}
