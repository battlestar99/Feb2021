package sampleFunctions;

public class runFacebook {

	public static void main(String[] args) {
		
		
		facebook jim = new facebook();
		facebook mike = new facebook();
		
		jim.createNewaccount();
        mike.createNewaccount();
        
        jim.createNewPost();
        mike.createNewPost();
        
        
        facebook.getNumberofusers();
        
        
        
	}

}
