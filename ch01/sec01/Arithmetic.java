package ch01.sec01;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Arithmetic {
    /*
    operators are listed by decreasing precedence
    Operators                                       Associativity
    [] . () (method call)                       |   Left
    ! ~ ++ -- + (unary) - (unary) () (cast) new |   Right
    * / % (modulus)                             |   Left
    +-                                          |   Left
    << >> >>> (arithmetic shift)                |   Left
    < > <= >= instanceof                        |   Left
    == !=                                       |   Left
    & (bitwise and)                             |   Left
    ^ (bitwise exclusive or)                    |   Left
    | (bitwise or)                              |   Left
    && (logical and)                            |   Left
    || (logical or)                             |   Left
    ? : (conditional)                           |   Left
    = += -= *= /= %= <<= >>= >>>= &= ^= |=      |   Right

    If both operands are integer types, it denotes integer division, discarding the remainder. For example, 17 / 5 is 3, whereas 17.0 / 5 is 3.4.
     */
    public static void main(String[] args) {
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
//        System.out.println(Math.multiplyExact(1000000000, 3));

        /*
        1.4.4 Number Type Conversions
            1. If either of the operands is of type double, the other one is converted to double.
            2. If either of the operands is of type float, the other one is converted to float.
            3. If either of the operands is of type long, the other one is converted to long.
            4. Otherwise, both operands are converted to int.

            If you compute 'J' + 1, the char value 'J' is converted to the int value 74, and the result is the int value 75.
            char next = (char)('J' + 1); // Converts 75 to 'K'

            If the precision of the primitive integer and floating-point types is not sufficient,
            you can turn to the BigInteger and BigDecimal classes in the java.math
         */

        //The static valueOf method turns a long into a BigInteger:
        BigInteger n = BigInteger.valueOf(876543210123456789L);
//        You can also construct a BigInteger from a string of digits:
        BigInteger k = new BigInteger("9876543210123456789");
//        There are predefined constants BigInteger.ZERO, BigInteger.ONE, BigInteger.TWO, and BigInteger.TEN.

        // See the difference
        float result = 2.0f - 1.111111f;
        System.out.println(result);

        System.out.println(BigDecimal.valueOf(2,0).subtract(BigDecimal.valueOf(11111111,8)));
    }
}
