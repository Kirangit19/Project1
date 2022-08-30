package com.DropDown;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop01 {

	public static void main(String[] args) throws Exception {
		FileInputStream f=new FileInputStream(".\\Textdata\\AutomationTesting.properties");
		Properties p=new Properties();
		p.load(f);
		
		String Key=p.getProperty("Key");
		String Path=p.getProperty("Path");
		String Link=p.getProperty("Link");
		
		String path=System.getProperty("user.dir")+Path;
		System.setProperty(Key, path);
		
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		
		d.get(Link);
		
		WebElement skill=d.findElement(By.id("Skills"));
		Select ss=new Select(skill);
		System.out.println(ss.isMultiple());
		System.out.println(ss.getFirstSelectedOption().getText());
		
		List<WebElement> list=ss.getOptions();
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(i+" : "+list.get(i).getText());
		}
		ss.selectByIndex(3);
		System.out.println("Selected option : "+ss.getFirstSelectedOption().getText());

		ss.selectByValue("Android");
		System.out.println(ss.getFirstSelectedOption().getText());
		ss.selectByVisibleText("Analytics");
		System.out.println(ss.getFirstSelectedOption().getText());
		
		WebElement year=d.findElement(By.id("yearbox"));
		Select ys=new Select(year);
		System.out.println(ys.isMultiple());
		
		List<WebElement>L1=ys.getOptions();
		List L2=new ArrayList ();
		for(WebElement w:L1) {
			System.out.print(w.getText()+" ");
			L2.add(w.getText());
		}		
		List tem=new ArrayList<>();
		System.out.println("");
		tem=L2;
		Collections.sort(tem);
		System.out.println("Year ascending order validation : "+L2.equals(tem));
/*************************************************************************************************************/		
		Select month=new Select(d.findElement(By.cssSelector("[placeholder=\"Month\"]")));
		
		List<WebElement>M=month.getOptions();
		for(WebElement w1:M) {
			System.out.print(w1.getText()+" ");
		}System.out.println();
/***********************************************************************************************************/
		Select day=new Select(d.findElement(By.id("daybox")));
		List<WebElement>dl=day.getOptions();
		List original=new ArrayList<>();
		for(WebElement w2:dl) {
			System.out.print(w2.getText()+" ");
			String S2=w2.getText();
			original.add(S2);
		}System.out.println();
		List temp=new ArrayList<>();
		temp=original;
		Collections.sort(temp);
		System.out.println("Days ascending order validation : "+original.equals(temp));
		d.close();
	}

}

//TODO: perform validation on following
//1. Year(ascending order validation)
//2. Month(month Sequence validation)
//3. Days(ascending order validation)