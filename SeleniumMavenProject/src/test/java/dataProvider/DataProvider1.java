package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@Test(dataProvider="getData")
	public void test1(String user,String pas,int mobile) {
		
	}
  @DataProvider
  public Object[][]getData() {
	  Object[][] ob=new Object[2][3];
	  
	  ob[0][0]="username";
	  ob[0][1]="password";
	  ob[0][2]=123;
	  
	  ob[1][0]="username1";
	  ob[1][1]="password2";
	  ob[1][2]=1234;
	  return ob;
  }
}
