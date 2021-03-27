package runPack;

import bankPackage.bankAccount;

public class runBank {

	public static void main(String[] args) {
		
		
		bankAccount john = new bankAccount("63974397");
		
		bankAccount mike = new bankAccount("709708");
		
		bankAccount jim = new bankAccount("3413");
		
		bankAccount lu = new bankAccount();
		
		bankAccount sooh = new bankAccount(34);
		
		System.out.println(john.accountNumber);
		
		
		john.getTotalMoney(12);
		
		
		john.address="virginia";
		mike.address="DC";
		
		System.out.println(john.address);

	}

}
