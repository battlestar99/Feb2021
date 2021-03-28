package interFaceObject;

public class fireFoxDriver implements WebDriver {

	@Override
	public void findElements() {
		System.out.println("findelement in firefox");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("sendkeys in firefox");
		
	}

	@Override
	public void getText() {
		System.out.println("getText in firefox");
		
	}

}
