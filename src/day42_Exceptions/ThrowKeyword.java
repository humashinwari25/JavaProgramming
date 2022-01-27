package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age:");//-20

        int age = new Scanner(System.in).nextInt();



        if(age < 0){
          throw new InputMismatchException("Age can not be negative: "+ age);
            //similar to exit method; much more understandable
            //throw keyword used to create exception//new keyword to create object from mismatchException class
            //  System.err.println("Invalid age: " + age);
            //System.exit(1);
        }
        if(age > 21){
            System.out.println("you are eligible");
        }else{
            throw new RuntimeException("you must be at least 21 years old");
        }

    }
}
