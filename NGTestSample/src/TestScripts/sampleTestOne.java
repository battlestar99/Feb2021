package TestScripts;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTestOne {
	
	
	
	
	@BeforeTest
	public void setupTest() {
		
	// going to setup the pre-requirement of the test 
	// opening up browser
	// going to the url
  // deleting cookies
		// maximizing windows 
		System.out.println("setupTest");
	}
	
	@AfterTest
	public void endTest() {
		
	// close the browser 	
		System.out.println("endTest");
	}
	
	
	@Test(priority=1) 
	public void verifyTopMenu() {
		
		// verify if login option is in the top menu
		// verify signup option is in the top menu
		System.out.println("verifyTopMenu");
	
		
		
	}
	
	@Test(priority=0) 
	public void verifyFooterMenu() {
		
		// verify the footer links
		System.out.println("verifyFooterMenu");
		
	}
	
	
	

}
