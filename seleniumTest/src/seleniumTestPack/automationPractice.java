package seleniumTestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        
        WebDriver driver1=new ChromeDriver();
        
        driver.get("http://automationpractice.com/index.php");	
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// finding a link and clicking in the link
		driver.findElement(By.linkText("Sign in")).click();;
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("email_create")).sendKeys("dkjfdsalfd@test.com");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.name("id_gender")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("customer_firstname")).sendKeys("jim");;
		
		
		Thread.sleep(2000);
		
		
		driver.quit();

		

	}

}
