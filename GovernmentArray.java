public class GovernmentArray {
    public static void main(String[] govVar) {

        //This is a three dimensional array that initiates 3 groups of 4 x 3 arrays
        String [] [] [] governmentArray = new String [4] [3] [3];

        //Filling the array with values for the names, parties, and ages of US Representatives from the state of Iowa
        governmentArray [0] [0] [0] = "Mariannette Miller-Meeks";
        governmentArray [0] [1] [0] = "Republican";
        governmentArray [0] [2] [0] = "67";

        governmentArray [1] [0] [0] = "Ashley Hinson";
        governmentArray [1] [1] [0] = "Republican";
        governmentArray [1] [2] [0] = "39";

        governmentArray [2] [0] [0] = "Zach Nunn";
        governmentArray [2] [1] [0] = "Republican";
        governmentArray [2] [2] [0] = "43";

        governmentArray [3] [0] [0] = "Randy Feenstra";
        governmentArray [3] [1] [0] = "Republican";
        governmentArray [3] [2] [0] = "53";

        //Filling the array with values for the names, parties, and ages of US Senators from the state of Iowa
        governmentArray [0] [0] [1] = "Chuck Grassley";
        governmentArray [0] [1] [1] = "Republican";
        governmentArray [0] [2] [1] = "89";

        governmentArray [1] [0] [1] = "Joni Ernst";
        governmentArray [1] [1] [1] = "Republican";
        governmentArray [1] [2] [1] = "52";

        //Filling the array with values for the name, party, and age of the Governor of the state of Iowa
        governmentArray [0] [0] [2] = "Kim Reynolds";
        governmentArray [0] [1] [2] = "Republican";
        governmentArray [0] [2] [2] = "63";

        //Printing out the values of the array for each representative as well as their district
        System.out.println("\n" + "US Representatives from Iowa");

        //Using a for-loop to iterate through the values
        for (int x = 0; x < 4; x++) {
            System.out.println("\n" + "Representative for Iowa Congressional District " + (x+1));
            System.out.println("Name: " + governmentArray [x] [0] [0]);
            System.out.println("Party: " + governmentArray [x] [1] [0]);
            System.out.println("Age: " + governmentArray [x] [2] [0]);
        }

        //Printing out the values of the array for each senator
        System.out.println("\n" + "US Senators from Iowa");

        //Using a for-loop to iterate through the values
        for (int x = 0; x < 2; x++) {
            System.out.println("\n" + "Name: " + governmentArray [x] [0] [1]);
            System.out.println("Party: " + governmentArray [x] [1] [1]);
            System.out.println("Age: " + governmentArray [x] [2] [1]);
        }

        //Printing out the values of the array for the governor
        System.out.println("\n" + "The Governor of Iowa");
        System.out.println("\n" + "Name: " + governmentArray [0] [0] [2]);
        System.out.println("Party: " + governmentArray [0] [1] [2]);
        System.out.println("Age: " + governmentArray [0] [2] [2]);
    }
}
