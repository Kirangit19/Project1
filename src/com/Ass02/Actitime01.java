package com.Ass02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime01 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream f=new FileInputStream(".\\Textdata\\ActitimeData.properties");
		Properties p=new Properties();
		p.load(f);
		
		String Key=p.getProperty("Key");
		String Path=p.getProperty("Path");
		String Link=p.getProperty("Link");
		String Username=p.getProperty("Username");
		String Password=p.getProperty("Password");
		String name=p.getProperty("name");
		
		System.setProperty(Key, Path);
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get(Link);
		
		System.out.println(d.getTitle());
		System.out.println(d.getTitle().length());
		
		String url=d.getCurrentUrl();
		String eurl=Link;
		System.out.println("Page URL Validation: "+url.contains(eurl));
		
		WebElement user=d.findElement(By.id("username"));
		user.clear();
		user.sendKeys(Username);
		user.click();
		
		WebElement pass=d.findElement(By.className("pwdfield"));
		pass.clear();
		pass.sendKeys(Password);
		pass.click();
		
		WebElement button=d.findElement(By.id("loginButton"));
		button.click();
		
		System.out.println(d.getTitle());
		
		Thread.sleep(2000);
		d.findElement(By.cssSelector("td:nth-of-type(4)>a")).click();
		d.findElement(By.cssSelector("div.title.ellipsis")).click();
		
		d.findElement(By.cssSelector("div.item.createNewTasks")).click();
		d.findElement(By.cssSelector("div.customerSelector>div>div>div:nth-of-type(3).dropdownButton")).click();
		d.findElement(By.cssSelector("div.searchItemList>div:nth-of-type(3).itemRow.cpItemRow")).click();
		
		Thread.sleep(2000);
		d.findElement(By.cssSelector("div.projectSelector>div>div>div:nth-of-type(3).dropdownButton")).click();
		d.findElement(By.cssSelector("div[style=\"overflow-y: hidden;\"] >div>div>div:nth-of-type(4).itemRow")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("tr:nth-of-type(1)>td:nth-of-type(6)>label>span.checkmark")).click();
				
		d.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("Testing1");
		d.findElement(By.cssSelector("div.basicLightboxFooter div.buttonsBox div.components_button_label")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("tr.taskRow .checkbox.inactive .img")).click();
		
		List<WebElement>task=d.findElements(By.cssSelector(".namesContainer"));
		List<String> list=new ArrayList<String>();
		for(WebElement w: task) {
			list.add(w.getText());
		}
		System.out.println(list.contains("Testing1"));
		d.findElement(By.cssSelector(".delete.button")).click();
		d.findElement(By.cssSelector(".dialogWithPointerWrapper  .submitTitle.buttonTitle")).click();
		
		System.out.println("Page Title "+d.getTitle());
		
		d.close();
	}

}

/**
 * In order to perform any operation on any element first identify it from WebPage, 
 * for that use findElement()
 * 
 * WebElement element= driver.findElement(By.locator()); --> use to identify the element from the Web page 
 * 														and return WebElement
 * 				---> By ---> predefined class which has several static method known as locators
 * 						--->id(string), name(string), linkText(string), partialLinkText(string)
 * 							className(string), tagName(string), cssSelector(String), xpath(String)
 * Once you identified the element, you can perform the required operation like-
 * 1. type				--> element.sendKeys("");
 * 2. click				--> element.click();
 * 3. delete existing text-> element.clear();
 */