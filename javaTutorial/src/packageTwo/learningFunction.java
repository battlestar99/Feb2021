package packageTwo;

public class learningFunction {

	
	// want to create a function that will be able to add two number
	
	
	// explaininf function: output/return datatype,
	// input datatype, paremeters/argument
	// what the function is doing
	
	
	public int add(int x, int y) {
		
		int sum = x+y; 
		System.out.println(sum);
		return sum; 
		
	}
	
	
	public int subtract(int x, int y) {
		
		int sub=x-y; 
		return sub; 
		
	}
	
	public void printName(String name) {
		
		System.out.println(name);
		
	}
	
	
	// x=100.45; y = 87.34 , flag = 
	public boolean iflarger(double x, double y) {
		
		boolean flag=true; 
		
		if(x>y) {
			
			flag=true; 
		}
		else {
			flag=false; 
			
		}
		
		return flag; 
		
		
		
	}
	
	// to convert farenhite to celsius 
	
	public double convertFartoCel(double far) {
		
		double celsius; 
		
		celsius = (far-32)*5/9; 
		
		//System.out.println(celsius);
		
		return celsius; 
		
		
	}
	
	
	
	
	
	
	

}
