package com.Ass04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricinfo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.espncricinfo.com/");
		
		List<WebElement> w=d.findElements(By.cssSelector("div[class=\"ds-popper-wrapper\"]>a"));
		
		System.out.println("Main menu option count: "+w.size());
		for(WebElement e:w) {
			System.out.println(e.getText());
		}
		d.close();
	}

}
