package dataProvider;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	@DataProvider
	public Object[][] getData(){
				
		Object[][] data=new Object[2][2];
		
		data[0][0]="Arjun";
		data[0][1]="Trainer";
		
		data[1][0]="Anto";
		data[1][1]="Student";
		
		return data;
		
	}
	
	
	@Test(dataProvider="getData", priority=0)
	public void dptest(String nm,String rl) {
		
		System.out.println("The name is: "+nm);
		System.out.println("The role is: "+rl);
		
	}
	
	@Test(dataProvider="getData", priority=1)
	public void createUser(String nm,String rl) {
		
		JSONObject requestbody1=new JSONObject();
		
		requestbody1.put("name", nm);
		requestbody1.put("job", rl);
		
		baseURI="https://reqres.in/";
		
		given().
			body(requestbody1.toString()).
			headers("Content-Type","application/json").
			log().body().
		when().
			post("api/users").
		then().
			statusCode(201).
			log().body();		
		
	}
	


}
