package mouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		String chromeExePath = System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";	
		System.setProperty("webdriver.chrome.driver", chromeExePath);		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://the-internet.herokuapp.com/drag_and_drop");
		WebElement src=d.findElement(By.xpath("//div[@id=\"columns\"]/div[1]"));
		WebElement target=d.findElement(By.xpath("//div[@id=\"columns\"]/div[2]"));
		
		Actions a=new Actions(d);
		a.dragAndDrop(src, target).build().perform();
		
//		a.clickAndHold(src).moveToElement(target).release().build().perform();
	}

}
