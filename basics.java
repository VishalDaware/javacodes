//basics of java---------------------------------------------------------

import java.util.Scanner;

class basics {
    public static void main(String arg[]) {

        // printing
        // string----------------------------------------------------------------------------------------
        // System.out.println("Hello World");->output is Hello World

        // primitive data
        // types-----------------------------------------------------------------------------------
        /*
         * char a = 'G';// initiazing and creating costom character and always in single
         * quotes
         * int i = 69; // used for numeric values
         * byte b = 45; // used if memory is limited
         * short s = 54;// same as byte
         * double d = 1.473347;// default fraction value is double in java
         * float f = 5.5457f;// us to print values in points use f suffix
         * long l = 347598;// holds big range of integers or numbers
         * System.out.println("char: " + a);
         * System.out.println("int: " + i);
         * System.out.println("byte: " + b);
         * System.out.println("short: " + s);
         * System.out.println("double: " + d);
         * System.out.println("float: " + f);
         * System.out.println("long: " + l);
         */

        // Non primitive data types----------------------------------------------------
        /*
         * String s = "Hello";
         * System.out.println("String: " + s);
         * // other non primitive data types are arr,objects, class, interface
         */

        // ex. program to understand primitive and object data types
        /*
         * System.out.println("Primitive data types");
         * int x = 5;
         * int y = x;
         * System.out.println("x =" + x);
         * System.out.println("y =" + y);
         * y = 6; // changing value of y it doesn't affect above value of y
         * System.out.println("After changing value of y");
         * System.out.println("y =" + y);
         * 
         * System.out.println("Reference data types");
         * int[] d = { 1, 2, 3, 4, 5 };
         * int[] f = d;
         * System.out.println("Arr d =" + Arrays.toString(d));
         * System.out.println("Arr f =" + Arrays.toString(f));
         * d[2] = 9; // changing 2nd index value of given array(remembre indexing in
         * java starts from
         * // 0)
         * System.out.println("Arr d =" + Arrays.toString(d));
         * System.out.println("Arr f =" + Arrays.toString(f));
         */

        // Identifiers
        // ----------------------------------------------------------------------
        // example of identifiers
        /*
         * public class Test{
         * public static void main(String[] args) {
         * int a = 20;
         * }
         * }
         */
        // in above code 1)Test(class name), 2)main(method name),3)String(predifined
        // class name), 4)args(variable name), 5)a(variable name) are the Identifiers
        // Rules to declear Identifiers-------
        // 1)The only allowed characters for identifiers are all alphanumeric
        // characters([A-Z],[a-z],[0-9]), ‘$‘(dollar sign) and ‘_‘ (underscore).For
        // example “geek@” is not a valid Java identifier as it contains a ‘@’ a special
        // character.
        // 2)Identifiers should not start with digits([0-9]). For example “123geeks” is
        // not a valid Java identifier.
        // 3)Java identifiers are case-sensitive.

        // Operators in Java----------------------------------------
        // Arithmatic operators(+,-,/,*,%)
        /*
         * int a = 5;
         * int b = 10;
         * System.out.println("a+b = " + (a + b));// + is to addition
         * System.out.println("a-b = " + (a - b));// - is for subtration
         * System.out.println("a/b = " + (a / b));// / is for divide
         * System.out.println("a*b = " + (a * b));// * is for multiplication
         * System.out.println("a%b = " + (a % b));// % for remainder
         */
        // Unary operators(++,--)
        /*
         * int g = 8;
         * System.out.println("Postincrement :" + (g++));// 1st print value then
         * increment
         * System.out.println("Preincrement :" + (++g));// 1st increment then print
         * value
         * System.out.println("Postdecrement :" + (g--));// 1st print value then
         * decrement
         * System.out.println("Predecrement :" + (--g));// 1st decrement then print
         * value
         */
        // Assignment Operator(+=,-=,*=,/=)
        /*
         * int j = 6;
         * System.out.println("j += 2 =" + (j += 2));// adding j with right side operand
         * System.out.println("j -= 2 =" + (j -= 2));// subtracting j with right side
         * operand
         * System.out.println("j *= 2 =" + (j *= 2));// multiplying j with right side
         * operand
         * System.out.println("j /= 2 =" + (j /= 2));// dividing j with right side
         * operand
         */
        // Relational operator(==,<,>,<=,>=,!=)
        // gives boolean values -: True or false
        /*
         * int v = 6;
         * int i = 5;
         * System.out.println("v > i =" + (v > i));// greter than
         * System.out.println("v < i =" + (v < i));// less than
         * System.out.println("v >= i =" + (v >= i));// greter than equal
         * System.out.println("v <= i =" + (v <= i));// less than equal
         * System.out.println("v == i =" + (v == i));// equal to equal
         * System.out.println("v != i =" + (v != i));// not equal
         */
        // Logical operator(&&,||,!)
        /*
         * boolean n = true;
         * boolean m = false;
         * System.out.println("n && m =" + (n && m));// and
         * System.out.println("n || m =" + (n && m));// or
         * System.out.println("!n =" + (!n));// not
         * System.out.println("!m =" + (!m));// not
         */

        // Variables in java-----------------------------------------------
        // 1)Local variable
        /*
         * public class Local{
         * public static void main(String[] args) {
         * //Declering local variable
         * int a=10;
         * //local variable in decleared in only main method
         * System.out.println("Local variable :"+ a);
         * }
         * }
         */

        // 2)Instance variable
        // Declecing subclass
        /*
         * class Student{
         * //Instance variables always declere in subclass
         * String name;
         * int age;
         * int rollNo;
         * double precentage;
         * //default constructor initializing instance variables
         * this.name="Hello world";
         * this.age=20;
         * this.rollNo=50;
         * this.precentage=60.33;
         * public static void main(String[] args) {
         * //creating object
         * Student s1 = new Student();
         * System.out.println("Student name is :"+ s1.name);
         * System.out.println(s1.age);
         * System.out.println(s1.rollNo);
         * }
         * }
         */

        // 3)Static variables(variables declered using static keyword)
        /*
         * class Tree {
         * // declering Static variables
         * static String name = "Hello World";
         * public static void main(String[] args) {
         * // static variables can acces without creating objects
         * System.out.println(Tree.name);
         * }
         * 
         * }
         */

    }
}