package AttributesOfTestAnnotation;

import org.testng.annotations.Test;

public class priority {
	
	//Without priority tags as mentioned below, the order of execution will be m1,2,3,4
	
	@Test(priority=3)
	public void method1() {
		
		System.out.println("Method1");
		
	}
	
	@Test(priority=2)
	public void method2() {
		
		System.out.println("Method2");
		
	}
	
	@Test(priority=1)
	public void method3() {
		
		System.out.println("Method3");
		
	}
	
	@Test(priority=0)
	public void method4() {
		
		System.out.println("Method4");
		
	}

}
