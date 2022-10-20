package testDependency;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OnMethods {
	//dependsOnMethods consider over priority
	@Test (priority=-1,dependsOnMethods="Method5",alwaysRun=true) //alwaysRun helps to run in any condition 
	public void Method1() {
		System.out.println("This is Method1");
	}
	
	@Test	(dependsOnMethods="Method1",ignoreMissingDependencies=true)
	public void Method2() {
		System.out.println("This is Method2");
	}
	
	@Test	(dependsOnMethods= "Method2")
	public void Method3() {
		System.out.println("This is Method3");
	}
	
	@Test (dependsOnMethods= {"Method5","Method1"})
	public void Method4() {
		System.out.println("This is Method4");
	}
	//If main test fail then dependent test get skip
//	@Ignore 	//dependent test cases get failed and shows exception		
	@Test
	public void Method5() {
		System.out.println("This is Method5");
		Assert.assertEquals(false, true);
	}
}
