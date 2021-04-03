package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	
	WebDriver driver; 
	
	public loginPage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	
public WebElement getUserId() {
		
		WebElement x = driver.findElement(By.id("user-name"));
		return x; 
		
		
	}
	
	
public WebElement getPassword() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		return x; 
		
		
	}

public WebElement getLoginButton() {
	
	WebElement x = driver.findElement(By.id("login-button"));
	return x; 
	
	
}
	

}
