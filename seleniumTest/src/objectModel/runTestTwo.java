package objectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class runTestTwo {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://login.yahoo.com/account/create");	
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		// finding a text box and typing a value 
		WebElement x = driver.findElement(By.id("usernamereg-firstName"));
		
		x.getText();
		x.getTagName();
		
		Thread.sleep(1000);
		driver.findElement(By.name("lastName")).sendKeys("Jordan");

	}

}
