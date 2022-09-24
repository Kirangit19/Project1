package actitimeTestNG;

import org.testng.annotations.Test;

public class Actitime_enabled{
  @Test(enabled=true,timeOut=200)
  public void openBrowserAndAppURL() throws InterruptedException {
		Thread.sleep(180);
		System.out.println("Open browser and enter app url");
	}
  @Test(enabled=false)
  public void login() {
	  System.out.println("Enter username ");
  }
  @Test(enabled=true)
	public void createTask() {
		System.out.println("create new task");
	}
	@Test(enabled=false)
	public void logoutClose() {
		System.out.println("Logout from the application and close the browser");
	}
}
