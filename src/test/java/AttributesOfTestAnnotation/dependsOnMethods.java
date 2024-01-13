package AttributesOfTestAnnotation;

import org.testng.annotations.Test;

public class dependsOnMethods {
	
	@Test
	public void b() {
		
		System.out.println("Method b");
		
	}
	
	@Test(dependsOnMethods = { "b" })
	public void a() {
		
		System.out.println("Method a");
		
	}
	

}
