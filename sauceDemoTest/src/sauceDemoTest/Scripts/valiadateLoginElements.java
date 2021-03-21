package sauceDemoTest.Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sauceDemotTest.pages.loginPage;

public class valiadateLoginElements {
	
	WebDriver driver; 
	loginPage lp; 
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		
		lp = new loginPage(driver);
		
		driver.get("https://www.saucedemo.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
				
	     Thread.sleep(1000);
				
		
	}
	
	@AfterTest
	public void endTest() {
		
		driver.quit();
	}
	
	@Test(priority=0)
	public void enableUsername() {
		
		boolean x = lp.getUserId().isEnabled();
		Assert.assertTrue(x);
		
	}
	@Test(priority=1)
	public void enablePassword() {
		
		boolean x = lp.getPassword().isEnabled();
		Assert.assertTrue(x);
		
	}
	@Test(priority=2)
	public void enablelogin() {
		
		boolean x = lp.getLoginButton().isEnabled();
		Assert.assertTrue(x);
	}
	

}
