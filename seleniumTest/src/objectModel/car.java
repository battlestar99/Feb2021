package objectModel;

public class car {
	
	// constructor overloading 
	
	public car() {
		
	System.out.println("a new object is created");	
	}
	
	public car(String x) {
		
		String name; 
		
		name=x;
		
		System.out.println(name);	
	}
	
	
	
	
	
	public void go() {
		
		System.out.println("Car is going");
		
	}
	
	public int getMileage(int x) {
		
		x=30;
		return x;
	}

}
