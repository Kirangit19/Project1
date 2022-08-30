package com.Ass04;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://www.gsmarena.com/samsung-phones-9.php");
		List<WebElement> mobiles=d.findElements(By.cssSelector("aside>div>ul>li>a"));
		System.out.println("Number of Phones : "+mobiles);
//		Iterator i=mobiles.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		System.out.println("Mobiles :");
		for(WebElement i : mobiles) {
			System.out.print(i.getText()+" ; ");
		}
		d.close();
	}

}
