package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticce3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();//user inputs 5

        if(length<=0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        int[] numbers = new int[length]; //10,20,50

        for (int i = 0; i <length ; i++) { //index i is less than lenght if <= lenght -1; I:0,1
            System.out.println("Enter a number");
            numbers [i] = scan.nextInt(); //5 each input user provided during each execution of the loop, will be assigned

        }
        System.out.println(Arrays.toString(numbers));
    }
}
//3. Write a program that asks user to enter a number 10 times: