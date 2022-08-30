package mouseOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Espncricinfo {

	public static void main(String[] args) {
		
		String chromeExePath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://www.espncricinfo.com/");	
//		d.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		List<WebElement> menu=d.findElements(By.xpath("//div[1]/div[@class=\"ds-popper-wrapper\"]"));
		List<WebElement> submenu=d.findElements(By.xpath("//span[@class='ds-grow']"));

		System.out.println("Espncricinfo Menu Options : ");		
		Actions a=new Actions(d);
		for(int i=0;i<menu.size();i++) {
			System.out.println(i+" : "+menu.get(i).getText());
			a.moveToElement(menu.get(i)).build().perform();
			for(int j=i;j<submenu.size();j++) {
				System.out.print("   "+submenu.get(j).getText()+",");
			}
			System.out.println();
		}		
		//Or
		MouseHover(a, menu.get(1));
	}
	static void MouseHover(Actions act,WebElement element) {
		act.moveToElement(element).perform();
	}
}
