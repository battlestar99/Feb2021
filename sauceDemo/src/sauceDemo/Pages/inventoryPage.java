package sauceDemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class inventoryPage {
	
	
	WebDriver driver; 
	
	public inventoryPage(WebDriver driver) {
		
		
		this.driver=driver;
	}

	public WebElement getbackPackText() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		return x; 
		
		
	}
	
public WebElement getbackPackPrice() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/div"));
		return x; 
		
		
	}

public WebElement getbackPackAddCart() {
	
	WebElement x = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
	return x; 
	
	
}


public WebElement getCart() {
	
	WebElement x = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]"));
	return x; 
	
	
}

	
	
	
}
