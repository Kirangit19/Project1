package com.Group;

import org.testng.annotations.Test;

public class Class02 {
	
	@Test(groups= {"smoke"},priority=1)
	public void Method01() {
		System.out.println("Method 1");
	}
	@Test	(groups= {"smoke","Integration"},priority=1)
	public void Method02() {
		System.out.println("Method 2");
	}
	@Test(groups= {"sanity"},enabled=false)
	public void Method03() {
		System.out.println("Method 3");
	}
	@Test(groups= {"smoke","Integration"})
	public void Method04() {
		System.out.println("Method 4");
	}
	@Test(groups= {"sanity","Integration"})
	public void Method05() {
		System.out.println("Method 5");
	}
}
