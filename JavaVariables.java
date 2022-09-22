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
        System.out.println("daysOfYear= " + daysOfYear);
        System.out.println("weeksOfYear= " + weeksOfYear);
        System.out.println("monthsOfYear= " + monthsOfYear);
        System.out.println("daysOfWeek= " + daysOfWeek);
        System.out.println("hoursOfDay= " + hoursOfDay);
        System.out.println("Wow, someone got something wrong here - let's fix it...");

        //Replace current values
        daysOfYear = monthsOfYear * daysOfYear + 1; //Now 365
        weeksOfYear = daysOfYear / monthsOfYear; //Now 52
        monthsOfYear = daysOfWeek / 2; //Now 12
        hoursOfDay = monthsOfYear * 2; //Now 24
        daysOfWeek = daysOfYear / weeksOfYear; //Now 7

        // Print out values of corrected variables
        System.out.println("daysOfYear= " + daysOfYear);
        System.out.println("weeksOfYear= " + weeksOfYear);
        System.out.println("monthsOfYear= " + monthsOfYear);
        System.out.println("daysOfWeek= " + daysOfWeek);
        System.out.println("hoursOfDay= " + hoursOfDay);
        System.out.println("All better! :)");
    }
}
