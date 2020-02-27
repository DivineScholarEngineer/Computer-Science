import java.util.Scanner;
import java.util.*;

public class PostfixEvalutor{
  
  public PostfixEvalutor(){
    
  } // end of PostfixEvalutor constructor
  
  // String array
  String[] equationType = {"Prefix" ,"Infix", "Postfix"}; 
  
  // Scanner object
  Scanner keyboard = new Scanner(System.in);
  
  // Scanner container
  String userEquation;
  
  // additional math
  private String baseNumber;
  private String userPower;
  private int absoluteValue = Math.abs(baseNumber);
  private final int POWER = Math.pow(baseNumber,userPower);
  private final String SQUAREROOT;
  
  // constants for basic operations =
  private final String ADD = "+";
  private final String SUBTRACT = "-";
  private final String MULTIPLY= "*";
  private final String DIVIDE = "/";
  
  // user number
  String
  
  public void IntroPostfix(){
   System.out.print("Welcome to Postfix Evalutor/n" + "What type of equation would you like to input\n" + 
   "The types of equations include "); 
   for(int i = 0; i <= equationType.length; i++){
     System.out.print(equationType[i] + " ");
     for(int i = 0; i < equationType.length; i++){
     System.out.print(", ");        
     } // end of nested for loop
   } // end of for loop
   System.out.print(Your choice: );
   userEquation = keyboard.nextLine
   equationTypeChecker();
   
   
  /* do{
      
   }(userEquation.equalsIgnoreCase(equationType[0]) ||){
    
   } // end of while loop*/
   
  } // end of IntroPostfix method
  
  public void operation(String useroperation){
    switch(useroperation){
      case ADD:
        System.out.print
        break;
      A
   } // end of switch statement
  } // end of operation method
  
  public void equationTypeChecker(boolean isPrefix, boolean isInfix, boolean isPostfix){
    try{
    for(int i = 0; i < equationType.length; i++){
      while(onType[i]){
         System.out.print();
      }
     } // end of for loop
    } // end of try
    catch(exception e){
      
    } // end of catch exception
  } // end of equationTypeChecker method
  
  public static void main(String args[]){ 
    PostfixEvalutor evaluate = new PostfixEvalutor();
    evaluate.
  }
} // end of PostfixEvalutor class
