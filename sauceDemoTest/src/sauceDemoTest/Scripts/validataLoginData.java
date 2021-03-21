package sauceDemoTest.Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import sauceDemotTest.pages.loginPage;

public class validataLoginData {
	
	WebDriver driver; 
	loginPage lp; 
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		
		lp = new loginPage(driver);
		
	//	driver.get("https://www.saucedemo.com/");

	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
				
	     Thread.sleep(1000);
				
		
	}
	
	@AfterTest
	public void endTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@BeforeMethod
	public void getToHomePage() {
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Parameters({"userid","password","expectedvalue"})
	@Test 
	public void validateLogin(String userid, String password, String expectedvalue) throws InterruptedException {
		
		lp.getUserId().sendKeys(userid);
		lp.getPassword().sendKeys(password);
		lp.getLoginButton().click();
		
	//	String exepctedValue = "https://www.saucedemo.com/inventory.html";
		
		String actualValue = driver.getCurrentUrl(); 
		
		Thread.sleep(1000);
		
		Assert.assertEquals(actualValue, expectedvalue);
		
		
		
	}
	
	
	
	
	

}
