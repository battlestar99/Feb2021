package objectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	// declaring the variable
	WebDriver driver; 
	 
	
	public homePage(WebDriver x) {
		
		// initializing the value
		driver=x;
		
	}
	
	
	public WebElement getSignInButton() {
	
	//	return driver.findElement(By.id("usernamereg-firstName"));
	WebElement obj = driver.findElement(By.linkText("Sign in"));
	return obj; 
		
	}
	
	
     public WebElement getContactUs() {
		
		WebElement obj = driver.findElement(By.linkText("Contact Us"));
		return obj; 
		
	}
     
     public WebElement getSearchBox() {
 		
		WebElement obj = driver.findElement(By.id("search_query_top"));
		return obj; 
		
	}
	
     public WebElement getSearchBoxButton() {
  		
 		WebElement obj = driver.findElement(By.name("submit_search"));
 		return obj; 
 		
 	}

}
