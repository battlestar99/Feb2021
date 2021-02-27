package packageTwo;

public class mainRun {

	public static void main(String[] args) {
		
		learningFunction lf=new learningFunction();
		
		int a = lf.add(120, 25);
		System.out.println(a);
		
		a= lf.add(500, 300);
		System.out.println(a);
		
		a= lf.subtract(200, 100);
		System.out.println(a);
		
		lf.printName("Jon");
	}

}
