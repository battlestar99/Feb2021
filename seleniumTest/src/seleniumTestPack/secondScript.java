package seleniumTestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondScript {

	public static void main(String[] args) {
		
		// setting up the properties for browser  
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
				
			// create a object of the webdriver class and open up the browser 

		WebDriver driver = new ChromeDriver();
				
			// navigate to the url
		
		
		driver.get("https://login.yahoo.com/account/create");
		
		// finding the current url of the driver
		
		String url = driver.getCurrentUrl();
		
		String title = driver.getTitle();
		
		System .out.println(url);
		System .out.println(title);
		
        
		
		driver.quit();
		

	}

}
