/* 
*********************************************************************************
 *       James Johanningmeier     DLM: 10/18/2022       MySizes.java 
 * 
 * Description: These are the basic required components of a simple Java program
 *     This program is interactive and asks the user for their waist size. 
 *       It then processes the users input using two different methods:
 *   switch-case and nested if statements. The two output the same result.
 *  
********************************************************************************* 
*/

//Imports Utilities
import java.io.IOException;
import java.util.Scanner;

public class MySizes {
    public static void main(String[] args) throws IOException {
        // Initialize variable for customer size
        int customerSize;

        // Initialize variables for the upper and lower bounds of sizes for nested if statement
        int upperBoundLarge = 30;
        int upperBoundMedium = 26;
        int upperBoundSmall = 22;
        int lowerBoundSmall = 19;

        // Create a new scanner for user input
        try (Scanner in = new Scanner(System.in)) {

            // Prints out a welcome, asks for waist size, and scans the input of the user
            System.out.println("Welcome to the clothes shop!");
            System.out.println("What is your waist size in inches? (please input an integer) \n");
            customerSize = in.nextInt();

            // Processing of customerSize using switch-case (inefficient for this scenario)
            switch (customerSize) {
                case 19: case 20:
                case 21: case 22:
                System.out.println("You wear small size!");
                    break;
                case 23: case 24:
                case 25: case 26:
                System.out.println("You wear medium size!");
                    break;
                case 27: case 28:
                case 29: case 30:
                System.out.println("You wear large size!");
                    break;
                default:
                System.out.println("We do not have a size for you. Try our children's department for smaller sizes and our special clothing department for larger sizes!");
                    break;
            }

            //Pre-initialized booleans to create a cleaner nested if statement
            boolean isLarge = (customerSize > upperBoundMedium && customerSize <= upperBoundLarge);
            boolean isSmall = (customerSize >= lowerBoundSmall && customerSize <= upperBoundSmall);
            boolean isMedium = (customerSize > upperBoundSmall && customerSize <= upperBoundMedium);

            //Processing of customerSize using a nested if-statement (much more efficient for this scenario)
            if (isSmall) {
                System.out.println("You wear small size!");
            } if (isMedium) {
                System.out.println("You wear medium size!");
            } if (isLarge) {
                System.out.println("You wear large size!");
            } else {
                System.out.println("We do not have a size for you. Try our children's department for smaller sizes and our special clothing department for larger sizes!");
            }
        }
    }
}
