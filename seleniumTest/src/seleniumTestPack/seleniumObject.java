package seleniumTestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumObject {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        
        driver.get("http://automationpractice.com/index.php");
        
        String url = driver.getCurrentUrl();
        
        String title = driver.getTitle();
        
        
      
        driver.findElement(By.xpath("//input[@id=\'test\']"));

	}

}
