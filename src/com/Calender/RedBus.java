package com.Calender;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class RedBus {

	public static void main(String[] args) throws Exception {
		
		FileInputStream f=new FileInputStream(".\\Textdata\\RedBus.properties");
		Properties p=new Properties();
		p.load(f);
		
		String key=p.getProperty("key");
		String path=p.getProperty("path");
		String link=p.getProperty("link");
//		String key=p.getProperty("link");
		
		System.setProperty(key, path);
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get(link);
		
		d.findElement(By.id("src")).sendKeys("Pune");
		d.findElement(By.cssSelector("[data-id=\"67159\"]"));
		
		d.findElement(By.id("dest")).sendKeys("Goa");
		d.findElement(By.cssSelector("[data-id=\"67123\"]"));
		
		d.findElement(By.cssSelector("#onward_cal")).click();
		Thread.sleep(3000);
		d.findElement(By.cssSelector("td.next")).click();
		d.findElement(By.cssSelector("div.rb-calendar:nth-child(21) table.rb-monthTable.first.last tbody:nth-child(1) tr:nth-child(4) > td.wd.day:nth-child(5)")).click();
		d.findElement(By.id("search_btn")).click();
		
		System.out.println("Booking Page title : "+d.getTitle());
		Thread.sleep(2000);		
		d.findElement(By.cssSelector("[for=\"dtAfter 6 pm\"].custom-checkbox")).click();
//		d.navigate().refresh();
		Thread.sleep(3000);
		d.findElement(By.cssSelector("[for=\"bt_AC\"].custom-checkbox")).click();
/***************************************************************************************************************/
		List<WebElement> name=d.findElements(By.cssSelector("[class=\"travels lh-24 f-bold d-color\"]"));
		List L1=new ArrayList<>();
		System.out.println("List of Bus Names : ");
		for(WebElement w:name) {
			System.out.println(w.getText());
			L1.add(w.getText());
		}
System.out.println("*****************************************************************************");
		List<WebElement> price=d.findElements(By.cssSelector("[class=\"f-19 f-bold\"]"));
		List<Float> L2=new ArrayList<Float>();
		System.out.println("Price  : ");
		for(WebElement w1:price) {
			System.out.println(w1.getText());
			String s=w1.getText();
			L2.add(Float.parseFloat(s));
		}
//		Iterator<String> i=L1.iterator();
//		while(i.hasNext()) {
		System.out.println(L1+" : "+L2);
//		}
		
		d.close();
	}

}
