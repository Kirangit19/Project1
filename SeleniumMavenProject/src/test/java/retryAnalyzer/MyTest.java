package retryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	
	@Test(retryAnalyzer=analyzer.RetryAnalyzer.class)
	public void Test1() {
		Assert.assertEquals(true, true);
	}
	@Test
	public void Test2() {
		Assert.assertEquals(true, true);
	}
}
