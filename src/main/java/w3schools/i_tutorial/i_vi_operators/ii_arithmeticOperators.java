package w3schools.i_tutorial.i_vi_operators;

public class ii_arithmeticOperators {

    public static void main(String[] args) {

        //Arithmetic Operators
        /*
        Arithmetic operators are used to perform common mathematical operations.
         */

        //1. Addition
        Addition();

        //2. Subtraction
        Subtraction();

        //3. Multiplication
        Multiplication();

        //4. Division
        Division();

        //5. Modulus
        Modulus();

        //6. Increment
        Increment();

        //7. Decrement
        Decrement();


    }

    public static void Addition() {

        int x = 5;
        int y = 3;
        System.out.println("Addition : " + (x + y));

    }

    public static void Subtraction() {

        int x = 5;
        int y = 3;
        System.out.println("Subtraction : " + (x - y));

    }

    public static void Multiplication() {

        int x = 5;
        int y = 3;
        System.out.println("Multiplication : " + x * y);

    }

    public static void Division() {

        int x = 6;
        int y = 3;
        System.out.println("Division : " + x / y);

    }

    public static void Modulus() {

        int x = 5;
        int y = 3;
        System.out.println("Modulus : " + x % y);

    }

    public static void Increment() {

        int x = 6;
        System.out.println("Increment : " + ++x);

    }

    public static void Decrement() {

        int x = 6;
        System.out.println("Decrement : " + --x);

    }


}
