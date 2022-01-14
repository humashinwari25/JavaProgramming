package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first number:");
        int num1 = scan.nextInt();
        System.out.println("enter your second number:");
        int num2 = scan.nextInt();
        System.out.println("enter a math operator:");
        int ch  = scan.next().charAt(0);

       /*can use if statement or while loop
       if( !(ch == '+' || ch == '-')){
            System.out.println("Invalid Operator, Please re-enter");
            ch =scan.next().charAt(0);
*/
        while ( !(ch == '+' || ch == '-')){
            System.out.println("Invalid Operator, Please re-enter");
            ch =scan.next().charAt(0);
        }
        System.out.println( (ch == '+')? num1+num2: num1-num2 );

       /* for loop can be used but better to use while loop when not sure how many times statement is being repeated
       for (int i = 0;  !(ch == '+' || ch == '-'); ) {

            System.out.println("Invalid Operator, Please re-enter");
            ch =scan.next().charAt(0);
            */

        }
    }

/*
ask user to enter two numbers and math operators to do calculation
only can enter + or -, otherwise print invalid operator, please re-enter
we do not know how many times user will enter other operators
best to use while loop method now
 */