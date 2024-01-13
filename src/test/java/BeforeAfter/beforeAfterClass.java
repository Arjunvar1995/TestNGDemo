package BeforeAfter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforeAfterClass {
	
	@Test
	public void method1() {
		
		System.out.println("Method1");
		
	}
	
	@BeforeSuite
	public void method2() {
		
		System.out.println("BeforeSuite");
		
	}
	
	@AfterSuite
	public void method3() {
		
		System.out.println("AfterSuite");
		
	}
	
	@BeforeTest
	public void method4() {
		
		System.out.println("BeforeTest");
		
	}
	
	@AfterTest
	public void method5() {
		
		System.out.println("AfterTest");
		
	}
	
	@BeforeClass
	public void method6() {
		
		System.out.println("BeforeClass");
		
	}
	
	@AfterClass
	public void method7() {
		
		System.out.println("AfterClass");
		
	}
	
	@BeforeMethod
	public void method8() {
		
		System.out.println("BeforeMethod");
		
	}
	
	@AfterMethod
	public void method9() {
		
		System.out.println("AfterMethod");
		
	}
	
	@Test
	public void method10() {
		
		System.out.println("Method10");
		
	}

}
