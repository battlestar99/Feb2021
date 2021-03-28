package carPack;

public class car {
	
	// properties of car class, global variable 
	// value is not defined 
	
	public String vinNumber; 
	public String color; 
	public int priceOfThecar; 
	public static String dealername; 
	
	
	// methods means what car can do 
	
	private static void startTransmission() {
		
		
	}
	
	private void checkkey() {
		
		
		
	}
	
	
	
	public void startEngine() {
		checkkey() ;
		
		startTransmission();
		
		
		System.out.println("starting the engine");
	}
	
 void stopEngine() {
		
		System.out.println("stopping the engine");
	}
	
	public void accelerate() {
		
		startEngine();
		System.out.println("accelerate the engine");
		
	}
	
	public static int getNumberofSale() {
		
		
		return 1000;
	}
	
	

}
