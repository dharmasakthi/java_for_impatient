package ch01.sec01;

import java.util.*;

public class ArrayTut {
    public static void main(String[] args) {
        /*
        1.8 Arrays and Array Lists
            collecting multiple items of the same type.
            When you construct an array with the value.
            • Arrays of numeric type (including char)
            • Arrays of boolean are filled with new char ) operator, it is filled with a default are filled with zeroes. false .
            • Arrays of objects are filled with null references.
         */
        int[] a = new int[10];
        int[] b = {1, 2, 3};
        b = new int[] {1,2,3,4};

        /*
        1.8.3 Array Lists
         */
        ArrayList<String> friends = new ArrayList<>();
        // or new ArrayList<String>()
        //Note the empty <> . The compiler infers the type parameter from the type of the variable.

        friends = new ArrayList<>(List.of("sakthi", "dharma"));
        friends.remove(0);
        System.out.println(friends);

        try {
            // List.of unmutable list
            List list = List.of(new String("hi"));
            list.add("sakthi");
            list.remove(0);
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        1.8.4 Wrapper Classes for Primitive Types
            Integer , Byte , Short , Long , Character , Float , Double , and Boolean
            Conversion between primitive types and their corresponding wrapper types is automatic
         */
        ArrayList<Integer> intArray = new ArrayList<>(List.of(1,2,1,1));
        if(intArray.get(0).equals(intArray.get(1))) {
            System.out.println("equal");
        }
        // Compares the object content in wrapper class but on other object it compares the reference
        if(intArray.get(0) < intArray.get(1)) {
            System.out.println("equal");
        }
        Short aa  = 10;
        Integer bb = 11;
        if(bb > aa) {
            System.out.println("jiiiiiiiiiiii");
        }

        /*
        1.8.5 The Enhanced for Loop
         */
        for(int value: intArray) {
            System.out.println(value);
        }
         /*
        1.8.6 Copying Arrays and Array Lists
            int[] numbers = primes;
            numbers[5] = 42; // Now primes[5] is also 42
            If you don’t want this sharing use static "Arrays.copyOf" method
         */
        int[] intArray2 = Arrays.copyOf(a, a.length);

        // To copy new array list into array list, construct a new array list from the existing one
        ArrayList<Integer> intArray3 = new ArrayList<>(intArray);

        // copy an array into an array list use "List.of"
        Integer[] testArray = {1,2,3,4};
        ArrayList<Integer> intArray4 = new ArrayList<>(List.of(testArray));

        // copy array list into array
        Integer[] testArray1;
        testArray1 = intArray4.toArray(testArray);

        /*
        There is no easy way to convert between primitive type arrays and the corresponding array lists of wrapper classes.
        For example, to convert between an int[] and an ArrayList<Integer> , you need an explicit loop or an IntStream
         */

        /*
        1.8.7 Array Algorithms
            The Arrays and Collections classes provide implementations of common algorithms for arrays and array lists
         */
        // print null
        Integer[] arr = new Integer[10];
        System.out.println(arr[1]);
        System.out.println(arr[1]);

        // print 0
        int[] arrInt = new int[10];
        System.out.println(arrInt[1]);
        System.out.println(arrInt[1]);

        // Fill array
        Arrays.fill(a, 10);

        // Fill array List
        Collections.fill(intArray3, 10);

        //To sort an array or array list, use the sort method:
        Arrays.sort(intArray2);
        Collections.sort(intArray3);

        //The Arrays.toString method yields a string representation of an array.
        System.out.println(Arrays.toString(intArray2));

        //Array lists have a toString
        System.out.println(intArray4.toString());

        /*
        1.8.8 Command-Line Arguments
         */

        /*
        1.8.9 Multidimensional Arrays
            Java does not have true multidimensional arrays. They are implemented as arrays of arrays
         */
        int[][] square = {
                { 16, 3, 2, 13 },
                { 5, 10, 11, 8 },
                { 9, 6, 7, 12 },
                { 4, 15, 14, 1}
        };

        //There is no requirement that the row arrays have equal length
        int[][] pascal = new int[4][];

    }
}
