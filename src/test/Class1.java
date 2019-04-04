package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {		//No.127
	
	@AfterTest
	public void AfterRequisite() {
		
		System.out.println("After Test ===== testng AfterRequisite");
	}
	
	
	@Test
	public void Demo1() {
		
		System.out.println("testng demo1");
	}
	
	@Test
	public void Demo2() {
		
		System.out.println("testng demo2");
	}
	

}
