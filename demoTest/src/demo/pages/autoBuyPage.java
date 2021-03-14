package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class autoBuyPage {
	
	
	WebDriver driver; 
	
	public autoBuyPage(WebDriver driver2) {
		
		driver=driver2;
		
	}
	
	
	public WebElement getNextButton() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"breakdown-main\"]/section[2]/div/div/div/form/div[3]/div[1]/div[1]/div[2]/div/button"));
		
		return x; 
		
	}
	

}
