/* 
*********************************************************************************
 *       James Johanningmeier     DLM: 9/22/2022       JavaVariables.java 
 * 
 * Description: These are the basic required components of a simple Java program
 *  This program initializes five variables with descriptive names (that have 
 *    incorrect values), prints their name and their value in the terminal, 
 *      changes the value of the variables to the correct values using 
 *   mathematical operations, and prints out the new values in the terminal
 *  
********************************************************************************* 
*/

public class JavaVariables {
    public static void main(String[] javaVar)
    {
        // Initialize five different variables
        int daysOfYear = 52;
        int weeksOfYear = 365;
        int monthsOfYear = 7;
        int hoursOfDay = 12;
        int daysOfWeek = 24;

        // Print out values of each variable
        System.out.println("-------------------------------------------------------");
        System.out.println("daysOfYear= " + daysOfYear);
        System.out.println("weeksOfYear= " + weeksOfYear);
        System.out.println("monthsOfYear= " + monthsOfYear);
        System.out.println("daysOfWeek= " + daysOfWeek);
        System.out.println("hoursOfDay= " + hoursOfDay);
        System.out.println("");
        System.out.println("Wow, someone got something wrong here - let's fix it...");
        System.out.println("-------------------------------------------------------");

        //Replace current values by performing mathematical operations
        daysOfYear = monthsOfYear * daysOfYear + 1; //Now 365
        weeksOfYear = daysOfYear / monthsOfYear; //Now 52
        monthsOfYear = daysOfWeek - hoursOfDay; //Now 12
        hoursOfDay = monthsOfYear * 2; //Now 24
        daysOfWeek = daysOfYear / weeksOfYear; //Now 7

        // Print out values of corrected variables
        System.out.println("daysOfYear= " + daysOfYear);
        System.out.println("weeksOfYear= " + weeksOfYear);
        System.out.println("monthsOfYear= " + monthsOfYear);
        System.out.println("daysOfWeek= " + daysOfWeek);
        System.out.println("hoursOfDay= " + hoursOfDay);
        System.out.println("");
        System.out.println("All better! :)");
        System.out.println("-------------------------------------------------------");
    }
}
