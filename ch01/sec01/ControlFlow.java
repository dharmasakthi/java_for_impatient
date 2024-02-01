package ch01.sec01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1.7 Control Flow
 */
public class ControlFlow {
    public static void main(String[] args) {

        /*
        1.7.1 Branches
            if, else, else if
            switch
         */

        /*
        It is a common error to forget a break at the end of an alternative
        use jvm option "-Xlint:fallthrough" to throw a compile error
        With this option, the compiler will issue a warning message whenever an alternative does not end with a break or return statement
         */
        int count = 1;
        //You can use values [char , byte , short , int, Character , Byte , Short , Integer, String, enum]
        switch(count) {
            case 1:
                System.out.println(count);
            case 2:
                System.out.println(count);
        }
        /*
        1.7.2 Loops
            while, do while, for
            for (;;) // An infinite loop
         */
        for(int i=0, j=10; i<j && i>=0; i++, j--) {
            System.out.println("khjhkj");
        }

        /*
        1.7.3 Breaking and Continuing
            The break statement only breaks out of the immediately enclosing loop or switch
            If you want to jump to the end of another enclosing statement (2 loops), use a "labeled break" statement
         */
        outer:
        for (int i=0; i<5; i++) {
            System.out.print("i = " + i);
            for (int j=0; j<5; j++) {
                if(j == 1)
                    break outer;
                System.out.print(" j = " + j);
            }
            System.out.println();
        }

        int i = 0;
        sample: {
            i++;
            if(i < 10) {
                System.out.println(i);
                break sample;
            }
        }

        /*
        1.7.4 Local Variable Scope
            In Java, you cannot have local variables with the same name in overlapping scopes.
         */

    }
}
