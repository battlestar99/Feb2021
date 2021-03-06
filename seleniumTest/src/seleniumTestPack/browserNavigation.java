package seleniumTestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserNavigation {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		
         WebDriver driver=new ChromeDriver();
         
         driver.get("https://login.yahoo.com/account/create");
         
        String url =  driver.getCurrentUrl();
        String title = driver.getTitle();
        
        System.out.println(url);
        System.out.println(title);
        
        
        driver.findElement(By.linkText("Help")).click();
        
       url =  driver.getCurrentUrl();
       title = driver.getTitle();
        
       System.out.println(url);
       System.out.println(title);
        
       
       Thread.sleep(2000);
        // get back to the previous page
       driver.navigate().back();
       
      
       Thread.sleep(1000);
        
       driver.navigate().forward();
       
       Thread.sleep(1000);
       
       Thread.sleep(1000);
       
       driver.navigate().refresh();
       
       Thread.sleep(1000);
       driver.quit();
        
	}

}
