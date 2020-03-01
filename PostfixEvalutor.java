package PostifixRelation;
// import all class and objects that are neccessary that isn't included
import java.util.*;

// Scanner object
import java.util.Scanner;

// Stack object
import java.util.Stack;



public class PostfixEvaluator {
    // constants variables
    private final static char ADD      = '+';
    private final static char SUBTRACT = '-';
    private final static char MULTIPLY = '*';
    private final static char DIVIDE = '/';
    private final static char MODULUS = '%';
    private final static char POWER = '^';
    private final static char UNARYMINUS = '~';  
    private final static char FACTORIALS = '!';      
    // stack variable
    private Stack<Integer> stack;
    
    // PostfixEvaluator constructor
    public PostfixEvaluator() {
        stack = new Stack<Integer>();
    } // end of PostfixEvaluator constructor
    
    int op1, op2, result = 0;
    public int evaluate(String expr) {
        String token;
        Scanner parser = new Scanner(expr);

        while (parser.hasNext()) {
            token = parser.next();
            boolean isPostfix = false;
            if (isOperator(token)) {
                op2 = stack.pop();
                op1 = stack.pop();
                result = evaluateSingleOperator(token.charAt(0), op1, op2, isPostfix);
                stack.push(result);
            } // end of if statement
            else
                stack.push(Integer.parseInt(token));
        } // end of while loop

        parser.close();
        return (stack.pop());
    } // end of evaluate method
     
     private boolean isOperator(String token) {
        return ( token.equals("+") || token.equals("-") || 
                 token.equals("*") || token.equals("/") || token.equals("%") || token.equals("^"));
        // OR return ("+-*/".indexOf(token) >= 0);
    } // end of isOperator method
    
    private int evaluateSingleOperator(char operation, int op1, int op2, boolean isPostfix) {
        int result = 0;

        switch (operation) {
            case ADD:
                result = op1 + op2;
                break;
                
            case SUBTRACT:
                result = op1 - op2;
                break;
                
            case MULTIPLY:
                result = op1 * op2;
                break;
                
            case DIVIDE:
                result = op1 / op2;
                break;
            case MODULUS:
                result = op1 % op2;
                break;
            case POWER:
                result = (int)Math.pow(op1, op2);
                break;
            case UNARYMINUS: 
                result = op1 + (-op2);
                break;
            case FACTORIALS: 
                for(int i = 1; i <= op1; i++) {
                	op1 = op1 * i;
                	result = op1;
                }
                break;
            default:
                
        } // end of swtch statement
        
        return result;
    } // end of evaluateSingleOperator method
    
   /*public void equationLengthCheckerExpection() throws EquationIncompleteException{
    	try {
	    	if(op1 > op2) {
        		throw new EquationIncompleteException();
	    	} // end of if statement
	    	else if(op1 < op2) {
        		throw new EquationIncompleteException();
	    	} // end of else if statement
    	} catch(EquationIncompleteException r) {
    		System.out.print(r.getMessage());    		
    	} 
    } // end numberCheckerExpection method*/ 

    public void numberCheckerExpection() throws NotEnoughNumbersException{
    	try {
	    	if(op1 > op2) {
        		throw new NotEnoughNumbersException();
	    	} // end of if statement
    	} catch(NotEnoughNumbersException e) {
    		System.out.print(e.getMessage());
    	} // end numberCheckerExpection method
    } // end of numberCheckerExpection method
    
    public void operationCheckerExpection() throws NotEnoughOperationsException{
    	try {
	    	if(op1 < op2) {
        		throw new NotEnoughOperationsException();
	    	} // end of if statement
    	} catch(NotEnoughOperationsException r) {
    		System.out.print(r.getMessage());    		
    	} // end of catch
    } // end numberCheckerExpection method
    
} // end of PostfixEvaluator class
