import java.util.*;
import java.io.*;

public class StringInJava {
    public static void main(String args[]) {
        // String object stored in string constant pool

        /*
         * // Declaring string using string literal
         * String str = "Tony stark";
         * System.out.println(str);
         * 
         * // declaring string using new keyword
         * String str1 = new String("Harry potter");
         * System.out.println(str1);
         * 
         * // StringBuffer
         * StringBuffer str2 = new StringBuffer("Hello world");
         * System.out.println(str2);
         * 
         * // StringBuilder
         * StringBuilder str3 = new StringBuilder();
         * str3.append("Bonjure");
         * System.out.println(str3);
         */

        /*
         * // Strings are immutable i.e unchangable for ex
         * String str = "Tony";
         * str.concat("Stark");
         * System.out.println(str);
         * //here output is tony but there is new object created i.e Tony Stark
         */

        /*
         * // use reference variable to concat the strings
         * String str = "Hello ";
         * str = str.concat("World");
         * System.out.println(str);
         */

        /*
         * // Ex to demonstrate string
         * String name = "Tony Stark";
         * String movie = new String("Avengers");
         * System.out.println("Name = " + name);
         * System.out.println("Movie = " + movie);
         */

        /*
         * // String formation using characters or many strings
         * char characters[] = { 'H', 'e', 'y' };
         * String str = new String(characters);
         * String str2 = new String(str);
         * System.out.println(characters);
         * System.out.println(str);
         */

    }

}
