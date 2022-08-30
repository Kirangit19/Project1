package mouseOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		
		String chromeExePath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://www.flipkart.com/");	
		d.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		List<WebElement> menu=d.findElements(By.xpath("//div[@class=\"eFQ30H\"]"));
		
		System.out.println("Flipkart Menu Options : ");
		Actions a=new Actions(d);
		for(int i=0;i<menu.size();i++) {
			System.out.println(menu.get(i).getText());
			a.moveToElement(menu.get(i)).build().perform();
		}		
	}
}
