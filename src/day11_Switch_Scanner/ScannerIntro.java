package day11_Switch_Scanner;
import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
      //  input.nextInt();

        System.out.println("Enter an integer: ");
        int num1 = input.nextInt();

        System.out.println("Enter a decimal:");
            double num2 = input.nextDouble();


        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: "+ (num1*num2));

        input.close();//closes the scanner otherwise the performance is slow

     //   System.out.println("Enter an integer:");
       // int num3 =input.nextInt();
        // System.out.println(num3);
}
}
/*
scanner-allows to get input
scanner class is from util package which is from java package

 */