package bankPackage;

public class bankAccount {
	
	// properties of the class , global variable
	public String firstName; 
	public String lastname; 
	public String accountNumber; 
	public int totalMoney; 
	public String address; 
	
	public bankAccount(String accountNumber) {
		
		this.accountNumber=accountNumber; 
		
		
	}
	
	public bankAccount() {
		
		System.out.println("no input constructor");
		
	}
	
	public bankAccount(int x) {
		
		System.out.println("integer input constructor");
		
	}
	
	
	
	
	
	public void depositMoney() {
		
		System.out.println("depositMoney");
		
	}
	
	public void withDrawMoney() {
		
		System.out.println("withDrawMoney");
		
	}
	
	public void getTotalMoney() {
		
		System.out.println("getTotalMoney");
	}
	
	
	public int getTotalMoney(int x ) {
		
		System.out.println("getTotalMoney function2");
		return 12; 
		
	}
	
	public void overDraft() {
		
		System.out.println("overDraft");
		
	}
	
	
	
	

}
