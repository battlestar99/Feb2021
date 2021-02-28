package carPrice;

import java.util.Scanner;

public class runCarPayment {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the base price of the car...");
		double basePrice = sc.nextDouble();
		
		
		System.out.println("Enter the downpayment...");
		double downPayment = sc.nextDouble(); 
		
		double interestRate=0; 
		System.out.println("Enter the credit score...");
		double crediScore = sc.nextDouble(); 
		
		double tax = 6; 
		
		System.out.println("Enter the months...");
		double months = sc.nextDouble(); ;
		
		System.out.println("Do you want warrenty?");
		boolean warrenty = sc.nextBoolean(); 
		
		calUtility cu=new calUtility();
		
		double totalprice = cu.gettotalPrice(basePrice, tax, warrenty);
		//System.out.println(totalprice);
		double finPrice = cu.getFinancePrice(totalprice, downPayment);
		//System.out.println(finPrice);
		
		double apr = cu.getApr(crediScore); 
		
		double totalFinPrice = cu.getTotalFinPrice(finPrice, apr);
		
		double monthlyPay = cu.getMonthlyPaymen(totalFinPrice, months);
		
		System.out.println("Total Monthly Payment is .....");
		System.out.println(monthlyPay);
		
		int x;
		
		String name12;
		
		
		
     
     
     
     
  
     
     

	}

}
