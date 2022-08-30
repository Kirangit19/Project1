package mouseOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOp3 {

	public static void main(String[] args) {
		
		String chromeExePath = System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		// frame handling
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);

		// create an instance of Actions class by passing required browser instance to
		// its constructor
		Actions act = new Actions(driver);

		List<WebElement> sourceElements = driver.findElements(By.cssSelector("ul#gallery>li"));
		WebElement target = driver.findElement(By.id("trash"));

//		act.dragAndDrop(sourceElements.get(0), target).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(sourceElements.get(1), target).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(sourceElements.get(2), target).build().perform();
		
		performDranAndDrop(act, sourceElements.get(0), target);
	}
	
	static void performDranAndDrop(Actions act,WebElement src,WebElement target) {
		act.dragAndDrop(src, target).build().perform();
	}

}
