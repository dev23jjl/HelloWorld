/* 
*********************************************************************************
 *       James Johanningmeier     DLM: 9/28/2022       MathOperations.java 
 * 
 * Description: These are the basic required components of a simple Java program
 * The program declares and manipulates variables using assignment, mathematical, 
 *      and comparison operators and prints these variables to the terminal.
 *  
********************************************************************************* 
*/
public class MathOperations {
    public static void main(String[] mathOperations)
    {
        //Initializes the variables for computation
        float hrsWorked = 40;
        double payRate = 10.00;
        double taxRate1 = 0.25;
        double taxRate2 = 0.50;
        double grossPay = 0.00;
        double taxAmt = 0.00;
        double netPay = 0.00;

        //Prints out the name of the variable and it's value
        System.out.println("hrsWorked= " + hrsWorked);
        System.out.println("payRate= $" + payRate);
        System.out.println("taxRate1 = " + taxRate1);
        System.out.println("taxRate2 = " + taxRate2);
        System.out.println("grossPay = " + grossPay);
        System.out.println("taxAmt = " + taxAmt);

        //Changes the values of grossPay, taxAmt, and netPay based on other variables
        //Checks if the grossPay is large (greater than/equal to 500) or small (less than/equal to 500)        
        grossPay = payRate * hrsWorked;
        boolean bigGrossPay = (grossPay >= 500);
        taxAmt = grossPay * taxRate1;
        boolean littleGrossPay = (grossPay <= 500);
        taxAmt = grossPay * taxRate2;
        netPay = grossPay - taxAmt;

        //Prints out the information
        System.out.println("hrsWorked = " + hrsWorked);
        System.out.println("payRate = $" + payRate);
        System.out.println("taxRate1 = " + taxRate1);
        System.out.println("taxRate2 = " + taxRate2);
        System.out.println("grossPay = $" + grossPay);
        System.out.println("taxAmt = $" + taxAmt);
        System.out.println("netPay = $" + netPay);
        System.out.println("bigGrossPay = " + bigGrossPay);
        System.out.println("littleGrossPay = " + littleGrossPay);
    }
}
