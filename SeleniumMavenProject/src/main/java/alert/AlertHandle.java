package alert;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandle {
	WebDriver driver = new ChromeDriver();


	public void expectedCondition() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
				System.out.println("Alert not displayed");
			} else {
				driver.switchTo().alert().accept();
				// O0R
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}


	public void AlertClass() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException ne) {
			System.out.println("Alert not displayed");
			ne.printStackTrace();
		}

	}

	public void getWindowHandles() {

		Set<String> wids = driver.getWindowHandles();
		if (wids.size() > 1) {
			driver.switchTo().window("give name or window handle");
			try {
				WebElement elementOnPopup = driver.findElement(By.id("test"));
				if (elementOnPopup.isDisplayed()) {
					elementOnPopup.click();
				}
			} catch (NoSuchElementException ne) {

				System.out.println("Alert is displayed but colud not click on Yes/Ok button");
			}
		}
	}

}
