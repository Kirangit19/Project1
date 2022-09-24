package sample;

import org.testng.annotations.Test;

public class Sample3 {
	int age =25;
	
  @Test
  public void b_login() {
	  System.out.println("I am  login..");
	  System.out.println("age : "+age);
	  }
  @Test
  public void c_compose() {
	  System.out.println("I am compose");
  }
  @Test
	public void a_signUp() {
		System.out.println("I am signup....");
	}
}


//Test cases execute as per method nomenclature