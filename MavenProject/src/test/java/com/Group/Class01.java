package com.Group;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Class01 {
	@Ignore
	@Test (groups= "Integration",priority=0)
	public void Method01() {
		System.out.println("Method 01");
	}
	@Test(groups= {"smoke","Integration"},priority=1)
	public void Method02() {
		System.out.println("Method 02");
	}
	@Test(groups= {"Integration"},priority=2)
	public void Method03() {
		System.out.println("Method 03");
	}
	@Test(groups= {"smoke","Integration"},priority=1)
	public void Method04() {
		System.out.println("Method 04");
	}
	@Test(groups= {"snaity","Integration"},priority=-1)
	public void Method05() {
		System.out.println("Method 05");
	}
}
