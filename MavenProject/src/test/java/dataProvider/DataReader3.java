package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataReader3 {

	@Test (dataProvider="logintestData",dataProviderClass= DataContainer.class)
	public void LoginTest(String username) {
		
		System.out.println(username);
	}
	
	
	
}
