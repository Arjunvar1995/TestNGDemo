package AttributesOfTestAnnotation;

import org.testng.annotations.Test;

public class enabled {
	
	@Test(enabled=true)
	public void method1() {
		
		System.out.println("Method1");
		
	}

}
