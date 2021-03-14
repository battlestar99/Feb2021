package demo.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import demo.pages.autoBuyPage;
import demo.pages.homePage;
import demo.pages.salesPage;

public class geicoQuoteTest {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
        
       
        
        WebDriver driver = new ChromeDriver();;
        
        homePage hp=new homePage(driver);
        
        autoBuyPage abp= new autoBuyPage(driver);
        
        salesPage sp = new salesPage(driver);
        
          driver.get("https://www.geico.com/");	
          
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		
		hp.getZipCodeBox().sendKeys("22031");
		String buttonValue = hp.getStartQuoteButton().getText();
		hp.getStartQuoteButton().click();
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(buttonValue);
		
		abp.getNextButton().click();
		
		String nextButtonValue = abp.getNextButton().getText();
		
		System.out.println(nextButtonValue);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		sp.getBirthDate().sendKeys("01/01/1990");
		sp.getNextButton().click();
		
		
			

	}

}
