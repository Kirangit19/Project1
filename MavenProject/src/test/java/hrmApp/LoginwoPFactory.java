package hrmApp;

import org.testng.annotations.*;

import com.Pack1.Utilities;
import com.hrm.LoginwithoutPFactory;

public class LoginwoPFactory extends Utilities {

	@BeforeClass
	public void startHrm() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}	
	
	@Test
	public void LoginPage() {
		LoginwithoutPFactory lwpf=new LoginwithoutPFactory(driver);
		
		lwpf.username("Admin");
		lwpf.password("admin123");
		lwpf.loginButton();
	}
	
	@AfterClass
	public void endHrm() {
		driver.close();
	}
	
}
