package TestScripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class sampleTest {
	
	@AfterTest
	public void finishTest() {
		
		System.out.println("This is aftertest");
		
	}
	
	@Test
	public void validateLogin() {
		System.out.println("This is validateLogin");
		
		String exepctedresult = "test";
		String actualResult = "test";
		
		
		Assert.assertEquals(exepctedresult, actualResult);
		
	}
	
	
	@Test
	public void validateLinks() {
		
		System.out.println("This is validateLinks");
		String exepctedresult = "test123";
		String actualResult = "test";
		
		
		Assert.assertEquals(exepctedresult, actualResult);
		
		
	}
	
	
	
	
	@BeforeTest
	public void setupTest() {
		
		System.out.println("This is beforetest");
	}
	
	
	

}
