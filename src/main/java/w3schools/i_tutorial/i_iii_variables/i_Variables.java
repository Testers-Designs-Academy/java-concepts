package w3schools.i_tutorial.i_iii_variables;

public class i_Variables {

    public static void main(String[] args) {

    // type variableName = value;

        // Storing String values
        String name = "Your name here.";
        System.out.println(name);

        // Storing integer values
        int i = 2;
        System.out.println(i);

        // Assign a value to a variable later
        int j;
        j = 3;
        System.out.println(j);

        // If you assign a new value to an existing variable, it will overwrite the previous value
        int k = 0;
        k = 4;
        System.out.println(k);

        // Using the keyword final if you don't want others (or yourself) to overwrite existing values (this will declare the variable as "final" or "constant", which means unchangeable and read-only)
        final int l = 5;
        // l = 10; // Uncomment to see the error

        // Other types of variables
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";



    }

}
