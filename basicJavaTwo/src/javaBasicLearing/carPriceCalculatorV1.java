package javaBasicLearing;

public class carPriceCalculatorV1 {

	public static void main(String[] args) {
		
		double carPrice = 20000; 
		double downPayment = 3000; 
		double interestRate=0; 
		double crediScore = 670; 
		double tax = 6; 
		double months = 60;
		double priceAfterDown; 
		double financinprice; 
		double monthlyPayment; 
		
		if(crediScore>700) {
			
			interestRate=1.5;
			
		}
     if(crediScore<=700) {
			
			interestRate=2;
			
		}
     
     priceAfterDown= carPrice-downPayment; 
     financinprice =  priceAfterDown+priceAfterDown*(interestRate/100);
     monthlyPayment = financinprice/months; 
     
     
     System.out.println(monthlyPayment);
     
     
     
     
     
     
     

	}

}
