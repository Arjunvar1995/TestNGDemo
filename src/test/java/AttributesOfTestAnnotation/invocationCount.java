package AttributesOfTestAnnotation;

import org.testng.annotations.Test;

public class invocationCount {
	
	@Test(invocationCount=5)
	public void method1() {
		
		System.out.println("Method1");
		
	}

}
