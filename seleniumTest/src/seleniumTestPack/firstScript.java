package seleniumTestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstScript {

	public static void main(String[] args) {
		
	// setting up the properties for browser  
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		
	// create a object of the webdriver class and open up the browser 

WebDriver driver = new ChromeDriver();
		
	// navigate to the url
    // any object of the webdriver is browser isntance

WebDriver driver1=new ChromeDriver();

// navigating to the url
driver.get("https://www.google.com/");

driver1.get("https://www.facebook.com/");



	}

}
