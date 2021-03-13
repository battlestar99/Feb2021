package objectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signIN {
	
	WebDriver driver;
	
	public signIN(WebDriver x) {
		
		driver=x;
	}
	
	
	
	  public WebElement getsignInBox() {
			
			WebElement x = driver.findElement(By.id("email_create"));
			return x; 
			
		}
	
	
	

}
