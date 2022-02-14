package w3schools.i_tutorial.i_iv_dataTypes;

public class ii_primitiveDataTypes {

    public static void main(String[] args) {

        /*
        Primitive data types - includes byte, short, int, long, float, double, boolean and char - https://www.w3schools.com/java/java_data_types.asp
        A primitive data type specifies the size and type of variable values, and it has no additional methods.
         */

        /*
        Numbers
        Primitive number types are divided into two groups:

        - Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.
        - Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: float and double.

        Even though there are many numeric types in Java, the most used for numbers are int (for whole numbers) and double (for floating point numbers). However, we will describe them all as you continue to read.
         */

        //1. Byte
        IntegerTypesByte();

        //2. Short
        IntegerTypesShort();

        //3. Int
        IntegerTypesInt();

        //4. Long
        IntegerTypesLong();

        //5. Float
        FloatingPointTypesFloat();

        //6. Double
        FloatingPointTypesDouble();

        // Scientific Numbers
        ScientificNumbers();

        //7. Boolean
        Booleans();

        //8. Characters
        Characters();



    }

    public static void IntegerTypesByte(){

        //Byte
        /*
        The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
         */

        byte myNum = 127;
        System.out.println(myNum);

    }

    public static void IntegerTypesShort() {

        //Short
        /*
        The short data type can store whole numbers from -32768 to 32767:
         */

        short myNum = 32767;
        System.out.println(myNum);

    }

    public static void IntegerTypesInt() {

        //Int
        /*
        The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.
        */

        int myNum = 2147483647;
        System.out.println(myNum);

    }

    public static void IntegerTypesLong() {

        //Long
        /*
        The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L":
        * */
        long myNum = 9223372036854775807L;
        System.out.println(myNum);

    }

    //Floating Point Types
    /*
    You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
     */

    public static void FloatingPointTypesFloat() {

        //Float
        /*
        The float data type can store fractional numbers from 3.4e−038 to 3.4e+038. Note that you should end the value with an "f":
         */
        float myNum = 5.75f;
        System.out.println(myNum);

    }

    public static void FloatingPointTypesDouble() {

        //Double
        /*
        The double data type can store fractional numbers from 1.7e−308 to 1.7e+308. Note that you should end the value with a "d":
         */
        double myNum = 19.99d;
        System.out.println(myNum);
    }

    public static void ScientificNumbers(){

        //Scientific Numbers
        /*
        A floating point number can also be a scientific number with an "e" to indicate the power of 10:
         */
        float f1 = 35.12e3f;
        double d1 = 1.212E4d;
        System.out.println(f1);
        System.out.println(d1);

    }

    public static void Booleans(){

        //Booleans
        /*
        A boolean data type is declared with the boolean keyword and can only take the values true or false:
         */
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
    }

    public static void Characters(){

        //Characters
        /*
        The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':
         */
        char myGrade = 'B';
        System.out.println(myGrade);

        /*
        Alternatively, you can use ASCII values to display certain characters: https://www.w3schools.com/charsets/ref_html_ascii.asp
         */
        char myVar1 = 205, myVar2 = 1025, myVar3 = 12345;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

    }
}
