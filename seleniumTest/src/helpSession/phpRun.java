package helpSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class phpRun {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.phptravels.net/register");
        
        // implicit wait 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.xpath("//*[@id='headersignupform']/div[3]/div[1]/div/label/span"));
		
	   firstName.sendKeys("test");

	}

}
