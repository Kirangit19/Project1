package mavenproject1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumUtilities {
	public WebDriver setup(String browserType,String appUrl) {
		WebDriver d=null;
		if(browserType.equalsIgnoreCase("chrome")) {
		String path=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		d=new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("firefox")) {
			String path=System.getProperty("user.dir")+"\\Executable\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);
			d=new FirefoxDriver();
			}
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get(appUrl);
		return d;		
	}

	public static void main(String[] args) throws Throwable {
		SeleniumUtilities su=new SeleniumUtilities();
		WebDriver d=su.setup("chrome", "https://www.google.co.in/");
		
		TakesScreenshot ts=(TakesScreenshot)d;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File(".//screenShot//img2.png"));
		d.close();
	}

}
