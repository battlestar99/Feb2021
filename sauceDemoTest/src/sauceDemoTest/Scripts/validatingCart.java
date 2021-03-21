package sauceDemoTest.Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sauceDemotTest.pages.inventoryPage;
import sauceDemotTest.pages.loginPage;

public class validatingCart {

	WebDriver driver; 
	loginPage lp; 
	inventoryPage ip;
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		
		lp = new loginPage(driver);
		ip = new inventoryPage(driver);
		
	    driver.get("https://www.saucedemo.com/");

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
				
	     Thread.sleep(1000);
	     
	     
	    lp.getUserId().sendKeys("standard_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getLoginButton().click();
				
		
	}
	
	@AfterTest
	public void endTest() {
		
		driver.quit();
	}
	
	
	@Test
	public void validateCartOption() {
		
		ip.getBackPackcart().click();
	//	ip.getBikelightName().click();
		
	//String expectedbackpackname = ip.getBackPackName().getText(); 
	//String expectedbikelightname = ip.getBikelightName().getText(); 
		
		boolean x = ip.getCheckout().isEnabled();
		
		Assert.assertTrue(x);
		
		
	}
	
	
	
	
}
