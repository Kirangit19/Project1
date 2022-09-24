package dataProvider;

import org.testng.annotations.Test;

public class GroupExample {
	
	@Test(groups="Calculation")
	public void Addition() {
	System.out.println("Addition 1");	
	}
	@Test(groups="Maths")
	public void Substraction() {
		System.out.println("Substraction 1");	
	}
	@Test(groups="Calculation")
	public void Multiplication() {
		System.out.println("Multiplication 1");	
	}
	@Test(groups="Maths")
	public void Division() {
		System.out.println("Division 1");	
	}
	@Test(groups="Calculation")
	public void Modulus() {
		System.out.println("Modulus 1");	
	}
	@Test(groups="Maths")
	public void Percentage() {
		System.out.println("Percentage 1");	
	}
}
