package carPrice;

public class calUtility {
	

	public double gettotalPrice(double baseprice, double Tax, boolean wrnt) {
		
		double x = baseprice + (baseprice*(Tax/100));
		
		if(wrnt) {
			
			x=x+1500;
		}
		
		return x; 
		
	}
	
	public double getFinancePrice(double totalPrice, double downpayment) {
		
		double fprice=totalPrice-downpayment;
				return fprice; 
		
	}
	
	public double getApr(double creditscore) {
		
		double apr = 0; 
		
     if(creditscore>700) {
			
			apr=1.5;
			
		}
     if(creditscore<=700 && creditscore>=650 ) {
			
    	 apr=2;
			
		}
     
     if(creditscore<650 ) {
			
    	 apr=3;
			
		}
     
     return apr; 
		
		
	}
	
	
	public double getTotalFinPrice(double finprice, double apr) {
		
		double totalfinPrice = finprice+finprice*(apr/100);
		
		return totalfinPrice; 
		
		
		
	}
	
	public double getMonthlyPaymen(double totalfinprice, double months) {
		
		double monthlyPayment = totalfinprice/months; 
		return monthlyPayment;
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
