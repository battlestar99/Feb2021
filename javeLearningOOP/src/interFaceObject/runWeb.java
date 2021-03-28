package interFaceObject;

public class runWeb {

	public static void main(String[] args) {
		
		
		WebDriver driver=new chromeDriver();
		
		driver.getText();
		
		driver.findElements();
		
		WebDriver driver1=new fireFoxDriver();
		
		driver1.getText();
		
		driver1.findElements();

	}

}
