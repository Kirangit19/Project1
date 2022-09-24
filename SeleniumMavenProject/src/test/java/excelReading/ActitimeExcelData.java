package excelReading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utilities.ExcelUtility;
import com.Utilities.Utilities;

public class ActitimeExcelData extends Utilities {

	String appUrl;
	String userName;
	String passWord;

	@BeforeTest
	public void getData() {
		appUrl = ExcelUtility.getCellValue(".\\src\\test\\java\\excelReading\\TestData.xlsx", 
				"Sheet1", 1,0);
		userName = ExcelUtility.getCellValue(".\\src\\test\\java\\excelReading\\TestData.xlsx",
				"Sheet1", 1,1);
		passWord = ExcelUtility.getCellValue(".\\src\\test\\java\\excelReading\\TestData.xlsx",
				"Sheet1", 1,2);
	}
	@Test
	public void actitimeLogin() {
		WebDriver driver=setUp("chrome", appUrl);
		
		WebElement un=driver.findElement(By.id("username"));
		un.clear();
		un.sendKeys(userName);
		WebElement pw=driver.findElement(By.id("password"));
		pw.clear();
		pw.sendKeys(passWord);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		String actTitle=driver.getTitle();
		String expTitle="Home";
//		Assert.assertEquals(actTitle, expTitle, "This is wrong Title");
		String result;
		if(actTitle.equals(expTitle)) {
			 result="Passed";
		}else {
			 result="Fail";
		}
		ExcelUtility.updateExcel(".\\src\\test\\java\\excelReading\\TestData.xlsx",
				"Sheet1", 1, 4, actTitle);
		ExcelUtility.updateExcel(".\\src\\test\\java\\excelReading\\TestData.xlsx",
				"Sheet1", 1, 5, result);
	}
	@AfterTest
	public void cleanup() {
		cleanUp();
	}
//	<class name="excelReading.ActitimeExcelData"/>
}
