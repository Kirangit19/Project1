package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilities {

	public static WebDriver driver = null;
	public static Actions action = null;
	public static WebDriverWait wait;

	public static WebDriver setUp(String browserName, String appUrl) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			// use setup method of WebDriverManager
			WebDriverManager.chromedriver().setup();
//				System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
			// step2: create an instance of Chrome Browser
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			// use setup method of WebDriverManager
			// WebDriverManager.iedriver().setup();
			System.setProperty("webdriver.ie.driver", ".\\Executable\\IEDriverServer.exe");
			// step2: create an instance of Chrome Browser
			driver = new InternetExplorerDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// use setup method of WebDriverManager
			WebDriverManager.firefoxdriver().setup();
//				System.setProperty("webdriver.gecko.driver", ".\\Executable\\geckodriver.exe");
			// step2: create an instance of Chrome Browser
			driver = new FirefoxDriver();
		}
		// maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);

		try {
			if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
//				System.out.println("Alert not displayed");
			} else {
				driver.switchTo().alert().accept();
				// O0R
//			driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		driver.get(appUrl);
		action = new Actions(driver);
		return driver;
	}

	public static void initialization() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}
	//This is for click Action
	public void clickingOnWebElement(WebElement element) {
	element. click();
	}
	//This is for sendkeys Action:::: on text field.
	public void sendkeysOnWebElement (WebElement element, String text) {
	element. click();
	element. clear();
	element. sendKeys (text);
	}
	// This method is for selecting dropdownlist
	public void selectByVisibleText(WebElement element, String text) {
	Select select = new Select (element);
	select.selectByVisibleText(text);
	}
	//accepting an alert from UI
	public void acceptAlert (WebDriver driver) {
	driver. switchTo() .alert().accept();
	}

	
	public void performClick(WebElement element) {
		element.click();
	}

	public void typeInput(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public String getCurrentWorkingDir() {
		String currentDir = System.getProperty("user.dir");
		return currentDir;
	}

	public void copyTextFromField(WebElement element) {
		action.doubleClick(element).perform();
		element.sendKeys(Keys.chord(Keys.CONTROL, "c"));
	}

	public void pasteTextInToField(WebElement element) {
		element.sendKeys(Keys.chord(Keys.CONTROL, "v"));
	}

	public void waitTillElementIsClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
//		public WebElement explicitewait(WebElement driver,By locator,int timeout) {
//			WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(timeout));
//			wait.until(ExpectedConditions.elementToBeClickable(locator));
//			return driver.findElement(locator);
//		}
//		public static WebElement waitForelementWithFluentWait(WebDriver driver, final By locator) {
//				Wait<WebDriver> w = new FluentWait<WebOriver>(driver)
//				.withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(2))
//				.ignoring(Exception.class);
//
//				w.until(ExpectedConditions.visibilityOfElementLocated(locator));
//		}

//		public List<WebElement> getAllElements(String locatorType,String locatorValue){
//			//switch  case
//		}

	public String getValueFromPropertyFile(String fileName, String key) {
		Properties prop = getPropertyFile(fileName);
		return prop.getProperty(key);
	}

	public Properties getPropertyFile(String fileName) {
		String filePath = getCurrentWorkingDir() + fileName;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

//			parent p=new parent();   ---parent objct
//			parent p1=new child();    ---Upcasting 
//			child =(child)p1;		----DownCasting
//			
	public void takeScreenshot() {
//			TakesScreenshot ts = (TakesScreenshot) driver;   //---DownCasting			
//			File src = ts.getScreenshotAs(OutputType.FILE);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(".\\screenShot\\" + this.getClass().getName() + "screenshot01.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String screenShot(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../BStackImages/" + System.currentTimeMillis() + ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
	}

	public void performDranAndDrop(WebElement src, WebElement target) {
		action.moveToElement(src).dragAndDrop(src, target).build().perform();
	}

	public void cleanUp() {
		driver.close();
	}

	public void rightClick(WebElement option) {
		action.moveToElement(option).contextClick().build().perform();
	}

	public void mouseHoverWithCords(WebElement option, int x, int y) {
		action.moveToElement(option, x, y).perform();
	}

	public void mouseHover(WebElement element) {
		action.moveToElement(element).perform();
	}

	public void doubleClick(WebElement element) {
		action.moveToElement(element).doubleClick().perform();
	}

//		public void switchToRequiredFrameUsingName(String name) {
//			driver.switchTo().frame(name);
//		}
	//
//		public void switchToRequiredFrameUsingWebElement(WebElement element) {
//			driver.switchTo().frame(element);
//		}
	//
//		public void switchToRequiredFrameUsingIndex(int index) {
//			driver.switchTo().frame(index);
//		}
	//
//		public void switchControlBackToMainPage() {
//			driver.switchTo().defaultContent();
//		}
	//
//		public WebElement getActiveElement() {
//			return driver.switchTo().activeElement();
//		}
	// methods for select dropdown
	public void dropDown(WebElement element) {
		Select select = new Select(element);
		select.selectByIndex(1);
	}

	public void bootStrapDropDown(WebElement element, List<WebElement> list) {
		action.moveToElement(element).click().build().perform();
		for (WebElement w : list) {
			System.out.println(w.getText());
		}
	}

	// title
	public String pageTitle() {
		String title = driver.getTitle();
		System.out.println("Current page title : " + title);
		return title;
	}

	// currentUrl
	public void pageUrl() {
		String Url = driver.getCurrentUrl();
		System.out.println("Current page URL : " + Url);
	}

	// attribute
	public void elementAttribute(WebElement element) {
		System.out.println(element.getAttribute("id"));
	}

	// inner text
	public void innerText(WebElement element) {
		System.out.println(element.getText());
	}

	// Window handling ---> not now
	// Alert Handling ---> not now
	// calendar handling
	public void calenderHandle(WebElement element) {

	}
}
