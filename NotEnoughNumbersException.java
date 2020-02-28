package java.util;

public class NotEnoughNumbersException extends Exception{

	public NotEnoughNumbersException(){
		super("There is not enough numbers for the corresponding operation");
	} //end of NotEnoughOperationsException constructor
	
	public NotEnoughNumbersException(String numberMessage){
		super(numberMessage);
	} //end of NotEnoughOperationsException constructor
} // end of NotEnoughNumbersException class
