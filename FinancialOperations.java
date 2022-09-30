/* 
*********************************************************************************
 *    James Johanningmeier     DLM: 9/30/2022       FinancialOperations.java 
 * 
 * Description: These are the basic required components of a simple Java program
 * The program declares and manipulates variables using assignment, mathematical, 
 * and comparison operators to compute various information for the financials of
 *  three different employees and prints out this information in the terminal. 
 *  
********************************************************************************* 
*/
public class FinancialOperations {
    public static void main(String[] financialOperation) 
    {
        //Initialize Variables for basic setup
        float hrsWorked = 40;
        double payRate = 10.00;
        double taxRate1 = 0.25;
        double taxRate2 = 0.50;
        double grossPay = 0.00;
        double taxAmt = 0.00;
        double netPay = 0.00;

        //Prints out the name of the variable and it's value
        System.out.println("Initial Setup");
        System.out.println("hrsWorked= " + hrsWorked);
        System.out.println("payRate= $" + payRate);
        System.out.println("taxRate1 = " + taxRate1);
        System.out.println("taxRate2 = " + taxRate2);
        System.out.println("grossPay = " + grossPay);
        System.out.println("taxAmt = " + taxAmt);
        System.out.println("****************");

        //Computes information for the first employee, Bob Basic
        //Changes the values of grossPay, taxAmt, and netPay based on other variables
        //Checks if the grossPay is large (greater than/equal to 500) or small (less than/equal to 500)        
        grossPay = payRate * hrsWorked;
        boolean bigGrossPay = (grossPay >= 500);
        taxAmt = grossPay * taxRate1;
        boolean littleGrossPay = (grossPay <= 500);
        taxAmt = grossPay * taxRate2;
        netPay = grossPay - taxAmt;

        //Prints out information for the first employee: Bob Basic
        System.out.println("Employee Name: Bob Basic");
        System.out.println("hrsWorked = " + hrsWorked);
        System.out.println("payRate = $" + payRate);
        System.out.println("taxRate1 = " + taxRate1);
        System.out.println("taxRate2 = " + taxRate2);
        System.out.println("grossPay = $" + grossPay);
        System.out.println("taxAmt = $" + taxAmt);
        System.out.println("netPay = $" + netPay);
        System.out.println("bigGrossPay = " + bigGrossPay);
        System.out.println("littleGrossPay = " + littleGrossPay);
        System.out.println("****************");

        //Changes information for the second employee, William Workmore
        hrsWorked = 60;
        payRate = 12;
        grossPay = 0.00;
        taxAmt = 0.00;
        netPay = 0.00;

        //Prints out the name of the variable and it's value after further manipulation
        System.out.println("More hours and better pay");
        System.out.println("hrsWorked= " + hrsWorked);
        System.out.println("payRate= $" + payRate);
        System.out.println("taxRate1 = " + taxRate1);
        System.out.println("taxRate2 = " + taxRate2);
        System.out.println("grossPay = " + grossPay);
        System.out.println("taxAmt = " + taxAmt);
        System.out.println("****************");

        //Computes information for the second employee, William Workmore
        grossPay = payRate * hrsWorked;
        bigGrossPay = (grossPay >= 500);
        taxAmt = grossPay * taxRate1;
        littleGrossPay = (grossPay <= 500);
        taxAmt = grossPay * taxRate2;
        netPay = grossPay - taxAmt;

        //Prints out information for the second employee: William Workmore
        System.out.println("Employee Name: William Workmore");
        System.out.println("hrsWorked = " + hrsWorked);
        System.out.println("payRate = $" + payRate);
        System.out.println("taxRate1 = " + taxRate1);
        System.out.println("taxRate2 = " + taxRate2);
        System.out.println("grossPay = $" + grossPay);
        System.out.println("taxAmt = $" + taxAmt);
        System.out.println("netPay = $" + netPay);
        System.out.println("bigGrossPay = " + bigGrossPay);
        System.out.println("littleGrossPay = " + littleGrossPay);
        System.out.println("****************");

        //Changes out information for the third employee, Mandy Makesalot
        hrsWorked = 30;
        payRate = 50;
        grossPay = 0.00;
        taxAmt = 0.00;
        netPay = 0.00;

        //Prints out the name of the variable and it's value after further manipulation
        System.out.println("Less hours and way better pay");
        System.out.println("hrsWorked= " + hrsWorked);
        System.out.println("payRate= $" + payRate);
        System.out.println("taxRate1 = " + taxRate1);
        System.out.println("taxRate2 = " + taxRate2);
        System.out.println("grossPay = " + grossPay);
        System.out.println("taxAmt = " + taxAmt);
        System.out.println("****************");

        //Computes information for the second employee, Mandy Makesalot
        grossPay = payRate * hrsWorked;
        bigGrossPay = (grossPay >= 500);
        taxAmt = grossPay * taxRate1;
        littleGrossPay = (grossPay <= 500);
        taxAmt = grossPay * taxRate2;
        netPay = grossPay - taxAmt;

        //Prints out information for the first employee: Mandy Makesalot
        System.out.println("Employee Name: Mandy Makesalot");
        System.out.println("hrsWorked = " + hrsWorked);
        System.out.println("payRate = $" + payRate);
        System.out.println("taxRate1 = " + taxRate1);
        System.out.println("taxRate2 = " + taxRate2);
        System.out.println("grossPay = $" + grossPay);
        System.out.println("taxAmt = $" + taxAmt);
        System.out.println("netPay = $" + netPay);
        System.out.println("bigGrossPay = " + bigGrossPay);
        System.out.println("littleGrossPay = " + littleGrossPay);
        System.out.println("****************");
    }
}
