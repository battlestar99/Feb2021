package seleniumTestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementInteraction {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		
         WebDriver driver=new ChromeDriver();
         
         driver.get("https://login.yahoo.com/account/create");	
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// finding a text box and typing a value 
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Michael");
		
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("Jordan");
		
		Thread.sleep(2000);
		driver.findElement(By.id("usernamereg-yid")).sendKeys("mickael.jordan1265");
		
		Thread.sleep(2000);
		driver.findElement(By.id("usernamereg-password")).sendKeys("dfkjfdsj++");
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
