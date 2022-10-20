package testDependency;

import org.testng.annotations.Test;

public class OnGroups2 {
	
	@Test	(groups="sanity")
	public void Method3() {
		System.out.println("This is Method3");
	}
	@Test	(groups="smoke")
	public void Method1() {
		System.out.println("This is Method1");
	}
	@Test	(groups="functional")
	public void Method4() {
		System.out.println("This is Method4");
	}
	@Test	(groups="smoke")
	public void Method2() {
		System.out.println("This is Method2");
	}
}
