import java.io.*;
import java.util.*;

class Formatting {
    public static void main(String arg[]) {
        // NO. formatting
        /*
         * int n = 20000;
         * System.out.printf("%,d%n", n);
         */

        // Decimal no. formatting
        /*
         * double n = 3.1465858655;
         * System.out.printf("%f\n", n);
         * System.out.printf("%6.1f\n", n);
         * System.out.printf("%2.3f\n", n);
         * System.out.printf("%1.4f\n", n);
         */

        // Boolean formatting
        /*
         * int n = 54;
         * Boolean t = true;
         * Boolean f = false;
         * System.out.printf("%b\n", n);
         * System.out.printf("%B\n", n);
         * System.out.printf("%b\n", t);
         * System.out.printf("%B\n", t);
         * System.out.printf("%b\n", f);
         * System.out.printf("%B\n", f);
         */

        // character formatting
        /*
         * char a = 'y';
         * System.out.printf("%c\n", a);
         * System.out.printf("%C\n", a);
         */

        // string formatting
        /*
         * String n = "Hello world";
         * System.out.printf("%s\n", n);
         * System.out.printf("%S\n", n);
         */

        // Date and time formatting
        // creating object of time

        Date time = new Date();
        System.out.printf("Current Time: %tT\n", time);
        System.out.printf("Current Time: Hours: %tH\n Minutes: %tM Seconds: %tS", time, time, time);

    }

}
