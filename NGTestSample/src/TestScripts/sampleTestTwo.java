package TestScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTestTwo {
	
	
	
	@BeforeTest
	public void setupTest() {
		
		System.out.println("This is beforeTest");
	}
	
	
	@BeforeMethod
	public void beforeEachTest() {
		
		System.out.println("beforeEachTest");
	}
	
	
	@AfterMethod
	public void aftereachTest() {
		
		System.out.println("aftereachTest");
		
	}
	
	@Test(priority=0)
	public void mainTest() {
	
		System.out.println("This is test one");
		
	}
	
	@Test(priority=1)
	public void mainTestOne() {
		
		System.out.println("This is test two");
		
	}
	
	@AfterTest
	public void endTest() {
		
		System.out.println("This is afterTest");
		
	}

}
