package w3schools.i_tutorial.i_iii_variables;

public class ii_displayVariables {

    public static void main(String[] args) {

        // To display a value often println() command is used
        System.out.println("Display a value in console");

        // To combine two values together use + sign
        String name = "Your name here";
        System.out.println("Please enter " + name);

        // Use also + sign add a variable to another variable:
        String firstName = "James";
        String lastName = "Bond";
        System.out.println(firstName + " " + lastName);

        // For numeric values, the + character works as a mathematical operator (notice that we use int (integer) variables here):
        int i = 1;
        int j = 2;
        System.out.println( i + j );

        //Declare Many Variables
        int x = 2, y = 3, z = 4;
        System.out.println(x + y + z);

        /*
        Java Identifiers
        All Java variables must be identified with unique names.
        These unique names are called identifiers.
        Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
        Note: It is recommended to use descriptive names in order to create understandable and maintainable code:
         */

        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;


    }

}
