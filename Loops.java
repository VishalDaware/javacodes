import java.util.*;

public class Loops {
    public static void main(String[] arg) {
        // Java selection statement-----------------------------------------
        // 1) if statement------
        // syntax:-
        /*
         * if(condition){
         * statement to be executed if its true
         * }
         */
        // example of if statement
        // Write a program to give true value if given value is less than 5
        // condition is enter value less than 5
        // if you enter value greater than 5 then it dosen't work
        /*
         * Scanner sc = new Scanner(System.in);//Scanner class
         * System.out.println("Enter the number");//printing command
         * int x = sc.nextInt();//taking input of string
         * // if statement
         * if (x < 5) {
         * System.out.println("no is less than 5");//this will print if condition is
         * true
         * }
         */

        // 2) if else statement-----------
        // syntax:-
        /*
         * if(condition){
         * //statement to execute if condition is true
         * } else{
         * //statement to execute if condition is false
         * }
         */
        // example of if else statement
        // write a program to check given no. is even or odd
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the no.");
         * int x = sc.nextInt();
         * if (x % 2 == 0) {
         * System.out.println("Given no is even");
         * } else {
         * System.out.println("Given no is odd");
         * }
         */

        // 3)nested Statement----------------
        // syntax:
        /*
         * if(condition 1){
         * if (condition 2)
         * //statement to execute
         * if(condition 2)
         * //statement to execute
         * }else{
         * //statement
         * }
         */
        // Example of nested Statement
        // check given no is even or odd if it even check it less than or greater than
        // 100
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the no");
         * int x = sc.nextInt();
         * if (x % 2 == 0) {
         * if (x > 100)
         * System.out.println("entered no. is greater than 100");
         * if (x < 100)
         * System.out.println("entered no. is less than 100");
         * } else {
         * System.out.println("entered no. is odd no.");
         * }
         */

        // 4) if else if statement
        // example of if else if statement
        // java program to understand concept
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the no.");
         * int x = sc.nextInt();
         * if (x == 10)
         * System.out.println("No is equal to 10");
         * else if (x < 10)
         * System.out.println("No is less than 10");
         * else if (x > 10)
         * System.out.println("No is greater than 10");
         * else
         * System.out.println("Entered no is wrong");
         */

        // Loops in java---------------------------------------
        // 1)While loop----------
        // Syntax:-
        /*
         * while (condition) {
         * loop statement
         * }
         */

        // Example
        // Java program to print value 0 to 10
        /*
         * int x = 0;//Declering starting variable
         * //while loop
         * while (x <= 10) {
         * System.out.println(x);
         * x++;//increment while value of x is 10
         * 
         * }
         */

        // For Loop-------------------------------
        // Java program to print 1 to 10 value
        /*
         * for (int i = 0; i <= 10; i++) {
         * System.out.println(i);
         * }
         */
        // java program to print Hello for 5 times
        /*
         * for (int i = 0; i <= 5; i++) {
         * System.out.println("Hello");
         * }
         */

        // Nested loops--------------------------
        // Java program to print 1 to 4 value twice
        /*
         * for (int i = 0; i < 5; i++) {
         * for (int j = 0; j < 2; j++) {
         * System.out.println(i);
         * }
         * System.out.println();
         * }
         */

        // java program to print sum of 1 to 10 integers
        /*
         * int sum = 0;
         * for (int x = 0; x <= 10; x++) {
         * sum = sum + x;
         * }
         * System.out.println("Sum is : " + sum);
         */

        // Continue statement---------------
        // use to skip
        // example:- Write a program to print 0 to 15 integers but skip 5 and 12
        /*
         * for (int i = 0; i <= 15; i++) {
         * if (i == 5 || i == 12) {
         * continue;
         * }
         * System.out.print(i + " ");
         * }
         */

        // Break Statement---------------------
        // used to break the loop
        // for example
        /*
         * for (int i = 0; i < 10; i++) {
         * if (i == 6)
         * break;
         * System.out.println("i : " + i);
         * }
         * System.out.println("Loop completed");
         */
    }

}
