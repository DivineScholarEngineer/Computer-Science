// Scanner object
import java.util.Scanner;

// exception classes
// pre-existed class
import java.util.EmptyStackException;
// custom exception classes
import java.util.NotEnoughNumbersException;
//import java.util.NotEnoughOperationsException;

public class PostfixTester    
{
    /**
     * Reads and evaluates multiple postfix expressions.
     * @throws NotEnoughNumbersException 
     */
	 public static void main(String []args) throws EmptyStackException, NotEnoughNumbersException{
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
	                
	                
	                
	        		} // end of while loop
	            catch(EmptyStackException e){
	        			System.out.print( e.getMessage() + "\nThis is a incomplete equation \n" + "\n");  
	        			
	        			if(evaluator.evaluate(expression)) {
	        				throw new NotEnoughNumbersException();  
	        			} // end of if statement 
	        			         		
	        	} // end of catch exception
	            catch(NotEnoughNumbersException m){
        			System.out.print( m.getMessage()); 
	            } // end of 
	          
	          System.out.print("Evaluate another expression [Y/N]? ");
	            again = in.nextLine();
	            System.out.println();
	        } while (again.equalsIgnoreCase("y")); // end of do-while loop
	        
	        in.close();
	    } // end of main method
}
