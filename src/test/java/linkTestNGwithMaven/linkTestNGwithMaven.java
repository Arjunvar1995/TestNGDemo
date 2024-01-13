package linkTestNGwithMaven;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class linkTestNGwithMaven {
	
	@Test
	public void getMethod_1() {
		
		baseURI="https://reqres.in/";
		given().
			get("api/users?page=1").
		then().
			statusCode(200).
			log().all();
	}
	
	@Test
	public void getMethod_2() {
		
		baseURI="https://reqres.in/";
		given().
			get("api/users?page=2").
		then().
			statusCode(200).
			log().all();
	}

}
