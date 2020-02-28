package PostifixRelation;

// Scanner object
// exception classes
// pre-existed class
// custom exception classes
import java.util.*;

import java.lang.SecurityException;

import java.lang.*;


public class PostfixTester{
    /**
     * Reads and evaluates multiple postfix expressions.
     * @throws NotEnoughNumbersException 
     */
	
	
	 public static void main(String []args) {
	        String expression, again;
	        int result;
	        
	        // creating a Scanner variable
	        Scanner in = new Scanner(System.in);
	        do
	        {  
	            // initial the PostfixEvaluator class
	            PostfixEvaluator evaluator = new PostfixEvaluator();
				System.out.println("Enter a valid post-fix expression one token" + "at a time with a space between each token" 
				    + "(e.g. 5 4 + 3 2 1 - + *)");
				System.out.println("Each token must be an integer or an operator (+,-,*,/)");
	            expression = in.nextLine();
	            
	            // try and catch exception
	            try {
	                result = evaluator.evaluate(expression);
	                System.out.println();
	                System.out.println("That expression equals " + result);
	              	if(result == -1) {	                	
	            		throw new NotEnoughOperationsException();
	              	}else {
	              		throw new NotEnoughNumbersException();	/*	*/	                  
	              	}                   
        		} // end of try
	            catch(EmptyStackException e) {
	        			System.out.print("\n" + e.getMessage() + "\nThis is a incomplete equation \n" + "\n"); 
	        	} // end of catch exception
	            catch(NotEnoughNumbersException m){
        			System.out.print( m.getMessage()); 
	            } // end of  /**/
	            catch(NotEnoughOperationsException r){
        			System.out.print( r.getMessage()); 
	            } // end of
	          System.out.print("Evaluate another expression [Y/N]? ");
	            again = in.nextLine();
	            System.out.println();
	        } while (again.equalsIgnoreCase("y")); // end of do-while loop
	        
	        in.close();
	    } // end of main method
} // end of PostfixTester class
