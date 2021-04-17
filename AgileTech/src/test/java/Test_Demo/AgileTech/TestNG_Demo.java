package Test_Demo.AgileTech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Demo {

	@Test
	public void testngdemo() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Agile1Tech\\Desktop\\Feb-2021-WS\\libraries\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://mvnrepository.com/open-source/aop-programming");
		
	}
	
}
