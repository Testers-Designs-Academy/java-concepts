package w3schools.i_tutorial.i_v_typeCasting;

public class ii_wideningCasting {

    public static void main(String[] args) {

        //Widening Casting
        /*
        Widening casting is done automatically when passing a smaller size type to a larger size type:
         */

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
    }
}
