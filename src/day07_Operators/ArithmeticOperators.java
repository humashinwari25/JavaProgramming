package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        //two nums given;divide 10/3 anf give result with remainders
        //10 divide by 3 is equal to 3 with a remainder of 1

        int num1 = 100;
        int num2 = 15;
       int division = num1/num2; //division variable contains the result of num1 divided by num2
       int remainder = 10%3; // remainder variable contains the result of num1 divided by number (num - (den * integer value)

        System.out.println(num1 + " divide by " + num2 + " is equal to " + division + " with a remainder of " + remainder);
        //whats the remainder of 25 divided by 4 :
        System.out.println( 25%4);
        System.out.println(25/4);
    }




}
