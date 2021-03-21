package sauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sauceLogin {
	
	WebDriver driver; 
	
	public sauceLogin(WebDriver driver) {
		
		this.driver=driver;
		
		
	}
	
	public WebElement getUsername() {
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		return username; 
	}
	
	public WebElement getPassword() {
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]")); 
		return password; 
	}
	public WebElement getloginButton() {
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]")); 
		return  loginButton; 
	}

}
