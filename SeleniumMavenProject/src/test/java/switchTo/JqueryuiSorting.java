package switchTo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryuiSorting {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://jqueryui.com/");
		
		d.findElement(By.xpath("//a[text()='Sortable']")).click();
		d.switchTo().frame(0);
		Actions act=new Actions(d);
		act.dragAndDrop(d.findElement(By.xpath("//li[text()='Item 7']")), d.findElement(By.xpath("//li[text()='Item 1']"))).build().perform();
		act.dragAndDrop(d.findElement(By.xpath("//li[text()='Item 6']")), d.findElement(By.xpath("//li[text()='Item 1']"))).build().perform();
		act.dragAndDrop(d.findElement(By.xpath("//li[text()='Item 5']")), d.findElement(By.xpath("//li[text()='Item 1']"))).build().perform();
		act.dragAndDrop(d.findElement(By.xpath("//li[text()='Item 4']")), d.findElement(By.xpath("//li[text()='Item 1']"))).build().perform();
		act.dragAndDrop(d.findElement(By.xpath("//li[text()='Item 3']")), d.findElement(By.xpath("//li[text()='Item 1']"))).build().perform();
		act.dragAndDrop(d.findElement(By.xpath("//li[text()='Item 2']")), d.findElement(By.xpath("//li[text()='Item 1']"))).build().perform();
		
		List<WebElement>list=d.findElements(By.xpath("//ul[@id=\"sortable\"]/li"));
		for(WebElement w:list) {
			System.out.println(w.getText());
		}
	}

}
