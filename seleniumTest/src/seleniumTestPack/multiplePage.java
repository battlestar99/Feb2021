package seleniumTestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplePage {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://login.yahoo.com/account/create");
        
        // implicit wait 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement helplink = driver.findElement(By.linkText("Help"));
		
		
		helplink.click();
		
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement helpSearch = driver.findElement(By.id("searchInput"));
		WebElement Searchbutton = driver.findElement(By.id("search-submit"));
		
		
		helpSearch.sendKeys("yahoo signup");
		Searchbutton.click();
		
		Thread.sleep(1000);
		
		driver.quit();

	}

}
