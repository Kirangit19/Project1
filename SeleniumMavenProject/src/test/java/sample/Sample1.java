package sample;

import org.testng.annotations.Test;

public class Sample1 {
	int age =25;
	void display() {
		System.out.println("I am display....");
	}
  @Test
  public void test() {
	  System.out.println("I am test");
	  System.out.println("age : "+age);
	  display();
  }
}
