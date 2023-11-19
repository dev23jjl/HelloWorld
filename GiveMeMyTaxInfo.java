/* 
*********************************************************************************
 *       dev23jjl     DLM: 10/11/2022       GiveMeMyTaxInfo.java 
 * 
 * Description: these are the basic required components of a simple Java program
 *          this program creates character and string variables to hold
 *         user input and uses the conditional operator, the if statement,
 *              and the if-else statement to produce output using
 *          Personalized data for tax amount, gross pay, and net pay
 *  
********************************************************************************* 
*/

import java.io.IOException;
import java.util.Scanner;

public class GiveMeMyTaxInfo {
    public static void main(String[] someVariableName) throws IOException {

        String userChoice;
        
        String userName;
        
        double hrsWorked = 0;
        double payRate = 0.00;
        double taxRate1 = 0.25;
        double taxRate2 = 0.50;
        
        double grossPay = 0.00;
        double taxAmt = 0.00;
        double netPay = 0.00;
        
        
        try (Scanner in = new Scanner( System.in )) {
            System.out.println("Please enter your first name ==> \n");
            userName = in.next(); // Read the next word from Standard input
            
            
            System.out.println("Do you want to compute your net pay? \n");
            System.out.println("Enter Y for yes or N for no ==> ");
            userChoice = in.next(); //read user input and store in
            
            
            if (userChoice.equals("Y")) {
            System.out.println("\n Please enter the number of hours you worked ==>");
            hrsWorked = in.nextInt();
            
            
            System.out.println("\n Please enter your pay rate ==> $");
            payRate = in.nextFloat();
            
            grossPay = payRate * hrsWorked;
            
            taxAmt = (grossPay >= 500) ? grossPay * taxRate2 : grossPay * taxRate1;
            
            netPay = grossPay - taxAmt;
            
            System.out.println( "\n " + userName + " you said you worked " + hrsWorked + " hours at $" + payRate + "\n");
            System.out.println("which means you earned a gross amount of $" + grossPay + " \n");
            System.out.println("and you paid $" + taxAmt + " in taxes\n");
            System.out.println("so your net pay is $" + netPay + " \n");
            
            } else {
            System.out.println("\n Thank you " + userName + " then I will not computer your net pay \n");
            System.out.println(" Thank you and please come again. \n");
            }
        }
    }
}
