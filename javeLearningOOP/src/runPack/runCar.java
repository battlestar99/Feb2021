package runPack;

import carPack.car;

public class runCar {

	public static void main(String[] args) {
	
		// creating an object of the car class 
		car a = new car();
		
		// create another object of the car class 
		
		// declaring the object
		car b; 
		
		// initialize the b object 
		
		b = new car();
		
		a.color="red";
		
		b.color="blue";
		
		b.priceOfThecar=45000;
		
		System.out.println(b.color);
		System.out.println(a.color);
		
		System.out.println(a.priceOfThecar);
		System.out.println(b.priceOfThecar);
		

	}

}
