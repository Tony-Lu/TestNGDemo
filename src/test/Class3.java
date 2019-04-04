package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class3 {	//No.127
	
	@Test
	public void Weblogin() {
		
		System.out.println("testng Weblogin");
	}
	
	@Test
	public void MobileTest() {
		
		System.out.println("testng MobileTest");
	}
	
	@BeforeSuite
	public void BeforeSuiteTest() {
		
		System.out.println("Before Suite ********** testng BeforeSuiteTest");
	}
	
	@Test
	public void MobileTest2() {
		
		System.out.println("testng MobileTest2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void MobileTest3() {
		
		System.out.println("testng MobileTest3");
	}
	
	@Test
	public void MobileTest4() {
		
		System.out.println("testng MobileTest4");
	}
	
	@AfterTest
	public void AfterTest() {
		
		System.out.println("After Test =========== testng AfterTest");
	}

}
