package mavenproject1;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDM {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");
		
		TakesScreenshot ts=(TakesScreenshot)d;
		File fs=ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(fs, new File(".\\target\\screenshot\\img1.png"));
		
		WebElement search=d.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("Basics",Keys.chord(Keys.CONTROL,"A"));
		search.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		Thread.sleep(2000);
		List<WebElement> op=d.findElements(By.xpath("//div[@class='wM6W7d'] //span[text()='basics']"));
		for(int i=0;i<op.size();i++) {
			op.get(2).click();
			break;
		}
		Thread.sleep(5000);
		FileUtils.copyFile(fs, new File(".\\target\\screenshot\\img2.png"));
		
		d.close();
	}

}
