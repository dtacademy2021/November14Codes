package exceptions;

public class FinalVsFinallyVsFinalize {

	public static void main(String[] args) {
		
		
		
		//final - classes -> cannot be extended, methods -> cannot be overridden, variables -> cannot be reassigned a different value
		//finally - optional block that is executed no matter the exception in try block is thrown or not (except System.exit())
		//finalize() - protected method that comes from Object class that is inherited by every Java object. 
		//The purpose is to do clean-up actions on that object before it gets garbage collected
	}

}
