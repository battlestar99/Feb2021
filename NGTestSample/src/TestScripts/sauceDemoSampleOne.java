package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import sauceDemoPages.sauceLogin;

public class sauceDemoSampleOne {
	
	WebDriver driver;
	
	sauceLogin sl; 
	 
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
driver = new ChromeDriver();
 sl=new sauceLogin(driver);
 
        
         driver.get("https://www.saucedemo.com/");	
          
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		
	}
	
	
	@BeforeMethod
	public void beforeEachTest() {
		
		driver.get("https://www.saucedemo.com/");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	
	@Test(priority=0)
	
	public void positiveloginTest() throws InterruptedException {
		
		sl.getUsername().sendKeys("standard_user");
		Thread.sleep(1000);
		sl.getPassword().sendKeys("secret_sauce");
		Thread.sleep(1000);
		sl.getloginButton().click();
		Thread.sleep(1000);
		
		String exepectedResult = "https://www.saucedemo.com/inventory.html"; 
		
		String actualResult = driver.getCurrentUrl();
		
		Assert.assertEquals(exepectedResult, actualResult);
		
	}
	
@Test(priority=1)
	
	public void negativeloginTest() throws InterruptedException {
      
		sl.getUsername().sendKeys("locked_out_user");
		Thread.sleep(1000);
		sl.getPassword().sendKeys("secret_sauce");
		Thread.sleep(1000);
		sl.getloginButton().click();
		Thread.sleep(1000);
		
		String exepectedResult = "https://www.saucedemo.com/"; 
		
		String actualResult = driver.getCurrentUrl();
		
		Assert.assertEquals(exepectedResult, actualResult);
		
		
		
		
	}
	
	
	@AfterTest
	public void endTest() {
		
		driver.quit();
		
	}
	

}
