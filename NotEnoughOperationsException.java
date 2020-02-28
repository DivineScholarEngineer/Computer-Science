package java.util;
public class NotEnoughOperationsException extends Exception{
	public NotEnoughOperationsException(){
		super("There is not enough operations for the corresponding numbers");
	} //end of NotEnoughOperationsException constructor
	
	public NotEnoughOperationsException(String operationMessage){
		super(operationMessage);
	} //end of NotEnoughOperationsException constructor
} // end of NotEnoughOperationsException method
