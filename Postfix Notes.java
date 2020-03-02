package ProjectPractice;

// Scanner object
import java.util.Scanner;

// import stack
import java.util.Stack;

// import all objects, either needed or not
import java.util.*;

public class Postfix {
	// Scanner object
	Scanner keyboard = new Scanner(System.in);
	// constants
	
    // variables
    private char operation;
    private int op1;
    private int op2;
    private int result;
    
    String userInputNumber;
    String userInput;
    String comma = ", ";
    String equationState= " equation";
    
    // String arrays
//    ArrayList<String> userEquationValues = new ArrayList<String>();
    final String[] equationNameIdentifier = {"Infix","Prefix", "Postfix"};
    
    // Scanner container
    String userEquation;
    
    // additional math
    /*private String baseNumber;
    private String userPower;
    private int absoluteValue = Math.abs(baseNumber);
    private final int POWER = Math.pow(baseNumber,userPower);
    private final String SQUAREROOT;*/
    
    // constants for basic operations =
    private final String ADD = "+";
    private final String SUBTRACT = "-";
    private final String MULTIPLY= "*";
    private final String DIVIDE = "/";
    
    // Stacks
    private Stack post;
    
//	System.out.println();
    public Postfix() {
        post = new Stack<Integer>();
    }
    
    
    public void IntroPostfix(){
    	System.out.print("Welcome to Postfix Evalutor/n" 
    		+ "What type of equation would you like to input\n" 
    		+ "The types of equations include "); 
    	   
    	for(int i = 0; i <= equationNameIdentifier.length; i++){
    	     System.out.print(equationNameIdentifier[i] + ", ");
    	     i--;
    	   } // end of for loop
    	   
    	System.out.print("\nYour choice: ");
    	userEquation = keyboard.nextLine();
    	String userEquateChoice;
//    	userEquationDeterminator(userEquateChoice);
		
		// user input equation container variable
		String userEquatChoice;
		String[] equations;
		
		System.out.print("Welcome to Postfix Evaluator\n"
				+ "What type of equation would you like to put "
				+ "("+ equationNameIdentifier[0] + comma 
				+ equationNameIdentifier[1] + comma + equationNameIdentifier[2] + ")?\n"
				+ "Your choice: ");
		userEquateChoice = keyboard.nextLine();
//		userEquationDeterminator(userEquateChoice);
} // end of postfixIntro method
		
	public void userEquationDeterminator(String userEquateChoice) {
		do {	
			switch(userEquateChoice) {
				case "Prefix":
					equationTypeIntifiers(true, false, false);
					break;
				case "Infix":
					equationTypeIntifiers(false, true, false);
					break;
				case "Postfix":
					equationTypeIntifiers(false, false, true);
					break;
				default:
					System.out.println("This is not an example of any of the equation types\n"
						+ "Try again");
					break;
			} // end of switch statement
			} while(!(userEquateChoice.equalsIgnoreCase(equationNameIdentifier[0]) 
					|| userEquateChoice.equalsIgnoreCase(equationNameIdentifier[1]) 
					|| userEquateChoice.equalsIgnoreCase(equationNameIdentifier[2]))); 
		// end of while loop
		} // end of userEquationDeterminator method
    
	public void equationTypeIntifiers(boolean isPrefix , boolean isInfix, boolean isPostfix){
		try {
			for(int i = 0; i < equationNameIdentifier.length; i++){
				
			} // end of for loop
				
			while(isPrefix = true) {
				System.out.print("This is an example of an " + 
						equationNameIdentifier[0] + equationState);
				
				System.out.print("How many numbers would you like to enter?\n"
						+ "Your number: ");
			} // end of while loop
			
			while(isInfix = true) {
					
				} // end of while loop
		} // end of try
		
		catch(Exception e){	
			while(!(isInfix = true)) {
				System.out.print("This is not an example of an " + 
			equationNameIdentifier[0] + equationState);
			} // end of while loop
		} // end of catch exception
	} // end of equationTypeIntifiers method
	
	public void operationSelection(String operation, double userNum1, double userNum2) {
		double add;
		double subtract;
		double multiply;
		double divide;
		switch(operation) {
		case "+":
			add = userNum1 + userNum2;
			System.out.println(add);
			break;
		case "-":
			subtract = userNum1 - userNum2;
			System.out.println(subtract);
			break;
		case "*":
			multiply = userNum1 * userNum2;
			System.out.println(multiply);
			break;
		case "/":
			divide = userNum1 / userNum2;
			System.out.println(divide);
			break;
		default:
			System.out.println("That is not a valid operation");
			break;
		}// end of switch statement
	} // end of operation method
	
	public static void main(String[] args) {
		Postfix math = new Postfix();
		math.IntroPostfix();
	} // end of main method
} // end of Postfix class



/*String operation;
		double userNum1=0;
		double userNum2 = 0;
		double[] equation = {userNum1, userNum2};
		equation = keyboard.nextDouble();
		operationSelection(operation, userNum1, userNum2);
		String operation;
		operation(operation, userNum1, userNum2);
		private int evaluateOperator() {
	         result = 0;

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
	        }
	        return result;
			         
            		while(isPostfix = true) {
            			System.out.print("This is an example of an " + 
    					equationNameIdentifier[0] + equationState);
			
	    }*/
		
		
		/*while(!(equationNumExample == 0) || !(equationNumExample == 0)) {
			while(!(equationNumExample == 0)){
					System.out.print("Your equation has numbers");
		} // end of 1st while loop
				
		while(operationExample <= 1){
		    System.out.print("Your equation has operation");			
		} // end of 2nd nested while loop
		
		} // end of while loop
		
		try {
			
		}catch(Exception e) {
		    System.out.print("This is not an postfix equation");
		    System.out.print("Your mistake is " + e);
		}*/
		
		    
   /* public void equationTypeIntifiers(boolean isPostfix){		
    	char operation = 0; int op1; int op2;
    	evaluateSingleOperator(operation, op1, op2);
    	try {
			while(isPostfix = true) {
				System.out.print("This is an example of an " + 
						equationNameIdentifier[0] + equationState);
			} // end of while loop
		} // end of try
		catch(Exception e) {
			while(isOperator(null) || op1 > 0 || op2 == 0){
    				System.out.print("This is not a postfix equation");            		
            	} // end of if statement
        } // end of catch
	} // end of equationTypeIntifiers method*/
	
	/*
	
	
import java.util.EmptyStackException;
import java.util.Scanner;

//import java.util.NotEnoughException;

import java.util.*;
import java.util.Stack;
import java.util.Scanner;
import java.util.EmptyStackException;

public class PostfixEvaluator {
    private final static char ADD      = '+';
    private final static char SUBTRACT = '-';
    private final static char MULTIPLY = '*';
    private final static char DIVIDE   = '/';
    private final static char MODULUS   = '%';
    private final static char POWER   = '^';
    private final static char unaryMinus   = '~';    
    
    // unaryMinus: e ~ 
    
    private Stack<Integer> stack;

    public PostfixEvaluator() {
        stack = new Stack<Integer>();
    }

	public int evaluate(String expr) {
        int op1, op2, result = 0;
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
            }
            else
                stack.push(Integer.parseInt(token));
        }

        parser.close();
        return (stack.pop());
    }
	
    private boolean isOperator(String token) {
        return ( token.equals("+") || token.equals("-") || 
                 token.equals("*") || token.equals("/") || token.equals("%") || token.equals("^"));
        // OR return ("+-*/".indexOf(token) >= 0);
    }
    
    final String[] equationNameIdentifier = {"Infix","Prefix", "Postfix"};
    String equationState= " equation";
    
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
            case unaryMinus: 
                result = (int)Math.pow(op1, op2);
        }

        return result;
    } // end of evaluateSingleOperator method
    
} // end of PostfixEvaluator class
    /**
     * Reads and evaluates multiple postfix expressions.
     */
	 
	 
	 
    public static void main(String[] args) throws EmptyStackException{
        String expression, again;
        int result;
    
        Scanner in = new Scanner(System.in);
      
        do
        {  
            PostfixEvaluator evaluator = new PostfixEvaluator();
            
			System.out.println("Enter a valid post-fix expression one token " +
							   "at a time with a space between each token (e.g. 5 4 + 3 2 1 - + *)");
			System.out.println("Each token must be an integer or an operator (+,-,*,/)");
            expression = in.nextLine();
            try {
                result = evaluator.evaluate(expression);
                System.out.println();
                System.out.println("That expression equals " + result);
        		} // end of while loop
        	catch(EmptyStackException e){
        			System.out.print( e.getMessage() + "\nThis is not a postfix equation\n" + "\n");            		
        	} // end of catch exception
            catch(NotEnoughStacksException m) {
    			System.out.print( m.getMessage() + "\nThis is not a postfix equation\n" + "\n");   	        		
        	} // end of catch exception
            
            System.out.print("Evaluate another expression [Y/N]? ");
            again = in.nextLine();
            System.out.println();
        } while (again.equalsIgnoreCase("y"));
        
        in.close();
  } 
}
	/*  catch(NotEnoughNumbersException m){
        			System.out.print( m.getMessage()); 
	            } // end of */
	             /*catch(NotEnoughOperationsException r){
        			System.out.print( r.getMessage()); 
	            } // end of*/
	/*
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
    } // end numberCheckerExpection method
	
	
    public int numberCheckerExpection() throws NotEnoughNumbersException{
    	try {
	    	if(op1 > op2) {
        		throw new NotEnoughNumbersException();
	    	} // end of if statement
    	} catch(NotEnoughNumbersException e) {
    		System.out.print(e.getMessage());
    	} // end numberCheckerExpection method
    	return result;
    } // end of numberCheckerExpection method
    
	 public int operationCheckerExpection() throws NotEnoughOperationsException{
    	try {
	    	if(stack.search(stack) > 0) {
        		throw new NotEnoughOperationsException();
	    	} // end of if statement
    	} catch(NotEnoughOperationsException r) {
    		System.out.print(r.getMessage());    		
    	} // end of catch
    	return result;
    } // end numberCheckerExpection method

        if(!isUnaryOperator(token) || !isOperator(token)) {
    		throw new NotEnoughOperationsException();
    	}
	// throw new EquationIncompleteException();  
	*/