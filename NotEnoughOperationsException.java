package PostifixRelation;
public class NotEnoughOperationsException extends RuntimeException{
	public NotEnoughOperationsException(){
		super("There is not enough operations for the corresponding numbers in this equations\n");
	} //end of NotEnoughOperationsException constructor
	
	public NotEnoughOperationsException(String operationMessage){
		super(operationMessage);
	} //end of NotEnoughOperationsException constructor
} // end of NotEnoughOperationsException method