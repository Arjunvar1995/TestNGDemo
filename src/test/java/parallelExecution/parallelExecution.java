package parallelExecution;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class parallelExecution {
	
	@Test(priority=0)
	public void getMethod_1() {
		
		System.out.println("The thread ID for getMethod_1 is "+ Thread.currentThread().getId());
		
		baseURI="https://reqres.in/";
		given().
			get("api/users?page=1").
		then().
			statusCode(200).
			log().all();
	}
	
	@Test(priority=1)
	public void getMethod_2() {
		
		System.out.println("The thread ID for getMethod_2 is "+ Thread.currentThread().getId());
		
		baseURI="https://reqres.in/";
		given().
			get("api/users?page=2").
		then().
			statusCode(200).
			log().all();
	}

}
