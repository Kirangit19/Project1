package hrmApp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pack1.Utilities;
import com.hrm.LoginPFactory;
import com.hrm.LoginwithoutPFactory;

public class LoginHRMPF extends Utilities {

	@BeforeClass
	public void startHrm() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}	
	
	@Test
	public void LoginPage() {
		LoginPFactory lwpf=new LoginPFactory(driver);
		
		lwpf.username("Admin");
		lwpf.password("admin123");
		lwpf.Loginbutton();
	}
	
	@AfterClass
	public void endHrm() {
		cleanUp();
	}
}
