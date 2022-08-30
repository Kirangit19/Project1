package com.Ass04;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://www.gsmarena.com/samsung-phones-9.php");
		
		d.findElement(By.cssSelector("a[href=\"samsung-phones-9.php\"]")).click();
		List<WebElement> mobiles=d.findElements(By.cssSelector("strong>span"));
		System.out.println("Number of Phones : "+mobiles);
		
		System.out.println("Mobiles :");
		for(WebElement i : mobiles) {
			System.out.print(i.getText()+" ; ");
		}
		d.close();
	}

}
