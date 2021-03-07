package seleniumTestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textBoxVersionTwo {

	public static void main(String[] args) throws InterruptedException {
		
		String firstname = "Michael";
		String lastname = "Jordan";
		String email = "mickael.jordan1265";
		String password = "dfkjfdsj++";
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://login.yahoo.com/account/create");	
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// finding a text box and typing a value 
		
		WebElement firstNameText = driver.findElement(By.id("usernamereg-firstName")); 
		
		firstNameText.sendKeys(firstname);
		
		Thread.sleep(1000);
		
		firstNameText.clear();
		Thread.sleep(1000);
		
		firstNameText.sendKeys(firstname);
		
		boolean firstnameEnable = firstNameText.isEnabled();
		
		System.out.println(firstnameEnable);
		
		WebElement lastNameText = driver.findElement(By.name("lastName")); 
		
		lastNameText.sendKeys(lastname);
		
		boolean lastNamedisplay = lastNameText.isDisplayed();
		
		System.out.println(lastNamedisplay);
		
		
		
		
		
		
		
		
		
		
		/*
		 * Thread.sleep(2000);
		 * driver.findElement(By.name("lastName")).sendKeys(lastname);
		 * 
		 * Thread.sleep(2000);
		 * driver.findElement(By.id("usernamereg-yid")).sendKeys(email);
		 * 
		 * Thread.sleep(2000);
		 * driver.findElement(By.id("usernamereg-password")).sendKeys(password);
		 * 
		 * Thread.sleep(2000);
		 */
		driver.quit();
		

	}

}
