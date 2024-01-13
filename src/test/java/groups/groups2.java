package groups;

import org.testng.annotations.Test;

public class groups2 {
	
	@Test
	public void method1() {
		
		System.out.println("Groups2 Method1");
		
	}
	
	@Test
	public void method2() {
		
		System.out.println("Groups2 Method2");
		
	}
	
	@Test
	public void method3() {
		
		System.out.println("Groups2 Method3");
		
	}
	
	@Test
	public void method4() {
		
		System.out.println("Groups2 Method4");
		
	}
	
	@Test(groups= {"Regression"})
	public void method5() {
		
		System.out.println("Groups2 Method5");
		
	}

}
