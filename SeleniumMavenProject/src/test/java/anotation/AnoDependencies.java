package anotation;

import org.testng.annotations.Test;

public class AnoDependencies {
  @Test
  public void test1() {
	  System.out.println("This is test 1");
  }
  @Test
  public void test2() {
	  System.out.println("This is test 2");
  }
  @Test(dependsOnMethods="test1")
  public void test3() {
	  System.out.println("This is test 3");
  }
  
}
