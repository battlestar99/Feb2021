package packageOne;

import packageTwo.learningFunction;

public class runTest {

	
	public static void main(String args[]) {
		
		
		
		// declare and initialzation in the same step
		utility c  = new utility();
		
		// in different step 
		
		utility b; // the object is created
		b=new utility(); // initialization 
		
		
		c.getnumber();
		b.getnumber();
		
		
		c.multiply(10, 9);
		
		int mul = c.multiply(12, 12);
		
		System.out.println(mul);
		
		learningFunction lf=new learningFunction();
		
		boolean z = lf.iflarger(12.12, 10.23);
		
		
		
	}
	
	
}
