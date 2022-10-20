package dataProvider;

import org.testng.annotations.Test;

public class ExcelDataReader {

	@Test (dataProvider="ExcelData",dataProviderClass=ExcelDataProvider.class)
	public void LoginTest(String username,String password) {
		
		System.out.println(username+" "+password);
	}
}
