package w3schools.i_tutorial.i_iv_dataTypes;

public class iii_nonPrimitiveDataTypes {

    public static void main(String[] args) {

        /*
        Non-Primitive Data Types
        Non-primitive data types are called reference types because they refer to objects.

        The main difference between primitive and non-primitive data types are:
        - Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
        - Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
        - A primitive type has always a value, while non-primitive types can be null.
        - A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
        - The size of a primitive type depends on the data type, while non-primitive types have all the same size.
        - Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about these in a later chapter.
         */


        Strings();
    }

    public static void Strings(){

        //Strings
        /*
        The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:
         */
        String greeting = "Hello World";
        System.out.println(greeting);

        /*
        The String type is so much used and integrated in Java, that some call it "the special ninth type".
        A String in Java is actually a non-primitive data type, because it refers to an object. The String object has methods that are used to perform certain operations on strings. Don't worry if you don't understand the term "object" just yet. We will learn more about strings and objects in a later chapter.
         */

    }
}
