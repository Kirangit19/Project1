package restAssuredDemo;

import org.testng.annotations.Test;
import io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;

public class Test1GetReq {

	@Test
	public void getUserDetails()
	{
		given()
		.when().get("https://reqres.in/api/users?page=2")
		.then()			
			.assertThat().statusCode(200);
			
	}
}
