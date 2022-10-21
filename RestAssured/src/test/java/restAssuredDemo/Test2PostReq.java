package restAssuredDemo;

import org.testng.annotations.*;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Test2PostReq {
	
//		Endpoint/API/URI : https://reqres.in/api/users
	
	@Test
	public void getUserDetails()
	{
		RestAssured.baseURI = "https://reqres.in";
		
		String createResponce=given().header("Content-Type","application/json").body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}")
		.when().post("api/users")
		.then().assertThat().statusCode(201).extract()
			.response().asPrettyString();
			
		System.out.println(createResponce);
	}
}
