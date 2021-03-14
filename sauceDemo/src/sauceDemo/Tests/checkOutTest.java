package sauceDemo.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sauceDemo.Pages.inventoryPage;
import sauceDemo.Pages.loginPage;



public class checkOutTest {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
        
       
        
        WebDriver driver = new ChromeDriver();;
        
        loginPage lp = new loginPage(driver);
        inventoryPage invp = new inventoryPage(driver);
          driver.get("https://www.saucedemo.com/");	
          
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		lp.getUserId().sendKeys("standard_user");
		Thread.sleep(1000);
		lp.getPassword().sendKeys("secret_sauce");
		Thread.sleep(1000);
		lp.getLoginButton().click();
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String backText = invp.getbackPackText().getText();
		String backPrice = invp.getbackPackPrice().getText();
		
		System.out.println(backText);
		System.out.println(backPrice);
		
		invp.getbackPackAddCart().click();
		Thread.sleep(1000);
		invp.getCart().click();

	}

}
