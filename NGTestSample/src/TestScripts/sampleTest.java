package TestScripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTest {
	
	@AfterTest
	public void finishTest() {
		
		System.out.println("This is aftertest");
		
	}
	
	@Test
	public void validateLogin() {
		System.out.println("This is validateLogin");
		
	}
	
	
	@Test
	public void validateLinks() {
		
		System.out.println("This is validateLinks");
		
	}
	
	
	
	
	@BeforeTest
	public void setupTest() {
		
		System.out.println("This is beforetest");
	}
	
	
	

}
