package ch01.sec01;

public class StringTut {
    /*
    A string is a sequence of characters.
    In Java, a string can contain any Unicode characters.
    For example, the string "JavaTM" or "Java\u2122" consists of the five characters J, a, v, a, and TM.
    The last character is “U+2122 Trade Mark Sign.”
     */
    public static void main(String[] args) {
        String string = "Java\u2122";
        System.out.println(string);
        /*
        1.5.1 Concatenation
            Use the + operator to concatenate two strings
            When you concatenate a string with another value, that value is converted to a string
         */

        //To combine several strings, separated with a delimiter
        string =  String.join("," , "sakthi", "dharma");
        System.out.println(string);

        //large number of strings concat use StringBuilder

        /*
        1.5.2 Substrings
            To take strings apart, use the substring method. For example,
            String greeting = "Hello, World!";
            String location = greeting.substring(7, 12); // Sets location to "World"

            Extract all substrings from a string that are separated by a delimiter
            String names = "Peter, Paul, Mary"; String[]
            result = names.split(", ");
                An array of three strings ["Peter", "Paul", "Mary"]
         */

        String greeting = "Hello, World!";
        String location = greeting.substring(7, 12); // Sets location to "World"
        System.out.println(location);

        String names = "Peter, Paul, Mary";
        String[] result = names.split(", ");
        System.out.println(result.length);

        /*
        1.5.3 String Comparison
            use .equals
            location.equals("World")

            if String is null use ==
        Ignore Case - "world".equalsIgnoreCase(location);
        Dictionary Order - first.compareTo(second)
         */

        /*
        Nowadays, Unicode requires 21 bits. Each valid Unicode value is called a code point.
         */

        int codePoint = string.codePointAt(string.offsetByCodePoints(0, 2));
        System.out.println(codePoint);

    }
}
