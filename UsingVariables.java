/* 
*********************************************************************************
 *       James Johanningmeier     DLM: 9/21/2022       UsingVariables.java 
 * 
 * Description: These are the basic required components of a simple Java program
 * The program prints "Skeleton Code!" to the screen as a string literal, declares 
 *  and initializes three variables, manipulates the data values within those 
 *  variables by using arithmetic operators to change the values held by the 
 *    variables, and prints the contents of the variables to the terminal.
 *  
********************************************************************************* 
*/

public class UsingVariables {
    public static void main(String[] myVar)
    {
        // Initialize the three variables
        int myAge = 17;
        int yourAge = 24;
        int totalAge = 0;
        
        // This prints out the variables in a way that can be understood by humans
        // Warning: This is comical and conversational and probably not accurate...
        System.out.println("I am " + myAge + " years old!");
        System.out.println("Are you " + yourAge + " years old?");
        System.out.println("This Java program currently thinks that our total age altogether is " + totalAge + " years.");
        System.out.println("But, we'll change that...");
        System.out.println("********************************************************************************************");

        // Changes totalAge to add myAge and yourAge
        totalAge = myAge + yourAge;

        // Prints out the updated variable "totalAge" (in a conversational manner)
        System.out.println("Now that we changed a few things, our age combined is " + totalAge + " years!");
        System.out.println("That is a long time!");
        System.out.println("******************************************************************************");

        // And last but not least for randomness, we will print out "Skeleton Code!"
        System.out.println("This is");
        System.out.println("Skeleton Code!");
        System.out.println("For using simple variables!");
    }
}
