package anotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class simpleTest {
  
	@BeforeSuite
	public void beforesuite() {
		System.out.println("This is before Suite ");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("This is before Test ");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("This is before class ");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This is before Method ");
	}
	@Test
	public void test1() {
		System.out.println("This is Test case 1 ");
	}
	@Test
	public void test2() {
		System.out.println("This is Test case 2 ");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("This is after method ");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("This is after class ");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("This is after Test ");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is after Suite ");
	}
}
