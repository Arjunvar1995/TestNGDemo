package groups;

import org.testng.annotations.Test;

public class groups1 {
	
	@Test(groups= {"Regression"})
	public void method1() {
		
		System.out.println("Groups1 Method1");
		
	}
	
	@Test
	public void method2() {
		
		System.out.println("Groups1 Method2");
		
	}
	
	@Test
	public void method3() {
		
		System.out.println("Groups1 Method3");
		
	}
	
	@Test
	public void method4() {
		
		System.out.println("Groups1 Method4");
		
	}
	
	@Test
	public void method5() {
		
		System.out.println("Groups1 Method5");
		
	}

}
