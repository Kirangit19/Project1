package com.Ass04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		
		d.findElement(By.cssSelector("button[class=\"_2KpZ6l _2doB4z\"]")).click();
		List<WebElement> w=d.findElements(By.cssSelector("div[class=\"eFQ30H\"]"));
		
		System.out.println("Main menu option count: "+w.size());
		for(WebElement e:w) {
			System.out.println(e.getText());
		}
		d.close();
	}

}
