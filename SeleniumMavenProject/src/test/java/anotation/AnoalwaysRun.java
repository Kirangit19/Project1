package anotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnoalwaysRun {
  @Test(alwaysRun=true)
  public void test1() {
	  Assert.assertTrue(false);
	  System.out.println("This is test 1");
  }
  @Test(alwaysRun=true)
  public void test2() {
	  Assert.fail("Method fail");
	  System.out.println("This is test 2");
	  
  }
  @Test
  public void test4() {
	  System.out.println("This is test 4");
	  
  }
  @Test(dependsOnMethods="test1")
  public void test3() {
	  System.out.println("This is test 3");
  }
  
}
