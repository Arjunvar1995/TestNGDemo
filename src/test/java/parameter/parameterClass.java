package parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterClass {
	
	@Test
	@Parameters({"username","password"})
	public void login(String un, String pwd) {
		
		System.out.println("Username is: "+un);
		System.out.println("Password is: "+pwd);
		
	}

}
