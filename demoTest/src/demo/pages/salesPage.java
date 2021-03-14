package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class salesPage {
	
	
	WebDriver driver; 
	
	public salesPage(WebDriver driver2) {
		
		
		driver=driver2; 
	}
	
	
	public WebElement getBirthDate() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"Id_GiveDateOfBirth_93548\"]"));
		
		return x; 
		
		
	}
	
public WebElement getNextButton() {
		
		WebElement x = driver.findElement(By.id("Id_NEXT_39775Button"));
		
		return x; 
		
		
	}
	
	

}
