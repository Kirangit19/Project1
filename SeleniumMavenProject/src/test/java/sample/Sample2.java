package sample;

import org.testng.annotations.Test;

public class Sample2 {
	int age =25;
	@Test
	public void signUp() {
		System.out.println("I am signup....");
	}
  @Test
  public void login() {
	  System.out.println("I am  login..");
	  System.out.println("age : "+age);
	  }
  @Test
  public void compose() {
	  System.out.println("I am compose");
  }
}
