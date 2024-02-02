
// Input output in java--------------------------------------------------------
// declering universal package it also use for Scanner class
/*
 * import java.util.*;
 * 
 * public class InputInJava {
 * public static void main(String[] args)
 * 
 * {
 * 
 * // Taking input using Scanner class
 * Scanner sc = new Scanner(System.in);// Syntax of input
 * 
 * // in build scanner functions:1)nextInt(),2)nextFloat
 * // Taking input of string by next() function
 * String s1 = sc.next();
 * System.out.println("string s1 is :" + s1);
 * // Taking input of Integer value by nextInt() function
 * int x = sc.nextInt();
 * System.out.println("integer x is :" + x);
 * // Taking input of Float value by nextFloat() function
 * float y = sc.nextFloat();
 * System.out.println("Float y is :" + y);
 * 
 * }
 * }
 */

// Example no 2)
/*
 * import java.util.*;
 * 
 * public class InputInJava {
 * public static void main(String[] args) {
 * Scanner student = new Scanner(System.in);
 * String name;
 * int age;
 * int rollNo;
 * System.out.println("Enter student name");
 * name = student.next();
 * System.out.println("Enter student age");
 * age = student.nextInt();
 * System.out.println("Enter student roll No.");
 * rollNo = student.nextInt();
 * 
 * System.out.println("Student name is :" + name);
 * System.out.println("Student age is :" + age);
 * System.out.println("Student roll no is :" + rollNo);
 * }
 * }
 */

// Example no 3.
/*
 * import java.util.Scanner;
 * 
 * public class InputInJava {
 * // declering main class
 * public static void main(String[] args) {
 * // Instance variables
 * String name;
 * int age;
 * char Gender;
 * double percentage;
 * float pointer;
 * // Input by Scanner class
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter your name");
 * name = sc.nextLine();// String input method
 * 
 * System.out.println("Enter your age");
 * age = sc.nextInt();// Integer input
 * 
 * System.out.println("Enter your Gender");
 * Gender = sc.next().charAt(0);// Character input
 * 
 * System.out.println("Enter your Percentage");
 * percentage = sc.nextDouble();// Value in point
 * 
 * System.out.println("Pointer");
 * pointer = sc.nextFloat();// float input
 * 
 * // Result
 * System.out.println("Student name is :" + name);
 * System.out.println("Student age :" + age);
 * System.out.println("Gender :" + Gender);
 * System.out.println("Percentage" + percentage);
 * System.out.println("Pointer" + pointer);
 * }
 * }
 */

// Example no 3.
// program to take name and age of user and print their result statement
/*
 * import java.util.Scanner;//Declering Scanner package
 * //Main class
 * 
 * public class InputInJava {
 * public static void main(String[] args) {
 * // scanner class to take input
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter your name");// instruction
 * String name = sc.next();// input of string
 * 
 * System.out.println("Enter your age");// instruction
 * int age = sc.nextInt();// input of integer value
 * // printing final result
 * System.out.println("Your name is " + name + " & your age is " + age);
 * 
 * }
 * }
 */

// Taking input using console class----------------------------------
/*
 * public class InputInJava {
 * public static void main(String[] args) {
 * System.out.println("Enter your name");
 * String name = System.console().readLine();// taking String input using
 * console class
 * System.out.println("Your name is " + name);
 * 
 * }
 * }
 */

/// There are so many methods to take input in java but using SCANNER class is
/// efficint method to take input in java.

// difference in println() and print()----------------------------------
// println() use to print in next line &
// print() use to print in one single line
// ex. 1)print Hello 3 times in single line by separate commands
// 2) print Hello 3 times in different lines
/*
 * import java.util.*;
 * 
 * public class InputInJava {
 * public static void main(String[] args) {
 * // 1)print Hello 3 times in single line by separate commands
 * System.out.print("Hello ");
 * System.out.print("Hello ");
 * System.out.println("Hello");
 * 
 * // 2) print Hello 3 times in different lines
 * System.out.println("Hello");
 * System.out.println("Hello");
 * System.out.println("Hello");
 * 
 * }
 * }
 */