package ch01.sec01;

import java.math.BigInteger;

/**
 * CHAPTER - I
 * KEY POINTS
 * 1. Java has eight primitive types: four signed integral types, two floating-point types, char, and boolean.
 * 2. "String" objects are sequences of characters or, more precisely, Unicode code points in the UTF-16 encoding.
 * 3. With the "System.out" object, you can display output in a terminal window. A "Scanner" tied to "System.in" lets you read terminal input.
 * 4. Arrays and collections can be used to collect elements of the same type.
 * 5. A "package" is a set of related classes, group related classes together and avoid conflicts when multiple classes have the same name
 * 6. "javac" command compiles the Java source code into byte codes in class file.
 * 7. "java" command launches a "virtual machine" that loads the class files and executes the byte codes. [“write once, run anywhere”]
 */
public class MethodDemo {
    public static void main(String[] args) {
        /*
        1. "System.out" is an object. It is an instance of a class called PrintStream
         */
        System.out.println("Hello, World!");

        /*
        Java has eight primitive types: four signed integral types, two floating-point types, char, and boolean.
        1. Primitive Types
            1.1 Signed Integer Types
                byte    1 byte      –128 to 127
                short   2 bytes     –32,768 to 32,767
                int     4 bytes     –2,147,483,648 to 2,147,483,647 (just over 2 billion)
                long    8 bytes     –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

                NOTE: The constants "Integer.MIN_VALUE" and "Integer.MAX_VALUE" are the smallest and largest int values.
                    The Long, Short, and Byte classes also have MIN_VALUE and MAX_VALUE constants.
                    If the long type is not sufficient, use the "BigInteger" class

               Integer literals
               1. long -> 900L or 900l
               2. int -> 890
               3. short -> (short) 1223
               4. byte - > (byte) 123

               Other base system
               0x -> hexa -> eg:0xA12F
               0b -> binary -> eg:0b1011
               0 -> octa -> 011

         */
        BigInteger bInt = new BigInteger("9223372036854775807909765432134568987654321234568765432123456787651234567");
        bInt = bInt.multiply(BigInteger.valueOf(10));
        System.out.println(bInt);

        /*
        In java there is no unsigned values if you want you can use it like for Byte use Byte.toUnsignedInt(b)
        1.2 Floating point
            float   4 bytes     Approximately ±3.40282347E+38F (6–7 significant decimal digits)
            double  8 bytes     Approximately ±1.79769313486231570E+308 (15 significant decimal digits)

            Floating literals
            1. double -> 1.23, 1.23D, 1.23d
            2. float -> 1,23f, 1.23F
            these floating will round off the value so use "BigDecimal" for currency like calculation
         */

        double d = Double.NaN;
        if(Double.isNaN(d)) {
            System.out.println("hi");
        } else {
            System.out.println("bye");
        }

        char c = '\u263A';
        System.out.println("24fgdfgdfgdfgdfgdfgdfgdfgdfgdfgdfgdfgdfg\t\r3\\");

        /*
        The special codes and backspace. '\n' , '\r' , '\t' , '\b' denote a line feed, carriage return, tab,
        Use a backslash to escape a single quote '\'' and a backslash '\\' .

        1.3 Variables
            1. It can consist of any letters, digits, and the symbols _ and $
            2. $ used for automatically generated names so dont use it
            3. the _ by itself is not a valid variable name
            4. variable and function use camle case
            5. Class name start with upper Letter
         */

        int i = 0;
        System.out.println((-10)%(-3));

        /*
        1.4.3 Mathematical Methods
            1. Math.pow(x, y) yields x^y
            2. Math.sqrt(x)
            3. Math.min and Math.max
            4. Math class provides trigonometric and logarithmic functions as well as the constants Math.PI and Math.E
            5.
         */
        System.out.println(Math.multiplyExact(1000000000, 3));
    }
}
