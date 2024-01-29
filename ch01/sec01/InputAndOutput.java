package ch01.sec01;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.Console;
import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        /*
        1.6.1 Reading Input
        When you call System.out.println, output is sent to the “standard output stream” and shows up in a terminal window.
        Reading from the “standard input stream” isn’t quite as simple because the corresponding
        System.in object only has methods to read individual bytes.
        To read strings and numbers, construct a Scanner that is attached to System.in:
         */
        Scanner in = new Scanner(System.in);

        //The nextLine method reads a line of input.
        String name = in.nextLine();
        System.out.println(name);

        //Here, it makes sense to use the nextLine method because the input might contain spaces.
        // To read a single word (delimited by whitespace), call

        String firstName = in.next();
        System.out.println(firstName);

        //To read an integer, use the nextInt method.
        int age = in.nextInt();
        System.out.println(age);
        //Similarly, the nextDouble method reads the next floating-point number.

        //To read a password, you do not want to use the Scanner class since the input is visible in the terminal.
        // Instead, use the Console class:
//        Console terminal = System.console();
//        name = terminal.readLine("enter name");
//        char[] password = terminal.readPassword("enter password");

//        System.out.println(password);

        /*
        1.6.2 Formatted Output
         */
        System.out.printf("%+08.3f__", 1000.0 / 3.0);
        //multiple parameters to printf
        System.out.printf("Hello, %s. Next year, you'll be %2d.\n", name, age);

    }
}
