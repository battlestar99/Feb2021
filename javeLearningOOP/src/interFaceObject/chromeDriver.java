package interFaceObject;

public class chromeDriver implements WebDriver {

	@Override
	public void findElements() {
	System.out.println("findelement in chrome");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("sendkeys in chrome");
		
	}

	@Override
	public void getText() {
		System.out.println("getText in chrome");
		
	}

}
