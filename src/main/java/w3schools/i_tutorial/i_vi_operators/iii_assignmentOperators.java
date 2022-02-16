package w3schools.i_tutorial.i_vi_operators;

public class iii_assignmentOperators {

    public static void main(String[] args) {

        //Java Assignment Operators
        /*
        Assignment operators are used to assign values to variables.
        In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:
         */

        int x = 10;
        System.out.println(x);

        //The addition assignment operator (+=) adds a value to a variable:
        int a = 10;
        a += 5;
        System.out.println("a : x + 3 = " + a);

        int b = 10;
        b -= 3;
        System.out.println("b : x - 3 = " + b);

        int c = 10;
        c *= 3;
        System.out.println("c : x * 3 = " + c);

        int d = 10;
        d /= 3;
        System.out.println("d : x / 3 = " + d);

        int e = 10;
        e %= 5;
        System.out.println("e : x % 3 = " + e);

        int f = 10;
        f &= 4; //TODO: To find out how does this work
        System.out.println("f :" + f);

        int g = 10;
        g |= 3; //TODO: To find out how does this work
        System.out.println("g :" + g);

        int h = 10;
        h ^= 3;
        System.out.println("h : x ^ 3 = " + h);

        int i = 10;
        i >>= 3; //TODO: To find out how does this work
        System.out.println("i :" + i);

        int j = 10;
        j <<= 3; //TODO: To find out how does this work
        System.out.println("j :" + j);

        
    }
}
