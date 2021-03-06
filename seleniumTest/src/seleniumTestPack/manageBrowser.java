package seleniumTestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manageBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://login.yahoo.com/account/create");
        
        
        driver.manage().deleteAllCookies();
        
        driver.manage().window().maximize();
        
        
        
        Thread.sleep(2000);
        
		

	}

}
