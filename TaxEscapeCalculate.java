/* 
*********************************************************************************
 *       James Johanningmeier     DLM: 10/10/2022       TaxEscapeCalculate.java 
 * 
 * Description: These are the basic required components of a simple Java program
 *  This program computes the tax amount, gross pay, and net pay of an example
 *          and outputs the results of the computation in the terminal.
 *  
********************************************************************************* 
*/

public class TaxEscapeCalculate {
    public static void main(String[] taxVar)
    {
        double hrsWorked = 40;
        double payRate = 10.00;
        double taxRate1 = 0.25;
        double taxRate2 = 0.50;
        double grossPay = 0.00;
        double taxAmt = 0.00;
        double netPay = 0.00;

        System.out.println("hrsWorked = " + hrsWorked); // prints the variable name,
        System.out.println("payRate = $" + payRate); // the equal sign, and the
        System.out.println("taxRate1 = " + taxRate1); // and the value stored in it
        System.out.println("taxRate2 = " + taxRate2);
        System.out.println("grossPay =$" + grossPay);
        System.out.println("taxAmt = $" + taxAmt);
        System.out.println("netPay = $" + netPay);

        // use arithmetic and comparison operators to turn data into information
        grossPay = payRate * hrsWorked; // puts the results from the

        // conditional operator example used to determine
        // which tax rate to use based on whether the conditional statement,
        // grossPay >= 500 is True or False
        taxAmt = (grossPay >= 500) ? grossPay * taxRate2 : grossPay * taxRate1;

        // taxAmt receives the result of the conditional operator
        // if grossPay is greater than or equal to 500 then the conditional part of the
        // statement is True and the variable taxAmt receives the value of
        // grossPay * taxRate2, or grossPay * 0.50
        // if grossPay is not greater than or equal to 500 then the conditional part of the
        // statement is False and the variable taxAmt receives the value of
        // grossPay * taxRate1, or grossPay * 0.25
        netPay = grossPay - taxAmt;

        System.out.println("hrsWorked = " + hrsWorked); //prints new values
        System.out.println("payRate = $" + payRate);
        System.out.println("taxRate1 = " + taxRate1);
        System.out.println("taxRate2 = " + taxRate2);
        System.out.println("grossPay =$" + grossPay);
        System.out.println("taxAmt = $" + taxAmt);
        System.out.println("netPay = $" + netPay);
    }
}
