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
	public void loginTest() {
		
		System.out.println(x);
		WebElement x = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		x.sendKeys("username");
	}
	
	@AfterTest
	public void endTest() {
		
		
		
	}

}
