package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	// the class if for creating functions for all the 
	// web elements of home page 
	
	WebDriver driver; 
	
	public homePage(WebDriver driver) {
		
		this.driver=driver;
		
			
	}
	
	
	// functions for finding web elements 
	
	
	public WebElement getZipCodeBox() {
		
		WebElement x= driver.findElement(By.id("zip"));
		return x; 
		
		
	}
	
	
public WebElement getStartQuoteButton() {
		
		WebElement x= driver.findElement(By.xpath("//*[@id=\"submitBtn\"]/button"));
		return x; 
		
		
	}
	
	
	
	

}
