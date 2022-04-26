package Practice_12_08_2021;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
       int number = input.nextInt();

        int result = 1;


      //   if (number > 2){   can use if&elsse or without
             for (int i = number; i >=1; i--) {
                 result *= i;
             }
       //  } else{
                // result = number;

        System.out.println("Factorial of number is: " + result);
         }

    }

/* Write a program that can return the factorial number of any given number

                              Ex:
                                  input: 5
                                  output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )


the main idea:: factorial #: multiplyin the number from the beginning to the lowest # eith eah ...so if 5! = 5*4*3*2*1
given # = have to use scanner
other wise use integer #

for result used 1 because anything * 1 = itself
if it was addition would use 0..1+0=itself
number >2 used because if used less than 1, it would be itself
int i = number==>first initializing it would start with number ,whichever # user puts
i>=1 ==>ending point, will end unitl it reaches 1
i-- ====> will decrease each time
result *= i    ===> shortway result * i; 1*5,=5, then 1*4,

 */