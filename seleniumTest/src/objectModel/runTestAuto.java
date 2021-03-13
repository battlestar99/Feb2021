package objectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class runTestAuto {

	public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        
        driver.get("http://automationpractice.com/index.php");	
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		homePage hp = new homePage(driver); 
		
		hp.getSearchBox().sendKeys("dresses");
		
		hp.getSearchBoxButton().click();

	}

}
