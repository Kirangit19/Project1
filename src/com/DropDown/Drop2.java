package com.DropDown;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Driver;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop2 {

	public static void main(String[] args) throws Exception {
		String driverPath = System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		//**** Identify dropdown list
		WebElement skillDropdown=driver.findElement(By.id("Skills"));
		
		//**** Create an instance of Select class and pass above element into its constructor
		Select selectSkill=new Select(skillDropdown);
		
		//**** check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown is allowing you to select multiple option: "+selectSkill.isMultiple());
		
		//**** get default or already select option
//		WebElement selectedOption=selectSkill.getFirstSelectedOption();
//		String selectedOptionName=selectedOption.getText();
//		System.out.println("Already selected option name: "+selectedOptionName);
					//or
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
		
		//get option count 
		List<WebElement> options=selectSkill.getOptions();
		System.out.println("Option count is:"+options.size());
		//Get dropdown option names
		for(int i=0;i<options.size();i++) {
			System.out.println("Option "+i+": "+options.get(i).getText());
		}
		 
		//TODO: validation dropdown skills are getting displayed in ascending order
		
		//select options from dropdown
		selectSkill.selectByIndex(4);
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
				//or
		selectSkill.selectByValue("Backup Management");
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
				//or
		selectSkill.selectByVisibleText("Analytics");
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
	
		//TODO: perform validation on following
		//1. Year(ascending order validation)
		//2. Month(month Sequence validation)
		//3. Days(ascending order validation)
		
	}

}
