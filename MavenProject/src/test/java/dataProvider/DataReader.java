package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataReader {

	@Test (dataProvider="logintestData")
	public void LoginTest(String username,String password) {
		
		System.out.println(username+" "+password);
	}
	
	@DataProvider
	public Object logintestData() {
		Object [][] data=new Object[2][2];
		data [0][0]="Admin";
		data [0][1]="123";
		
		data [1][0]="Admin123";
		data [1][1]="admin123";
		return data;
	}
	
}
