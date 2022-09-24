package dataProvider;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	@Parameters({"browser"})
	@Test
	public void test1(String browser) {
		System.out.println("Browser Details "+browser);
	}
}
