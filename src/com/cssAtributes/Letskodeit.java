package com.cssAtributes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letskodeit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://courses.letskodeit.com/practice");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		
		WebElement openwindow=d.findElement(By.id("openwindow"));
		
		String ow1=openwindow.getCssValue("background-color");
		String ow2=openwindow.getCssValue("font-size");
		String ow3=openwindow.getCssValue("color");
		System.out.println("Open Window Button Details :");
		System.out.println("Font Background Color: "+ow1);
		System.out.println("Font Size: "+ow2);
		System.out.println("Font color: "+ow3);System.out.println();
		
		WebElement opentab=d.findElement(By.id("opentab"));
		
		String ot1=opentab.getCssValue("background-color");
		String ot2=opentab.getCssValue("font-size");
		String ot3=opentab.getCssValue("color");
		System.out.println("Open Tab Button Details :");
		System.out.println("Font Background Color: "+ot1);
		System.out.println("Font Size: "+ot2);
		System.out.println("Font color: "+ot3);System.out.println();
		
		WebElement alertbtn=d.findElement(By.id("alertbtn"));
		
		String ab1=alertbtn.getCssValue("background-color");
		String ab2=alertbtn.getCssValue("font-size");
		String ab3=alertbtn.getCssValue("color");
		System.out.println("Alert Button Details :");
		System.out.println("Font Background Color: "+ab1);
		System.out.println("Font Size: "+ab2);
		System.out.println("Font color: "+ab3);System.out.println();
		
		WebElement confirmbtn=d.findElement(By.id("confirmbtn"));
		
		String cb1=confirmbtn.getCssValue("background-color");
		String cb2=confirmbtn.getCssValue("font-size");
		String cb3=confirmbtn.getCssValue("color");
		System.out.println("Confirm Button Details :");
		System.out.println("Font Background Color: "+cb1);
		System.out.println("Font Size: "+cb2);
		System.out.println("Font color: "+cb3);System.out.println();
		
		WebElement webtable=d.findElement(By.cssSelector("div#table-example-div>div.left-align>fieldset>legend"));
		
		String wt1=webtable.getCssValue("background");
		String wt2=webtable.getCssValue("font-size");
		String wt3=webtable.getCssValue("color");
		System.out.println("Web Table Button Details :");
		System.out.println("Font Background Color: "+wt1);
		System.out.println("Font Size: "+wt2);
		System.out.println("Font color: "+wt3);System.out.println();
		
		d.close();
	}

}
