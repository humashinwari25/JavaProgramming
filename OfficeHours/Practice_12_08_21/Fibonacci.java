package Practice_12_08_21;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

/* Create a program that will give you the Fibonacci numbers up to the x value.

                           Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum
                           of the previous 2 numbers

                           Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1,
                           2nd value is 1, etc

                          Ex:
                             Input:
                               8
                             Output:
                               0, 1, 1, 2, 3, 5, 8, 13, 21

            */

        Scanner input = new Scanner(System.in);
        System.out.println("How many fibonnacci number do you want to see?");
        int number = input.nextInt();
        int num1 = 0; ///first two numbers are given, 0 & 1
        int num2 = 1;
        int result = 0;

        System.out.println(num1); //first print out first & second # : rule of fibonnacci
        System.out.println(num2);

        for (int i = 2; i < number; i++) { //for loop: i=2 ==>because already have first and second index(0,1) so start with index 2
            result = num1 + num2;//0+1
            System.out.println(result);
            num1 = num2;//assigning num2 to num1/swapping; num1 = 1 now
            num2 = result; //num 2 = result of previous;1
////0, 1, 1, 2,3,4,5,13,21
        }
    }
}
/*
    0, 1, 1, 2, 3, 5, 8, 13, 21
    0  1  2  3  4  5  6  7   8 indexes
     \  /
      we already
      have, so we start with number in index 2
 */