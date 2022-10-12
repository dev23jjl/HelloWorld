/* 
*********************************************************************************
 *       James Johanningmeier     DLM: 10/11/2022       MyChoices.java 
 * 
 * Description: These are the basic required components of a simple Java program
 *  This program is interactive and asks the user their name and if they like 
 *   rock music or not. Then, their responses are processed using an If-else
 *      statement and a customized result is outputted in the terminal.
 *  
********************************************************************************* 
*/

//Import IOException and Scanner
import java.io.IOException;
import java.util.Scanner;

public class MyChoices {
    public static void main(String[] ifThen) throws IOException {

        //Initialize variables to hold the choices of the user
        String yourName;
        String yourChoice;

        //Create the scanner to receive input from the user
        try (Scanner in = new Scanner(System.in)) {

            //Ask the user for their name, listen for input
            System.out.println("Hello there, what is your name?");
            System.out.println("Please enter in your name below to continue... \n");
            yourName = in.next();

            //Ask the user if they like rock music or not
            System.out.println("\n Hello, " + yourName + "!");
            System.out.println("\n Do you like rock music?");
            System.out.println("\n Please choose Y (Yes) or N (No) by entering in your choice below... \n");
            yourChoice = in.next();

            //Process the response using an If-else statement
            if(yourChoice.equals("Y")) {

                //If the response is Y (Yes), then this result will be outputted
                System.out.println("\n You do like rock music " + yourName + "!");
                System.out.println("\n Then, " + yourName + ", I recommend that you listen to... \n");
                System.out.println("Bohemian Rhapsody (by Queen),");
                System.out.println("Livin' on a Prayer (by Bon Jovi), and");
                System.out.println("Comfortably Numb (by Pink Floyd)");
                
            } else {
                
                //Otherwise, this will be outputted instead of the code in the "if" block
                System.out.println("\n Sorry that you don't like rock music, " + yourName + " :( \n");
                System.out.println("Thanks for visiting, " + yourName + "!");
            }
        }
    }
}
