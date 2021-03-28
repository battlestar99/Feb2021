package bankAccountPack;

public class runBank {

	public static void main(String[] args) {
		
		//bankAccount john = new bankAccount();
		
		
		checkingAccount mike=new checkingAccount();
		
		mike.checkAccount();
		mike.closeCheckingAccount();
		
		mike.depositMoney();
		
		
		mortageAccount sooh = new mortageAccount();
		
		sooh.checkAccount();
		sooh.openmortageAccount();
	}

}
