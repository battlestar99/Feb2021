package sauceDemotTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class inventoryPage {
	
	
WebDriver driver; 
	
	public inventoryPage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	
public WebElement getbikelightCart() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button"));
		return x; 
		
		
	}
	
	

public WebElement getBackPackcart() {
	
	WebElement x = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
	return x; 
	
	
}

public WebElement getBackPackName() {
	
	WebElement x = driver.findElement(By.id("item_4_title_link"));
	return x; 
	
	
}


public WebElement getBikelightName() {
	
	WebElement x = driver.findElement(By.id("item_0_title_link"));
	return x; 
	
	
}
	
public WebElement getcart() {
	
	WebElement x = driver.findElement(By.xpath("//*[@id=\\\"item_0_title_link\\\"]/div"));
	return x; 
	
	
}

public WebElement getCheckout() {
	
	WebElement x = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]"));
	return x; 
	
	
}

}
