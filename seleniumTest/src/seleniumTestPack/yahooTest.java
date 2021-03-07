package seleniumTestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class yahooTest {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
         
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://login.yahoo.com/account/create");
        
        // implicit wait 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// text box
		
		WebElement firstNameText= driver.findElement(By.id("usernamereg-firstName"));
		WebElement lastNameText= driver.findElement(By.id("usernamereg-lastName"));
		WebElement emailText= driver.findElement(By.id("usernamereg-yid"));
		WebElement passwordText= driver.findElement(By.id("usernamereg-password"));
		WebElement mobileText= driver.findElement(By.id("usernamereg-phone"));
		WebElement dayText= driver.findElement(By.id("usernamereg-day"));
		WebElement yearText= driver.findElement(By.id("usernamereg-year"));
		
		// drop down
		
		
		WebElement countryCodedrop= driver.findElement(By.xpath("//*[@id=\"regform\"]/div[3]/div[2]/div/select"));
		WebElement birthMonthdrop= driver.findElement(By.id("usernamereg-month"));
		
		
		// submit button 
		
		WebElement submitButton= driver.findElement(By.id("reg-submit-button"));
		
		// entering value to the form 
		
		boolean firstNameEnable = firstNameText.isEnabled();
		//System.out.println(firstNameEnable); 
		
		Thread.sleep(1000);
		 firstNameText.sendKeys("Michael");
		 Thread.sleep(1000);
		 lastNameText.sendKeys("jordan");
		 Thread.sleep(1000);
		 emailText.sendKeys("mickael.jordan1265");
		 Thread.sleep(1000);
		 passwordText.sendKeys("dfkjfdsj++");
		 Thread.sleep(1000);
		 
		 Select ccdd = new Select(countryCodedrop);
		 
		 ccdd.selectByIndex(20);
		 
		 mobileText.sendKeys("697979879");
		 
		 
		 Select bmdd = new Select(birthMonthdrop);
		 Thread.sleep(1000);
		 bmdd.selectByVisibleText("July");
		 
		 Thread.sleep(1000);
		 dayText.sendKeys("11");
		 Thread.sleep(1000);
		 yearText.sendKeys("1960");
		 
		 
		String submitText =  submitButton.getText();

		System.out.println(submitText);
		
		
		driver.quit();
		
		
		
		
		
		
	}

}
