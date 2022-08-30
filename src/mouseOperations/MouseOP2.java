package mouseOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOP2 {

	public static void main(String[] args) throws Exception {
		
		String chromeExePath = System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.globalsqa.com/demo-site/");
		// identify all the elements of main menu
		List<WebElement> mainMenu = driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		System.out.println("Main Menu option count: " + mainMenu.size());
		// create an instance of Actions class by passing required browser instance to
		// its constructor
		Actions act = new Actions(driver);
		// to do hover over the Home option
		// act.moveToElement(mainMenu.get(0)).perform();

//		for(int i=0;i<mainMenu.size();i++) {
//			WebElement option=mainMenu.get(i);
//			act.moveToElement(option).perform();
//			Thread.sleep(1000);
//		}
		// mouseHoverOverTheElement(act, mainMenu.get(2));
		// mouseHover(act, mainMenu);
		// act.moveToElement(mainMenu.get(1), 100, 0).perform();
		// mouseHoverWithCords(act, mainMenu.get(1),100,0);

		rightClick(act, mainMenu.get(1));
		
//		mouseHover(act, mainMenu);
	}

	static void mouseHoverOverTheElement(Actions act, WebElement element) {
		act.moveToElement(element).perform();
	}

	static void rightClick(Actions act, WebElement option) {
		System.out.println("Option name is : " + option.getText());
		act.moveToElement(option).contextClick().build().perform();
		// act.contextClick(option).build().perform();
	}

	static void mouseHoverWithCords(Actions act, WebElement option, int x, int y) throws InterruptedException {
		System.out.println("Option name is : " + option.getText());
		act.moveToElement(option, x, y).perform();
	}

	static void mouseHover(Actions act, List<WebElement> mainMenu) throws InterruptedException {
		for (int i = 0; i < mainMenu.size(); i++) {
			WebElement option = mainMenu.get(i);
			act.moveToElement(option).perform();
			Thread.sleep(1000);
		}
	}
}
