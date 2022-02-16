package w3schools.i_tutorial.i_vi_operators;

public class v_logicalOperators {

    public static void main(String[] args) {

        //Java Logical Operators
        /*
        Logical operators are used to determine the logic between variables or values:
         */

        int x = 5;
        System.out.println("AND -> (5 > 3) && (5 < 10) -> " + (x > 3 && x < 10)); // AND -> returns true because 5 is greater than 3 AND 5 is less than 10

        int y = 5;
        System.out.println("OR -> (5 > 4) || (5 < 4) -> " + (y > 3 || y < 4)); // OR -> returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)

        int z = 5;
        System.out.println("NOT -> !(5==4) -> " + !(5==4)); // returns false because ! (not) is used to reverse the result
    }
}
