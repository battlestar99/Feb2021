package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class sauceDemoSample {
	
	WebDriver driver;
	int x; 
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
 driver = new ChromeDriver();;
 x = 34; 
        
         driver.get("https://www.saucedemo.com/");	
          
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		
		
		
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		
		System.out.println(x);
		WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		username.sendKeys("standard_user");
		
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]")); 
		password.sendKeys("secret_sauce");
		
		Thread.sleep(1000);
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]")); 
		loginButton.click();
		
		Thread.sleep(1000);
		
		
		
		
	}
	
	@AfterTest
	public void endTest() {
		
		driver.quit();
		
	}

}
