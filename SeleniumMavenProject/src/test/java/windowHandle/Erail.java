package windowHandle;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://erail.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(d, 10);
				
		d.findElement(By.xpath("//a[contains(text(),'eCatering')]")).click();
		Set<String> allWID=d.getWindowHandles();
//		allWID.remove(hpWID);
		Iterator<String> i=allWID.iterator();
		String hpWID=i.next();
		String childWID=i.next();
		d.switchTo().window(childWID);
		Actions act=new Actions(d);
		
		d.findElement(By.cssSelector("[placeholder=\"Search Train or Station to explore\"]")).click();
		d.findElement(By.xpath("//button[text()='12616']")).click();
		d.findElement(By.cssSelector("[name=\"date\"]")).click();
		act.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build().perform();
		act.sendKeys(Keys.TAB,Keys.ENTER).build().perform();
		Thread.sleep(2000);
		WebElement station=d.findElement(By.cssSelector("[placeholder=\"Boarding Station\"]"));
		station.click();
		Select s=new Select(station);
		Thread.sleep(8000);
		s.selectByIndex(2);
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[contains(text(),'FIND FOOD')]")).click();
		List<WebElement> junction=d.findElements(By.xpath("//div[@class=\"flex flex-col\"]//div[@class=\"text-lg \"]"));
		for(WebElement stop: junction) {
			stop.click();
			System.out.print(stop.getText()+" : ");
			WebElement result=d.findElement(By.xpath("//small[@class=\"text-gray-60 text-base tracking-wide\"]"));
			Thread.sleep(2000);
			System.out.println(result.getText());
		}
		d.quit();
	}

}
