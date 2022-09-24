package switchTo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoqaAlerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(d, 10);
		
		d.findElement(By.xpath("//button[@id='alertButton']")).click();
		d.switchTo().alert().accept();
		
		d.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		d.switchTo().alert().accept();
		
		d.findElement(By.xpath("//button[@id='confirmButton']")).click();
		d.switchTo().alert().accept();
		
		d.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert an=d.switchTo().alert();
		an.sendKeys("Kiran");
		an.accept();
				
	}

}
