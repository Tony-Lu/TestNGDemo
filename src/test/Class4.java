package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class4 {		//No.127
	
	@BeforeClass
	public void BeforeClass() {
		
		System.out.println("Before BeforeClass ===== testng BeforeClass");
	}
	
	@AfterClass
	public void AfterClass() {
		
		System.out.println("AfterClass ===== testng AfterClass");
	}
	
	@Test(groups= {"Smoke"})
	public void WebCostcologdin() {
		
		System.out.println("testng WebCostcologdin");
	}
	
	@Test(enabled=false)	// testng will skip this test
	public void MobileAppiumTest() {
		
		System.out.println("testng MobileAppiumTest");
	}
	
	@Test(dependsOnMethods= {"TimeOutTest","WebCostcologdin"})
	public void MobileAndroidTest() {
		
		System.out.println("testng MobileAndroidTest");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		
		System.out.println("Before BeforeMethod ===== testng BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethod() {
		
		System.out.println("AfterMethod ===== testng AfterMethod");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileMenu1Test() {
		
		System.out.println("testng MobileMenu1Test");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileMenu2Test() {
		
		System.out.println("testng MobileMenu2Test");
	}
	
	@Test(timeOut=4000)
	public void TimeOutTest() {
		
		System.out.println("testng TimeOutTest");
	}

}
