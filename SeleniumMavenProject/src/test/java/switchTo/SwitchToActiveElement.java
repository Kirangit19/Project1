package switchTo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToActiveElement {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://opensource-demo.orangehrmlive.com");
		
		Thread.sleep(2000);
		String user=d.findElement(By.xpath("//p[text()='Username : Admin']")).getText();
		System.out.println("UserName : "+user);
		String name=user.substring(user.indexOf("A"));		
		d.switchTo().activeElement().sendKeys(name,Keys.TAB);
		
		String pass=d.findElement(By.xpath("//p[text()='Password : admin123']")).getText();
		System.out.println("Password : "+pass);
		String passw=pass.substring(11);
		d.switchTo().activeElement().sendKeys(passw,Keys.ENTER);
		
		System.out.println("Page Title validation : "+d.getTitle());		
//		d.close();
	}

}
